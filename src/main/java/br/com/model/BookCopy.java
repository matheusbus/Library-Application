/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

/**
 *
 * @author Matheus
 */
public class BookCopy {
    
    private Integer copyId;
    private Book book;

    public BookCopy(Integer copyId, Book book) {
        this.copyId = copyId;
        this.book = book;
    }

    public Integer getCopyId() {
        return copyId;
    }

    public void setCopyId(Integer copyId) {
        this.copyId = copyId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookCopy{" + "copyId=" + copyId + ", book=" + book + '}';
    }
    
}
