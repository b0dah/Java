package com.company.individuals.IndividualTask;

import java.util.ArrayList;

public class TaxiCompanyStructure {

    private ArrayList<Order> allOrders;
    private ArrayList<Driver> drivers;
    private ArrayList<Manager> managers;

    public TaxiCompanyStructure() {
        this.allOrders = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.managers = new ArrayList<>();
    }

    // GETTERS
    public ArrayList<Order> getAllOrders() {
        return allOrders;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setAllOrders(ArrayList<Order> allOrders) {
        this.allOrders = allOrders;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }
}
