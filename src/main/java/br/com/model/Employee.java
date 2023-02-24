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
public class Employee extends Person {
    
    private User empUser;
    private Date admissionDate;

    public Employee(User empUser, Date admissionDate, Integer id, String name, String cpf, String rg, String phone, Date bornDate, RegisterStatus status) {
        super(id, name, cpf, rg, phone, bornDate, status);
        this.empUser = empUser;
        this.admissionDate = admissionDate;
    }

    public User getEmpUser() {
        return empUser;
    }

    public void setEmpUser(User empUser) {
        this.empUser = empUser;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "empUser=" + empUser + ", admissionDate=" + admissionDate + '}';
    }
    
}
