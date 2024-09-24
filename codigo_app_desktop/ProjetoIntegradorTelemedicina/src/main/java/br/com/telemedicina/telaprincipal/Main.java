/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package br.com.telemedicina.telaprincipal;

import br.com.telemedicina.bd.BD;
import br.com.telemedicina.subtelas.AgendaConsulta;
import br.com.telemedicina.subtelas.AgendaExame;
import br.com.telemedicina.subtelas.HistoricoConsulta;
import br.com.telemedicina.subtelas.HistoricoExame;
import br.com.telemedicina.subtelas.HistoricoPagamento;
import br.com.telemedicina.subtelas.HistoricoPrescricao;
import br.com.telemedicina.subtelas.NovaPrescricao;
import br.com.telemedicina.subtelas.TelaInicio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talisson53899806
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form MainP
     */
    public Main() {
        initComponents();
        TelaInicio inicio = new TelaInicio(this, true);
        inicio.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        botaoExcluirMed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nomeMedLabel = new javax.swing.JLabel();
        botaoExame = new javax.swing.JButton();
        botaoPrescricao = new javax.swing.JButton();
        labelBemVindo = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        statusLabelPaciente = new javax.swing.JLabel();
        botaoExcluirPac = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nomePacienteLabel = new javax.swing.JLabel();
        labelBemVindo1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        historicoConsulta = new javax.swing.JMenuItem();
        novaConsulta = new javax.swing.JMenuItem();
        examesMenu = new javax.swing.JMenu();
        historicoExame = new javax.swing.JMenuItem();
        agendaExame = new javax.swing.JMenuItem();
        prescricoesMenu = new javax.swing.JMenu();
        historicoPrescricao = new javax.swing.JMenuItem();
        novaPrescricao = new javax.swing.JMenuItem();
        pagamentosMenu = new javax.swing.JMenu();
        historicoPagamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPane.setAutoscrolls(true);
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBackground(new java.awt.Color(46, 169, 248));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pacientes do dia");

        jTableMedico.setBackground(new java.awt.Color(255, 255, 255));
        jTableMedico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTableMedico.setForeground(new java.awt.Color(0, 0, 0));
        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Paciente", "CPF", "Data nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMedico);

        botaoExcluirMed.setBackground(new java.awt.Color(204, 0, 0));
        botaoExcluirMed.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirMed.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirMed.setText("Excluir");
        botaoExcluirMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(statusLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        nomeMedLabel.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        nomeMedLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeMedLabel.setText("as");
        nomeMedLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(nomeMedLabel);
        nomeMedLabel.setBounds(9, 40, 813, 81);

        botaoExame.setBackground(new java.awt.Color(0, 0, 153));
        botaoExame.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExame.setForeground(new java.awt.Color(255, 255, 255));
        botaoExame.setText("Exame");
        botaoExame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(botaoExame);
        botaoExame.setBounds(560, 220, 130, 40);

        botaoPrescricao.setBackground(new java.awt.Color(0, 102, 153));
        botaoPrescricao.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoPrescricao.setForeground(new java.awt.Color(255, 255, 255));
        botaoPrescricao.setText("Prescrição");
        botaoPrescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(botaoPrescricao);
        botaoPrescricao.setBounds(740, 220, 130, 40);

        labelBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        labelBemVindo.setForeground(new java.awt.Color(0, 0, 0));
        labelBemVindo.setText("as");
        jPanel2.add(labelBemVindo);
        labelBemVindo.setBounds(10, 130, 813, 81);

        jSplitPane1.setRightComponent(jPanel2);

        jTabbedPane1.addTab("Médico", jSplitPane1);

        jSplitPane2.setDividerLocation(350);
        jSplitPane2.setDividerSize(0);

        jPanel3.setBackground(new java.awt.Color(46, 169, 248));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consultas");

        jTablePaciente.setBackground(new java.awt.Color(255, 255, 255));
        jTablePaciente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTablePaciente.setForeground(new java.awt.Color(0, 0, 0));
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Médico", "Horário Marcado", "Modelo de Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePaciente);

        botaoExcluirPac.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluirPac.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botaoExcluirPac.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirPac.setText("Excluir");
        botaoExcluirPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoExcluirPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(statusLabelPaciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoExcluirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botaoExcluirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        nomePacienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        nomePacienteLabel.setForeground(new java.awt.Color(0, 0, 0));

        labelBemVindo1.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        labelBemVindo1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomePacienteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelBemVindo1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(nomePacienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBemVindo1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel4);

        jTabbedPane1.addTab("Paciente", jSplitPane2);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, -37, 1280, 760);

        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoConsulta.setText("Histórico de consultas");
        historicoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(historicoConsulta);

        novaConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        novaConsulta.setText("Nova Consulta");
        novaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(novaConsulta);

        menuBar.add(jMenu3);

        examesMenu.setText("Exames");
        examesMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoExame.setText("Histórico de Exames");
        historicoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoExameActionPerformed(evt);
            }
        });
        examesMenu.add(historicoExame);

        agendaExame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agendaExame.setText("Agendar Exames");
        agendaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaExameActionPerformed(evt);
            }
        });
        examesMenu.add(agendaExame);

        menuBar.add(examesMenu);

        prescricoesMenu.setText("Prescrições");
        prescricoesMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        historicoPrescricao.setText("Histórico de Prescrições");
        historicoPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoPrescricaoActionPerformed(evt);
            }
        });
        prescricoesMenu.add(historicoPrescricao);

        novaPrescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        novaPrescricao.setText("Nova Prescrição");
        novaPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaPrescricaoActionPerformed(evt);
            }
        });
        prescricoesMenu.add(novaPrescricao);

        menuBar.add(prescricoesMenu);

        pagamentosMenu.setText("Pagamentos");
        pagamentosMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        historicoPagamento.setText("Histórico de Pagamentos");
        historicoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoPagamentoActionPerformed(evt);
            }
        });
        pagamentosMenu.add(historicoPagamento);

        menuBar.add(pagamentosMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1277, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historicoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoConsultaActionPerformed
        HistoricoConsulta histoConsulta = new HistoricoConsulta();
        this.desktopPane.add(histoConsulta);
        histoConsulta.setVisible(true);
    }//GEN-LAST:event_historicoConsultaActionPerformed

    private void novaPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPrescricaoActionPerformed
        NovaPrescricao prescricao = new NovaPrescricao();
        this.desktopPane.add(prescricao);
        prescricao.setVisible(true);
    }//GEN-LAST:event_novaPrescricaoActionPerformed

    private void novaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaConsultaActionPerformed
        AgendaConsulta consulta = new AgendaConsulta();
        this.desktopPane.add(consulta);
        consulta.setVisible(true);
    }//GEN-LAST:event_novaConsultaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         //ler o arquivo que contem as informacao de quem esta logado no sistema
       try (BufferedReader br = new BufferedReader(new FileReader("sessao"))) {
           //verificar qual o tipo de quem esta logado (medico ou paciente)
           String linha;
           String[] dados = {};
           
           while ((linha = br.readLine()) != null) {
               dados = linha.split(",");
           }
           
           BD banco = new BD();
           banco.conectaBD();
           
           //Aba Médico
           if(dados[1].equals("Médico")) {
                //ativar a aba correspondente
                this.jTabbedPane1.removeTabAt(1);
                 
                //Inicia a tabela junto ao sistema
                String query  = "SELECT nome, cpf, dataNascimento FROM Paciente WHERE ID <= 10";
                String query2 = "SELECT nomeMed FROM Medico WHERE emailMed LIKE ?";
                PreparedStatement ps = banco.getPreparedStatement(query);

                try {
                    ResultSet rs = ps.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) this.jTableMedico.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }


                    while (rs.next()) {
                       String[] dadosMedico = { rs.getString("nome"),
                                          rs.getString("cpf"),
                                          rs.getDate("dataNascimento").toString()}; 

                       model.addRow(dadosMedico);
                    }
                    this.jTableMedico.setModel(model);
                    //Termina carregamento da tabela
                    
                    //Coloca o nome no Jlabel
                    ps = banco.getPreparedStatement(query2);
                    
                    ps.setString(1, dados[0]);
                    
                    rs = ps.executeQuery();
                    
                    String dadosNomeMed = "";
                    
                    while (rs.next()) {
                        dadosNomeMed = rs.getString("nomeMed");
                    }
                    
                    this.nomeMedLabel.setText("Olá, " + dadosNomeMed);
                    this.labelBemVindo.setText("Seja Muito Bem-Vindo!!");
                    
                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, 
                    "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
                }
                
                
             //Aba Paciente
           } else if (dados[1].equals("Paciente")) {
               //ativar a aba correspondente
                this.jTabbedPane1.removeTabAt(0);
                
                //Remove as opções de menu para Agendar exame e Nova prescrição
                this.examesMenu.remove(agendaExame);
                this.prescricoesMenu.remove(novaPrescricao);
                
                //Inicia a tabela junto ao sistema
                String query = "SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO WHERE m.enderecoMed LIKE '%DF'";
                String query2 = "SELECT nome FROM Paciente WHERE email LIKE ?";
                PreparedStatement ps = banco.getPreparedStatement(query);
        
                try {
                    ResultSet rs = ps.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) this.jTablePaciente.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }


                    while (rs.next()) {
                       String[] dadosPaciente = { rs.getString("m.nomeMed"),
                                          rs.getDate("cs.dataConsulta").toString(),
                                          rs.getString("cs.formatoConsulta")}; 

                       model.addRow(dadosPaciente);
                    }
                    this.jTablePaciente.setModel(model);
                    
                    ps = banco.getPreparedStatement(query2);
                    
                    ps.setString(1, dados[0]);
                    
                    rs = ps.executeQuery();
                    
                    String dadosNomePac = "";
                    while (rs.next()) {
                        dadosNomePac = rs.getString("nome");
                        
                    }
                    this.nomePacienteLabel.setText("Olá, " + dadosNomePac);
                    this.labelBemVindo1.setText("Seja Muito Bem-Vindo!!");
                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, 
                    "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
                }
                   }        
           
       } catch (IOException e) {
           JOptionPane.showMessageDialog(this,
                   "Não foi possível iniciar o sistema!! Error: " + e.getMessage());
           e.printStackTrace();
       }
    }//GEN-LAST:event_formWindowOpened

    private void agendaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaExameActionPerformed
        AgendaExame exame = new AgendaExame();
        this.desktopPane.add(exame);
        exame.setVisible(true);
    }//GEN-LAST:event_agendaExameActionPerformed

    private void historicoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoExameActionPerformed
        HistoricoExame histoExame = new HistoricoExame();
        this.desktopPane.add(histoExame);
        histoExame.setVisible(true);
    }//GEN-LAST:event_historicoExameActionPerformed

    private void historicoPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoPrescricaoActionPerformed
        HistoricoPrescricao histoPrescricao = new HistoricoPrescricao();
        this.desktopPane.add(histoPrescricao);
        histoPrescricao.setVisible(true);
    }//GEN-LAST:event_historicoPrescricaoActionPerformed

    private void botaoExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirMedActionPerformed
        int linhaSelecionada = this.jTableMedico.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecione um registro para excluir!");
            return;
        }
        
        String idPaciente =
                (String) this.jTableMedico.getValueAt(linhaSelecionada, 0);
        
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir o Paciente " + idPaciente + "?",
                "Excluir", JOptionPane.OK_CANCEL_OPTION);
        
        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();
            
            String query2 = "DELETE FROM Consulta WHERE ID_PACIENTE = (SELECT ID FROM Paciente WHERE nome = ?)";
            String query = "DELETE FROM Paciente WHERE nome = ?";
            
            try (PreparedStatement ps =banco.getPreparedStatement(query)){
                ps.setString(1, query2);
                ps.setString(1, query);
                boolean linhaApagada = ps.execute();
                
                 
                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.jTableMedico.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                            "Registro excluido com sucesso!!");
                
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Nenhum registro encontrado para excluir.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao excluir o registro: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                return;
            }
        }
    }//GEN-LAST:event_botaoExcluirMedActionPerformed

    private void botaoExcluirPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPacActionPerformed
        int linhaSelecionada = this.jTablePaciente.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecione um registro para excluir!");
            return;
        }
        
        String idMedico =
                (String) this.jTablePaciente.getValueAt(linhaSelecionada, 0);
        
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir a Consulta com " + idMedico + "?",
                "Excluir", JOptionPane.OK_CANCEL_OPTION);
        
        if (opcao == 0) {
            BD banco = new BD();
            banco.conectaBD();
            
            String query2 = "DELETE FROM Consulta WHERE ID_MEDICO = (SELECT ID FROM Medico WHERE nomeMed = ?)";
            String query = "DELETE FROM Medico WHERE nomeMed = ?";
            
            try (PreparedStatement ps =banco.getPreparedStatement(query)){
                ps.setString(1, query2);
                ps.setString(1, query);
                boolean linhaApagada = ps.execute();
                
                 
                if (linhaApagada == false) {
                    //Remove a linha da jTable
                    DefaultTableModel model = (DefaultTableModel) this.jTablePaciente.getModel();
                    model.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(this,
                            "Registro excluido com sucesso!!");
                
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Nenhum registro encontrado para excluir.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao excluir o registro: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                return;
            }
        }
    }//GEN-LAST:event_botaoExcluirPacActionPerformed

    private void historicoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoPagamentoActionPerformed
        HistoricoPagamento hpg = new HistoricoPagamento();
        this.desktopPane.add(hpg);
        hpg.setVisible(true);
    }//GEN-LAST:event_historicoPagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agendaExame;
    private javax.swing.JButton botaoExame;
    private javax.swing.JButton botaoExcluirMed;
    private javax.swing.JButton botaoExcluirPac;
    private javax.swing.JButton botaoPrescricao;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu examesMenu;
    private javax.swing.JMenuItem historicoConsulta;
    private javax.swing.JMenuItem historicoExame;
    private javax.swing.JMenuItem historicoPagamento;
    private javax.swing.JMenuItem historicoPrescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableMedico;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelBemVindo1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nomeMedLabel;
    private javax.swing.JLabel nomePacienteLabel;
    private javax.swing.JMenuItem novaConsulta;
    private javax.swing.JMenuItem novaPrescricao;
    private javax.swing.JMenu pagamentosMenu;
    private javax.swing.JMenu prescricoesMenu;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusLabelPaciente;
    // End of variables declaration//GEN-END:variables

}
