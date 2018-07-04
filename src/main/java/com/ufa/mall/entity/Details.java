package com.ufa.mall.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="details")
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Details() {
    }

    public Details(@NotNull String name, @NotNull String description) {
        this.name = name;
        this.description = description;
    }
}
