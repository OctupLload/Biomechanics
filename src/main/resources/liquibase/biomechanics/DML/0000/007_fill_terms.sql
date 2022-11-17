--liquibase formatted sql

--changeset emikhailenko:TERMS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.terms (name, description, video_id, term_type_id, create_date, edit_date)
VALUES ('Аши гарами', 'Болевой на ногу', 1, 2, CURRENT_DATE, CURRENT_DATE),
       ('Арм бар', 'Болевой на руку', 2, 2, CURRENT_DATE, CURRENT_DATE),
       ('Беримболо', 'Переход за спину', 3, 3, CURRENT_DATE, CURRENT_DATE),
       ('Треугольник', 'Удушенение ногами', 4, 1, CURRENT_DATE, CURRENT_DATE),
       ('Дэ-ла-рива', 'Болевой на икроножную мышцу', 5, 2, CURRENT_DATE, CURRENT_DATE),
       ('Лук и стрелы', 'Удушающий со спины', 6, 1, CURRENT_DATE, CURRENT_DATE),
       ('RNC', 'Удушение курткой', 7, 1, CURRENT_DATE, CURRENT_DATE),
       ('Торреад пасс', 'Проход гарда', 8, 3, CURRENT_DATE, CURRENT_DATE)








