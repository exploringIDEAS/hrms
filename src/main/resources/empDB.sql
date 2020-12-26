create table employee (
    user_id varchar(36) default null,
    username varchar(30) not null,
    email varchar(30) default null,
    mobile_country_code varchar(5) default null,
    mobile int(12) default null,
    address varchar(400),
    city_id int default null,
    department_designation_id int not null,
    primary key (user_id)
);

create table country (
    id int not null auto_increment,
    title varchar(30),
    primary key (id)
);

create table state (
    id int not null auto_increment,
    country_id int not null,
    title varchar (30),
    unique(country_id, title)
    primary key (id)
);

create table city (
    id int not null auto_increment,
    state_id int not null,
    title varchar (30),
    unique(state_id, title),
    primary key(id)
);

create table department (
    id int not null auto_increment,
    title varchar(50) not null,
    unique(title),
    primary key (id)
);

create table designation (
    id int not null auto_increment,
    department_id int not null,
    title varchar (30) not null,
    unique(department_id, title),
    primary key (id)
);