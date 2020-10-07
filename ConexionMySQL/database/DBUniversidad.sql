
CREATE DATABASE IF EXISTS universidad;
use universidad;

#/*********************************************************************************************/

CREATE TABLE ALUMNOS (
  DNI varchar(9) NOT NULL,
  Nombre varchar(20) DEFAULT NULL,
  Apellidos varchar(50) DEFAULT NULL,
  Direccion varchar(150) DEFAULT NULL,
  Ciudad varchar(20) DEFAULT NULL,
  PRIMARY KEY (DNI)
);

INSERT INTO ALUMNOS VALUES ('34276347C','Cristian Ezequiel','Campos Jiménez','Calle Camarón 14','Granada');
INSERT INTO ALUMNOS VALUES ('65874267S','Salvador','Cabezas Helmy','Calle Vito Corleone','Granada');
INSERT INTO ALUMNOS VALUES ('76442684E','Carlos','Fernández Jiménez','Calle Rafael Alberti 13','Granada');
INSERT INTO ALUMNOS VALUES ('87356782J','Jaime','García Rojas','Cuesta de Alfacar','Granada');
INSERT INTO ALUMNOS VALUES ('87546271P','Pablo','García Gordo','Calle Edison Morales 12','Granada');
INSERT INTO ALUMNOS VALUES ('97354762A','Arturo','Lopez Mena','Calle Chueca 10','Granada');
INSERT INTO ALUMNOS VALUES ('98563287D','David','Lopez Reynosa','Calle Farruquito','Granada');

#/*********************************************************************************************/

DROP TABLE IF EXISTS ASIGNATURA;

CREATE TABLE ASIGNATURA (
  Cod_asig varchar(4) NOT NULL,
  Nombre varchar(50) DEFAULT NULL,
  Curso int DEFAULT NULL,
  PRIMARY KEY (Cod_asig),
  CONSTRAINT asignatura_chk_1 CHECK ((Curso between 1 and 3))
);

INSERT INTO ASIGNATURA VALUES ('ADA','Acceso a Datos',2);
INSERT INTO ASIGNATURA VALUES ('BD','Base de datos',1);
INSERT INTO ASIGNATURA VALUES ('DI','Desarrollo de Interfaces',2);
INSERT INTO ASIGNATURA VALUES ('ED','Entornos de Desarrollo',1);
INSERT INTO ASIGNATURA VALUES ('ING','Inglés','2');
INSERT INTO ASIGNATURA VALUES ('LM','Lenguaje de Marcas',1);
INSERT INTO ASIGNATURA VALUES ('PMDM','Programación Multimedia y Dispositivos Móviles',2);
INSERT INTO ASIGNATURA VALUES ('PROG','Programación',1);
INSERT INTO ASIGNATURA VALUES ('PSP','Programación de Servicios y Procesos',2);
INSERT INTO ASIGNATURA VALUES ('SGE','Sistemas de Gestión Empresarial',2);
INSERT INTO ASIGNATURA VALUES ('SIS','Sistemas informáticos',1);

#/*********************************************************************************************/
DROP TABLE IF EXISTS MATRICULA;

CREATE TABLE MATRICULA (
  DNI varchar(9) NOT NULL,
  Nombre_alu varchar(20) DEFAULT NULL,
  Apellido_alu varchar(20) DEFAULT NULL,
  Nombre_asig varchar(50) DEFAULT NULL,
  Cod_asig varchar(4) NOT NULL,
  Curso int DEFAULT NULL,
  PRIMARY KEY (DNI,Cod_asig),
  FOREIGN KEY (DNI) REFERENCES ALUMNOS(DNI),
  FOREIGN KEY (Cod_asig) REFERENCES ASIGNATURA(Cod_asig)
  
);

INSERT INTO MATRICULA VALUES ('34276347C','Cristian Ezequiel','Campos Jiménez','Programación','PROG',1);
INSERT INTO MATRICULA VALUES ('65874267S','Salvador','Cabezas Helmy','Sistemas informáticos','SIS',1);
INSERT INTO MATRICULA VALUES ('76442684E','Carlos','Fernández Jiménez','Desarrollo de Interfaces','DI',2);
INSERT INTO MATRICULA VALUES ('87356782J','Jaime','García Rojas','Inglés','ING',2);
INSERT INTO MATRICULA VALUES ('87546271P','Pablo','García Gordo','Base de datos','BD',1);
INSERT INTO MATRICULA VALUES ('97354762A','Arturo','Lopez Mena','Programación de Servicios y Procesos','PSP',2);
INSERT INTO MATRICULA VALUES ('98563287D','David','Lopez Reynosa','Sistemas de Gestión Empresarial','SGE',2);