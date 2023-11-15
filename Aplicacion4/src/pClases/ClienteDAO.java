
package pClases;

import java.sql.*;
import javax.swing.JOptionPane;

public class ClienteDAO {
        Conexion objCon = new Conexion();
        Connection cn;
        
        
       public ResultSet listadoClientes() {
    try {
        cn = objCon.getConecta();
        Statement st = cn.createStatement();
        return st.executeQuery("SELECT NOM_CLII,DIR_CLII,FON_CLII " +
                                "FROM CLIENTEE");
    } catch (SQLException ex) {
        ex.printStackTrace(); // Manejo básico de la excepción: imprimir el rastreo en la consola.
    }
    return null;
}
       public void registraCliente(Cliente objE) {
 try {
 cn = objCon.getConecta();
 String sql = "INSERT INTO CLIENTEE(NOM_CLII,DIR_CLII,FON_CLII) "
         +"VALUES(?,?,?)";
 PreparedStatement pt = cn.prepareStatement(sql);
 pt.setString(1, objE.getNombres());
 pt.setString(2, objE.getDireccion());
 pt.setString(3, objE.getTelefono());
 pt.executeUpdate();
 JOptionPane.showMessageDialog(null, "Cliente registrado correctamente");
 } catch (Exception ex) {
 }
     }
}
