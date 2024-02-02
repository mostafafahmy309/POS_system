package com.example.POS;

import java.util.ArrayList;

public class Item {
    private int idItem;
    private String name;
    private double price;
    private  String date;

    public Item(int idItem,String name, double price, String date) {
        this.idItem=idItem;
        this.name = name;
        this.price = price;
        this.date = date;
    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
