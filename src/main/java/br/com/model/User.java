/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import br.com.model.constant.RegisterStatus;
import br.com.model.constant.UserType;
import java.util.Date;

/**
 *
 * @author Matheus
 */

public class User {
    
    private Integer id;
    private String login;
    private String password;
    private String mail;
    private Date dateRegistration;
    private Date dateUpdated;
    private UserType userType;
    private RegisterStatus status;

    public User(Integer id, String login, String password, String mail, Date dateRegistration, Date dateUpdated, UserType userType, RegisterStatus status) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.dateRegistration = dateRegistration;
        this.dateUpdated = dateUpdated;
        this.userType = userType;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public RegisterStatus getStatus() {
        return status;
    }

    public void setStatus(RegisterStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", password=" + password + ", mail=" + mail + ", dateRegistration=" + dateRegistration + ", dateUpdated=" + dateUpdated + ", userType=" + userType + ", status=" + status + '}';
    }
    
}
