/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.bd;

import java.sql.Connection;

public class BD {
    private String url = "jdbc:mysql://10.160.222.12:3307/projetoIntegradorTelemedicina";
    private String user = "root";
    private String password = "senac";
    private Connection conn;
    
    public boolean conectaBD() {
        try {
            //Carrega o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
    }
}
