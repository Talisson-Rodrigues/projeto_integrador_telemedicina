/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Talisson53899806
 */
public class DataRepository {
    
    public static boolean validaData(String data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); //Não permite datas inválidas
        
        try {
            formato.parse(data); //SDE o formato estiver correto, o parse será bem -sucedido
            return true;
            
        } catch (ParseException ex) {
            return false; // Data inválida  
        }
    } 
}
