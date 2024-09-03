/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD {
    private String url = "jdbc:mysql://localhost:3307/projetoIntegradorTelemedicina";
    private String user = "root";
    private String password = "senac";
    private Connection conn;
    
    public boolean conectaBD() {
        try {
            //Carrega o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelecer a conexão
            this.conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean encerrarConexao() {
        try {
           this.conn.close(); 
        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
        return true;
    }
    
    public PreparedStatement getPreparedStatement(String query) {
        try {
            return this.conn.prepareStatement(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
