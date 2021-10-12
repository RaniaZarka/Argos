package com.example.cargo.classes;

import android.graphics.drawable.Drawable;

public class ProductsModel {

public String name;
/*public String image;
    public String smiley;
public String type;*/
public String details;

    public ProductsModel(String name, String details) {
        this.name = name;
        this.details = details;
    }



  /*  public ProductsModel(String name, String image, String type, String details, String smiley) {
        this.name = name;
        this.image = image;
        this.type = type;
        this.details = details;
        this.smiley = smiley;
    }*/



    public ProductsModel(){}


    public String getName() {
        return name;
    }
  /*  public String getType() {
        return type;
    }
    public String getImage() {
        return image;
    }
    public String getSmiley() {
        return smiley;
    }*/

    public String getDetails() {
        return details;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDetails(String details) {
        this.details = details;
    }

  /*  public void setImage(String image) {
        this.image = image;
    }

    public void setType(String type) {
        this.type = type;
    }



    public void setSmiley(String smiley) {
        this.smiley = smiley;
    }*/



}
