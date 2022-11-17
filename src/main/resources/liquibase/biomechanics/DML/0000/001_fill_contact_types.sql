--liquibase formatted sql

--changeset emikhailenko:CONTACT_TYPES_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.contact_types ("type") VALUES ('mail');
INSERT INTO biomechanics.contact_types ("type") VALUES ('phone');