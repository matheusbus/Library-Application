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
public class Publisher {
    
    private Integer id;
    private String name;
    private String cnpj;
    private Date dateRegistration;
    private User userRegistration;

    public Publisher(Integer id, String name, String cnpj, Date dateRegistration, User userRegistration) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "Publisher{" + "id=" + id + ", name=" + name + ", cnpj=" + cnpj + ", dateRegistration=" + dateRegistration + ", userRegistration=" + userRegistration + '}';
    }
    
}
