# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        integer not null,
  name                      varchar(255),
  constraint pk_book primary key (id))
;

create table page (
  id                        integer not null,
  title                     varchar(255),
  text                      varchar(255),
  constraint pk_page primary key (id))
;

create sequence book_seq;

create sequence page_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists book;

drop table if exists page;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists book_seq;

drop sequence if exists page_seq;

