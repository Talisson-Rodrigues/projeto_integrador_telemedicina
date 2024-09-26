/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.telemedicina.repository;

import br.com.telemedicina.bd.BD;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Talisson53899806
 */
public class MedicoRepository {
   
    public int getIdbyEmail() {
        String email = lerArquivoSessao();
        if (email == null) {
            return 0; //Retorna 0 se o email não foi encontrado
            
        }
        
        return obterIdPorEmail(email);
    }
    
    private String lerArquivoSessao() {
        try (BufferedReader br = new BufferedReader(new FileReader("sessao"))) {
            String linha;
            if((linha = br.readLine()) != null) {
                return linha.split(",")[0]; //Retorna o primeiro dado (email)
                
            } else {
                exibirErro("Arquivo de sessão vazio ou inválido!!");
            }
            
        } catch (IOException ie) {
            exibirErro("Erro ao ler o arquivo: " + ie.getMessage());
            
        }
        
        return null; //Retorna null se ocorrer um erro
    }
    
    private int obterIdPorEmail(String email) {
        String query = "SELECT ID FROM Medico WHERE emailMed LIKE ?";
        return realizaConsulta(query, email);
        
    }
    
    private int realizaConsulta(String query, String parametro) {
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
    
    private void exibirErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private int getIdByNome(String nomeMed) {
        String query = "SELECT ID FROM Medico WHERE nomeMed LIKE ?";
        return realizaConsulta(query, nomeMed);
    }
}
