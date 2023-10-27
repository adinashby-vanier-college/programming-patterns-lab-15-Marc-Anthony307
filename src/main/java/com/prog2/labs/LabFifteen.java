package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabFifteen {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {
        Library l1 = Library.getInstance();

        Book book = new Book ("Harry Potter", "JK Rowling", 45);
        l1.addBook(book);

        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
    }

    /**
     * Please refer to the README file for question(s) description
     */
}
