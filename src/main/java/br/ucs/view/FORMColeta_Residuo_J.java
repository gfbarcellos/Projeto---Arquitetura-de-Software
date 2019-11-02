
package br.ucs.view;

import javax.swing.table.DefaultTableModel;

public class FORMColeta_Residuo_J extends javax.swing.JDialog {
    
    public FORMColeta_Residuo_J(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Coleta_Residuos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_ID_Coleta_Residuo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ID_Coleta = new javax.swing.JTextField();
        txt_ID_Residuo_Solido = new javax.swing.JTextField();
        txt_Quantidade = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grid_Coleta_Residuos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Coleta Resíduo", "ID Coleta", "ID Resíduo Sólido", "Quantidade"
            }
        ));
        grid_Coleta_Residuos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_Coleta_ResiduosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Coleta_Residuos);

        jLabel1.setText("ID Coleta Resíduo:");

        txt_ID_Coleta_Residuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Coleta_ResiduoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Coleta:");

        jLabel3.setText("ID Resíduo Sólido:");

        jLabel4.setText("Quantiade:");

        txt_ID_Coleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_ColetaActionPerformed(evt);
            }
        });

        txt_ID_Residuo_Solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Residuo_SolidoActionPerformed(evt);
            }
        });

        txt_Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_QuantidadeActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAtualiza.setText("Atualizar");

        btnRemove.setText("Remover");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ID_Coleta)
                            .addComponent(txt_ID_Coleta_Residuo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ID_Residuo_Solido)
                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ID_Coleta_Residuo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_ID_Coleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualiza)
                    .addComponent(btnRemove))
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void carregaDados(){
           //Pega os dados no banco e inicializa a tabela (lembre-se que retorna uma list de elementos
           DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos.getModel();
           
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           for(int i = 0; i<5; i++){
               Object [] dados = {i,i,i,i};
               linha.addRow(dados);
           }
       }
    
    private void txt_ID_Coleta_ResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Coleta_ResiduoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Coleta_ResiduoActionPerformed

    private void txt_ID_ColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_ColetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_ColetaActionPerformed

    private void txt_ID_Residuo_SolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Residuo_SolidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Residuo_SolidoActionPerformed

    private void txt_QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QuantidadeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos.getModel();
        Object []dados ={ "","", "", ""};
        linha.addRow(dados);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void grid_Coleta_ResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_Coleta_ResiduosMouseClicked
        String id_coleta_residuo = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),0).toString();
        String id_coleta         = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),1).toString();
        String id_coleta_solido  = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),2).toString();
        String quantidade        = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),3).toString();
        
        txt_ID_Coleta_Residuo.setText(id_coleta_residuo);
        txt_ID_Coleta.setText(id_coleta);
        txt_ID_Residuo_Solido.setText(id_coleta_solido);
        txt_Quantidade.setText(quantidade);
    }//GEN-LAST:event_grid_Coleta_ResiduosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable grid_Coleta_Residuos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ID_Coleta;
    private javax.swing.JTextField txt_ID_Coleta_Residuo;
    private javax.swing.JTextField txt_ID_Residuo_Solido;
    private javax.swing.JTextField txt_Quantidade;
    // End of variables declaration//GEN-END:variables
}
