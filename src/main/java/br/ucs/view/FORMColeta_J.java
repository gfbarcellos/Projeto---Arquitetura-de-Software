
package br.ucs.view;

import javax.swing.table.DefaultTableModel;

public class FORMColeta_J extends javax.swing.JDialog {
    
    public FORMColeta_J(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Coleta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Data_Coleta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ID_Coleta = new javax.swing.JTextField();
        txt_ID_Municipio = new javax.swing.JTextField();
        txt_Populacao = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_ID_Local_Destino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_KM_Realizada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_ID_Veiculo = new javax.swing.JTextField();
        txt_ID_Empresa = new javax.swing.JTextField();
        txt_ID_Tipo_Coleta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grid_Coleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Coleta", "Data Coleta", "ID Município", "População Total", "ID Local Destino", "KM Realizada", "ID Veículo", "ID Empresa", "ID Tipo COleta"
            }
        ));
        grid_Coleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_ColetaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grid_ColetaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Coleta);

        jLabel1.setText("Data Coleta:");

        txt_Data_Coleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Data_ColetaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Coleta:");

        jLabel3.setText("ID Município:");

        jLabel4.setText("População Total:");

        txt_ID_Coleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_ColetaActionPerformed(evt);
            }
        });

        txt_ID_Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_MunicipioActionPerformed(evt);
            }
        });

        txt_Populacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PopulacaoActionPerformed(evt);
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

        jLabel5.setText("ID Local Destino:");

        txt_ID_Local_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Local_DestinoActionPerformed(evt);
            }
        });

        jLabel6.setText("KM Realizada:");

        txt_KM_Realizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KM_RealizadaActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Veículo:");

        jLabel8.setText("ID Empresa:");

        jLabel9.setText("ID Tipo de coleta:");

        txt_ID_Veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_VeiculoActionPerformed(evt);
            }
        });

        txt_ID_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_EmpresaActionPerformed(evt);
            }
        });

        txt_ID_Tipo_Coleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Tipo_ColetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ID_Local_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_ID_Coleta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_ID_Municipio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_Data_Coleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_Populacao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_ID_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_KM_Realizada, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_ID_Tipo_Coleta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ID_Coleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_KM_Realizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Data_Coleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ID_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ID_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Populacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_ID_Tipo_Coleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ID_Local_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualiza)
                    .addComponent(btnRemove)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void carregaDados(){
           //Pega os dados no banco e inicializa a tabela (lembre-se que retorna uma list de elementos
           DefaultTableModel linha = (DefaultTableModel)grid_Coleta.getModel();
           
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           for(int i = 0; i<5; i++){
               Object [] dados = {i,i,i,i,i,i,i,i,i};
               linha.addRow(dados);
           }
       }
    private void txt_Data_ColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Data_ColetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Data_ColetaActionPerformed

    private void txt_ID_ColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_ColetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_ColetaActionPerformed

    private void txt_ID_MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_MunicipioActionPerformed

    private void txt_PopulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PopulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PopulacaoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Coleta.getModel();
        Object []dados ={ "","", "", "", "","","","",""};
        linha.addRow(dados);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txt_ID_Local_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Local_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Local_DestinoActionPerformed

    private void txt_KM_RealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KM_RealizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_KM_RealizadaActionPerformed

    private void txt_ID_VeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_VeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_VeiculoActionPerformed

    private void txt_ID_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_EmpresaActionPerformed

    private void txt_ID_Tipo_ColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Tipo_ColetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Tipo_ColetaActionPerformed

    private void grid_ColetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_ColetaMouseClicked
        String id_coleta    = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),0).toString();
        String data_coleta  = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),1).toString();
        String id_municipio = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),2).toString();
        String populacao    = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),3).toString();
        String id_destino   = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),4).toString();
        String km           = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),5).toString();
        String id_veiculo   = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),6).toString();
        String id_empresa   = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),7).toString();
        String id_tp_coleta = grid_Coleta.getValueAt(grid_Coleta.getSelectedRow(),8).toString();
             
        txt_ID_Coleta.setText(id_coleta);
        txt_Data_Coleta.setText(data_coleta);
        txt_ID_Municipio.setText(id_municipio);
        txt_Populacao.setText(populacao);
        txt_ID_Empresa.setText(id_empresa);
        txt_ID_Local_Destino.setText(id_destino);
        txt_ID_Tipo_Coleta.setText(id_tp_coleta);
        txt_ID_Veiculo.setText(id_veiculo);
        txt_KM_Realizada.setText(km);
    }//GEN-LAST:event_grid_ColetaMouseClicked

    private void grid_ColetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_ColetaMousePressed

//        txt_Data_Coleta.setText("1");
    }//GEN-LAST:event_grid_ColetaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable grid_Coleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Data_Coleta;
    private javax.swing.JTextField txt_ID_Coleta;
    private javax.swing.JTextField txt_ID_Empresa;
    private javax.swing.JTextField txt_ID_Local_Destino;
    private javax.swing.JTextField txt_ID_Municipio;
    private javax.swing.JTextField txt_ID_Tipo_Coleta;
    private javax.swing.JTextField txt_ID_Veiculo;
    private javax.swing.JTextField txt_KM_Realizada;
    private javax.swing.JTextField txt_Populacao;
    // End of variables declaration//GEN-END:variables
}
