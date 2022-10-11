--liquibase formatted sql

--changeset emikhailenko:BIOMECHANICS_TABLES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.belts (
	belt_id serial PRIMARY KEY,
	belt_color varchar(100),
	stripes smallint,
	belt_picture_url text
);

CREATE TABLE biomechanics.cities (
	city_id serial PRIMARY KEY,
	city_title varchar(255),
	short_description varchar(255),
	long_description varchar(255)
);

CREATE TABLE biomechanics.persons (
	person_id serial PRIMARY KEY,
	first_name varchar(255),
	middle_name varchar(255),
	last_name varchar(255),
	birthday varchar(255),
	contact_phone varchar(255),
	create_date varchar(255),
	edit_date varchar(255)
);

CREATE TABLE biomechanics.coaches (
	coach_id serial PRIMARY KEY,
	coach_info varchar(255),
	experience smallint,
	person_id int,
	belt_id int,
	create_date varchar(255),
	edit_date varchar(255)
);

CREATE TABLE biomechanics.addresses (
	address_id serial PRIMARY KEY,
	contact_id int,
	address_location varchar(255),
	create_date varchar(255),
	edit_date varchar(255),
	city_id int
);

CREATE TABLE biomechanics.contact_types (
	contact_type_id serial PRIMARY KEY,
	contact_title varchar(255)
);

CREATE TABLE biomechanics.contacts (
	contact_id serial PRIMARY KEY,
	contact_type_id int,
	value varchar(255),
	create_date varchar(255),
	edit_date varchar(255)
);

CREATE TABLE biomechanics.section_infos (
	section_info_id serial PRIMARY KEY,
	section_info_title varchar(255),
	short_description varchar(255),
	full_description varchar(255),
	preview_url text,
	image_url text,
	address_id int,
	is_active boolean,
	create_date varchar(255),
	edit_date varchar(255)
);

CREATE TABLE biomechanics.section_infos_coaches (
	section_infos_contact_id serial PRIMARY KEY,
	section_info_id int,
	coach_id int
);

ALTER TABLE biomechanics.coaches
ADD CONSTRAINT person_id_fk
FOREIGN KEY (person_id)
REFERENCES biomechanics.persons(person_id);

ALTER TABLE biomechanics.coaches
ADD CONSTRAINT belt_id_fk
FOREIGN KEY (belt_id)
REFERENCES biomechanics.belts(belt_id);

ALTER TABLE biomechanics.addresses
ADD CONSTRAINT city_id_fk
FOREIGN KEY (city_id)
REFERENCES biomechanics.cities(city_id);

ALTER TABLE biomechanics.contacts
ADD CONSTRAINT contact_type_id_fk
FOREIGN KEY (contact_type_id)
REFERENCES biomechanics.contact_types(contact_type_id);

ALTER TABLE biomechanics.addresses
ADD CONSTRAINT contact_id_fk
FOREIGN KEY (contact_id)
REFERENCES biomechanics.contacts(contact_id);

ALTER TABLE biomechanics.section_infos_coaches
ADD CONSTRAINT section_info_id_fk
FOREIGN KEY (section_info_id)
REFERENCES biomechanics.section_infos(section_info_id);

ALTER TABLE biomechanics.section_infos_coaches
ADD CONSTRAINT coach_id_fk
FOREIGN KEY(coach_id)
REFERENCES biomechanics.coaches(coach_id);

ALTER TABLE biomechanics.section_infos
ADD CONSTRAINT address_id_fk
FOREIGN KEY(address_id)
REFERENCES biomechanics.addresses(address_id);