-- Creating Garage table

create table garage
(
id bigint not null,
company varchar(70) not null,
name varchar(70) not null,
primary key (id)
);

--select * from garage; -- not working here!!



create table gadget
(
id bigint not null,
company varchar(70) not null,
name varchar(70) not null,
primary key (id)
);