package com.company.labs.lab4;

public abstract class Parent {
    public abstract void print();
}

interface Fly {
    int a = 5;
    void fly();
    void f();
}

interface Fly2 {

    void fly();

    default  void f(){

    }

}

