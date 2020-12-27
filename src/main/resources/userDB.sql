create table person (
    id varchar(36) not null,
    username varchar(30) not null,
    password varchar(64) not null,
    created_at timestamp default current_timestamp,
    last_updated_at timestamp default current_timestamp on update current_timestamp,
    client_branch_id int not null,
    active tinyint(1) default true,
    unique(client_branch_id, username),
    primary key (id)
);

create table client (
    id int not null auto_increment,
    title varchar(50),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key (id)
);

create table client_branch (
    id int not null auto_increment,
    client_id int not null,
    branch varchar (100) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(client_id, branch),
    primary key(id)
);

create table role (
    id int not null auto_increment,
    title varchar(20),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key (id)
);

create table authority (
    id int not null auto_increment,
    title varchar(50) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key (id)
);

create table role_authority (
    role_id int not null,
    authority_id int not null,
    created_at timestamp default current_timestamp,
    primary key (role_id, authority_id)
);

create table user_role (
    user_id varchar(36) not null,
    role_id int not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (user_id, role_id)
);