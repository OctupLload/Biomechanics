--liquibase formatted sql

--changeset emikhailenko:PERSONS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.persons (user_id, first_name, middle_name, last_name, phone, birth_day, create_date, edit_date)
VALUES (1, 'Dorinda', NULL, 'Hinojosa', '+9736144005002', '2000-05-25', CURRENT_DATE, CURRENT_DATE),
       (2, 'Tiffani', NULL, 'Prieto', '+479480421561', '2000-01-24', CURRENT_DATE, CURRENT_DATE),
       (3, 'Armand', NULL, 'Purvis', '+2687883338603', '2000-11-23', CURRENT_DATE, CURRENT_DATE),
       (4, 'Teresita', NULL, 'Sowers', '+8529865994559', '2000-03-29', CURRENT_DATE, CURRENT_DATE),
       (5, 'Willetta', NULL, 'Lunn', '+9733632069563', '2001-01-05', CURRENT_DATE, CURRENT_DATE),
       (6, 'Wilton', NULL, 'Ha', '+311403272230', '2000-06-07', CURRENT_DATE, CURRENT_DATE),
       (7, 'Buford', NULL, 'Berrios', '+654577267970', '2001-05-28', CURRENT_DATE, CURRENT_DATE),
       (8, 'Mary', NULL, 'Razo', '+3523018691169', '2001-06-01', CURRENT_DATE, CURRENT_DATE),
       (9,'Horacio', NULL, 'Mclemore', '+5919388970516', '2000-05-04', CURRENT_DATE, CURRENT_DATE);






