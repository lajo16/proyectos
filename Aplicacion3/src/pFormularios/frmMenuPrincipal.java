
package pFormularios;

public class frmMenuPrincipal extends javax.swing.JFrame {

    public frmMenuPrincipal() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        dpMenu = new javax.swing.JMenu();
        mListado = new javax.swing.JMenuItem();
        mRegistrar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpMenu.setText("Empleados");
        dpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpMenuActionPerformed(evt);
            }
        });

        mListado.setText("Lista de Empleados");
        mListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoActionPerformed(evt);
            }
        });
        dpMenu.add(mListado);

        mRegistrar.setText("Nuevo Empleado");
        mRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarActionPerformed(evt);
            }
        });
        dpMenu.add(mRegistrar);

        barraMenu.add(dpMenu);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        barraMenu.add(Salir);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpMenuActionPerformed

    }//GEN-LAST:event_dpMenuActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

    }//GEN-LAST:event_SalirActionPerformed

    private void mListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoActionPerformed
        frmListadoEmpleado objA=new frmListadoEmpleado();
        objA.setVisible(true);
    }//GEN-LAST:event_mListadoActionPerformed

    private void mRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarActionPerformed
            frmNuevoEmpleado objA=new frmNuevoEmpleado();
            objA.setVisible(true);
    }//GEN-LAST:event_mRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu dpMenu;
    private javax.swing.JMenuItem mListado;
    private javax.swing.JMenuItem mRegistrar;
    // End of variables declaration//GEN-END:variables
}
