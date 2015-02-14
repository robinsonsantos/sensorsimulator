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

create table record (
  id                        bigint not null,
  uuid                      varchar(255),
  value                     varchar(255),
  created_at                varchar(255),
  constraint pk_record primary key (id))
;

create table user (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_user primary key (id))
;

create sequence device_seq;

create sequence record_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists device;

drop table if exists record;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists device_seq;

drop sequence if exists record_seq;

drop sequence if exists user_seq;

