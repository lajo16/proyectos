
package pFormularios;

import java.sql.ResultSet;
import pClases.Empleado;
import pClases.EmpleadoDAO;

public class frmNuevoEmpleado extends javax.swing.JFrame {
    
    ResultSet rs;
    EmpleadoDAO objDAO = new EmpleadoDAO();
    
    public frmNuevoEmpleado() {
        initComponents();
        llenarCargo();
        llenarDistrito();
    }
 void llenarCargo() {
try {
 rs = objDAO.listadoCargos();
 while (rs.next()) {
 cboCargo.addItem(rs.getString(2));
 }
 } catch (Exception ex) {
 }
 }
void llenarDistrito() {
 try {
 rs = objDAO.listadoDistritos();
 while (rs.next()) {
 cboDistrito.addItem(rs.getString(2));
 }
} catch (Exception ex) {
 }
 }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtApellidos = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        cboDistrito = new javax.swing.JComboBox<>();
        cboCargo = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        txtFechaCon = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDOS"));

        txtFechaNac.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCION"));

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        cboDistrito.setBorder(javax.swing.BorderFactory.createTitledBorder("DISTRITO"));

        cboCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("CARGO"));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONO"));

        txtFechaCon.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CONTRATACION"));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboDistrito, 0, 159, Short.MAX_VALUE)
                                    .addComponent(cboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(210, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnRegistrar)
                .addGap(42, 501, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
Empleado objE = new Empleado(getApellidos(),getNombres(),
 getFechaNac(),getDireccion(),
getDistrito(),getTelefono(),
getCargo(),getFechaCon());
 objDAO.registraEmpleado(objE);
 }
String getApellidos() {
 return txtApellidos.getText();
 }
 String getNombres() {
 return txtNombres.getText();
 }
 String getFechaNac() {
 return txtFechaNac.getText();
 }
 String getDireccion() {
 return txtDireccion.getText();
 }
 int getDistrito() {
 return cboDistrito.getSelectedIndex() + 1;
 }
 String getTelefono() {
 return txtTelefono.getText();
 }
 int getCargo() {
 return cboCargo.getSelectedIndex() + 1;
 }
 String getFechaCon() {
 return txtFechaCon.getText();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNuevoEmpleado().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JComboBox<String> cboDistrito;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaCon;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
