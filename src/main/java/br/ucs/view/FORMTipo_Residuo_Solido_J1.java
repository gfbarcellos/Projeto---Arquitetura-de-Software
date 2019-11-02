
package br.ucs.view;

import javax.swing.table.DefaultTableModel;
import br.ucs.DAO.TipoResiduoSolidoDAO;
import br.ucs.constants.AcaoDBEnum;
import br.ucs.modelo.TipoResiduoSolido;
import java.util.List;

public class FORMTipo_Residuo_Solido_J1 extends javax.swing.JDialog {
    
    public FORMTipo_Residuo_Solido_J1(java.awt.Frame parent, boolean modal) {
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
        jLabel2 = new javax.swing.JLabel();
        txt_ID_Tipo_Residuo_Solido = new javax.swing.JTextField();
        txt_Nome_Residuo_Solido = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grid_Coleta_Residuos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Tipo Resíduo Sólido", "Nome Resíduo Sólido"
            }
        ));
        grid_Coleta_Residuos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_Coleta_ResiduosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Coleta_Residuos);

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Tipo Resíduo Sólido:");

        jLabel2.setText("Nome Resíduo Sólido:");

        txt_ID_Tipo_Residuo_Solido.setEditable(false);
        txt_ID_Tipo_Residuo_Solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_Tipo_Residuo_SolidoActionPerformed(evt);
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
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(txt_ID_Tipo_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Nome_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(325, 325, 325))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ID_Tipo_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nome_Residuo_Solido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualiza)
                    .addComponent(btnRemove))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void carregaDados(){
           //Pega os dados no banco e inicializa a tabela (lembre-se que retorna uma list de elementos
           DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos.getModel();
           if (linha.getRowCount() > 0) {
            for (int i = linha.getRowCount() - 1; i > -1; i--) {
                linha.removeRow(i);
            }
        }
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           List<TipoResiduoSolido> lista = TipoResiduoSolidoDAO.retornarTodos();
        //Precisa substituir esse for - Use um 
        for (TipoResiduoSolido tiporesiduo : lista) {
            Object[] dados = {tiporesiduo.getIdTipoResiduoSolido(), tiporesiduo.getNmTipoResiduoSolido()};
            linha.addRow(dados);
        }
        txt_ID_Tipo_Residuo_Solido.setText("");
        txt_Nome_Residuo_Solido.setText("");
       }
    
    private void txt_ID_Tipo_Residuo_SolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_Tipo_Residuo_SolidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_Tipo_Residuo_SolidoActionPerformed

    private void txt_Nome_Residuo_SolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_Residuo_SolidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_Residuo_SolidoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Coleta_Residuos.getModel();
        TipoResiduoSolido tipoResiduo = new TipoResiduoSolido();
        tipoResiduo.setNmTipoResiduoSolido(txt_Nome_Residuo_Solido.getText());
        TipoResiduoSolidoDAO.persistir(tipoResiduo, AcaoDBEnum.INSERT);
        carregaDados();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void grid_Coleta_ResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_Coleta_ResiduosMouseClicked
        String id    = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),0).toString();
        String nome  = grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(),1).toString();
        
        txt_ID_Tipo_Residuo_Solido.setText(id);
        txt_Nome_Residuo_Solido.setText(nome);
    }//GEN-LAST:event_grid_Coleta_ResiduosMouseClicked

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        TipoResiduoSolido tipoResiduo = TipoResiduoSolidoDAO.retornarTipoResiduoSolidoPorId((Integer) grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(), 0));
        tipoResiduo.setNmTipoResiduoSolido(txt_Nome_Residuo_Solido.getText());
        TipoResiduoSolidoDAO.persistir(tipoResiduo, AcaoDBEnum.UPDATE);
        carregaDados();
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        TipoResiduoSolido tipoResiduo = TipoResiduoSolidoDAO.retornarTipoResiduoSolidoPorId((Integer) grid_Coleta_Residuos.getValueAt(grid_Coleta_Residuos.getSelectedRow(), 0));
        tipoResiduo.setNmTipoResiduoSolido(txt_Nome_Residuo_Solido.getText());
        TipoResiduoSolidoDAO.persistir(tipoResiduo, AcaoDBEnum.DELETE);
        carregaDados();
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable grid_Coleta_Residuos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ID_Tipo_Residuo_Solido;
    private javax.swing.JTextField txt_Nome_Residuo_Solido;
    // End of variables declaration//GEN-END:variables
}
