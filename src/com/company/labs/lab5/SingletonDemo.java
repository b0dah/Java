package com.company.labs.lab5;

class Singleton {
    private static Singleton instance;

    private Singleton(){} // чтобы нельзя было созлать откуда угодно

    public static Singleton getInstance() {  // фабричный метод
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonDemo {

    Singleton singleton = Singleton.getInstance();

}
