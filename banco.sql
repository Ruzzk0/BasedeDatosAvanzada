#Proyecto BD
CREATE DATABASE IF NOT EXISTS banco;
USE banco;

CREATE TABLE Clientes(
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombres VARCHAR(200) NOT NULL,
    apellido_paterno VARCHAR(100) NOT NULL,
    apellido_materno VARCHAR(100),
    edad INT,
    fecha_nacimiento DATE NOT NULL,
    contraseña VARCHAR(50) NOT NULL,	
    usuario VARCHAR(50) NOT NULL,
    calle VARCHAR(100) NOT NULL,
    colonia VARCHAR(100) NOT NULL,
    numero VARCHAR(10)
);

CREATE TABLE Cuentas(
    id_cuenta INT PRIMARY KEY AUTO_INCREMENT,
    num_cuenta INT NOT NULL UNIQUE,
    fecha_apertura DATE NOT NULL,
    saldo DECIMAL DEFAULT 0.00 ,
    estado VARCHAR(50) NOT NULL DEFAULT 'ACTIVA',
    id_cliente INT,
    CHECK (estado IN ('ACTIVA', 'CANCELADA'))
);


CREATE TABLE Transacciones (
    id_transacciones INT PRIMARY KEY AUTO_INCREMENT,
    fecha_hora DATETIME NOT NULL,
    monto DECIMAL NOT NULL,
    id_cliente INT NOT NULL
);

CREATE TABLE Transacciones_Retiro(
    id_retiro INT PRIMARY KEY AUTO_INCREMENT,
    folio_operacion VARCHAR(15) NOT NULL,
    contraseña INT NOT NULL,
    estado VARCHAR(30) NOT NULL DEFAULT "ACEPTADA",
    id_transacciones INT,
    CHECK (estado in ("ACEPTADA", "CANCELADA DESPUES DE 10 MIN"))
);
# 8 Numeros minimo y maximo de contraseña

CREATE TABLE Transacciones_Trans(
	id_transferencia INT PRIMARY KEY AUTO_INCREMENT,
	num_cuenta INT NOT NULL,
    id_transacciones INT 
);

#Llaves Foraneas

ALTER TABLE Cuentas ADD FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente);

ALTER TABLE Transacciones ADD FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente);
	
ALTER TABLE Transacciones_Retiro ADD FOREIGN KEY (id_transacciones) REFERENCES Transacciones(id_transacciones);

ALTER TABLE Transacciones_Trans ADD FOREIGN KEY (id_transacciones) REFERENCES Transacciones(id_transacciones);

#probar las tablas

SELECT * FROM clientes;
SELECT usuario, contraseña FROM clientes;