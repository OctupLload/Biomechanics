--liquibase formatted sql

--changeset emikhailenko:ACTIONS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.actions (title, description, action_type_id, video_id, image_url, create_date, edit_date)
VALUES ('Аши гарами','Болевой на ногу',2,1,NULL,'2022-12-13','2022-12-13'),
	   ('Арм бар','Болевой на руку',2,2,NULL,'2022-12-13','2022-12-13'),
	   ('Беримболо','Переход за спину',3,3,NULL,'2022-12-13','2022-12-13'),
	   ('Треугольник','Удушенение ногами',1,4,NULL,'2022-12-13','2022-12-13'),
	   ('Дэ-ла-рива','Болевой на икроножную мышцу',2,5,NULL,'2022-12-13','2022-12-13'),
	   ('Лук и стрелы','Удушающий со спины',1,6,NULL,'2022-12-13','2022-12-13'),
	   ('RNC','Удушение курткой',1,7,NULL,'2022-12-13','2022-12-13'),
	   ('Торреад пасс','Проход гарда',3,8,NULL,'2022-12-13','2022-12-13'),
	   ('Пулл гард','Перевод в гард',3,NULL,NULL,'2022-12-16','2022-12-16'),
	   ('Кросс чоук','Удушение курткой',1,NULL,NULL,'2022-12-16','2022-12-16'),
	   ('Гильотина','Удушающий в стойке',1,NULL,NULL,'2022-12-16','2022-12-16'),
	   ('Стойка','Стойка',4,NULL,NULL,'2022-12-16','2022-12-16');