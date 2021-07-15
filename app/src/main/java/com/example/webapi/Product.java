package com.example.webapi;

public class Product {
    int id;
    String title;
    int content_type;
    int publisher_id;
    int tab;
    String avatar;

    public Product(int id, String title, int content_type, int publisher_id, int tab, String avatar) {
        this.id = id;
        this.title = title;
        this.content_type = content_type;
        this.publisher_id = publisher_id;
        this.tab = tab;
        this.avatar = avatar;
    }

    public int getContent_type() {
        return content_type;
    }

    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
