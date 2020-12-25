create table person (
    id int(12) not null auto_increment,
    username varchar(30) not null,
    password varchar(30) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    email varchar(30) default null,
    mobile_country_code varchar(5) default null,
    mobile int(12) default null,
    client_id int not null,
    active tinyint(1) default true;
    primary key (id)
);

create table client {
    id int not null auto_increment,
    name varchar(50),
    branch Varchar(100),
    primary key (id)
}

create table role {
    id int not null auto_increment,
    name varchar(20),
    primary key (id)
}

create table authority {
    id int not null auto_increment,
    name varchar(50) not null
    primary key (id)
}

create table role_authority {
    id int not null auto_increment,
    role_id int not null,
    authority_id int not null,
    primary key (id)
}

create table user_role {
    id int not null auto_increment,
    user_id int not null,
    role_id int not null,
    primary key (id)
}