/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.model.constant.RegisterStatus;

/**
 *
 * @author Matheus
 */
public class PersonAdress {
    
    private Person person;
    private Address address;
    private String complement;
    private String referencePoint;
    private RegisterStatus status;

    public PersonAdress(Person person, Address address, String complement, String referencePoint, RegisterStatus status) {
        this.person = person;
        this.address = address;
        this.complement = complement;
        this.referencePoint = referencePoint;
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }

    public RegisterStatus getStatus() {
        return status;
    }

    public void setStatus(RegisterStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PersonAdress{" + "person=" + person + ", address=" + address + ", complement=" + complement + ", referencePoint=" + referencePoint + ", status=" + status + '}';
    }
    
}
