package com.example.POS;

import java.util.ArrayList;

public class Order {
    private int idOrder;
    private String customerName;

    private ArrayList<ItemLine> itemslines;

    public Order(int idOrder, String customerName, ArrayList<ItemLine> itemslines) {
        this.idOrder = idOrder;
        this.customerName = customerName;
// TODO: Why new when you have the parameter? done
        this.itemslines = itemslines;
    }

    public ArrayList<ItemLine> getItemslines() {
        return itemslines;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
