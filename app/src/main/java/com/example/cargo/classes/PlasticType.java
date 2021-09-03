package com.example.cargo.classes;

public class PlasticType {
    private String description;
    private String foundIn;
    private String tipsToAvoid;
    private String rating;

    public PlasticType(String description, String foundIn, String tipsToAvoid, String rating){
        this.description = description;
        this.foundIn = foundIn;
        this.tipsToAvoid = tipsToAvoid;
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public String getFoundIn() {
        return foundIn;
    }

    public String getRating() {
        return rating;
    }

    public String getTipsToAvoid() {
        return tipsToAvoid;
    }
}
