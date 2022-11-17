--liquibase formatted sql

--changeset emikhailenko:COMMENTS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics."comments" ("text", user_id, video_id, create_date, edit_date)
VALUES ('Очень хорошее видео, мне понравилось!', 1, 1, CURRENT_DATE, CURRENT_DATE),
       ('Действейнный прием, пробовал.', 2, 2, CURRENT_DATE, CURRENT_DATE),
       ('Видел как делают, эпичный.', 3, 3, CURRENT_DATE, CURRENT_DATE),
       ('Не советую усердствовать!', 4, 4, CURRENT_DATE, CURRENT_DATE),
       ('Стоит попробовать.', 5, 5, CURRENT_DATE, CURRENT_DATE),
       ('Хороший прием!', 6, 6, CURRENT_DATE, CURRENT_DATE),
       ('Да у меня так бабушка может.', 7, 7, CURRENT_DATE, CURRENT_DATE),
       ('Мой дед так фрицев обходил!', 8, 8, CURRENT_DATE, CURRENT_DATE),
       ('Такие же ножница, только лучше.', 9, 9, CURRENT_DATE, CURRENT_DATE),
       ('Хлеборезка, но без хлеба.', 10, 10, CURRENT_DATE, CURRENT_DATE)



