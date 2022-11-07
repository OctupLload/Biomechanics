--liquibase formatted sql

--changeset emikhailenko:ACTIONS_TREE stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.actions_tree (
    "id" serial PRIMARY KEY,
    action_id_prev int,
    action_id_next int,
    create_date date,
    edit_date date
);

ALTER TABLE biomechanics.actions_tree
ADD CONSTRAINT action_id_fk
FOREIGN KEY (action_id_prev)
REFERENCES biomechanics.actions("id");

ALTER TABLE biomechanics.actions_tree
ADD CONSTRAINT action_id_fk_2
FOREIGN KEY (action_id_next)
REFERENCES biomechanics.actions("id");
