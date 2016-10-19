create table User (
  id binary(16) not null,
  email varchar(100) not null unique,
  password varchar(60) not null,
  first_name varchar(60) not null,
  last_name varchar(60) not null,
  primary key (id)
);