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
       ('Horacio', NULL, 'Mclemore', '+5919388970516', '2000-05-04', CURRENT_DATE, CURRENT_DATE);






