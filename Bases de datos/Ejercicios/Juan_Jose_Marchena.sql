
USE CONSULTAS;
SELECT COUNT(*) FROM Customers;
SELECT * FROM Customers LIMIT 5;

SELECT * FROM Customers
WHERE City IN ('Berlin', 'Stuttgart');

SELECT * FROM Customers
WHERE Country IN ('Germany', 'Spain');

SELECT * FROM Customers
WHERE Country <> 'Germany';

SELECT * FROM Customers
WHERE Country = 'Germany'
  AND (City = 'Berlin' OR City = 'Stuttgart');

SELECT * FROM Customers
WHERE Country NOT IN ('Germany', 'USA');

SELECT * FROM Customers
ORDER BY Country;

SELECT * FROM Customers
ORDER BY Country DESC;

SELECT * FROM Customers
ORDER BY Country, CustomerName;

SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;
