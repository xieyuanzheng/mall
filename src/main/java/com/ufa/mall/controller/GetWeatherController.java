package com.ufa.mall.controller;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


@Controller
public class GetWeatherController {

    @ResponseBody
    @RequestMapping("/store")
    public String getSearchStore(){
        return "getSearchStore()：这是一个测试的Controller";
    }//end of getSearchStore()

    @ResponseBody
    @RequestMapping("/getstore")
    public String getStoreNoJoint(){
        //String url= "https://www.ufa.hk/app-web/shop/searchStore.pub";
        String url ="https://www.sojson.com/open/api/weather/xml.shtml?city=北京";
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .readTimeout(5,TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        final Call call = okHttpClient.newCall(request);
        new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    Response response = call.execute();
                    if(response.isSuccessful()){
                        String xml = response.body().string();
                        System.out.println(xml);
                        JSONObject jsonObject = XML.toJSONObject(xml);
                        System.out.println(jsonObject);
                        System.out.println(jsonObject.toString());
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        })).start();
        return "getStoreNoJoint()：这是查询北京市天气情况的一个Get Http 非拼接请求";
    }//end of getStoreNoJoint()

    /**
     * get拼接传值方法
     * @param  ?username=xxxx&password=xxx
     */
    @ResponseBody
    @RequestMapping("/getstorejoint")
    public String getStoreJoint(){
        //String url= "https://www.ufa.hk/app-web/shop/searchStore.pub";
        String url ="https://www.sojson.com/open/api/weather/xml.shtml";
        StringBuffer sb = new StringBuffer();
        sb.append("?").append("city=东莞");
        url = url + sb.toString();
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        final Call call = okHttpClient.newCall(request);
        new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    Response response = call.execute();
                    if(response.isSuccessful()){
                        String xml = response.body().string();
                        System.out.println(xml);
                        JSONObject jsonObject = XML.toJSONObject(xml);
                        System.out.println(jsonObject);
                        System.out.println(jsonObject.toString());
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        })).start();
        return "getStoreJoint()：这是查询东莞市天气情况的一个Get Http 拼接请求";
    }//end of getStoreJoint()


}
