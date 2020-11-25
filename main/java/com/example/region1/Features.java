package com.example.region1;

public class Features {
    private int resId;
    private String name;

    Features(int resId, String name){
        this.resId = resId;
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }
}
