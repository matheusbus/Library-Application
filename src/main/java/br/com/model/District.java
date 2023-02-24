/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.model;

import java.util.Date;


/**
 *
 * @author Matheus
 */
public class District {

    private Integer id;
    private String name;
    private String postalCode;
    private City city;
    private Date dateRegistration;
    private Integer status;

    public District(Integer id, String name, String postalCode, City city, Date dateRegistration, Integer status) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.city = city;
        this.dateRegistration = dateRegistration;
        this.status = status;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "District{" + "id=" + id + ", name=" + name + ", postalCode=" + postalCode + ", city=" + city + ", dateRegistration=" + dateRegistration + ", status=" + status + '}';
    }

    
    
}
