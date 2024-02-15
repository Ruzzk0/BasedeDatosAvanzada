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
    numero VARCHAR(10),
    id_domicilio INT 
);

CREATE TABLE Cuentas(
	id_cuenta INT PRIMARY KEY AUTO_INCREMENT,
    num_cuenta INT NOT NULL UNIQUE,
    fecha_apertura DATE NOT NULL,
    saldo DOUBLE,
    id_cliente INT 
);

CREATE TABLE Transacciones (
    id_transacciones INT PRIMARY KEY AUTO_INCREMENT,
    fecha_hora DATETIME NOT NULL,
    monto DOUBLE NOT NULL,
    id_cliente INT,
    id_transferencia INT,
    id_retiro INT 
);

CREATE TABLE Transacciones_Retiro(
	id_retiro INT PRIMARY KEY AUTO_INCREMENT,
    folio_operacion VARCHAR(15) NOT NULL,
    contraseña INT(8) NOT NULL
);

CREATE TABLE Transaccion_Trans(
	id_transferencia INT PRIMARY KEY AUTO_INCREMENT,
	num_cuenta INT NOT NULL
);


#Llaves Foraneas

ALTER TABLE Cuentas ADD FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente);

ALTER TABLE Transacciones ADD FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente);

ALTER TABLE Transacciones ADD FOREIGN KEY (id_retiro) REFERENCES Transaccion_Retiro(id_retiro);

ALTER TABLE Transacciones ADD FOREIGN KEY (id_transferencia) REFERENCES Transaccion_Trans(id_transferencia);