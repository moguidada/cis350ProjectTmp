package com.bb.cis350project;

public class Review {

    private String content;
    private User user;

    public Review(String c, User u){
        this.content = c;
        this.user = u;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
