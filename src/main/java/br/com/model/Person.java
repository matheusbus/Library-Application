/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.model.constant.RegisterStatus;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Person {
    
    private Integer id;
    private String name;
    private String cpf;
    private String rg;
    private String phone;
    private Date bornDate;
    private RegisterStatus status;

    public Person(Integer id, String name, String cpf, String rg, String phone, Date bornDate, RegisterStatus status) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.bornDate = bornDate;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public RegisterStatus getStatus() {
        return status;
    }

    public void setStatus(RegisterStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", cpf=" + cpf + ", rg=" + rg + ", phone=" + phone + ", bornDate=" + bornDate + ", status=" + status + '}';
    }
    
}
