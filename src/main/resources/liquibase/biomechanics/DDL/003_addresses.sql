--liquibase formatted sql

--changeset emikhailenko:BELTS stripComments:true
--preconditions onFail:MARK_RAN

CREATE TABLE biomechanics.belts (
	"id" serial PRIMARY KEY,
	color varchar(45),
	stripe smallint,
	picture_url varchar(500),
	create_date date,
	edit_date date
);
