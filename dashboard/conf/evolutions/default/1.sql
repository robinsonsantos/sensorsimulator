# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table device (
  id                        bigint not null,
  uuid                      varchar(255),
  name                      varchar(255),
  value_type                varchar(255),
  constraint pk_device primary key (id))
;

create table humidity (
  id                        bigint not null,
  value                     integer,
  constraint pk_humidity primary key (id))
;

create table pressure (
  id                        bigint not null,
  value                     integer,
  constraint pk_pressure primary key (id))
;

create table temperature (
  id                        bigint not null,
  value                     float,
  constraint pk_temperature primary key (id))
;

create table user (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_user primary key (id))
;

create sequence device_seq;

create sequence humidity_seq;

create sequence pressure_seq;

create sequence temperature_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists device;

drop table if exists humidity;

drop table if exists pressure;

drop table if exists temperature;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists device_seq;

drop sequence if exists humidity_seq;

drop sequence if exists pressure_seq;

drop sequence if exists temperature_seq;

drop sequence if exists user_seq;

