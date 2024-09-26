/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.repository;

import br.com.telemedicina.bd.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Talisson53899806
 */
public class PacienteRepository {
    
    public int realizaConsulta(String query, String parametro) {
        int resultado = 0;
        BD banco = new BD();
        banco.conectaBD();
        
        try (PreparedStatement ps = banco.getPreparedStatement(query)) {
            //Define o parâmetro para a consulta no SQL
            ps.setString(1, parametro);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    resultado = rs.getInt("ID");
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao realizar a consulta: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        } finally {
            banco.encerrarConexao();
            
        }
        
        return resultado;
    }
     
    public int getIdByNome(String nomePaciente) {
        String query = "SELECT ID FROM Paciente WHERE nome LIKE ?";
        return realizaConsulta(query, "%" + nomePaciente + "%");
        
    }
    
   
    
    public int getIdByCpf(String cpf) {
        String query = "SELECT ID FROM Paciente WHERE cpf LIKE ?";
        return realizaConsulta(query, cpf);
        
    }
    
}
