package com.mycompany.bancodominio;

import java.sql.Date;
import java.util.Objects;

public class Cuenta {

    private int id_cuenta;
    private int num_cuenta;
    private String fecha_apertura;
    private Double saldo;
    private String estado;
    private int id_cliente;

    public Cuenta() {
    }

    public Cuenta(int id_cuenta, int num_cuenta, String fecha_apertura, Double saldo, String estado, int id_cliente) {
        this.id_cuenta = id_cuenta;
        this.num_cuenta = num_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.estado = estado;
        this.id_cliente = id_cliente;
    }

    public Cuenta(int num_cuenta, String fecha_apertura, Double saldo, String estado, int id_cliente) {
        this.num_cuenta = num_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.estado = estado;
        this.id_cliente = id_cliente;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id_cuenta=" + id_cuenta + ", num_cuenta=" + num_cuenta + ", fecha_apertura=" + fecha_apertura + ", saldo=" + saldo + ", estado=" + estado + ", id_cliente=" + id_cliente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id_cuenta;
        hash = 89 * hash + this.num_cuenta;
        hash = 89 * hash + Objects.hashCode(this.fecha_apertura);
        hash = 89 * hash + Objects.hashCode(this.saldo);
        hash = 89 * hash + Objects.hashCode(this.estado);
        hash = 89 * hash + this.id_cliente;
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
        final Cuenta other = (Cuenta) obj;
        if (this.id_cuenta != other.id_cuenta) {
            return false;
        }
        if (this.num_cuenta != other.num_cuenta) {
            return false;
        }
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        if (!Objects.equals(this.fecha_apertura, other.fecha_apertura)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.saldo, other.saldo);
    }

}
