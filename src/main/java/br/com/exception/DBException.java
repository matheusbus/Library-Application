/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.exception;

/**
 *
 * @author Matheus
 */
public class DBException extends RuntimeException{
    
    public DBException(String message) {
        super(message);
    }

}
