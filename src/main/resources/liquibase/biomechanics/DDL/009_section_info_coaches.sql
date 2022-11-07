--liquibase formatted sql

--changeset emikhailenko:SECTION_INFO_COACHES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.section_info_coaches (
	"id" serial PRIMARY KEY,
	coach_id int,
	section_info_id int,
	create_date date,
	edit_date date
);

ALTER TABLE biomechanics.section_info_coaches
ADD CONSTRAINT coach_id_fk
FOREIGN KEY (coach_id)
REFERENCES biomechanics.coaches("id");

ALTER TABLE biomechanics.section_info_coaches
ADD CONSTRAINT section_info_id_fk
FOREIGN KEY (section_info_id)
REFERENCES biomechanics.section_infos("id");
