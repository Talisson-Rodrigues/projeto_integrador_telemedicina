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
    
    public String realizarConsulta(String query, String parametro) {
        String resultado = "";
        BD banco = new BD();
        banco.conectaBD();
        
        try (PreparedStatement ps = banco.getPreparedStatement(query)) {
            //Define o parâmetro para a consulta no SQL
            ps.setString(1, parametro);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    resultado = rs.getString("nome");
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
    
     public String realizaConsultas(String query, String parametro) {
        String resultado = "";
        BD banco = new BD();
        banco.conectaBD();
        
        try (PreparedStatement ps = banco.getPreparedStatement(query)) {
            //Define o parâmetro para a consulta no SQL
            ps.setString(1, parametro);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    resultado = rs.getString("cpf");
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
     
      public String realizarConsultas(String query, String parametro) {
        String resultado = "";
        BD banco = new BD();
        banco.conectaBD();
        
        try (PreparedStatement ps = banco.getPreparedStatement(query)) {
            //Define o parâmetro para a consulta no SQL
            ps.setString(1, parametro);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    resultado = rs.getString("endereco");
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
    
     private void exibirErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
     
    public int getIdByNome(String nomePaciente) {
        String query = "SELECT ID FROM Paciente WHERE nome LIKE ?";
        return realizaConsulta(query, "%" + nomePaciente + "%");
        
    }
    
   
    
    public int getIdByCpf(String cpf) {
        String query = "SELECT ID FROM Paciente WHERE cpf LIKE ?";
        return realizaConsulta(query, cpf);
        
    }
    
    public int getIdByEmail(String email) {
        String query = "SELECT ID FROM Paciente WHERE email LIKE ?";
        return realizaConsulta(query, email);
    }
    
    public int getIdByEmailArquivo() {
        String email = lerArquivoSessao();
        if (email == null) {
            return 0;
        }
        
        return getIdByEmail(email);
    }
    
    public String getNomeByEmail(String email) {
        String query = "SELECT nome FROM Paciente WHERE email LIKE ?";
        return realizarConsulta(query, email);
    }
    
    public String getCpfByEmail(String email) {
        String query = "SELECT cpf FROM Paciente WHERE email LIKE ?";
        return realizaConsultas(query, email);
    }
    
    public String getEnderecoByEmail(String email) {
        String query = "SELECT endereco FROM Paciente WHERE email LIKE ?";
        return realizarConsultas(query, email);
    }
    
    public String getNomeByEmailArquivo() {
        String email = lerArquivoSessao();
        if (email == null) {
            return "";
        }
        
        return getNomeByEmail(email);
    }
    
    public String getCpfByEmailArquivo() {
        String email = lerArquivoSessao();
        if (email == null) {
            return "";
        }
        
        return getCpfByEmail(email);
    }
    
    public String getEnderecoByEmailArquivo() {
        String email = lerArquivoSessao();
        if (email == null) {
            return "";
        }
        
        return getEnderecoByEmail(email);
    }
}
