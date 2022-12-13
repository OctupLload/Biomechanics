--liquibase formatted sql

--changeset emikhailenko:USERS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.users (login, password, role_id, is_active, create_date, edit_date)
VALUES ('Leo', 'lucifer', 2, 1, CURRENT_DATE, CURRENT_DATE),
       ('Charlie', 'password1', 2, 1, CURRENT_DATE, CURRENT_DATE),
       ('boo', 'something', 2, 1, CURRENT_DATE, CURRENT_DATE),
       ('Toby', 'jackson', 3, 1, CURRENT_DATE, CURRENT_DATE),
       ('Chloe', 'cherokee', 3, 1, CURRENT_DATE, CURRENT_DATE),
       ('Missy', 'alabama', 6, 1, CURRENT_DATE, CURRENT_DATE),
       ('sox', 'rebecca', 6, 1, CURRENT_DATE, CURRENT_DATE),
       ('Panda', 'secret', 2, 1, CURRENT_DATE, CURRENT_DATE),
       ('Max', 'strawberry', 2, 1, CURRENT_DATE, CURRENT_DATE),
       ('Sweetie', 'christopher', 6, 1, CURRENT_DATE, CURRENT_DATE),
       ('admin', 'admin', 4, 1, CURRENT_DATE, CURRENT_DATE);



