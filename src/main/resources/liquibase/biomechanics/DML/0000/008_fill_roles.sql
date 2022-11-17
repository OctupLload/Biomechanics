--liquibase formatted sql

--changeset emikhailenko:ROLES_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.roles (name, description, create_date, edit_date)
VALUES ('admin', 'administrator', CURRENT_DATE, CURRENT_DATE),
       ('user', 'regular user', CURRENT_DATE, CURRENT_DATE),
       ('manager', 'manager', CURRENT_DATE, CURRENT_DATE),
       ('superadmin', 'super administrator', CURRENT_DATE, CURRENT_DATE),
       ('guest', 'guest', CURRENT_DATE, CURRENT_DATE),
       ('coach', 'coach', CURRENT_DATE, CURRENT_DATE)





