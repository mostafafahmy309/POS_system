package com.example.POS;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Order> orders;
    private ArrayList<Item> items;

    public Manager() {
        //TODO: Specify the exact type. done
        this.orders = new ArrayList<Order>();
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void createItem(String name, double price, String date) {
        Item item = new Item(items.size(), name, price, date);
        items.add(item);
    }

    public void removeItem(int idItem) {
        for (int i = 0; i < items.size(); i++) {
            Item item =items.get(i);
            if (item.getIdItem() == idItem) {
                items.remove(item);
                break;
            }
        }
    }

    public void editeItem(int idItem, String name, double price, String date) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getIdItem() == idItem) {
                item.setName(name);
                item.setPrice(price);
                item.setDate(date);
            }

        }
    }

    public Item getItem(int idItem) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getIdItem() == idItem) {
                return item;

            }
        }
        return null;
    }

    public void createOrder(String customerName) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = new Order(orders.size() , customerName, new ArrayList<>());
            orders.add(order);
        }
    }




    public void removeOrder(int idOrder) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getIdOrder() == idOrder) {
                orders.remove(order);
                break;
            }
        }
    }

    public void editeOrder(int idOrder, String customerName) {
        //TODO: get is used with index not with id. Make a for loop instead. Check other functions. done
        for (Order order : orders) {
            if (order.getIdOrder() == idOrder) {
                order.setCustomerName(customerName);

            }
        }
    }

    public Order printOrder(int idOrder) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getIdOrder() == idOrder) {
                return order;

            }
        }
        return null;
    }

    public void addItemLineToOrder(int idOrder, int idItem, int count) {
        for (Order order : orders) {
            if (order.getIdOrder() == idOrder) {
                ItemLine itemLine = new ItemLine(order.getItemslines().size(), items.get(idItem), count);
                order.getItemslines().add(itemLine);
            }
        }
    }



    public void removeItemLineFromOrder(int idOrder, int idItemLine) {
        Order order = orders.get(idOrder);
        for (int i = 0; i < order.getItemslines().size(); i++) {
            ItemLine itemLine = order.getItemslines().get(i);
            if (itemLine.getIdItemLine() == idItemLine) {
                //TODO: Why remove with index when you have the exact instance? (actually, this is not wrong but confusing) done
                order.getItemslines().remove(itemLine);
                break;

            }

        }
    }

    public void editeItemLine(int idOrder, int idItemLine, int idItem, int count) {
        Order order = orders.get(idOrder);
        for (int i = 0; i < order.getItemslines().size(); i++) {
            ItemLine itemLine = order.getItemslines().get(i);
            if (itemLine.getIdItemLine() == idItemLine) {
                for (Item item : items) {
                    if (item.getIdItem() == idItem) {
                        itemLine.setItem(item);
                        itemLine.setCount(count);
                    }
                }
            }


        }
    }


    public double sum(int idOrder) {
        Order order = orders.get(idOrder);
        double sum = 0;
        for (int i = 0; i < order.getItemslines().size(); i++) {
            double itemLineSum = order.getItemslines().get(i).getItem().getPrice() * order.getItemslines().get(i).getCount();
            sum += itemLineSum;

        }
        return sum;
    }
}






