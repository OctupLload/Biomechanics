--liquibase formatted sql

--changeset emikhailenko:ACTIONS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.actions (
    "id" serial PRIMARY KEY,
    title varchar(80),
    description varchar(3000),
    action_type_id int,
    image_url text,
    video_id int,
    create_date date,
    edit_date date
);

ALTER TABLE biomechanics.actions
ADD CONSTRAINT video_id_fk
FOREIGN KEY (video_id)
REFERENCES biomechanics.videos("id");

ALTER TABLE biomechanics.actions
ADD CONSTRAINT action_type_id_fk
FOREIGN KEY (action_type_id)
REFERENCES biomechanics.action_types("id");
