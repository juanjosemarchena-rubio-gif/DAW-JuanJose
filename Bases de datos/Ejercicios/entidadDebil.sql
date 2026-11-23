CREATE DATABASE IF NOT EXISTS facturacion;


USE facturacion;


CREATE TABLE factura (
    id_factura INT PRIMARY KEY,
    fecha DATE NOT NULL,
    cliente VARCHAR(60) NOT NULL
);


CREATE TABLE linea_factura (
    id_factura INT,
    num_linea INT,
    producto VARCHAR(60) NOT NULL,
    cantidad INT NOT NULL,
    precio_unitario DECIMAL(10,2) NOT NULL,


    PRIMARY KEY (id_factura, num_linea),


    FOREIGN KEY (id_factura)
        REFERENCES factura(id_factura)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
INSERT INTO factura VALUES
(1001, '2026-11-01', 'Juan'),
(1002, '2026-11-02', 'Maria'),
(1003, '2026-11-03', 'Pedro');


INSERT INTO linea_factura VALUES
(1001, 1, 'Teclado', 2, 35.00),
(1001, 2, 'Raton', 3, 20.00),
(1001, 3, 'Monitor', 1, 180.00),
(1002, 1, 'Portatil', 2, 750.00),
(1002, 2, 'Webcam', 1, 48.00),
(1003, 1, 'Impresora', 1, 210.00);

SELECT * FROM linea_factura


SELECT * FROM linea_factura WHERE id_factura = 1001;


SELECT *, cantidad * precio_unitario AS importe
FROM linea_factura;


SELECT f.*, SUM(l.cantidad * l.precio_unitario) AS total
FROM factura f
JOIN linea_factura l ON f.id_factura = l.id_factura
GROUP BY f.id_factura;

SELECT f.*, SUM(l.cantidad * l.precio_unitario) AS total
FROM factura f
JOIN linea_factura l ON f.id_factura = l.id_factura
GROUP BY f.id_factura
HAVING total > 200;