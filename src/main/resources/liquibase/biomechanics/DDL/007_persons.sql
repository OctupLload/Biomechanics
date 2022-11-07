--liquibase formatted sql

--changeset emikhailenko:PERSONS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.persons (
	"id" serial PRIMARY KEY,
	first_name varchar(45),
	middle_name varchar(45),
	last_name varchar(45),
	phone varchar(15),
	birth_day date,
	create_date date,
	edit_date date
);

