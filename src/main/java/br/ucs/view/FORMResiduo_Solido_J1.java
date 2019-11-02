
package br.ucs.view;

import javax.swing.table.DefaultTableModel;

public class FORMResiduo_Solido_J1 extends javax.swing.JDialog {
    
    public FORMResiduo_Solido_J1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Coleta_Residuos = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ID_Tipo_Residuo_Solido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Residuo_Solido_pai = new javax.swing.JTextField();
        txt_ID_Residuo = new javax.swing.JTextField();
        txt_Nome_Residuo_Solido = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grid_Coleta_Residuos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Resíduo", "Nome Resíduo", "ID Tipo Resíduo Sólido", "Resíduo Sólido Pai"
            }
        ));
        grid_Coleta_Residuos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_Coleta_ResiduosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Coleta_Residuos);

        btnRemove.setText("Remover");

        jLabel1.setText("Resíduo Sólido Pai:");

        txt_ID_Tipo_Residuo_Solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Tipo_Residuo_SolidoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Resíduo:");

        jLabel3.setText("Nome Resíduo Sólido:");

        jLabel4.setText("ID Tipo Resíduo Sólido:");

        txt_Residuo_Solido_pai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Residuo_Solido_paiActionPerformed(evt);
            }
        });

        txt_ID_Residuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_ResiduoActionPerformed(evt);
            }
        });

        txt_Nome_Residuo_Solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_Residuo_SolidoActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAtualiza.setText("Atualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Nome_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_ID_Residuo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Residuo_Solido_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ID_Tipo_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ID_Tipo_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID_Residuo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Residuo_Solido_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nome_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualiza)
                    .addComponent(btnRemove))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
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
           DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos.getModel();
           
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           for(int i = 0; i<5; i++){
               Object [] dados = {i,i,i,i,i,i,i,i,i};
               linha.addRow(dados);
           }
       }
    
    private void txt_ID_Tipo_Residuo_SolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Tipo_Residuo_SolidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Tipo_Residuo_SolidoActionPerformed

    private void txt_Residuo_Solido_paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Residuo_Solido_paiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Residuo_Solido_paiActionPerformed

    private void txt_ID_ResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_ResiduoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_ResiduoActionPerformed

    private void txt_Nome_Residuo_SolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_Residuo_SolidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_Residuo_SolidoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos.getModel();
        Object []dados ={ "","", "", ""};
        linha.addRow(dados);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void grid_Coleta_ResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_Coleta_ResiduosMouseClicked
        String id      = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),0).toString();
        String nome    = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),1).toString();
        String id_tipo = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),2).toString();
        String residuo = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),3).toString();
                
        txt_ID_Residuo.setText(id);
        txt_Nome_Residuo_Solido.setText(nome);
        txt_ID_Tipo_Residuo_Solido.setText(id_tipo);
        txt_Residuo_Solido_pai.setText(residuo);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ID_Residuo;
    private javax.swing.JTextField txt_ID_Tipo_Residuo_Solido;
    private javax.swing.JTextField txt_Nome_Residuo_Solido;
    private javax.swing.JTextField txt_Residuo_Solido_pai;
    // End of variables declaration//GEN-END:variables
}
