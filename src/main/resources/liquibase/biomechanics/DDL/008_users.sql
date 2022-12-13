--liquibase formatted sql

--changeset emikhailenko:USERS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.users (
    "id" serial PRIMARY KEY,
    login varchar(45),
    "password" varchar(45),
    role_id int DEFAULT 2,
    is_active smallint DEFAULT 1,
    is_delete smallint DEFAULT 0,
    create_date date,
    edit_date date
);

ALTER TABLE biomechanics.users
ADD CONSTRAINT role_id_fk
FOREIGN KEY (role_id)
REFERENCES biomechanics.roles("id");
