
package br.ucs.view;

import br.ucs.DAO.EmpresaDAO;
import br.ucs.modelo.Empresa;
import javax.swing.table.DefaultTableModel;
import br.ucs.constants.AcaoDBEnum;
import java.util.List;

public class FORMEmpresa_J extends javax.swing.JDialog {
    
    public FORMEmpresa_J(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Empresa = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CNPJ = new javax.swing.JTextField();
        txt_Nome_Empresa = new javax.swing.JTextField();
        txt_ID_Empresa = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grid_Empresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Empresa", "CNPJ"
            }
        ));
        grid_Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_EmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Empresa);

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Nome Empresa:");

        jLabel4.setText("CPNJ:");

        txt_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CNPJActionPerformed(evt);
            }
        });

        txt_Nome_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_EmpresaActionPerformed(evt);
            }
        });

        txt_ID_Empresa.setEditable(false);
        txt_ID_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_EmpresaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Nome_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Nome_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnRemove)
                    .addComponent(btnAtualiza))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void carregaDados(){
           //Pega os dados no banco e inicializa a tabela (lembre-se que retorna uma list de elementos
           DefaultTableModel linha = (DefaultTableModel)grid_Empresa.getModel();
           
            //Precisa substituir esse for - Use um for(Classe classe : classes){ }
           if (linha.getRowCount() > 0) 
           {
             for (int i = linha.getRowCount() - 1; i > -1; i--) 
             {
                linha.removeRow(i);
             }
           }
           
           List<Empresa> lista = EmpresaDAO.retornarTodos();
           for (Empresa empresa : lista) {
            Object[] dados = {empresa.getIdEmpresa(), empresa.getNmEmpresa(), empresa.getCnpj()};
            linha.addRow(dados);
        }
        txt_ID_Empresa.setText("");
        txt_Nome_Empresa.setText("");
        txt_CNPJ.setText("");
       }
    
    private void txt_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CNPJActionPerformed

    private void txt_Nome_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_EmpresaActionPerformed

    private void txt_ID_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_EmpresaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Empresa.getModel();
        Empresa empresaNovo = new Empresa();
        empresaNovo.setNmEmpresa(txt_Nome_Empresa.getText());
        empresaNovo.setCnpj(txt_CNPJ.getText());
        EmpresaDAO.persistir(empresaNovo, AcaoDBEnum.INSERT);
        carregaDados();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void grid_EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_EmpresaMouseClicked
        String id    = grid_Empresa.getValueAt(grid_Empresa.getSelectedRow(),0).toString();
        String nome  = grid_Empresa.getValueAt(grid_Empresa.getSelectedRow(),1).toString();
        String cnpj = grid_Empresa.getValueAt(grid_Empresa.getSelectedRow(),2).toString();
        
        txt_ID_Empresa.setText(id);
        txt_Nome_Empresa.setText(nome);
        txt_CNPJ.setText(cnpj);
    }//GEN-LAST:event_grid_EmpresaMouseClicked

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        Empresa empresa = EmpresaDAO.retornarEmpresaPorId((Integer) grid_Empresa.getValueAt(grid_Empresa.getSelectedRow(), 0));
        empresa.setNmEmpresa(txt_Nome_Empresa.getText());
        empresa.setCnpj(txt_CNPJ.getText());
        EmpresaDAO.persistir(empresa, AcaoDBEnum.UPDATE);
        carregaDados();
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        Empresa empresa = EmpresaDAO.retornarEmpresaPorId((Integer) grid_Empresa.getValueAt(grid_Empresa.getSelectedRow(), 0));
        empresa.setNmEmpresa(txt_Nome_Empresa.getText());
        empresa.setCnpj(txt_CNPJ.getText());
        EmpresaDAO.persistir(empresa, AcaoDBEnum.DELETE);
        carregaDados();
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable grid_Empresa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_CNPJ;
    private javax.swing.JTextField txt_ID_Empresa;
    private javax.swing.JTextField txt_Nome_Empresa;
    // End of variables declaration//GEN-END:variables
}
