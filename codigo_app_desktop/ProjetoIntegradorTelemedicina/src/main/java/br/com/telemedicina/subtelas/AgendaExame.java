/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telemedicina.subtelas;

import br.com.telemedicina.bd.BD;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talisson53899806
 */
public class AgendaExame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgendaExame
     */
    public AgendaExame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNomePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTipoExame = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricaoExame = new javax.swing.JTextArea();
        botaoAgendar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoClinicas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        agendaExameTabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        campoDataExame = new javax.swing.JFormattedTextField();
        statusLabel = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(500);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(46, 169, 248));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agendar Exame");

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setToolTipText("");

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4430167.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do Paciente: ");

        campoNomePaciente.setBackground(new java.awt.Color(102, 102, 102));
        campoNomePaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNomePaciente.setForeground(new java.awt.Color(255, 255, 255));
        campoNomePaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo de Exame: ");

        campoTipoExame.setBackground(new java.awt.Color(102, 102, 102));
        campoTipoExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTipoExame.setForeground(new java.awt.Color(255, 255, 255));
        campoTipoExame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descrição do Exame: ");

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoDescricaoExame.setBackground(new java.awt.Color(102, 102, 102));
        campoDescricaoExame.setColumns(24);
        campoDescricaoExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDescricaoExame.setForeground(new java.awt.Color(255, 255, 255));
        campoDescricaoExame.setRows(5);
        campoDescricaoExame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(campoDescricaoExame);

        botaoAgendar.setBackground(new java.awt.Color(0, 204, 0));
        botaoAgendar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoAgendar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAgendar.setText("Agendar");
        botaoAgendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(campoNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(campoTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(209, 209, 209))
                    .addComponent(imageLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        botaoClinicas.setBackground(new java.awt.Color(255, 153, 51));
        botaoClinicas.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoClinicas.setForeground(new java.awt.Color(255, 255, 255));
        botaoClinicas.setText("Ver clínicas");
        botaoClinicas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoClinicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClinicasActionPerformed(evt);
            }
        });

        agendaExameTabela.setBackground(new java.awt.Color(102, 102, 102));
        agendaExameTabela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agendaExameTabela.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        agendaExameTabela.setForeground(new java.awt.Color(255, 255, 255));
        agendaExameTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Clínica", "Endereço Clinica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(agendaExameTabela);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data da Consulta: ");

        campoDataExame.setBackground(new java.awt.Color(102, 102, 102));
        campoDataExame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoDataExame.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoDataExame.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        statusLabel.setBackground(new java.awt.Color(255, 255, 255));
        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel)
                            .addComponent(botaoClinicas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoClinicas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendarActionPerformed
        if (!validaCampos()) {
            return;
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Exame.txt", true))) {
            
            String nomePaciente   = this.campoNomePaciente.getText();
            String tipoExame      = this.campoTipoExame.getText();
            String descricaoExame = this.campoDescricaoExame.getText();
            String dataExame      = this.campoDataExame.getText();
            
            bw.write(nomePaciente + ", " + tipoExame + ", " + descricaoExame + ", " + dataExame);
            
            JOptionPane.showMessageDialog(this,
                    "Cadastro de exame Concluído!!");
            this.setVisible(false);
                    
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao cadastrar Exame!! Error: " + e.getMessage());
        }
    }//GEN-LAST:event_botaoAgendarActionPerformed

    private boolean validaCampos() {
        if (this.campoNomePaciente.getText().equals("") ||
            this.campoTipoExame.getText().equals("") ||
            this.campoDescricaoExame.getText().equals("") ||
            this.campoDataExame.getText().equals("")) {
            
            this.errorLabel.setText("Ainda há campos em branco!!");
            return false;
        }
        this.errorLabel.setText("");
        return true;
    }
    
    private void botaoClinicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClinicasActionPerformed
        BD banco = new BD();
        boolean resultado =  banco.conectaBD();
        if (resultado == true) {
            this.statusLabel.setText("Status: Conectado ao banco de Dados!!");
        } else {
            this.statusLabel.setText("Status: Não conectado ao banco de dados!!");
            return;
        }
        
        String query = "SELECT nomeClinica, enderecoClinica FROM Clinica WHERE ID <= 10";
        PreparedStatement ps = banco.getPreparedStatement(query);
        
        try {
           ResultSet rs = ps.executeQuery();
           
           DefaultTableModel model = (DefaultTableModel) this.agendaExameTabela.getModel();
           if (model.getRowCount() > 0) {
               model.setRowCount(0);
           }
           
           while (rs.next()) {
               String[] dados = {rs.getString("nomeClinica"),
                                 rs.getString("enderecoClinica")};
               
               model.addRow(dados);
           }
           
           this.agendaExameTabela.setModel(model);
           rs.close();
           ps.close();
           banco.encerrarConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possivel realizar a consulta no BD !!! Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_botaoClinicasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable agendaExameTabela;
    private javax.swing.JButton botaoAgendar;
    private javax.swing.JButton botaoClinicas;
    private javax.swing.JFormattedTextField campoDataExame;
    private javax.swing.JTextArea campoDescricaoExame;
    private javax.swing.JTextField campoNomePaciente;
    private javax.swing.JTextField campoTipoExame;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}