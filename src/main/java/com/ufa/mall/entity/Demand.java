package com.ufa.mall.entity;

public class Demand {
    private int id;
    private String name;
    private String status;
    private String onlineTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Demand() {
    }

    public Demand(int id, String name, String status, String onlineTime) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.onlineTime = onlineTime;
    }
}
