--liquibase formatted sql

--changeset emikhailenko:CONTACTS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.contacts (
	"id" serial PRIMARY KEY,
	"value" varchar(80),
	contact_type_id int,
	section_info_id int,
	create_date date,
	edit_date date
);

ALTER TABLE biomechanics.contacts
ADD CONSTRAINT contact_type_id_fk
FOREIGN KEY (contact_type_id)
REFERENCES biomechanics.contact_types("id");

ALTER TABLE biomechanics.contacts
ADD CONSTRAINT section_info_id_fk
FOREIGN KEY (section_info_id)
REFERENCES biomechanics.section_infos("id");