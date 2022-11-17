--liquibase formatted sql

--changeset emikhailenko:TERM_TYPES_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.term_types (title, description, create_date, edit_date)
VALUES ('Удушающий', 'Удушающй прием перекрывающий кислород', CURRENT_DATE, CURRENT_DATE),
       ('Болевой', 'Различные заломы частей тела', CURRENT_DATE, CURRENT_DATE),
       ('Перевод', 'Перевод для дальнейшего развития', CURRENT_DATE, CURRENT_DATE)








