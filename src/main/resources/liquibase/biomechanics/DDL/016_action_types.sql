--liquibase formatted sql

--changeset emikhailenko:ACTION_TYPES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.action_types (
    "id" serial PRIMARY KEY,
    "type" varchar(45),
    create_date date,
    edit_date date
);
