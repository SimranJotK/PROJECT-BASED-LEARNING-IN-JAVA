CREATE DATABASE company;
USE company;

CREATE TABLE Employee (
  EmpID INT PRIMARY KEY,
  Name VARCHAR(100),
  Salary DECIMAL(10,2)
);

INSERT INTO Employee VALUES
(1, 'Alice', 55000),
(2, 'Bob', 60000),
(3, 'Charlie', 50000);
