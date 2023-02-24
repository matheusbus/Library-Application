/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Author {
    
    private Integer id;
    private String name;
    private Date dateRegistration;
    private User userRegistration;

    public Author(Integer id, String name, Date dateRegistration, User userRegistration) {
        this.id = id;
        this.name = name;
        this.dateRegistration = dateRegistration;
        this.userRegistration = userRegistration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public User getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(User userRegistration) {
        this.userRegistration = userRegistration;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", dateRegistration=" + dateRegistration + ", userRegistration=" + userRegistration + '}';
    }
    
}
