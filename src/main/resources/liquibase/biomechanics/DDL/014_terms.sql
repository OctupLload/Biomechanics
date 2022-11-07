--liquibase formatted sql

--changeset emikhailenko:TERMS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.terms (
    "id" serial PRIMARY KEY,
    "name" varchar(80),
    description varchar(3000),
    video_id int,
    term_type_id int,
    create_date date,
    edit_date date
);

ALTER TABLE biomechanics.terms
ADD CONSTRAINT role_type_id_fk
FOREIGN KEY (term_type_id)
REFERENCES biomechanics.term_types("id");

ALTER TABLE biomechanics.terms
ADD CONSTRAINT video_id_fk
FOREIGN KEY (video_id)
REFERENCES biomechanics.videos("id");
