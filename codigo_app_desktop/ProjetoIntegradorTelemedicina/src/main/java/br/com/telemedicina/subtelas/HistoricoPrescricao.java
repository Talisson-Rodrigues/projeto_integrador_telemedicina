/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telemedicina.subtelas;

import br.com.telemedicina.bd.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talisson53899806
 */
public class HistoricoPrescricao extends javax.swing.JInternalFrame {

    /**
     * Creates new form HistoricoPrescricao
     */
    public HistoricoPrescricao() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        botaoConsulta = new javax.swing.JButton();
        botaoExcluirMed = new javax.swing.JButton();

        setClosable(true);

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(46, 169, 248));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagemHistoricodePrescricao.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Histórico de Prescrições");

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Médico", "Nome Paciente", "Data Prescrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 204, 0));

        botaoConsulta.setBackground(new java.awt.Color(255, 153, 0));
        botaoConsulta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        botaoConsulta.setText("Consultar");
        botaoConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        botaoExcluirMed.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluirMed.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirMed.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirMed.setText("Excluir");
        botaoExcluirMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(statusLabel)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
         BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if(resultado == true) {
            this.statusLabel.setText("Status: Conectado ao banco de dados!!");
        } else {
            this.statusLabel.setText("Status: Não conectado ao banco de dados!!");
            return;
        }
        
        String query = "SELECT me.nomeMed, pa.nome, pr.dataPrescricao FROM Medico me INNER JOIN prescricao pr ON me.ID = pr.ID_MEDICO INNER JOIN Paciente pa ON pa.ID = pr.ID_PACIENTE";
        PreparedStatement ps = banco.getPreparedStatement(query);
        
        try {
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            if (model.getRowCount() > 0) {
                model.setNumRows(0);
            }
            
            while (rs.next()) {
                String[] dados = {  rs.getString("me.nomeMed"),
                                    rs.getString("pa.nome"),
                                    rs.getDate("pr.dataPrescricao").toString()};
                
                model.addRow(dados);
            }
            
            this.jTable1.setModel(model);
            rs.close();
            ps.close();
            banco.encerrarConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível fazer a Consulta no BD!!!! Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_botaoConsultaActionPerformed

    private void botaoExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirMedActionPerformed
        //Codigo de exclusão de registro de prescrição
        int linhaSelecionada = this.jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Favor selecione um registro para excluir!");
            return;
        }

        String idPaciente =
        (String) this.jTable1.getValueAt(linhaSelecionada, 0);

        int opcao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente excluir a Prescricão " + idPaciente + "?",
            "Excluir", JOptionPane.OK_CANCEL_OPTION);

        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();
            
            String query1 = "DELETE FROM Prescricao WHERE ID_MEDICO = (SELECT ID FROM Medico WHERE nomeMed = ?)"; 
            String query2 = "DELETE FROM Prescricao WHERE medicamento = ?";

            try (PreparedStatement ps =banco.getPreparedStatement(query2)){
                ps.setString(1, query1);
                ps.setString(1, query2);
                boolean linhaApagada = ps.execute();

                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                        "Histórico excluido com sucesso!!");

                } else {
                    JOptionPane.showMessageDialog(this,
                        "Nenhum histórico encontrado para excluir.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                    "Erro ao excluir o histórico: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                return;
            }
        }
    }//GEN-LAST:event_botaoExcluirMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoExcluirMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
