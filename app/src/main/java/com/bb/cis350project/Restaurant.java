package com.bb.cis350project;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private List<String> pictures; // the image url
    private List<Review> reviews;

    public Restaurant(String n){
        this.name = n;
        this.pictures = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
