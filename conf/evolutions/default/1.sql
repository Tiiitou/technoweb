# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table promotion (
  id                            bigint auto_increment not null,
  annee                         integer,
  constraint pk_promotion primary key (id)
);

create table session (
  id                            bigint auto_increment not null,
  nom                           varchar(255),
  promotion_id                  bigint,
  constraint pk_session primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  nom                           varchar(255),
  prenom                        varchar(255),
  role                          bigint,
  email                         varchar(255),
  identifiant                   bigint,
  constraint pk_user primary key (id)
);

alter table session add constraint fk_session_promotion_id foreign key (promotion_id) references promotion (id) on delete restrict on update restrict;
create index ix_session_promotion_id on session (promotion_id);


# --- !Downs

alter table session drop foreign key fk_session_promotion_id;
drop index ix_session_promotion_id on session;

drop table if exists promotion;

drop table if exists session;

drop table if exists user;

