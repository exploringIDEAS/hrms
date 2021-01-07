create table user_person (
    id BINARY(16) not null,
    username varchar(30) not null,
    password varchar(64) not null,
    email varchar(50) not null,
    created_at timestamp default current_timestamp,
    last_updated_at timestamp default current_timestamp on update current_timestamp,
    client_branch_id int not null,
    active tinyint(1) default true,
    unique(client_branch_id, username),
    primary key (id)
);

create table user_client (
    id int not null auto_increment,
    title varchar(50),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key (id)
);

create table user_client_branch (
    id int not null auto_increment,
    client_id int not null,
    branch varchar (100) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(client_id, branch),
    primary key(id)
);

create table user_role (
    id int not null auto_increment,
    title varchar(20),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key (id)
);

create table user_authority (
    id int not null auto_increment,
    title varchar(50) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key (id)
);

create table user_role_authority (
    role_id int not null,
    authority_id int not null,
    created_at timestamp default current_timestamp,
    primary key (role_id, authority_id)
);

create table user_person_role (
    person_id binary(16) not null,
    role_id int not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (person_id, role_id)
);

insert into person (id, username, password, client_branch_id, email) values (UUID_TO_BIN('dafb9f44-498c-11eb-89c9-080a1b6ac497'), "alien", "$2y$13$qaQaP7JDrZViUP.Z/.X9LeVmy5qd.bChRX4ra38aFl60cfFxoT3gO", 1, 'rahularya091@gmail.com');