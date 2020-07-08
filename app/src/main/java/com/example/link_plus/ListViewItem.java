package com.example.link_plus;

import android.graphics.drawable.Drawable;

public class ListViewItem {

    private Drawable iconDrawable;
    private String nameStr;
    private String phoneStr;
    private String timeStr;
    private String parkingStr;

    public void setName(String name){
        nameStr = name;
    }
    public void setPhone(String phone){
        phoneStr = phone;
    }
    public void setTime(String time){
        timeStr = time;
    }
    public void setParking(String parking){
        parkingStr = parking;
    }
    public void setIcon(Drawable icon){
        iconDrawable = icon;
    }

    public Drawable getIcon(){
        return this.iconDrawable;
    }
    public String getName(){
        return this.nameStr;
    }
    public String getPhone() { return this.phoneStr; }
    public String getTime() { return this.timeStr; }
    public String getParking() { return this.parkingStr; }
}
