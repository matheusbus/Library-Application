/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import java.math.BigInteger;

/**
 *
 * @author Matheus
 */
public class City {
    
    private Integer id;
    private String name;
    private BigInteger ibgeCode;
    private State state;

    public City(Integer id, String name, BigInteger ibgeCode, State state) {
        this.id = id;
        this.name = name;
        this.ibgeCode = ibgeCode;
        this.state = state;
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

    public BigInteger getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(BigInteger ibgeCode) {
        this.ibgeCode = ibgeCode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", ibgeCode=" + ibgeCode + ", state=" + state + '}';
    }
    
}
