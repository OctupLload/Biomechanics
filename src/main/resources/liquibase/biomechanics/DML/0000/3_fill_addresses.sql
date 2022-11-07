--liquibase formatted sql

--changeset emikhailenko:ADDRESSES_FILL stripComments:true
--preconditions onFail:MARK_RAN

insert into biomechanics.addresses (location, city_id) values ('97 Lukken Center', 4);
insert into biomechanics.addresses (location, city_id) values ('91 Carpenter Park', 4);
insert into biomechanics.addresses (location, city_id) values ('6 Northfield Way', 4);
insert into biomechanics.addresses (location, city_id) values ('2307 Green Place', 10);
insert into biomechanics.addresses (location, city_id) values ('2067 Katie Place', 10);
insert into biomechanics.addresses (location, city_id) values ('0322 Florence Parkway', 10);
insert into biomechanics.addresses (location, city_id) values ('8 Arrowood Circle', 22);
insert into biomechanics.addresses (location, city_id) values ('7 Golf Course Court', 22);
insert into biomechanics.addresses (location, city_id) values ('2 Magdeline Park', 15);
insert into biomechanics.addresses (location, city_id) values ('4 Buhler Road', 15);


