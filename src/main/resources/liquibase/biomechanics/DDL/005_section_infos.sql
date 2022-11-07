--liquibase formatted sql

--changeset emikhailenko:SECTION_INFOS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.section_infos (
	"id" serial PRIMARY KEY,
	title varchar(80),
	short_description varchar(150),
	full_description varchar(3000),
	preview_url varchar(500),
	image_url varchar(500),
	address_id int,
	is_active smallint,
	create_date date,
	edit_date date
);

ALTER TABLE biomechanics.section_infos
ADD CONSTRAINT address_id_fk
FOREIGN KEY (address_id)
REFERENCES biomechanics.addresses("id");
