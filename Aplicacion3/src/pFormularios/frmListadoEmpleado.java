
package pFormularios;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import pClases.EmpleadoDAO;

public class frmListadoEmpleado extends javax.swing.JFrame {
    
    ResultSet rs;
 Object[] fila = new Object[100];
 DefaultTableModel moEmpleados;

 
    public frmListadoEmpleado() {
        initComponents();
            formatoTabla();
            definirAnchos();
            listado();
    }
void formatoTabla() {
 moEmpleados = new DefaultTableModel();
 String[] cabecera = {"ID", "APELLIDO", "NOMBRE", "NACIMIENTO", 
 "DIRECCION", "DISTRITO", "TELEFONO", "CARGO","CONTRATACION"};
 moEmpleados.setColumnIdentifiers(cabecera);
 tEmpleados.setModel(moEmpleados);
 definirAnchos();
 }
void listado() {
try {
 EmpleadoDAO objDAO = new EmpleadoDAO();
 rs = objDAO.listadoEmpleados();
 while (rs.next()) {
 fila[0] = rs.getString(1);
 fila[1] = rs.getString(2);
 fila[2] = rs.getString(3);
 fila[3] = rs.getString(4);
 fila[4] = rs.getString(5);
 fila[5] = rs.getString(6);
 fila[6] = rs.getString(7);
 fila[7] = rs.getString(8);
 fila[8] = rs.getString(9);
 moEmpleados.addRow(fila);
 }
 } catch (Exception ex) {
 }
 }
public void definirAnchos() {
 TableColumn columna;
 columna = tEmpleados.getColumnModel().getColumn(0);
 columna.setPreferredWidth(70);
 columna = tEmpleados.getColumnModel().getColumn(1);
 columna.setPreferredWidth(200);
 columna = tEmpleados.getColumnModel().getColumn(2);
 columna.setPreferredWidth(100);
 columna = tEmpleados.getColumnModel().getColumn(3);
 columna.setPreferredWidth(200);
 columna = tEmpleados.getColumnModel().getColumn(4);
 columna.setPreferredWidth(100);
 columna = tEmpleados.getColumnModel().getColumn(5);
 columna.setPreferredWidth(100);
 columna = tEmpleados.getColumnModel().getColumn(6);
 columna.setPreferredWidth(200);
 columna = tEmpleados.getColumnModel().getColumn(7);
 columna.setPreferredWidth(100);
  columna = tEmpleados.getColumnModel().getColumn(8);
 columna.setPreferredWidth(100);
 tEmpleados.getTableHeader().setReorderingAllowed(false);
 tEmpleados.getTableHeader().setResizingAllowed(false);
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tEmpleados);

        jLabel1.setText("LISTADO GENERAL DE EMPLEADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListadoEmpleado().setVisible(true);
            }
        }); 
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tEmpleados;
    // End of variables declaration//GEN-END:variables
}
