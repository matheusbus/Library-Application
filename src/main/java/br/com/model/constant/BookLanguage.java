/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.model.constant;

/**
 *
 * @author Matheus
 */
public enum BookLanguage {
    
    INGLÊS(1),
    PORTUGUÊS(2),
    CHINÊS(3),
    HINDI(4),
    ESPANHOL(5),
    FRANCÊS(6),
    ÁRABE(7);
    
    private final int value;
    
    BookLanguage(int selectedValue){
        value = selectedValue;
    }
    
    public int getValue(){
        return value;
    }
            
}
