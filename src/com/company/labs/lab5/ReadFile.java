package com.company.labs.lab5;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.FileHandler;

public class ReadFile {

    public static void main(String[] args) /*throws Exception */ {
        //FileInputStream file = new FileInputStream("fileName.txt");

        try {
            InputStream in = new FileInputStream("1.txt");
                while (in.available() > 0 ) {
                    System.out.println(in.read());
            }
        } catch (FileNotFoundException e) { // сначала предок
            e.printStackTrace();
        } catch (IOException e) { // потом родитель
            e.printStackTrace();
//            log.error(e);
//            throw(e);
        } finally { // ОБЯЗАТЕЛЬНО ВЫОПЛНЯЕТСЯ, независимо от результата try-catch

        }

    }
}
