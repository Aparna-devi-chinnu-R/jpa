create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   primary key(id)
);
-- // this is commented out bez , the spring autoconfiguration already
-- knows we are using in memory database and it creates the schema by itself (this is done only for in memory database).
-- The table is identified by @Entity annotation.
INSERT INTO PERSON (ID, NAME, LOCATION)
VALUES(10001,  'Ranga', 'Hyderabad');
INSERT INTO PERSON (ID, NAME, LOCATION)
VALUES(10002,  'James', 'New York');
INSERT INTO PERSON (ID, NAME, LOCATION)
VALUES(10003,  'Pieter', 'Amsterdam');