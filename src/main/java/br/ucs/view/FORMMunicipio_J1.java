
package br.ucs.view;

import br.ucs.DAO.EmpresaDAO;
import javax.swing.table.DefaultTableModel;
import br.ucs.DAO.MunicipioDAO;
import br.ucs.constants.AcaoDBEnum;
import br.ucs.modelo.Municipio;
import java.util.List;

public class FORMMunicipio_J1 extends javax.swing.JDialog {
    
    public FORMMunicipio_J1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Populacao_Total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Populacao_Urbana = new javax.swing.JTextField();
        txt_ID_Municipio = new javax.swing.JTextField();
        txt_Nome_Municipio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Municipio = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_Populacao_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Populacao_TotalActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Nome Município:");

        jLabel4.setText("Poputalção Total:");

        txt_Populacao_Urbana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Populacao_UrbanaActionPerformed(evt);
            }
        });

        txt_ID_Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_MunicipioActionPerformed(evt);
            }
        });

        txt_Nome_Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_MunicipioActionPerformed(evt);
            }
        });

        grid_Municipio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Município", "População Total", "População Urbana"
            }
        ));
        grid_Municipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_MunicipioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_Municipio);

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

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("População Urbana:");

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
                                .addComponent(txt_Nome_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_ID_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Populacao_Urbana, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Populacao_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Populacao_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Populacao_Urbana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nome_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
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
           DefaultTableModel linha = (DefaultTableModel)grid_Municipio.getModel();
           if (linha.getRowCount() > 0) {
            for (int i = linha.getRowCount() - 1; i > -1; i--) {
                linha.removeRow(i);
            }
        }
           
            List<Municipio> lista = MunicipioDAO.retornarTodos();
            for (Municipio municipio : lista) {
            Object[] dados = {municipio.getIdMunicipio(),municipio.getNmMunicipio(), municipio.getPopTotal(), municipio.getPopUrbana() };
            linha.addRow(dados);
        }
        txt_ID_Municipio.setText("");
        txt_Nome_Municipio.setText("");
        txt_Populacao_Total.setText("");
        txt_Populacao_Urbana.setText("");
       }
    
    private void txt_Populacao_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Populacao_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Populacao_TotalActionPerformed

    private void txt_Populacao_UrbanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Populacao_UrbanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Populacao_UrbanaActionPerformed

    private void txt_ID_MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_MunicipioActionPerformed

    private void txt_Nome_MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_MunicipioActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        DefaultTableModel linha = (DefaultTableModel)grid_Municipio.getModel();
        Municipio municipio = new Municipio();
        municipio.setNmMunicipio(txt_Nome_Municipio.getText());
        municipio.setPopTotal(Integer.valueOf(txt_Populacao_Total.getText()));
        municipio.setPopUrbana(Integer.valueOf(txt_Populacao_Urbana.getText()));
        carregaDados();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void grid_MunicipioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_MunicipioMouseClicked
        String id               = grid_Municipio.getValueAt(grid_Municipio.getSelectedRow(),0).toString();
        String nome             = grid_Municipio.getValueAt(grid_Municipio.getSelectedRow(),1).toString();
        String populacao_total  = grid_Municipio.getValueAt(grid_Municipio.getSelectedRow(),2).toString();
        String populacao_urbana = grid_Municipio.getValueAt(grid_Municipio.getSelectedRow(),3).toString();
        
        txt_ID_Municipio.setText(id);
        txt_Nome_Municipio.setText(nome);
        txt_Populacao_Total.setText(populacao_total);
        txt_Populacao_Urbana.setText(populacao_urbana);
    }//GEN-LAST:event_grid_MunicipioMouseClicked

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        Municipio municipio = MunicipioDAO.retornarMunicipioPorId((Integer) grid_Municipio.getValueAt(grid_Municipio.getSelectedRow(), 0));
        municipio.setNmMunicipio(txt_Nome_Municipio.getText());
        municipio.setPopTotal(Integer.valueOf(txt_Populacao_Total.getText()));
        municipio.setPopUrbana(Integer.valueOf(txt_Populacao_Urbana.getText()));
        EmpresaDAO.persistir(municipio, AcaoDBEnum.UPDATE);
        carregaDados();
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        Municipio municipio = MunicipioDAO.retornarMunicipioPorId((Integer) grid_Municipio.getValueAt(grid_Municipio.getSelectedRow(), 0));
        municipio.setNmMunicipio(txt_Nome_Municipio.getText());
        municipio.setPopTotal(Integer.valueOf(txt_Populacao_Total.getText()));
        municipio.setPopUrbana(Integer.valueOf(txt_Populacao_Urbana.getText()));
        EmpresaDAO.persistir(municipio, AcaoDBEnum.DELETE);
        carregaDados();
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable grid_Municipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ID_Municipio;
    private javax.swing.JTextField txt_Nome_Municipio;
    private javax.swing.JTextField txt_Populacao_Total;
    private javax.swing.JTextField txt_Populacao_Urbana;
    // End of variables declaration//GEN-END:variables
}
