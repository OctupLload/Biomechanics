--liquibase formatted sql

--changeset emikhailenko:USERS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.users (login, password, role_id, is_active, person_id, create_date, edit_date)
VALUES ('Leo', 'lucifer', 2, 1, 1, CURRENT_DATE, CURRENT_DATE),
       ('Charlie', 'password1', 2, 1, 2, CURRENT_DATE, CURRENT_DATE),
       ('boo', 'something', 2, 1, 3, CURRENT_DATE, CURRENT_DATE),
       ('Toby', 'jackson', 3, 1, 4, CURRENT_DATE, CURRENT_DATE),
       ('Chloe', 'cherokee', 3, 1, 5, CURRENT_DATE, CURRENT_DATE),
       ('Missy', 'alabama', 6, 1, 6, CURRENT_DATE, CURRENT_DATE),
       ('sox', 'rebecca', 6, 1, 7, CURRENT_DATE, CURRENT_DATE),
       ('Panda', 'secret', 2, 1, 8, CURRENT_DATE, CURRENT_DATE),
       ('Max', 'strawberry', 2, 1, 9, CURRENT_DATE, CURRENT_DATE),
       ('Sweetie', 'christopher', 6, 1, 10, CURRENT_DATE, CURRENT_DATE),
       ('admin', 'admin', 4, 1, NULL, CURRENT_DATE, CURRENT_DATE);



