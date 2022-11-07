--liquibase formatted sql

--changeset emikhailenko:TERM_TYPES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.term_types (
    "id" serial PRIMARY KEY,
    title varchar(80),
    description varchar(1000),
    create_date date,
    edit_date date
);
