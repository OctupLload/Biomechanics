--liquibase formatted sql

--changeset emikhailenko:ACTIONS_TREE_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.actions_tree (action_id_prev, action_id_next, create_date, edit_date)
VALUES (NULL, 3, CURRENT_DATE, CURRENT_DATE),
       (3, 2, CURRENT_DATE, CURRENT_DATE),
       (3, 6, CURRENT_DATE, CURRENT_DATE),
       (5, 8, CURRENT_DATE, CURRENT_DATE),
       (8, 2, CURRENT_DATE, CURRENT_DATE),
       (5, 1, CURRENT_DATE, CURRENT_DATE),
       (1, 2, CURRENT_DATE, CURRENT_DATE),
       (6, 7, CURRENT_DATE, CURRENT_DATE);