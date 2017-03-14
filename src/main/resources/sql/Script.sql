CREATE DATABASE user;
USE user;
CREATE TABLE Persons
(
id INT(8) NOT NULL AUTO_INCREMENT,
name VARCHAR(25),
age INT ,
isAdmin BIT ,
createdDate TIMESTAMP DEFAULT NOW(),
PRIMARY KEY (id) 
);

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Jack Sparrow', 30, true, '2007-03-12');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Johan', 25, false, '2011-07-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Salasar', 18, false, '2016-08-05');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Lili', 21, false, '2015-07-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Leon Killer', 35, true, '2011-11-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Dart', 45, true, '2017-05-17');


INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Lukas', 15, false, '2006-07-12');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Abrams', 37, false, '2011-10-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Toby', 25, false, '2016-01-05');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Kitty', 39, false, '2015-08-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Peter', 55, true, '2017-01-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Adel', 19, true, '2017-01-01');


INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Mac', 19, true, '2008-03-12');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Mikky', 21, false, '2011-10-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Lyly', 17, false, '2013-08-05');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Lolo', 27, false, '2015-02-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Pepe', 33, true, '2014-11-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Jason Born', 31, true, '2017-09-17');


INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Florence', 47, false, '2006-09-12');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Walking Dead', 37, false, '2014-02-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Big Bang', 45, false, '2016-01-05');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Lyiza', 18, false, '2015-06-21');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Meredit', 22, true, '2016-01-25');

INSERT INTO Persons (name, age, isAdmin, createdDate)
VALUES ('Margo', 35, true, '2017-01-30');