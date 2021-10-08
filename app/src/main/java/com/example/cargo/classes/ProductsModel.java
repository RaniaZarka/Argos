package com.example.cargo.classes;

import android.graphics.drawable.Drawable;

public class ProductsModel {

public String name;
public Drawable image;
public Drawable type;
public String details;
public Drawable smiley;

    public ProductsModel(){}

    public ProductsModel(String name, Drawable image, Drawable type, String details, Drawable smiley) {
        this.name = name;
        this.image = image;
        this.type = type;
        this.details = details;
        this.smiley=smiley;
    }
    
    public Drawable getSmiley() {
        return smiley;
    }


    public String getName() {
        return name;
    }

    public Drawable getImage() {
        return image;
    }

    public Drawable getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public void setSmiley(Drawable smiley) {
        this.smiley = smiley;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public void setType(Drawable type) {
        this.type = type;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
