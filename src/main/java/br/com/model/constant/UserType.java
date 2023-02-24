/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.model.constant;

/**
 *
 * @author Matheus
 */
public enum UserType {
    
    ADMIN(1),
    OPERATOR(2);
    
    private final int value;
    
    UserType(int selectedValue){
        value = selectedValue;
    }
    
    public int getValue(){
        return value;
    }
    
    
}
