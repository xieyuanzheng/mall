package com.ufa.mall.controller;

import okhttp3.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class PostSearchStoreController {

    @ResponseBody
    @RequestMapping("/postSearchStore")
    public String postSearchStore() {
        String url = "https://www.ufa.hk/app-web/shop/searchStore.pub";
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("sk","")
                .add("pageNo","1")
                .add("pageSize","10")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("platform","android")
                .addHeader("timestamp","1522748144000")
                .addHeader("version","v2.0")
                .addHeader("token","")
                .addHeader("sign","")
                .addHeader("Accept","application/json")
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .post(formBody)
                .build();
        Response response ;
        try {
            response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()){
                System.out.println(response.body().string());
            }else {
                System.out.println("调用接口失败");
            }
        } catch (IOException e) {
            System.out.println("111111111");
            e.printStackTrace();
        }
        return "postSearchStore()：查询所有店铺 post Http请求";
    }//end of postSearchStore()

}
