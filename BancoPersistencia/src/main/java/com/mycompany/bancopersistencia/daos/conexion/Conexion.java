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
public class Conexion implements IConexion {

    private String url;
    private String user;
    private String password;
    private static final Logger LOG = Logger.getLogger(Conexion.class.getName());

    public Conexion() {
    }

    Connection conexion;

    public Conexion(String url, String user, String password, Connection conexion) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.conexion = conexion;
    }

    public Conexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection conexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(url, user, password);
        LOG.log(Level.INFO, "Conexión exitosa ", url);
        return conexion;
    }
}
