package com.mycompany.bancopersistencia.daos.conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lv1822
 */
public interface IConexion {

    public Connection conexion() throws SQLException;

}
