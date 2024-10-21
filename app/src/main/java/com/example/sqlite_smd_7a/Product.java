package com.example.sqlite_smd_7a;

public class Product {
    int id;
    String title, date;
    int price;

    public Product() {
    }

    public Product(int id, String title, String date, int price) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.price = price;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
