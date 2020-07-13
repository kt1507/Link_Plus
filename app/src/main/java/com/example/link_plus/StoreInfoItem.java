package com.example.link_plus;

import android.graphics.drawable.Drawable;

public class StoreInfoItem {
    private String nameStr;
    private String priceStr;

    public void setName(String product_name){
        nameStr = product_name;
    }
    public void setPrice(String product_price){
        priceStr = product_price;
    }

    public String getProductName() { return this.nameStr; }
    public String getProductPrice() { return this.priceStr; }
}