package com.Consturctor;

class  Book {
    String title;
    int pages;
    String author;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
    public Book(Book book) {
        this.title = book.title;
        this.pages = book.pages;
        this.author = book.author;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Author: " + author);
        System.out.println("-------------------");

    }
}

public class CopyConstructor {
    public static void main(String[] args){
        Book book1 = new Book("Mein Kampf",100,"Adolf Hitler");
        book1.display();
        for(int i=0; i <10; i++) {
            Book book2 = new Book(book1);
            book2.display();
        }
    }
}
