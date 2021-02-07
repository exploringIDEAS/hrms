create table timesheet_attendance (
    id int not null auto_increment,
    emp_id int not null,
    work_date date not null,
    marked_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    source varchar(15) not null, -- DASHBOARD, BIOMETRIC
    unique (emp_id, work_date),
    primary key (id)
);

create table timesheet_holiday_calendar (
    id int not null auto_increment,
    holiday_date date not null,
    description varchar(50) default null, -- about holiday
    optional tinyint default 0, -- TRUE, FALSE
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique (holiday_date),
    primary key(id)
);

create table timesheet_leave_request (
    id int not null auto_increment,
    emp_id int not null,
    from_date date not null,
    to_date date not null,
    leave_type varchar(25) not null, -- SICK LEAVE, CASUAL LEAVE, EARNED LEAVE, MATERNITY LEAVE, PATERNITY LEAVE, UNPAID LEAVE
    leave_req_state varchar(20) not null, -- PENDING, APPROVED, CANCELLED
    approved_by varchar(25) default null, -- MANAGER, AUTO, HR, ANY USER
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(emp_id, from_date),
    primary key(id)
);

create table timesheet_office_shift (
    id int not null auto_increment,
    title varchar(30) not null,
    start_at int not null, -- 1020 -> 10:20, 1245 -> 12:45
    hours int not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(title),
    primary key(id)
);

create table timesheet_emp_leave_stock (
    id int not null auto_increment,
    emp_id int not null,
    sick_leave int default 0,
    casual_leave int default 0,
    earned_leave int default 0,
    maternity_leave int default 0,
    paternity_leave int default 0,
    calendar_start_date date not null,
    calendar_end_date date not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp,
    unique(emp_id, calendar_start_date),
    primary key(id)
);

