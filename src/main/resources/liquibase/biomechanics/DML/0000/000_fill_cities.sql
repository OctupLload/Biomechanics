--liquibase formatted sql

--changeset emikhailenko:CITIES_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.cities (title)
VALUES ('Burgastai'),
       ('Kabor'),
       ('Himanka'),
       ('Wangong'),
       ('Zomba'),
       ('Hankasalmi'),
       ('Palmas Bellas'),
       ('Huai Mek'),
       ('Shums’k'),
       ('Vulcan'),
       ('Baracoa'),
       ('Shicheng'),
       ('Veslyy'),
       ('Yuelai'),
       ('Shihuiqiao'),
       ('Rogonik'),
       ('Mekon'),
       ('Motygino'),
       ('Trzemeszno'),
       ('Morelos'),
       ('Manizales'),
       ('Totolan'),
       ('Jiamaogong'),
       ('Guifes'),
       ('Khon San'),
       ('Bothaville'),
       ('Rominimbang'),
       ('Huarong Chengguanzhen'),
       ('Mantes-la-Jolie'),
       ('Stari Lec'),
       ('Crdoba'),
       ('Lumbangan'),
       ('Philadelphia'),
       ('Kertosari'),
       ('Szczaniec'),
       ('Trn'),
       ('Fukiage-fujimi'),
       ('Verkhniy Avzyan'),
       ('Veruby'),
       ('Davyd-Haradok'),
       ('Amorim'),
       ('Maao'),
       ('San Buenaventura'),
       ('Cikoneng'),
       ('Alderetes'),
       ('Linkping'),
       ('Yulin'),
       ('Tuy Phc'),
       ('Roanoke'),
       ('Pondokkaha Kelod');