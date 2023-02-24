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
public class Hallway {
    
    private Integer id;
    private String description;
    private RegisterStatus status;

    public Hallway(Integer id, String description, RegisterStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RegisterStatus getStatus() {
        return status;
    }

    public void setStatus(RegisterStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Hallway{" + "id=" + id + ", description=" + description + ", status=" + status + '}';
    }
    
}
