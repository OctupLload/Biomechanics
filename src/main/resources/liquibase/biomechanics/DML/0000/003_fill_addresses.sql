--liquibase formatted sql

--changeset emikhailenko:ADDRESSES_FILL stripComments:true
--preconditions onFail:MARK_RAN

INSERT INTO biomechanics.addresses (location, city_id)
VALUES  ('97 Lukken Center', 4),
        ('91 Carpenter Park', 4),
        ('6 Northfield Way', 4),
        ('2307 Green Place', 10),
        ('2067 Katie Place', 10),
        ('0322 Florence Parkway', 10),
        ('8 Arrowood Circle', 22),
        ('7 Golf Course Court', 22),
        ('2 Magdeline Park', 15),
        ('4 Buhler Road', 15);


