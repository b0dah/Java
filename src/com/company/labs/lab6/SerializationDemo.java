package com.company.labs.lab6;


import com.company.individuals.IndividualTask.Order;

import java.io.*;

class UserModel implements Serializable {
    String name;
    String email;

    UserModel(String name, String email){
        this.name = name;
        this.email= email;
    }
}

public class SerializationDemo {

    final static String filename = "Serialization/serializedInstance.ser";

    private static void serializeObject(Object object) {
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

            objectOutputStream.writeObject(object);

            objectOutputStream.close();
            file.close();
            System.out.println("object serialized!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Order deserializeObject() {
        Order instance = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(file);

            instance = (Order) objectInputStream.readObject();

            objectInputStream.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return instance;
    }

    private static void prettyModelPrint(Order order) {
        System.out.println("\n === Order ===\n" +
                order.getCustomerName() + "\n" +
                order.getDeliveryTime() + "\n" +
                order.getOriginAdress() + "\n" +
                order.getDestinantionAddress() + "\n" +
                order.getNumberOfMovers() + "\n" +
                order.getPayment() + "\n" +
                order.getPhoneNumber() + "\n" +
                order.getStatus() + "\n" );
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(100);
        order.setCustomerName("Байер (странное имя)");
        order.setDeliveryTime("08:00");
        order.setOriginAdress("Park Lane, 78");
        order.setDestinantionAddress("St. James, 21");
        order.setNumberOfMovers(5);
        order.setPayment(1000);
        order.setPhoneNumber("8-800-000-00-88");
        order.setStatus(0);


        serializeObject(order);
        Order deserializeInstance = deserializeObject();

        System.out.println("\n DESERIALIZED OBJECT: ");
        prettyModelPrint(deserializeInstance);
    }
}
