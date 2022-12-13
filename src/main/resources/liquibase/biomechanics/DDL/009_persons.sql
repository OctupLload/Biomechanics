--liquibase formatted sql

--changeset emikhailenko:PERSONS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.persons (
	"id" serial PRIMARY KEY,
    user_id int,
	first_name varchar(45),
	middle_name varchar(45),
	last_name varchar(45),
	phone varchar(15),
	birth_day date,
	create_date date,
	edit_date date
);

ALTER TABLE biomechanics.persons
ADD CONSTRAINT user_id_fk
FOREIGN KEY ("user_id")
REFERENCES biomechanics.users("id");

