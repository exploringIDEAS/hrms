create table employee (
    id int not null auto_increment,
    user_id binary(16) not null,
    dob date not null,
    first_name varchar(30) not null,
    last_name varchar(20) not null,
    gender enum ('M','F', 'O') not null,
    email varchar(30) default null,
    hire_date date not null,
    mobile int(12) default null,
    curr_dept_id smallint not null,
    curr_designation_id smallint not null,
    compensation_id int not null,
    curr_address varchar(400),
    curr_zipcode int default null,
    curr_country varchar(30) default null,
    perm_address varchar(400),
    perm_zipcode int default null,
    perm_country varchar(30) default null,
    alt_mobile int(12) default null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (id)
);

create table department (
    id smallint not null auto_increment,
    title varchar(40) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (id),
    unique  key (title)
);

create table designation (
    id smallint not null auto_increment,
    title varchar (50) not null,
    grade smallint default -1,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique (title),
    primary key (id)
);

create table dept_manager (
   emp_id int not null auto_increment,
   dept_id smallint not null,
   from_date date not null,
   to_date date default null,
   created_at timestamp default current_timestamp,
   updated_at timestamp default current_timestamp on update current_timestamp,
   primary key (emp_id, dept_id)
);

create table dept_employee (
    emp_id int not null,
    dept_id smallint not null,
    from_date date not null,
    to_date date default null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (emp_id, dept_id)
);

create table emp_designation (
    emp_id int not null,
    designation_id smallint not null,
    from_date date not null,
    to_date date default null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    primary key (emp_id, designation_id)
);

create table emp_compensation (
    emp_id int not null,
    compensation_id int not null,
    from_date date not null,
    to_date date default null,
    created_at timestamp default current_timestamp,
    primary key (emp_id, compensation_id)
);

create table compensation (
    id smallint not null,
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