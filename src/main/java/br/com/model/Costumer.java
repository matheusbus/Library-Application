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
public class Costumer extends Person {
    
    private Boolean receiveNews;
    private Boolean clubPart;

    public Costumer(Boolean receiveNews, Boolean clubPart, Integer id, String name, String cpf, String rg, String phone, Date bornDate, RegisterStatus status) {
        super(id, name, cpf, rg, phone, bornDate, status);
        this.receiveNews = receiveNews;
        this.clubPart = clubPart;
    }

    public Boolean getReceiveNews() {
        return receiveNews;
    }

    public void setReceiveNews(Boolean receiveNews) {
        this.receiveNews = receiveNews;
    }

    public Boolean getClubPart() {
        return clubPart;
    }

    public void setClubPart(Boolean clubPart) {
        this.clubPart = clubPart;
    }

    @Override
    public String toString() {
        return "Costumer{" + "receiveNews=" + receiveNews + ", clubPart=" + clubPart + '}';
    }
    
}
