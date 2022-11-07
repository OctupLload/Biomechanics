--liquibase formatted sql

--changeset emikhailenko:COACHES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.coaches (
	"id" serial PRIMARY KEY,
	coach_info varchar(255),
	experience smallint,
	person_id int,
	belt_id int,
	create_date varchar(255),
	edit_date varchar(255)
);

ALTER TABLE biomechanics.coaches
ADD CONSTRAINT person_id_fk
FOREIGN KEY (person_id)
REFERENCES biomechanics.persons("id");

ALTER TABLE biomechanics.coaches
ADD CONSTRAINT belt_id_fk
FOREIGN KEY (belt_id)
REFERENCES biomechanics.belts("id");

