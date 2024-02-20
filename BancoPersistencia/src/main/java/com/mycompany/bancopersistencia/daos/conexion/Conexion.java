package com.mycompany.bancopersistencia.daos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * PONER LOS LOGGERS
 *
 * @author KATT
 */
public class Conexion {
    // https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.33

    String url = "jdbc:mysql://localhost:3306";
    String nombreBD = "banco";
    String usuario = "root";
    String contra = "1512";
    String driver = "com.mysql.jdbc.Driver";

    Connection conexion = null;

    //Metodo para establecer la conexion con la BD
    public Connection conexion() throws SQLException {
        //Establecemos el intento de la conexion
        try {
            //Cargar los drivers de la base de dtaos en tiempo real o dinamica
            Class.forName(driver);
            //Establecer la conexion
            conexion = DriverManager.getConnection(url + "/" + nombreBD, usuario, contra);

            //Mostrar un mensaje en dado caso quela conexion sea correcta
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Conexion Fallida");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    public void desconectar() throws SQLException {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
