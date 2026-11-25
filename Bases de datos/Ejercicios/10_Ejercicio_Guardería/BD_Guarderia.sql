CREATE DATABASE IF NOT EXISTS guarderia;
USE guarderia;


CREATE TABLE nino (
    num_matricula    INT PRIMARY KEY,
    nombre           VARCHAR(80) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    fecha_ingreso    DATE NOT NULL,
    fecha_baja       DATE NULL
);


CREATE TABLE persona_autorizada (
    dni       CHAR(9) PRIMARY KEY,
    nombre    VARCHAR(80) NOT NULL,
    direccion VARCHAR(120) NOT NULL
);


CREATE TABLE telefono (
    dni      CHAR(9),
    telefono VARCHAR(15),
    PRIMARY KEY (dni, telefono),
    FOREIGN KEY (dni) REFERENCES persona_autorizada(dni)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);


CREATE TABLE autorizacion (
    num_matricula INT,
    dni           CHAR(9),
    relacion      VARCHAR(30) NOT NULL,
    PRIMARY KEY (num_matricula, dni),
    FOREIGN KEY (num_matricula) REFERENCES nino(num_matricula),
    FOREIGN KEY (dni) REFERENCES persona_autorizada(dni)
);


CREATE TABLE recogida (
    num_matricula INT,
    fecha_hora    DATETIME,
    dni           CHAR(9) NOT NULL,
    PRIMARY KEY (num_matricula, fecha_hora),
    FOREIGN KEY (num_matricula, dni)
        REFERENCES autorizacion(num_matricula, dni)
);



INSERT INTO nino VALUES
(1001, 'Lucia Garcia Ruiz',   '2023-03-14', '2024-09-02', NULL),
(1002, 'Mateo Lopez Diaz',    '2024-01-20', '2024-09-02', NULL),
(1003, 'Martina Sanchez Gil', '2023-07-08', '2024-09-02', '2026-06-30'),
(1004, 'Hugo Romero Vega',    '2024-11-02', '2025-09-01', NULL),
(1005, 'Sofia Romero Vega',   '2025-02-17', '2025-09-01', NULL),
(1006, 'Daniel Perez Ortiz',  '2023-05-25', '2025-01-13', '2026-10-15');

INSERT INTO persona_autorizada VALUES
('28456123V', 'Ana Ruiz Martin',    'C/ Feria 12, Sevilla'),
('30987456Q', 'Pedro Garcia Gomez', 'C/ Feria 12, Sevilla'),
('47123589Q', 'Carmen Diaz Soto',   'Av. de la Paz 45, Sevilla'),
('27654321H', 'Rosa Vega Nunez',    'C/ Betis 8, Sevilla'),
('29876543A', 'Javier Romero Ruiz', 'C/ Pureza 30, Sevilla'),
('48765432G', 'Elena Gil Castro',   'C/ Sol 5, Sevilla'),
('31234567S', 'Luis Perez Mora',    'Av. Kansas City 21, Sevilla'),
('45678912S', 'Isabel Torres Leon', 'C/ Feria 14, Sevilla');

INSERT INTO telefono VALUES
('28456123V', '600111222'),
('28456123V', '954000111'),
('30987456Q', '600333444'),
('47123589Q', '611222333'),
('27654321H', '622444555'),
('27654321H', '954222333'),
('29876543A', '633555666'),
('48765432G', '644666777'),
('31234567S', '655777888'),
('45678912S', '666888999');

INSERT INTO autorizacion VALUES
(1001, '28456123V', 'Madre'),
(1001, '30987456Q', 'Padre'),
(1001, '45678912S', 'Vecina'),
(1002, '47123589Q', 'Madre'),
(1002, '45678912S', 'Vecina'),
(1003, '48765432G', 'Madre'),
(1004, '29876543A', 'Padre'),
(1004, '27654321H', 'Abuela'),
(1005, '29876543A', 'Padre'),
(1005, '27654321H', 'Abuela'),
(1006, '31234567S', 'Padre');

INSERT INTO recogida VALUES
(1003, '2026-06-15 13:30:00', '48765432G'),
(1006, '2026-10-05 14:10:00', '31234567S'),
(1001, '2026-11-16 13:30:00', '28456123V'),
(1002, '2026-11-16 13:45:00', '47123589Q'),
(1001, '2026-11-17 14:00:00', '45678912S'),
(1004, '2026-11-18 13:15:00', '27654321H'),
(1005, '2026-11-18 13:15:00', '27654321H'),
(1002, '2026-11-19 13:50:00', '45678912S');


SELECT *
FROM nino
ORDER BY fecha_nacimiento ASC;


SELECT n.nombre, COUNT(a.dni) AS num_autorizados
FROM nino n
LEFT JOIN autorizacion a ON n.num_matricula = a.num_matricula
GROUP BY n.num_matricula, n.nombre
ORDER BY n.nombre ASC;


SELECT DISTINCT n.nombre
FROM nino n
JOIN recogida r ON n.num_matricula = r.num_matricula
WHERE r.fecha_hora >= '2026-11-16'
  AND r.fecha_hora <  '2026-11-19';

SELECT COUNT(*) AS ninos_de_baja
FROM nino
WHERE fecha_baja IS NOT NULL;

SELECT COUNT(*) AS ninos_activos
FROM nino
WHERE fecha_baja IS NULL;


SELECT n.nombre AS nino, p.nombre AS autorizado, a.relacion, t.telefono
FROM nino n
JOIN autorizacion a       ON n.num_matricula = a.num_matricula
JOIN persona_autorizada p ON a.dni = p.dni
JOIN telefono t           ON p.dni = t.dni
WHERE n.nombre LIKE 'M%'
ORDER BY n.nombre, p.nombre;
