
DROP TABLE IF EXISTS COLEGIO;
DROP TABLE IF EXISTS CURSO;
DROP TABLE IF EXISTS ASIGNATURA;

CREATE TABLE COLEGIO (
ID int auto_increment NOT NULL,
NOMBRE VARCHAR(50) NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE CURSO (
ID int UNSIGNED NOT NULL AUTO_INCREMENT,
GRADO VARCHAR(50) NOT NULL,
SALON VARCHAR(50) NOT NULL,
PRIMARY KEY (ID)
);
CREATE TABLE PROFESOR (
ID int  UNSIGNED NOT NULL AUTO_INCREMENT ,
NOMBRE VARCHAR(50) NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE ASIGNATURA (
ID int  UNSIGNED NOT NULL AUTO_INCREMENT,
NOMBRE VARCHAR(50) NOT NULL,
ID_PROFESOR int NOT NULL,
ID_CURSO int   NOT NULL,
FOREIGN KEY (ID_PROFESOR) REFERENCES PROFESOR (ID) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (ID_CURSO) REFERENCES CURSO(ID) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (ID)
);


--INSERT COLEGIO --
insert into COLEGIO(NOMBRE) values('El colegio del Olimpo');

--INSERT CURSO --
insert into CURSO(grado,salon)values('10A','A');
insert into CURSO(grado,salon)values('10B','B');
insert into CURSO(grado,salon)values('11A','A');
insert into CURSO(grado,salon)values('11B','B');

-- INSERT PROFESOR --
insert into PROFESOR(nombre) values ('Némesis');
insert into PROFESOR(nombre) values ('Príapo');
insert into PROFESOR(nombre) values ('Iris');

-- insert ASIGNATURA --
-- insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Matemáticas',(select ID from PROFESOR where nombre = 'Némesis'),(select ID from CURSO where grado = '10A'));
--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Español',(select ID from PROFESOR where nombre = 'Príapo'),(select ID from CURSO where grado = '10A'));
--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Ingles básico',(select ID from PROFESOR where nombre = 'Iris'),(select ID from CURSO where grado = '10A'));

--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Matemáticas',(select ID from PROFESOR where nombre = 'Némesis'),(select ID from CURSO where grado = '10B'));
--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Español',(select ID from PROFESOR where nombre = 'Príapo'),(select ID from CURSO where grado = '10B'))
--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Ingles avanzado',(select ID from PROFESOR where nombre = 'Iris'),(select ID from CURSO where grado = '10B'));

--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Matemáticas',(select ID from PROFESOR where nombre = 'Némesis'),(select ID from CURSO where grado = '11A'));
--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Pre Icfes',(select ID from PROFESOR where nombre = 'Némesis'),(select ID from CURSO where grado = '11A'));

--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Matemáticas',(select ID from PROFESOR where nombre = 'Némesis'),(select ID from CURSO where grado = '11B'));
--insert into ASIGNATURA(nombre,id_profesor, id_curso)values('Pre Icfes',(select ID from PROFESOR where nombre = 'Némesis'),(select ID from CURSO where grado = '11B'));


