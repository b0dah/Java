package com.company.labs.lab9Treads;


class MyInheritanceTread extends Thread {

}

class MyRunnable implements  Runnable {

    @Override
    public void run() {

    }
}

public class TreadsDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        thread.start(); // start() - в новый поток, run - нет
        thread.join();
        thread.wait(); // усыпить


        thread.notify(); // wake
        thread.notifyAll(); // wake all the treads fro another thread

        Thread thread1 = new Thread(()-> {

        });

        Thread thread2(new Runnable(){

            @Override
            public void run() {

            }
        }).start();



    }
}
