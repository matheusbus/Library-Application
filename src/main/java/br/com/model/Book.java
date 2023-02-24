/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.model.constant.BookLanguage;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Book {
    
    private Integer id;
    private String title;
    private Date publicationDate;
    private Publisher publisherCompany;
    private Author author;
    private String synopse;
    private Integer pageCount;
    private BookLanguage bookLanguage;
    private String isbn10code;
    private String isbn13code;
    private User userRegistration;
    private Date dateRegistration;
    private Shelf shelfLocate;

    public Book(Integer id, String title, Date publicationDate, Publisher publisherCompany, Author author, String synopse, 
                Integer pageCount, BookLanguage bookLanguage, String isbn10code, String isbn13code, User userRegistration, 
                Date dateRegistration, Shelf shelfLocate) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.publisherCompany = publisherCompany;
        this.author = author;
        this.synopse = synopse;
        this.pageCount = pageCount;
        this.bookLanguage = bookLanguage;
        this.isbn10code = isbn10code;
        this.isbn13code = isbn13code;
        this.userRegistration = userRegistration;
        this.dateRegistration = dateRegistration;
        this.shelfLocate = shelfLocate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Publisher getPublisherCompany() {
        return publisherCompany;
    }

    public void setPublisherCompany(Publisher publisherCompany) {
        this.publisherCompany = publisherCompany;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getSynopse() {
        return synopse;
    }

    public void setSynopse(String synopse) {
        this.synopse = synopse;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public BookLanguage getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(BookLanguage bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public String getIsbn10code() {
        return isbn10code;
    }

    public void setIsbn10code(String isbn10code) {
        this.isbn10code = isbn10code;
    }

    public String getIsbn13code() {
        return isbn13code;
    }

    public void setIsbn13code(String isbn13code) {
        this.isbn13code = isbn13code;
    }

    public User getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(User userRegistration) {
        this.userRegistration = userRegistration;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Shelf getShelfLocate() {
        return shelfLocate;
    }

    public void setShelfLocate(Shelf shelfLocate) {
        this.shelfLocate = shelfLocate;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", publicationDate=" 
                + publicationDate + ", publisherCompany=" + publisherCompany + ", author=" + author + ", synopse=" 
                + synopse + ", pageCount=" + pageCount + ", bookLanguage=" + bookLanguage + ", isbn10code=" 
                + isbn10code + ", isbn13code=" + isbn13code + ", userRegistration=" + userRegistration + ", dateRegistration="
                + dateRegistration + ", shelfLocate=" + shelfLocate + '}';
    }
    
    
    
}
