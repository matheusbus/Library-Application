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
public class Shelf {
    
    private Integer id;
    private String description;
    private RegisterStatus status;
    private Hallway hallway;

    public Shelf(Integer id, String description, RegisterStatus status, Hallway hallway) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.hallway = hallway;
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

    public Hallway getHallway() {
        return hallway;
    }

    public void setHallway(Hallway hallway) {
        this.hallway = hallway;
    }

    @Override
    public String toString() {
        return "Shelf{" + "id=" + id + ", description=" + description + ", status=" + status + ", hallway=" + hallway + '}';
    }
    
}
