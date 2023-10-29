/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.prog2.labs;

import java.awt.Dimension;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

/**
 *
 * @author Marc-Anthony
 */
public class MainForm extends javax.swing.JFrame {

    private ResourceBundle bundle;
    private ResourceBundle bundleFR;
    private LibraryController libraryController;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        bundle = ResourceBundle.getBundle("FormLanguage");
        bundleFR = ResourceBundle.getBundle("FormLanguage", Locale.FRANCE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bookStock = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();
        bookName = new javax.swing.JTextField();
        authorName = new javax.swing.JTextField();
        bookLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        languagesLabel = new javax.swing.JLabel();
        languageBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        booksTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("libraryFrame");
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        bookStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookStockActionPerformed(evt);
            }
        });

        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });

        authorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorNameActionPerformed(evt);
            }
        });

        bookLabel.setText("Enter Book Name:");

        authorLabel.setText("Enter Author Name:");

        stockLabel.setText("Enter Book Stock:");

        libraryLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        libraryLabel.setText("Generic Library");

        languagesLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        languagesLabel.setText("Languages:");

        languageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "French" }));
        languageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageBoxActionPerformed(evt);
            }
        });

        booksTextArea.setEditable(false);
        booksTextArea.setColumns(20);
        booksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        booksTextArea.setRows(5);
        jScrollPane2.setViewportView(booksTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bookStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(libraryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(languagesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(languageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addBookButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(libraryLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(languageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(languagesLabel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(authorName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookStock, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockLabel)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookStockActionPerformed

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameActionPerformed

    private void authorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorNameActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        String name = bookName.getText();
        String author = authorName.getText();
        int stock = Integer.parseInt(bookStock.getText());

        libraryController.addBook(name, author, stock);
        libraryController.updateView();
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void languageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageBoxActionPerformed
        if (languageBox.getSelectedItem().toString().equalsIgnoreCase("english")) {
            bookLabel.setText(bundle.getString("bookName"));
            authorLabel.setText(bundle.getString("authorName"));
            stockLabel.setText(bundle.getString("stockLabel"));
            libraryLabel.setText(bundle.getString("title"));
            addBookButton.setText(bundle.getString("add"));
            this.pack();    //making sure the content in the frame fits

        } else if (languageBox.getSelectedItem().toString().equalsIgnoreCase("french")) {
            bookLabel.setText(bundleFR.getString("bookName"));
            authorLabel.setText(bundleFR.getString("authorName"));
            stockLabel.setText(bundleFR.getString("stockLabel"));
            libraryLabel.setText(bundleFR.getString("title"));
            addBookButton.setText(bundleFR.getString("add"));
            this.pack();    //making sure the content in the frame fits
        }
    }//GEN-LAST:event_languageBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Library library = Library.getInstance();
                library.addBook(new Book("Harry Potter", "JK Rowling", 45));

                Controller controller = Controller.getInstance();
                MainForm mainForm = new MainForm();
                controller.setMainFormView(mainForm);
                LibraryController libraryController = new LibraryController(library, mainForm);
                mainForm.setLibraryController(libraryController);
                mainForm.setVisible(true);

            }
        });
    }

    public void setLibraryController(LibraryController libraryController) {
        this.libraryController = libraryController;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel authorLabel;
    public javax.swing.JTextField authorName;
    private javax.swing.JLabel bookLabel;
    public javax.swing.JTextField bookName;
    public javax.swing.JTextField bookStock;
    public javax.swing.JTextArea booksTextArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> languageBox;
    private javax.swing.JLabel languagesLabel;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JLabel stockLabel;
    // End of variables declaration//GEN-END:variables
}
