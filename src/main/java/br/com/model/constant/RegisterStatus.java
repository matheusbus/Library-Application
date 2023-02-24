/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.model.constant;

/**
 *
 * @author Matheus
 */
public enum RegisterStatus {
    
    ATIVO(1),
    INATIVO(2);

    private final int value;
    
    RegisterStatus(int selectedValue){
        value = selectedValue;
    }
    
    public int getValue(){
        return value;
    }
    
    
    
    
}
