/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.model.constant.AddressType;
import br.com.model.constant.RegisterStatus;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Address {
    
    private Integer id;
    private String name;
    private AddressType type;
    private Date dateRegistration;
    private RegisterStatus status;

    public Address(Integer id, String name, AddressType type, Date dateRegistration, RegisterStatus status) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public RegisterStatus getStatus() {
        return status;
    }

    public void setStatus(RegisterStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", name=" + name + ", type=" + type + ", dateRegistration=" + dateRegistration + ", status=" + status + '}';
    }
    
}
