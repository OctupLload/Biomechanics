--liquibase formatted sql

--changeset emikhailenko:USERS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.users (
    "id" serial PRIMARY KEY,
    login varchar(45),
    "password" varchar(45),
    role_id int,
    is_active smallint,
    person_id int,
    create_date date,
    edit_date date
);

ALTER TABLE biomechanics.users
ADD CONSTRAINT person_id_fk
FOREIGN KEY (person_id)
REFERENCES biomechanics.persons("id");

ALTER TABLE biomechanics.users
ADD CONSTRAINT role_id_fk
FOREIGN KEY (role_id)
REFERENCES biomechanics.roles("id");
