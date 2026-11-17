CREATE DATABASE centro_salud;
USE centro_salud;

CREATE TABLE MEDICO (
    nif            CHAR(9)      NOT NULL,
    nombre         VARCHAR(60)  NOT NULL,
    telefono       VARCHAR(15),
    num_colegiado  VARCHAR(12)  NOT NULL,
    tipo           ENUM('TITULAR', 'INTERINO', 'SUSTITUTO') NOT NULL,
    CONSTRAINT pk_medico           PRIMARY KEY (nif),
    CONSTRAINT uq_medico_colegiado UNIQUE (num_colegiado)
);

CREATE TABLE SUSTITUCION (
    nif_medico  CHAR(9) NOT NULL,
    fecha_alta  DATE    NOT NULL,
    fecha_baja  DATE    NULL,
    CONSTRAINT pk_sustitucion  PRIMARY KEY (nif_medico, fecha_alta),
    CONSTRAINT fk_sust_medico  FOREIGN KEY (nif_medico)
        REFERENCES MEDICO (nif)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT ck_sust_fechas  CHECK (fecha_baja IS NULL OR fecha_baja >= fecha_alta)
);

CREATE TABLE EMPLEADO (
    nif       CHAR(9)     NOT NULL,
    nombre    VARCHAR(60) NOT NULL,
    telefono  VARCHAR(15),
    puesto    ENUM('ATS', 'ATS DE ZONA', 'AUXILIAR DE ENFERMERIA',
                   'CELADOR', 'ADMINISTRATIVO') NOT NULL,
    CONSTRAINT pk_empleado PRIMARY KEY (nif)
);

CREATE TABLE PACIENTE (
    nif         CHAR(9)     NOT NULL,
    nombre      VARCHAR(60) NOT NULL,
    num_ss      CHAR(12)    NOT NULL,
    nif_medico  CHAR(9)     NOT NULL,
    CONSTRAINT pk_paciente      PRIMARY KEY (nif),
    CONSTRAINT uq_paciente_ss   UNIQUE (num_ss),
    CONSTRAINT fk_pac_medico    FOREIGN KEY (nif_medico)
        REFERENCES MEDICO (nif)
        ON DELETE RESTRICT ON UPDATE CASCADE
);

INSERT INTO MEDICO (nif, nombre, telefono, num_colegiado, tipo) VALUES
('28456123V', 'Carmen Ruiz Delgado',     '954112233', '414105678', 'TITULAR'),
('30987654F', 'Antonio Morales Vega',    '954223344', '414107890', 'TITULAR'),
('47123890H', 'Lucía Fernández Ortega',  '655334455', '414112345', 'INTERINO'),
('52345678R', 'Javier Navarro Gil',      '677445566', '414118899', 'SUSTITUTO'),
('29876543A', 'Elena Castro Romero',     '699556677', '414120011', 'SUSTITUTO');

INSERT INTO SUSTITUCION (nif_medico, fecha_alta, fecha_baja) VALUES
('52345678R', '2025-03-01', '2025-05-31'),
('52345678R', '2025-09-15', '2025-12-20'),
('52345678R', '2026-07-01', '2026-08-31'),
('29876543A', '2026-01-10', '2026-04-10'),
('29876543A', '2026-10-01', NULL);

INSERT INTO EMPLEADO (nif, nombre, telefono, puesto) VALUES
('45678912S', 'Rocío Jiménez Pérez',    '954334455', 'ATS'),
('31234567S', 'Manuel Herrera Soto',    '954445566', 'ATS DE ZONA'),
('77889900D', 'Isabel Márquez León',    '654556677', 'AUXILIAR DE ENFERMERIA'),
('48765432G', 'Francisco Rubio Lara',   '611667788', 'CELADOR'),
('30123456B', 'Pilar Domínguez Cano',   '954778899', 'ADMINISTRATIVO');

INSERT INTO PACIENTE (nif, nombre, num_ss, nif_medico) VALUES
('53456789M', 'Alberto Sánchez Mora',   '411234567890', '28456123V'),
('49876123W', 'Marta López Benítez',    '412345678901', '28456123V'),
('28111222R', 'José Luis Ramos Peña',   '413456789012', '30987654F'),
('75333444A', 'Ana Belén Torres Ríos',  '414567890123', '47123890H'),
('44555666C', 'David Molina Serrano',   '415678901234', '29876543A');

SELECT m.nombre, s.fecha_alta, s.fecha_baja
FROM MEDICO m JOIN SUSTITUCION s ON s.nif_medico = m.nif
ORDER BY m.nombre, s.fecha_alta;

SELECT p.nombre AS paciente, m.nombre AS medico, m.tipo
FROM PACIENTE p JOIN MEDICO m ON p.nif_medico = m.nif;