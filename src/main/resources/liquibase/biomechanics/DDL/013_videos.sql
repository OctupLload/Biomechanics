--liquibase formatted sql

--changeset emikhailenko:VIDEOS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.videos (
    "id" serial PRIMARY KEY,
    title varchar(80),
    description varchar(500),
    url varchar(500),
    create_date date,
    edit_date date
);
