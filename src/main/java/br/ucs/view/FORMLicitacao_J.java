
package br.ucs.view;

import javax.swing.table.DefaultTableModel;

public class FORMLicitacao_J extends javax.swing.JDialog {
    
    public FORMLicitacao_J(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_Data_Assinatura = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grid_Coleta_Residuos1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_ID_Municipio = new javax.swing.JTextField();
        btnNovo1 = new javax.swing.JButton();
        btnAtualiza1 = new javax.swing.JButton();
        btnRemove1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Valor = new javax.swing.JTextField();
        txt_ID_Licitacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_ID_Empresa = new javax.swing.JTextField();
        txt_Data_Validade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Valor:");

        txt_Data_Assinatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Data_AssinaturaActionPerformed(evt);
            }
        });

        grid_Coleta_Residuos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Empresa", "ID Município", "Valor", "Data Validade", "Data Assinatura"
            }
        ));
        grid_Coleta_Residuos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_Coleta_Residuos1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grid_Coleta_Residuos1);

        jLabel6.setText("ID Município:");

        txt_ID_Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_MunicipioActionPerformed(evt);
            }
        });

        btnNovo1.setText("Novo");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        btnAtualiza1.setText("Atualizar");

        btnRemove1.setText("Remover");

        jLabel7.setText("ID :");

        jLabel8.setText("Data Assinatura:");

        jLabel9.setText("Data Validade:");

        txt_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorActionPerformed(evt);
            }
        });

        txt_ID_Licitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_LicitacaoActionPerformed(evt);
            }
        });

        jLabel10.setText("ID Empresa:");

        txt_ID_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_EmpresaActionPerformed(evt);
            }
        });

        txt_Data_Validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Data_ValidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btnAtualiza1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_ID_Licitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ID_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Data_Validade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_Data_Assinatura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ID_Licitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_Data_Validade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_ID_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txt_Data_Assinatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo1)
                    .addComponent(btnAtualiza1)
                    .addComponent(btnRemove1))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void carregaDados(){
           //Pega os dados no banco e inicializa a tabela (lembre-se que retorna uma list de elementos
           DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos1.getModel();
           
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           for(int i = 0; i<5; i++){
               Object [] dados = {i,i,i,i,i,i,i,i,i};
               linha.addRow(dados);
           }
       }
    
    private void txt_Data_AssinaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Data_AssinaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Data_AssinaturaActionPerformed

    private void txt_ID_MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_MunicipioActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos1.getModel();
        Object []dados ={ "","", "", "", "",""};
        linha.addRow(dados);
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void txt_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorActionPerformed

    private void txt_ID_LicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_LicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_LicitacaoActionPerformed

    private void txt_ID_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_EmpresaActionPerformed

    private void txt_Data_ValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Data_ValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Data_ValidadeActionPerformed

    private void grid_Coleta_Residuos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_Coleta_Residuos1MouseClicked
        String id              = grid_Coleta_Residuos1.getValueAt(grid_Coleta_Residuos1.getSelectedRow(),0).toString();
        String id_empresa      = grid_Coleta_Residuos1.getValueAt(grid_Coleta_Residuos1.getSelectedRow(),1).toString();
        String id_municipio    = grid_Coleta_Residuos1.getValueAt(grid_Coleta_Residuos1.getSelectedRow(),2).toString();
        String valor           = grid_Coleta_Residuos1.getValueAt(grid_Coleta_Residuos1.getSelectedRow(),3).toString();
        String data_validade   = grid_Coleta_Residuos1.getValueAt(grid_Coleta_Residuos1.getSelectedRow(),4).toString();
        String data_assinatura = grid_Coleta_Residuos1.getValueAt(grid_Coleta_Residuos1.getSelectedRow(),5).toString();
        
        txt_ID_Licitacao.setText(id);
        txt_ID_Empresa.setText(id_empresa);
        txt_ID_Municipio.setText(id_municipio);
        txt_Valor.setText(valor);
        txt_Data_Validade.setText(data_validade);
        txt_Data_Assinatura.setText(data_assinatura);
        
        
    }//GEN-LAST:event_grid_Coleta_Residuos1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza1;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnRemove1;
    private javax.swing.JTable grid_Coleta_Residuos1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Data_Assinatura;
    private javax.swing.JTextField txt_Data_Validade;
    private javax.swing.JTextField txt_ID_Empresa;
    private javax.swing.JTextField txt_ID_Licitacao;
    private javax.swing.JTextField txt_ID_Municipio;
    private javax.swing.JTextField txt_Valor;
    // End of variables declaration//GEN-END:variables
}
