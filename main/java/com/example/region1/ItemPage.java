package com.example.region1;

public class ItemPage {
    int stringResId;
    int location;

    ItemPage(int stringResId, int location){
        this.stringResId = stringResId;
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public int getStringResId() {
        return stringResId;
    }
}