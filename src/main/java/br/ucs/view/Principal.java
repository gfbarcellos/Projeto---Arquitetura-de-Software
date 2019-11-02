package br.ucs.view;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadastar = new javax.swing.JMenu();
        btnLocal = new javax.swing.JMenuItem();
        btnColetaResiduo = new javax.swing.JMenuItem();
        btnResiduoSolido = new javax.swing.JMenuItem();
        btnTipoResiduoSolido = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        btnEditar = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastar.setText("Cadastros");

        btnLocal.setText("Local");
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });
        btnCadastar.add(btnLocal);

        btnColetaResiduo.setText("Coleta Resíduo");
        btnColetaResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColetaResiduoActionPerformed(evt);
            }
        });
        btnCadastar.add(btnColetaResiduo);

        btnResiduoSolido.setText("Resíduo Sólido");
        btnResiduoSolido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResiduoSolidoActionPerformed(evt);
            }
        });
        btnCadastar.add(btnResiduoSolido);

        btnTipoResiduoSolido.setText("Tipo Resíduo Sólido");
        btnTipoResiduoSolido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoResiduoSolidoActionPerformed(evt);
            }
        });
        btnCadastar.add(btnTipoResiduoSolido);

        jMenuItem1.setText("Tipo Coleta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnCadastar.add(jMenuItem1);

        jMenuItem2.setText("Município");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnCadastar.add(jMenuItem2);

        jMenuItem3.setText("Empresa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btnCadastar.add(jMenuItem3);

        jMenuItem4.setText("Veículo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btnCadastar.add(jMenuItem4);

        jMenuItem5.setText("Licitação");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btnCadastar.add(jMenuItem5);

        jMenuItem6.setText("Coleta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        btnCadastar.add(jMenuItem6);

        jMenuBar1.add(btnCadastar);

        btnEditar.setText("Relatórios");

        jMenuItem7.setText("Coleta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        btnEditar.add(jMenuItem7);

        jMenuBar1.add(btnEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        // TODO add your handling code here:
        FORMLocal local = new FORMLocal(this, true);
        local.setVisible(true);
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnColetaResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColetaResiduoActionPerformed
        FORMColeta_Residuo_J coleta = new FORMColeta_Residuo_J(this, true);
        coleta.setVisible(true);
    }//GEN-LAST:event_btnColetaResiduoActionPerformed

    private void btnTipoResiduoSolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoResiduoSolidoActionPerformed
        FORMTipo_Residuo_Solido_J1 residuo_solido = new FORMTipo_Residuo_Solido_J1(this, true);
        ;
        residuo_solido.setVisible(true);
    }//GEN-LAST:event_btnTipoResiduoSolidoActionPerformed

    private void btnResiduoSolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResiduoSolidoActionPerformed
        FORMResiduo_Solido_J1 residuo = new FORMResiduo_Solido_J1(this, true);
        residuo.setVisible(true);
    }//GEN-LAST:event_btnResiduoSolidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FORMTipo_Coleta_J1 coleta = new FORMTipo_Coleta_J1(this, true);
        coleta.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FORMMunicipio_J1 municipio = new FORMMunicipio_J1(this, true);
        municipio.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FORMEmpresa_J empresa = new FORMEmpresa_J(this, true);
        empresa.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FORMVeiculo_J1 veiculo = new FORMVeiculo_J1(this, true);
        veiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FORMLicitacao_J licitacao = new FORMLicitacao_J(this, true);
        licitacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FORMColeta_J coleta = new FORMColeta_J(this, true);
        coleta.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        RelColeta coleta = new RelColeta(this, true);
        coleta.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }
    RelColeta relatorioColeta = new RelColeta(this, true);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCadastar;
    private javax.swing.JMenuItem btnColetaResiduo;
    private javax.swing.JMenu btnEditar;
    private javax.swing.JMenuItem btnLocal;
    private javax.swing.JMenuItem btnResiduoSolido;
    private javax.swing.JMenuItem btnTipoResiduoSolido;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
