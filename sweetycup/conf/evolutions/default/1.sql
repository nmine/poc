# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  id                        bigint auto_increment not null,
  title                     varchar(255),
  date                      datetime,
  aside_content             varchar(255),
  footer_content            varchar(255),
  author                    varchar(255),
  template                  integer,
  content                   varchar(1000),
  constraint pk_article primary key (id))
;

create table comments (
  id                        bigint auto_increment not null,
  author                    varchar(255),
  content                   varchar(1000),
  constraint pk_comments primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table article;

drop table comments;

SET FOREIGN_KEY_CHECKS=1;

