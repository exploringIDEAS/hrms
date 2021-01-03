create table employee (
    id int not null auto_increment,
    user_id binary(16) not null,
    birth_date date not null,
    first_name varchar(30) not null,
    last_name varchar(20) not null,
    gender varchar(1) not null,
    email varchar(30) default null,
    hire_date date not null,
    mobile bigint default null,
    dept_id int default null,
    designation_id int default null,
    compensation_id int default null,
    curr_address varchar(400),
    perm_address varchar(400),
    alt_mobile bigint default null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(user_id),
    primary key (id)
);

create table department (
    id int not null auto_increment,
    title varchar(40) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (id),
    unique  key (title)
);

create table designation (
    id int not null auto_increment,
    title varchar (50) not null,
    grade int default -1,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique (title),
    primary key (id)
);

create table dept_manager (
   emp_id int not null auto_increment,
   dept_id int not null,
   from_date date not null,
   to_date date default null,
   created_at timestamp default current_timestamp,
   updated_at timestamp default current_timestamp on update current_timestamp,
   primary key (emp_id, dept_id, from_date)
);

create table dept_employee (
    emp_id int not null,
    dept_id int not null,
    from_date date not null,
    to_date date default null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (emp_id, dept_id, from_date)
);

create table emp_designation (
    emp_id int not null,
    designation_id int not null,
    from_date date not null,
    to_date date default null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (emp_id, designation_id, from_date)
);

create table emp_compensation (
    emp_id int not null,
    compensation_id int not null,
    from_date date not null,
    to_date date default null,
    created_at timestamp default current_timestamp,
    primary key (emp_id, compensation_id, from_date)
);

create table compensation (
    id int not null auto_increment,
    basic_salary int not null,
    da int default 0,
    hra int default 0,
    ca int default 0,
    lta int default 0,
    ma int default 0,
    bpa int default 0,
    gratuity int default 0,
    epf int default 0,
    pt int default 0,
    perf_bonus int default 0,
    created_at timestamp default current_timestamp,
    primary key (id)
);

create table promotionRequest (
    -- fields request
)