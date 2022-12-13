--liquibase formatted sql

--changeset emikhailenko:COMMENTS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics."comments" (
    "id" serial PRIMARY KEY,
    text varchar(1000),
    user_id int,
    term_id int,
    create_date date,
    edit_date date
);

ALTER TABLE biomechanics.comments
ADD CONSTRAINT user_id_fk
FOREIGN KEY (user_id)
REFERENCES biomechanics.users("id");

ALTER TABLE biomechanics.comments
ADD CONSTRAINT term_id_fk
FOREIGN KEY (term_id)
REFERENCES biomechanics.terms("id");
