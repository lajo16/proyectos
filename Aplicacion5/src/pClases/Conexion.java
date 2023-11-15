
package pClases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/negocios", "root", "");
        } catch (Exception e) {
            System.err.println("No se logro conexion correctamente");
        }
    }
    public Connection getConnection(){
        return con;
    }
}

