package com.mycompany.bancopersistencia.daos;

import com.mycompany.bancodominio.Clientes;
import com.mycompany.bancopersistencia.daos.conexion.Conexion;
import com.mycompany.bancopersistencia.daos.conexion.IConexion;
import com.mycompany.bancopersistencia.daos.dtos.ClientesDTO;
import com.mycompany.bancopersistencia.daos.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katt
 */
public class ClientesDAO implements IClientesDAO {

    IConexion conexionBD;
    String url = "jdbc:mysql://localhost:3306/banco";
    String uwu = "root";
    String contra = "1512";
    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());

    public ClientesDAO(IConexion conexionBD) {
        conexionBD = new Conexion(url, uwu, contra);
        this.conexionBD = conexionBD;
    }

    public Clientes agregarCliente(Clientes clientes) throws PersistenciaException {
        Conexion c = new Conexion();
        String sentenciaSQL = "INSERT INTO Clientes (nombres, apellido_paterno, apellido_materno, fecha_nacimiento, contraseña, usuario, calle, colonia, numero) VALUES (?,?,?,?,?,?,?,?,?);";

        try (Connection conexion = this.conexionBD.conexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            Statement w = c.conexion().createStatement();

            comandoSQL.setString(1, clientes.getNombres());
            comandoSQL.setString(2, clientes.getApellido_paterno());
            comandoSQL.setString(3, clientes.getApellido_materno());
            comandoSQL.setString(4, clientes.getFecha_nacimiento());
            comandoSQL.setString(5, clientes.getContraseña());
            comandoSQL.setString(6, clientes.getUsuario());
            comandoSQL.setString(7, clientes.getCalle());
            comandoSQL.setString(8, clientes.getColonia());
            comandoSQL.setString(9, clientes.getNumero());

            int resultado = comandoSQL.executeUpdate();
            int cant = w.executeUpdate(sentenciaSQL);

            LOG.log(Level.INFO, "Se ha agregado{0}", resultado);

            // Obtener primeros registros
            ResultSet res = comandoSQL.getGeneratedKeys();

            res.next();

            Clientes clienteGuardado = new Clientes(clientes.getNombres(), clientes.getApellido_paterno(), clientes.getApellido_materno(), clientes.getFecha_nacimiento(), clientes.getContraseña(), clientes.getUsuario(), clientes.getCalle(), clientes.getColonia(), clientes.getNumero());

            //Regresar activista anterior
            return clienteGuardado;

        } catch (SQLException e) {
            LOG.log(Level.SEVERE, "NO se pudo agregar el Cliente", e);
            throw new PersistenciaException("NO se pudo agregar el Cliente", e);
        }
    }

}
