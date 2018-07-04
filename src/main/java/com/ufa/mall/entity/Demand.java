package com.ufa.mall.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="demand")
public class Demand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String status;
    @NotNull
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
