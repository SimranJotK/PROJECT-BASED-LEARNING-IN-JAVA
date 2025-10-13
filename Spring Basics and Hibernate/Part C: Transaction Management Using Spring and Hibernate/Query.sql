CREATE DATABASE bankdb;
USE bankdb;

CREATE TABLE Account (
  acc_no INT PRIMARY KEY,
  holder_name VARCHAR(100),
  balance DOUBLE
);

INSERT INTO Account VALUES
(1, 'John', 1000),
(2, 'Mary', 2000);

CREATE TABLE TransactionRecord (
  id INT PRIMARY KEY AUTO_INCREMENT,
  from_acc INT,
  to_acc INT,
  amount DOUBLE,
  status VARCHAR(20)
);
