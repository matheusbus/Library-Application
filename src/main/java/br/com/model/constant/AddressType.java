/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.model.constant;

/**
 *
 * @author Matheus
 */
public enum AddressType {
    
    RUA(1), AVENIDA(2);
    
    private final int valor;
    
    AddressType(int selectedValue){
        valor = selectedValue;
    }
    
    public int getValor(){
        return valor;
    }
    
    
}
