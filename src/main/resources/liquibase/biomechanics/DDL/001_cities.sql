--liquibase formatted sql

--changeset emikhailenko:CITIES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.cities (
	"id" serial PRIMARY KEY,
	title varchar(45),
	create_date date,
	edit_date date
);
