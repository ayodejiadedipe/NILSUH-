DROP DATABASE IF EXISTS NILSUH;
CREATE DATABASE NILSUH;
USE NILSUH;


CREATE TABLE client(
	client_id int not null AUTO_INCREMENT, 
	c_fname varchar(50),
	c_lname varchar(50),
	gender ENUM('MALE', 'FEMALE'),
	address varchar(200),
	email varchar(50),
	telephone varchar(15),	
	
	PRIMARY KEY (client_id)
);


CREATE TABLE employee(
	emp_id int not null AUTO_INCREMENT,
	e_fname varchar(20),
	e_lname varchar(20),
	gender ENUM('MALE', 'FEMALE'),
	address varchar(200),
	email varchar(50),
	telephone varchar(15), 
	login_status varchar(50),
	position varchar(30),
	start_date date, 
	end_date date,
	hrs decimal(5,2),

	PRIMARY KEY (emp_id)
);


CREATE TABLE login(
	emp_id int,
	username varchar(50),
	password varchar(20),
	
	PRIMARY KEY (emp_id)	
);


CREATE TABLE batch(
	batch_id int not null AUTO_INCREMENT,
	entryDate date,	
	amount int,
	mortality int, 
	remain int,
	slaughter_date date, 
	feedCost decimal(10,2), 
	medicineCost decimal(10,2),
	
	PRIMARY KEY (batch_id)
);


CREATE TABLE transactions(
	trans_Num int not null AUTO_INCREMENT,
	entry_date date,
	quantity int, 
	qty_lb decimal(10,2), 
	amount decimal(10,2),
	balance decimal(10,2),
	trans_type varchar(100),
	payment_type varchar(100),
	purpose varchar(100),
	source varchar(100),
	destination varchar(100),
	description varchar(150),
	status varchar(50),
	dateopen date,
	dateclose date,
	
	PRIMARY KEY (trans_Num)
);


CREATE TABLE balance(
	balance decimal(10,2);
);




