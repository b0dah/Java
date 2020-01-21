package com.company.individuals.IndividualTask;

import java.util.ArrayList;

public class Driver {

    private int id;
    private String name;
    private String username;
    private String password;
    private String keyword;
    private ArrayList<Order> orders;

    public Driver(int id, String name, String username, String password, String keyword, ArrayList<Order> orders) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.keyword = keyword;
        this.orders = orders;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = new ArrayList<>(orders);
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getKeyword() {
        return keyword;
    }

    // MARK: METHODS

    public void addNewOrder(Order newOrder) {
        this.orders.add(newOrder);
    }


    public void changeExecutingOrderStatus(int orderId, OrderStatus newOrderStatus) {
        for (Order order: this.orders)
            if (order.getId() == orderId) {
                order.setStatus(newOrderStatus);
            }
    }

}
