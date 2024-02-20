package com.mycompany.bancopersistencia.daos;

import com.mycompany.bancodominio.Clientes;
import com.mycompany.bancopersistencia.daos.conexion.Conexion;
import com.mycompany.bancopersistencia.daos.conexion.IConexion;
import com.mycompany.bancopersistencia.daos.dtos.ClientesDTO;
import com.mycompany.bancopersistencia.daos.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.DriverManager;
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
        String sentenciaSQL = "INSERT INTO Clientes (nombres, apellido_paterno, apellido_materno, fecha_nacimiento, contraseña, usuario, calle, colonia, numero) VALUES (?,?,?,?,?,?,?,?,?);";

        try (Connection conexion = this.conexionBD.conexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS)) {

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

            LOG.log(Level.INFO, "Se ha agregado: {0}", resultado);

            if (resultado == 1) {
                ResultSet res = comandoSQL.getGeneratedKeys();
                if (res.next()) {
                    int idGenerado = res.getInt(1);
                    clientes.setId_cliente(idGenerado);
                }
                return clientes;
            } else {
                throw new PersistenciaException("No se pudo agregar el Cliente. La inserción no fue exitosa.");
            }

        } catch (PersistenciaException | SQLException e) {
            LOG.log(Level.SEVERE, "NO se pudo agregar el Cliente", e);
            throw new PersistenciaException("NO se pudo agregar el Cliente", e);
        }
    }

    public boolean verificarCredenciales(String usuario, String contraseña) throws PersistenciaException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, uwu, contra);

            String comandoSQL = "SELECT * FROM clientes WHERE usuario = ? AND contraseña = ?";
            try (PreparedStatement state = connection.prepareStatement(comandoSQL)) {
                state.setString(1, usuario);
                state.setString(2, contraseña);

                try (ResultSet rs = state.executeQuery()) {
                    return rs.next();
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Clientes actualizarCliente(Clientes cliente) throws PersistenciaException {
        String sentenciaSQL = "UPDATE Clientes SET nombres = ?, apellido_paterno = ?, apellido_materno = ?, fecha_nacimiento = ?, contraseña = ?, usuario = ?, calle = ?, colonia = ?, numero = ? WHERE id_cliente = ?;";

        try (Connection conexion = this.conexionBD.conexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS)) {

            comandoSQL.setString(1, cliente.getNombres());
            comandoSQL.setString(2, cliente.getApellido_paterno());
            comandoSQL.setString(3, cliente.getApellido_materno());
            comandoSQL.setString(4, cliente.getFecha_nacimiento());
            comandoSQL.setString(5, cliente.getContraseña());
            comandoSQL.setString(6, cliente.getUsuario());
            comandoSQL.setString(7, cliente.getCalle());
            comandoSQL.setString(8, cliente.getColonia());
            comandoSQL.setString(9, cliente.getNumero());
            comandoSQL.setInt(10, cliente.getId_cliente());

            int r = comandoSQL.executeUpdate();

            LOG.log(Level.INFO, "Se ha actualizado: {0}", r);

            if (r == 1) {
                return cliente; 
            } else {
                throw new PersistenciaException("No se pudo actualizar el Cliente. La actualización no fue exitosa.");
            }

        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "NO se pudo actualizar el Cliente", ex);
            throw new PersistenciaException("NO se pudo actualizar el Cliente", ex);
        }
    }

}
