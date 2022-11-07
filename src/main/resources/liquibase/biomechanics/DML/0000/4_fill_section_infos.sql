--liquibase formatted sql

--changeset emikhailenko:SECTION_INFOS_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.section_infos (title,
										short_description,
										preview_url,
										address_id,
										is_active)
VALUES ('Ales Fintess', 'Fitness', 'alexfintess.ru', 5, 1);

INSERT INTO biomechanics.section_infos (title,
										short_description,
										preview_url,
										address_id,
										is_active)
VALUES ('I am in form', 'Fintess center', 'belform.ru', 2, 1);

INSERT INTO biomechanics.section_infos (title,
										short_description,
										preview_url,
										address_id,
										is_active)
VALUES ('Ferrum', 'Fitness center', '31ferrum.ru', 5, 0);




