--liquibase formatted sql

--changeset emikhailenko:PERSONS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.persons (first_name, middle_name, last_name, phone, birth_day, create_date, edit_date)
VALUES ('Dorinda', NULL, 'Hinojosa', '+9736144005002', '2000-05-25', CURRENT_DATE, CURRENT_DATE),
       ('Tiffani', NULL, 'Prieto', '+479480421561', '2000-01-24', CURRENT_DATE, CURRENT_DATE),
       ('Armand', NULL, 'Purvis', '+2687883338603', '2000-11-23', CURRENT_DATE, CURRENT_DATE),
       ('Teresita', NULL, 'Sowers', '+8529865994559', '2000-03-29', CURRENT_DATE, CURRENT_DATE),
       ('Willetta', NULL, 'Lunn', '+9733632069563', '2001-01-05', CURRENT_DATE, CURRENT_DATE),
       ('Wilton', NULL, 'Ha', '+311403272230', '2000-06-07', CURRENT_DATE, CURRENT_DATE),
       ('Buford', NULL, 'Berrios', '+654577267970', '2001-05-28', CURRENT_DATE, CURRENT_DATE),
       ('Mary', NULL, 'Razo', '+3523018691169', '2001-06-01', CURRENT_DATE, CURRENT_DATE),
       ('Horacio', NULL, 'Mclemore', '+5919388970516', '2000-05-04', CURRENT_DATE, CURRENT_DATE),
       ('Tonja', NULL, 'Edmonds', '+640361948790', '2001-01-14', CURRENT_DATE, CURRENT_DATE),
       ('June', NULL, 'Stokes', '+5078316549267', '2000-02-20', CURRENT_DATE, CURRENT_DATE),
       ('Lesha', NULL, 'Catalano', '+2129273923538', '2001-09-29', CURRENT_DATE, CURRENT_DATE),
       ('Serina', NULL, 'Kirchner', '+494928966831', '2000-07-14', CURRENT_DATE, CURRENT_DATE),
       ('Kelley', NULL, 'Cho', '+2601907689267', '2000-05-01', CURRENT_DATE, CURRENT_DATE),
       ('Joi', NULL, 'Keeling', '+5032328222831', '2000-08-07', CURRENT_DATE, CURRENT_DATE),
       ('Darryl', NULL, 'Kell', '+663268956899', '2001-02-19', CURRENT_DATE, CURRENT_DATE),
       ('Granville', NULL, 'Montes', '+5065522577924', '2000-09-04', CURRENT_DATE, CURRENT_DATE),
       ('Tina', NULL, 'Singletary', '+5976673380822', '2001-09-11', CURRENT_DATE, CURRENT_DATE),
       ('Ehtel', NULL, 'Dillard', '+3588886498724', '2001-03-19', CURRENT_DATE, CURRENT_DATE),
       ('Kristie', NULL, 'Scales', '+209969129215', '2001-06-11', CURRENT_DATE, CURRENT_DATE)





