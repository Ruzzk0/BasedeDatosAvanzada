package com.mycompany.bancodominio;

import java.util.Objects;

/**
 *
 * @author Katt
 */
public class Transacciones {

    private int id_transacciones;
    private String fecha_hora;
    private double monto;
    private String id_cliente;

    public Transacciones() {
    }

    public Transacciones(int id_transacciones, String fecha_hora, double monto, String id_cliente) {
        this.id_transacciones = id_transacciones;
        this.fecha_hora = fecha_hora;
        this.monto = monto;
        this.id_cliente = id_cliente;
    }

    public Transacciones(String fecha_hora, double monto, String id_cliente) {
        this.fecha_hora = fecha_hora;
        this.monto = monto;
        this.id_cliente = id_cliente;
    }

    public int getId_transacciones() {
        return id_transacciones;
    }

    public void setId_transacciones(int id_transacciones) {
        this.id_transacciones = id_transacciones;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Transacciones{" + "id_transacciones=" + id_transacciones + ", fecha_hora=" + fecha_hora + ", monto=" + monto + ", id_cliente=" + id_cliente + '}';
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
        hash = 19 * hash + this.id_transacciones;
        hash = 19 * hash + Objects.hashCode(this.fecha_hora);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.monto) ^ (Double.doubleToLongBits(this.monto) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.id_cliente);
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
        final Transacciones other = (Transacciones) obj;
        if (this.id_transacciones != other.id_transacciones) {
            return false;
        }
        if (Double.doubleToLongBits(this.monto) != Double.doubleToLongBits(other.monto)) {
            return false;
        }
        if (!Objects.equals(this.fecha_hora, other.fecha_hora)) {
            return false;
        }
        return Objects.equals(this.id_cliente, other.id_cliente);
    }

}
