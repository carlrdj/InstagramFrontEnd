package com.rdj.carl.instagram.model;

/**
 * Created by SEVEN on 7/11/2017.
 */

public class Picture {

    private String picture;
    private String nickname;
    private String date;
    private String likes;

    public Picture(String picture, String nickname, String date, String likes) {
        this.picture = picture;
        this.nickname = nickname;
        this.date = date;
        this.likes = likes;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
