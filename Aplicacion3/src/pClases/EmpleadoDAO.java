
package pClases;

import java.sql.*;
import javax.swing.JOptionPane;

public class EmpleadoDAO {
    Conexion objCon = new Conexion();
    Connection cn;
    
public ResultSet listadoEmpleados() {
    try {
        cn = objCon.getConecta();
        Statement st = cn.createStatement();
        return st.executeQuery("SELECT IDE_EMP, APE_EMP, NOM_EMP, FNA_EMP, DIR_EMP, IDE_DIS, FON_EMP, IDE_CAR, FCO_EMP " +
                                "FROM EMPLEADO");
    } catch (SQLException ex) {
        ex.printStackTrace(); // Manejo básico de la excepción: imprimir el rastreo en la consola.
    }
    return null;
}

     public ResultSet listadoCargos() {
 try {
 ResultSet rs;
 cn = objCon.getConecta();
 Statement st = cn.createStatement();
 rs = st.executeQuery("SELECT * FROM CARGO");
 return rs;
 } catch (Exception ex) {
 }
 return null;
 }
     
     public void registraEmpleado(Empleado objE) {
 try {
 cn = objCon.getConecta();
 String sql = "INSERT INTO EMPLEADO(APE_EMP,NOM_EMP,FNA_EMP,DIR_EMP,IDE_DIS,FON_EMP,IDE_CAR,FCO_EMP) "
         +"VALUES(?,?,?,?,?,?,?,?)";
 PreparedStatement pt = cn.prepareStatement(sql);
 pt.setString(1, objE.getApellidos());
 pt.setString(2, objE.getNombres());
 pt.setString(3, objE.getFechaNac());
 pt.setString(4, objE.getDireccion());
 pt.setInt(5, objE.getDistrito());
 pt.setString(6, objE.getTelefono());
 pt.setInt(7, objE.getCargo());
 pt.setString(8, objE.getFechaCon());
 pt.executeUpdate();
 JOptionPane.showMessageDialog(null, "Empleado registrado correctamente");
 } catch (Exception ex) {
 }
     }
     
 public ResultSet listadoDistritos() {
 try {
 ResultSet rs;
 cn = objCon.getConecta();
 Statement st = cn.createStatement();
 rs = st.executeQuery("SELECT * FROM DISTRITO");
 return rs;
 } catch (Exception ex) {
 }
 return null;
 }
}

