CREATE TABLE productos(
	id int PRIMARY KEY AUTO_INCREMENT,
	nombre varchar(100),
	precio int
);
CREATE TABLE cajeros(
	id int PRIMARY KEY AUTO_INCREMENT,
	nom_apels varchar(100)
);
CREATE TABLE maquinas_registradoras(
	id int PRIMARY KEY AUTO_INCREMENT,
	piso int
);
CREATE TABLE venta(
	id int PRIMARY KEY AUTO_INCREMENT,
	id_cajero int,
	id_maquina int,
	id_producto int,
	FOREIGN KEY (id_cajero) REFERENCES cajeros (id),
	FOREIGN KEY (id_maquina) REFERENCES maquinas_registradoras (id),
	FOREIGN KEY (id_producto) REFERENCES productos (id)
);
INSERT INTO productos (nombre, precio) values ('pr1',99);
INSERT INTO productos (nombre, precio) values ('pr2',199);
INSERT INTO productos (nombre, precio) values ('pr3',299);
INSERT INTO productos (nombre, precio) values ('pr4',399);
INSERT INTO cajeros (nom_apels) values ('cj1');
INSERT INTO cajeros (nom_apels) values ('cj2');
INSERT INTO cajeros (nom_apels) values ('cj3');
INSERT INTO cajeros (nom_apels) values ('cj4');
INSERT INTO maquinas_registradoras (piso) values (1);
INSERT INTO maquinas_registradoras (piso) values (1);
INSERT INTO maquinas_registradoras (piso) values (2);
INSERT INTO maquinas_registradoras (piso) values (2);
INSERT INTO venta (id_cajero, id_maquina, id_producto) values (1, 1, 1);
INSERT INTO venta (id_cajero, id_maquina, id_producto) values (11, 11, 11);
INSERT INTO venta (id_cajero, id_maquina, id_producto) values (21, 21, 21);
INSERT INTO venta (id_cajero, id_maquina, id_producto) values (31, 31, 31);