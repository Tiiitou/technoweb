# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table groupe (
  id                            bigint auto_increment not null,
  groupe                        varchar(255),
  identifiant_id                bigint,
  tuteur                        varchar(255),
  role                          varchar(255),
  remarque                      varchar(255),
  constraint pk_groupe primary key (id)
);

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
  role                          integer,
  email                         varchar(255),
  identifiant                   integer,
  constraint pk_user primary key (id)
);

alter table groupe add constraint fk_groupe_identifiant_id foreign key (identifiant_id) references user (id) on delete restrict on update restrict;
create index ix_groupe_identifiant_id on groupe (identifiant_id);

alter table session add constraint fk_session_promotion_id foreign key (promotion_id) references promotion (id) on delete restrict on update restrict;
create index ix_session_promotion_id on session (promotion_id);


# --- !Downs

alter table groupe drop foreign key fk_groupe_identifiant_id;
drop index ix_groupe_identifiant_id on groupe;

alter table session drop foreign key fk_session_promotion_id;
drop index ix_session_promotion_id on session;

drop table if exists groupe;

drop table if exists promotion;

drop table if exists session;

drop table if exists user;

