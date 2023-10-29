/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Marc-Anthony
 */
public class LibraryController {  

    private Library model;
    private MainForm view;

    public LibraryController(Library model, MainForm view) {
        this.model = model;
        this.view = view;
    }

    //control model object
    public void setBookName(String name, int index) {
        model.getBooks().get(index).setName(name);
    }

    public String getBookName(int index) {
        return model.getBooks().get(index).getName();
    }

    public void setAuthorName(String author, int index) {
        model.getBooks().get(index).setAuthor(author);
    }

    public String getAuthorName(int index) {
        return model.getBooks().get(index).getAuthor();
    }

    public void setBookStock(int stock, int index) {
        model.getBooks().get(index).setStock(stock);
    }

    public int getBookStock(int index) {
        return model.getBooks().get(index).getStock();
    }

    public Library getLibraryModel() {
        return model;
    }

    public void setLibraryModel(Library model) {
        this.model = model;
    }

    public void setLibraryBooks(ArrayList<Book> books) {
        model.setBooks(books);
    }

    public ArrayList<Book> getLibraryBooks() {
        return model.getBooks();
    }

    //control view object
    public void updateView() {
        Controller.getInstance().updateBookTextArea(this);
    }

    public void addBook(String name, String author, int stock) {
        Book newBook = new Book(name, author, stock);
        model.addBook(newBook); 

    }
}
