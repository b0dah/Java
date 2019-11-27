package com.company.labs.lab6;


import javax.sound.midi.Soundbank;
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

    private static UserModel deserializeObject() {
        UserModel instance = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(file);

            instance = (UserModel) objectInputStream.readObject();

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

    public static void main(String[] args) {
        UserModel user = new UserModel("name", "e-mail");

        serializeObject(user);
        UserModel deserializeInstance = deserializeObject();

        System.out.println("Deserialized Object " + deserializeInstance.name);


    }
}
