CREATE SEQUENCE id;
CREATE TABLE person (
  id integer PRIMARY KEY DEFAULT nextval ('id'::regclass),
  name char (20) not null,
  surname char (20),
  age integer CHECK (age>=0),
  id_address integer
);
CREATE SEQUENCE id_address;
CREATE TABLE address (
  id integer PRIMARY KEY DEFAULT nextval ('id_address'::regclass),
  country char (20),
  city char (20)
);

INSERT INTO address (country, city) VALUES ('Russia', 'Krasnodar'), ('USA','Boston');

ALTER TABLE person ADD FOREIGN KEY (id_address) REFERENCES address (id);

SELECT (person.id, name, surname, age, country, city) FROM person p LEFT JOIN address ad ON p.id = ad.id ORDER BY p.id;