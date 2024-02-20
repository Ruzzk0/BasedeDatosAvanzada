package com.mycompany.bancodominio;

/**
 *
 * @author Katt
 */
public class Transacciones_Trans {

    private int id_transferencia;
    private int num_cuenta;
    private int id_transacciones;

    public Transacciones_Trans() {
    }

    public Transacciones_Trans(int id_transferencia, int num_cuenta, int id_transacciones) {
        this.id_transferencia = id_transferencia;
        this.num_cuenta = num_cuenta;
        this.id_transacciones = id_transacciones;
    }

    public Transacciones_Trans(int num_cuenta, int id_transacciones) {
        this.num_cuenta = num_cuenta;
        this.id_transacciones = id_transacciones;
    }

    public int getId_transferencia() {
        return id_transferencia;
    }

    public void setId_transferencia(int id_transferencia) {
        this.id_transferencia = id_transferencia;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getId_transacciones() {
        return id_transacciones;
    }

    public void setId_transacciones(int id_transacciones) {
        this.id_transacciones = id_transacciones;
    }

    @Override
    public String toString() {
        return "Transacciones_Trans{" + "id_transferencia=" + id_transferencia + ", num_cuenta=" + num_cuenta + ", id_transacciones=" + id_transacciones + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id_transferencia;
        hash = 37 * hash + this.num_cuenta;
        hash = 37 * hash + this.id_transacciones;
        return hash;
    }

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
        final Transacciones_Trans other = (Transacciones_Trans) obj;
        if (this.id_transferencia != other.id_transferencia) {
            return false;
        }
        if (this.num_cuenta != other.num_cuenta) {
            return false;
        }
        return this.id_transacciones == other.id_transacciones;
    }

}
