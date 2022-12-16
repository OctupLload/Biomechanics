--liquibase formatted sql

--changeset emikhailenko:ACTION_TYPES_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.action_types ("type", create_date, edit_date)
VALUES ('Удушающий', CURRENT_DATE, CURRENT_DATE),
       ('Болевой', CURRENT_DATE, CURRENT_DATE),
       ('Перевод', CURRENT_DATE, CURRENT_DATE),
       ('Стойка', CURRENT_DATE, CURRENT_DATE);