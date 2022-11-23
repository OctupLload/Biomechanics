--liquibase formatted sql

--changeset emikhailenko:CONTACTS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.contacts (contact_type_id, "value")
VALUES (1, 'rgeorgescu0@springer.com'),
       (1, 'ahebron1@reddit.com'),
       (1, 'cskule2@vk.com'),
       (1, 'bbaythorp3@gravatar.com'),
       (1, 'rdunrige4@blinklist.com'),
       (2, '7991039062'),
       (2, '4041410940'),
       (2, '9935700650'),
       (2, '8997549543'),
       (2, '2344429152');
