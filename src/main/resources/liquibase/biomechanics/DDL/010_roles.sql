--liquibase formatted sql

--changeset emikhailenko:ROLES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics."roles" (
    "id" serial PRIMARY KEY,
    "name" varchar(45),
    description varchar(200),
    create_date date,
    edit_date date
);
