/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Marc-Anthony
 */
public class Library {

    private static Library lObject;
    private ArrayList<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static Library getInstance() {    //Singleton design pattern
        if (lObject == null) {
            lObject = new Library();

        }
        return lObject;
    }

    public void addBook(Book book) {

        books.add(book);
    }

    public static Library getlObject() {
        return lObject;
    }

    public static void setlObject(Library lObject) {
        Library.lObject = lObject;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Library other = (Library) obj;
        return Objects.equals(this.books, other.books);
    }

    @Override
    public String toString() {
        return books.toString();
    }

}
