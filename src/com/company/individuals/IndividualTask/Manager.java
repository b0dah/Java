package com.company.individuals.IndividualTask;

public class Manager {
    int id;
    String name;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // METHODS
    public void distributeOrderToDriver(Driver driver, Order order) {
        driver.addNewOrder(order);
    }
}
