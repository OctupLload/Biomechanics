--liquibase formatted sql

--changeset emikhailenko:ADDRESSES stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.addresses (
	"id" serial PRIMARY KEY,
	"location" varchar(300),
	city_id int,
	create_date date,
	edit_date date
);

ALTER TABLE biomechanics.addresses
ADD CONSTRAINT city_id_fk
FOREIGN KEY (city_id)
REFERENCES biomechanics.cities("id");
