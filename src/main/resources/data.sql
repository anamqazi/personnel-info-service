DROP TABLE IF EXISTS person;

DROP SEQUENCE IF EXISTS seq_person;

CREATE SEQUENCE seq_person
    START WITH 3
    INCREMENT BY 1;

CREATE TABLE person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age INT ,
  favourite_colour VARCHAR(250) NOT NULL
);

INSERT INTO person (first_name,last_name,age,favourite_colour) values ('John','Smith',29,'red');
INSERT INTO person (first_name,last_name,age,favourite_colour) values('Katie','Holmes',59,'blue');