package com.mycompany.bancopersistencia.daos;

import com.mycompany.bancodominio.Clientes;
import com.mycompany.bancopersistencia.daos.dtos.ClientesDTO;
import com.mycompany.bancopersistencia.daos.excepciones.PersistenciaException;

/**
 *
 * @author Katt
 */
public interface IClientesDAO {

    public Clientes agregarCliente(Clientes cliente) throws PersistenciaException;

    public boolean verificarCredenciales(String usuario, String contraseña) throws PersistenciaException;

    public Clientes actualizarCliente(Clientes clientes) throws PersistenciaException;

}
