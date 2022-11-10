--liquibase formatted sql

--changeset emikhailenko:VIDEOS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.videos (title, description, url, create_date, edit_date)
VALUES ('Аши гарами', 'Аши гарами от самбистов', 'https://www.youtube.com/watch?v=bp5-JubOQ08', CURRENT_DATE, CURRENT_DATE),
       ('Арм бар', 'Рычаг логтя', 'https://www.youtube.com/watch?v=FaQ-I23-yBg', CURRENT_DATE, CURRENT_DATE),
       ('Беримболо', 'Популярный прием', 'https://www.youtube.com/watch?v=mYE5ibcQqcQ', CURRENT_DATE, CURRENT_DATE),
       ('Треугольник', 'Классический прием', 'https://www.youtube.com/watch?v=1DAui2hKd78', CURRENT_DATE, CURRENT_DATE),
       ('Дэ-ла-рива', 'Атаки и свипы', 'https://www.youtube.com/watch?v=Meem15e7kYA', CURRENT_DATE, CURRENT_DATE),
       ('Лук и стрелы', 'Удушение лук и стрелы на русском', 'https://www.youtube.com/watch?v=BbShiXDDVgQ', CURRENT_DATE, CURRENT_DATE),
       ('RNC', 'Rear naked choke', 'https://www.youtube.com/watch?v=xVdg4Mi1W8w', CURRENT_DATE, CURRENT_DATE),
       ('Торреада пасс', 'Торреада пасс от BJJ Library Seminar', 'https://www.youtube.com/watch?v=HcrOBNTiYpg', CURRENT_DATE, CURRENT_DATE),
       ('Ножницы', 'Прием ножницы', 'https://www.youtube.com/watch?v=Va6SYC5ZvXE', CURRENT_DATE, CURRENT_DATE),
       ('Хлеборезка', 'Прием хлеборезка', 'https://www.youtube.com/watch?v=DgEiLpy1ov8', CURRENT_DATE, CURRENT_DATE)








