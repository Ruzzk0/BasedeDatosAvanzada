package com.mycompany.bancodominio;

import java.util.Objects;

/**
 *
 * @author Kastt
 */
public class Clientes {

    private int id_cliente;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String fecha_nacimiento;
    private String contraseña;
    private String usuario;
    private String calle;
    private String colonia;
    private String numero;

    /**
     * Constructor por defecto sin parámetros.
     */
    public Clientes() {
    }

    /**
     * Constructor que inicializa los atributos de nombres, apellidos, fecha de
     * nacimiento, contraseña, usuario y dirección.
     *
     * @param nombres
     * @param apellido_paterno
     * @param apellido_materno
     * @param fecha_nacimiento
     * @param contraseña
     * @param usuario
     * @param calle
     * @param colonia
     * @param numero
     */
    public Clientes(String nombres, String apellido_paterno, String apellido_materno, String fecha_nacimiento, String contraseña, String usuario, String calle, String colonia, String numero) {
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    /**
     * Constructor que inicializa todos los atributos incluyendo el
     * identificador del cliente.
     *
     * @param id_cliente
     * @param nombres
     * @param apellido_paterno
     * @param apellido_materno
     * @param fecha_nacimiento
     * @param contraseña
     * @param usuario
     * @param calle
     * @param colonia
     * @param numero
     */
    public Clientes(int id_cliente, String nombres, String apellido_paterno, String apellido_materno, String fecha_nacimiento, String contraseña, String usuario, String calle, String colonia, String numero) {
        this.id_cliente = id_cliente;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    /**
     *
     *
     * @return
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * 
     * 
     * @param id_cliente 
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * 
     * 
     * @param nombres 
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * 
     * 
     * @param apellido_paterno 
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * 
     * 
     * @param apellido_materno 
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * 
     * 
     * @param fecha_nacimiento 
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * 
     * 
     * @param contraseña 
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     * 
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getCalle() {
        return calle;
    }

    /**
     * 
     * 
     * @param calle 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * 
     * 
     * @param colonia 
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * 
     * 
     * @return 
     */
    public String getNumero() {
        return numero;
    }

    /**
     * 
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Devuelve una representación de cadena de la instancia de Clientes,
     * incluyendo todos los atributos.
     *
     * @return
     */
    public String toString() {
        return "Clientes{" + "id_cliente=" + id_cliente + ", nombres=" + nombres + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", fecha_nacimiento=" + fecha_nacimiento + ", contrase\u00f1a=" + contraseña + ", usuario=" + usuario + ", calle=" + calle + ", colonia=" + colonia + ", numero=" + numero + '}';
    }

    /**
     * Calcula un código hash para la instancia de Clientes basado en sus
     * atributos.
     *
     * @return
     */
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id_cliente;
        hash = 79 * hash + Objects.hashCode(this.nombres);
        hash = 79 * hash + Objects.hashCode(this.apellido_paterno);
        hash = 79 * hash + Objects.hashCode(this.apellido_materno);
        hash = 79 * hash + Objects.hashCode(this.fecha_nacimiento);
        hash = 79 * hash + Objects.hashCode(this.contraseña);
        hash = 79 * hash + Objects.hashCode(this.usuario);
        hash = 79 * hash + Objects.hashCode(this.calle);
        hash = 79 * hash + Objects.hashCode(this.colonia);
        hash = 79 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    /**
     * Compara dos instancias de Clientes para verificar si son iguales
     * basándose en sus atributos.
     *
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellido_paterno, other.apellido_paterno)) {
            return false;
        }
        if (!Objects.equals(this.apellido_materno, other.apellido_materno)) {
            return false;
        }
        if (!Objects.equals(this.fecha_nacimiento, other.fecha_nacimiento)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        if (!Objects.equals(this.colonia, other.colonia)) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }

}
