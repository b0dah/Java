package com.company.individuals.IndividualTask;


import java.io.Serializable;

enum OrderStatus {
        DEFAULT, // 2
        SEEN,  // 3 просмотрел
        STARTED, // 4 выехал в начальную точку
        ARRIVED, // 5 прибыл в начальную точку
        DONE, // 6 заврешиил
        ERROR
    }

public class Order implements Serializable {
    private int id;
    private String customerName;
    private String originAdress;
    private String destinantionAddress;
    private String deliveryTime;
    private int payment;
    private OrderStatus status;
    private int numberOfMovers;
    private String phoneNumber;

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOriginAdress(String originAdress) {
        this.originAdress = originAdress;
    }

    public void setDestinantionAddress(String destinantionAddress) {
        this.destinantionAddress = destinantionAddress;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setStatus(int statusId) {

        OrderStatus status = OrderStatus.values()[statusId];
        this.status = status;
    }

    public void setStatus(OrderStatus newOrderStatus) {
        this.status = newOrderStatus;

    }

    public void setNumberOfMovers(int numberOfMovers) {
        this.numberOfMovers = numberOfMovers;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOriginAdress() {
        return originAdress;
    }

    public String getDestinantionAddress() {
        return destinantionAddress;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public int getPayment() {
        return payment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public int getNumberOfMovers() {
        return numberOfMovers;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
