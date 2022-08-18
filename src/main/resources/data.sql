CREATE TABLE facultad(
    id int PRIMARY KEY,
    nombre nvarchar(100)
);
CREATE TABLE investigadores(
    dni varchar(9) PRIMARY KEY,
    nom_apels nvarchar(255),
    id_facultad int,
    FOREIGN KEY (id_facultad) REFERENCES facultad (id)
);
CREATE TABLE equipos(
    num_serie char(4) PRIMARY KEY,
    nombre nvarchar(100),
    id_facultad int,
	FOREIGN KEY (id_facultad) REFERENCES facultad (id)
);
CREATE TABLE reservas(
    id int PRIMARY KEY AUTO_INCREMENT,
    id_investigador varchar(9),
    id_equipo char(4),
    comienzo datetime,
    fin datetime,
    FOREIGN KEY (id_equipo) REFERENCES equipos (num_serie),
    FOREIGN KEY (id_investigador) REFERENCES investigadores (dni)
);