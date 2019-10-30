package com.bb.cis350project;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Review> review;

    public User(String n){
        this.name = n;
        this.review = new ArrayList<>();
    }

    public void addReview(Review r){
        this.review.add(r);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }
}
