--liquibase formatted sql

--changeset emikhailenko:CONTACTS_FILL stripComments:true
--preconditions onFail:MARK_RAN

insert into biomechanics.contacts (contact_type_id, value) values (1, 'rgeorgescu0@springer.com');
insert into biomechanics.contacts (contact_type_id, value) values (1, 'ahebron1@reddit.com');
insert into biomechanics.contacts (contact_type_id, value) values (1, 'cskule2@vk.com');
insert into biomechanics.contacts (contact_type_id, value) values (1, 'bbaythorp3@gravatar.com');
insert into biomechanics.contacts (contact_type_id, value) values (1, 'rdunrige4@blinklist.com');

insert into biomechanics.contacts (contact_type_id, value) values (2, '7991039062');
insert into biomechanics.contacts (contact_type_id, value) values (2, '4041410940');
insert into biomechanics.contacts (contact_type_id, value) values (2, '9935700650');
insert into biomechanics.contacts (contact_type_id, value) values (2, '8997549543');
insert into biomechanics.contacts (contact_type_id, value) values (2, '2344429152');
