
package br.ucs.view;

import javax.swing.table.DefaultTableModel;

public class FORMVeiculo_J1 extends javax.swing.JDialog {
    
    public FORMVeiculo_J1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_ID_Veiculo = new javax.swing.JTextField();
        txt_Nome_Veículo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Veiculo = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Placa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_KM_Total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ID_Empresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_ID_Veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_VeiculoActionPerformed(evt);
            }
        });

        txt_Nome_Veículo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_VeículoActionPerformed(evt);
            }
        });

        grid_Veiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Veículo", "ID Empresa", "KM Total", "Placa"
            }
        ));
        grid_Veiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_VeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Veiculo);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAtualiza.setText("Atualizar");

        btnRemove.setText("Remover");

        jLabel1.setText("ID :");

        jLabel2.setText("Nome Veículo:");

        jLabel3.setText("Placa:");

        txt_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PlacaActionPerformed(evt);
            }
        });

        jLabel4.setText("KM Total:");

        txt_KM_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KM_TotalActionPerformed(evt);
            }
        });

        jLabel5.setText("ID Empresa");

        txt_ID_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_EmpresaActionPerformed(evt);
            }
        });

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
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Nome_Veículo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ID_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_KM_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ID_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_KM_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_Nome_Veículo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualiza)
                    .addComponent(btnRemove))
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
           DefaultTableModel linha = (DefaultTableModel)grid_Veiculo.getModel();
           
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           for(int i = 0; i<5; i++){
               Object [] dados = {i,i,i,i,i,i,i,i,i};
               linha.addRow(dados);
           }
       }
    
    private void txt_ID_VeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_VeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_VeiculoActionPerformed

    private void txt_Nome_VeículoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_VeículoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_VeículoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Veiculo.getModel();
        Object []dados ={ "","", "", "", ""};
        linha.addRow(dados);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txt_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PlacaActionPerformed

    private void txt_KM_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KM_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_KM_TotalActionPerformed

    private void txt_ID_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_EmpresaActionPerformed

    private void grid_VeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_VeiculoMouseClicked
        // TODO add your handling code here:
        String id         = grid_Veiculo.getValueAt(grid_Veiculo.getSelectedRow(),0).toString();
        String nome       = grid_Veiculo.getValueAt(grid_Veiculo.getSelectedRow(),1).toString();
        String id_empresa = grid_Veiculo.getValueAt(grid_Veiculo.getSelectedRow(),2).toString();
        String km         = grid_Veiculo.getValueAt(grid_Veiculo.getSelectedRow(),3).toString();
        String placa      = grid_Veiculo.getValueAt(grid_Veiculo.getSelectedRow(),4).toString();
        
        txt_ID_Veiculo.setText(id);
        txt_Nome_Veículo.setText(nome);
        txt_ID_Empresa.setText(id_empresa);
        txt_KM_Total.setText(km);
        txt_Placa.setText(placa);
    }//GEN-LAST:event_grid_VeiculoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable grid_Veiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ID_Empresa;
    private javax.swing.JTextField txt_ID_Veiculo;
    private javax.swing.JTextField txt_KM_Total;
    private javax.swing.JTextField txt_Nome_Veículo;
    private javax.swing.JTextField txt_Placa;
    // End of variables declaration//GEN-END:variables
}
