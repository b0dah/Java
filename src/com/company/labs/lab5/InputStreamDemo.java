package com.company.labs.lab5;


import java.io.FileInputStream;
import java.io.InputStream;

import static java.time.LocalDate.now;

//abstract class InputStream {
//
//    abstract public int read();
//}

// Pattern DECORATOR
// при декорировании расширяем объект, а не класс
//class LogTimeInputStream extends InputStream {
//
//    InputStream in;
//    LogTimeInputStream(InputStream in){
//        this.in = in;
//    }

       // @Override
//    public int read() {
//        System.out.println(now());
//        super.read();
//        System.out.println(now());
//    }
//}

public class InputStreamDemo {

    //LogTimeInputStream instance = new LogTimeInputStream(new LogTimeInputStream(new FileInputStream("1.txt")));

}
