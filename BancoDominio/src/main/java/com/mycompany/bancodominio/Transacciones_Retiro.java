package com.mycompany.bancodominio;

import java.util.Objects;

/**
 *
 * @author Katt
 */
public class Transacciones_Retiro {

    private int id_retiro;
    private String folio_operacion;
    private int contraseña;
    private String estado;
    private int id_transacciones;

    public Transacciones_Retiro() {
    }

    public Transacciones_Retiro(int id_retiro, String folio_operacion, int contraseña, String estado, int id_transacciones) {
        this.id_retiro = id_retiro;
        this.folio_operacion = folio_operacion;
        this.contraseña = contraseña;
        this.estado = estado;
        this.id_transacciones = id_transacciones;
    }

    public Transacciones_Retiro(String folio_operacion, int contraseña, String estado, int id_transacciones) {
        this.folio_operacion = folio_operacion;
        this.contraseña = contraseña;
        this.estado = estado;
        this.id_transacciones = id_transacciones;
    }

    public int getId_retiro() {
        return id_retiro;
    }

    public void setId_retiro(int id_retiro) {
        this.id_retiro = id_retiro;
    }

    public String getFolio_operacion() {
        return folio_operacion;
    }

    public void setFolio_operacion(String folio_operacion) {
        this.folio_operacion = folio_operacion;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_transacciones() {
        return id_transacciones;
    }

    public void setId_transacciones(int id_transacciones) {
        this.id_transacciones = id_transacciones;
    }

    @Override
    public String toString() {
        return "Transacciones_Retiro{" + "id_retiro=" + id_retiro + ", folio_operacion=" + folio_operacion + ", contrase\u00f1a=" + contraseña + ", estado=" + estado + ", id_transacciones=" + id_transacciones + '}';
    }
    
    
     /**
     * Calcula un código hash para la instancia de Clientes basado en sus
     * atributos.
     *
     * @return
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_retiro;
        hash = 59 * hash + Objects.hashCode(this.folio_operacion);
        hash = 59 * hash + this.contraseña;
        hash = 59 * hash + Objects.hashCode(this.estado);
        hash = 59 * hash + this.id_transacciones;
        return hash;
    }

    /**
     * Compara dos instancias de Clientes para verificar si son iguales
     * basándose en sus atributos.
     *
     * @param obj
     * @return
     */
    
    @Override
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
        final Transacciones_Retiro other = (Transacciones_Retiro) obj;
        if (this.id_retiro != other.id_retiro) {
            return false;
        }
        if (this.contraseña != other.contraseña) {
            return false;
        }
        if (this.id_transacciones != other.id_transacciones) {
            return false;
        }
        if (!Objects.equals(this.folio_operacion, other.folio_operacion)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }

}
