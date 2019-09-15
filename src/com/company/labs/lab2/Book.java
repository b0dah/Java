package com.company.labs.lab2;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private int publishingYear;

    public Book(String title, String author, int numberOfPages, int publishingYear) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publishingYear = publishingYear;
    }

    public void printBookDescription(){
        System.out.println("The Book described as : \n" +
                "\nTitle: " + this.title +
                "\nAuthor:" + this.author +
                "\nPages: " + this.numberOfPages +
                "\nYear: " + this.publishingYear);
    }

    public static void main(String[] args) {

        Book book = new Book("bookName", "Chuck", 15, 2008);
        book.printBookDescription();
    }

}



