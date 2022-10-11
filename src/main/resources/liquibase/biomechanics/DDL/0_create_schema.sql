--liquibase formatted sql

--changeset emikhailenko:BIOMECHANICS_SCHEMA stripComments:true
--preconditions onFail:MARK_RAN
CREATE SCHEMA IF NOT EXISTS biomechanics;
