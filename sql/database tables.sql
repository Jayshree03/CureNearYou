create database cureNearYou;
use cureNearYou;
create table user(
	uid varchar(30) not null primary key ,
    uname varchar(15),
    umob int(12),
    uadd varchar(50),
    upass varchar(25),
    utype int(6)
);
desc user;
use cureNearYou;
create table patient(
	pid VARCHAR(30) not null primary key ,
    uid varchar(30),
    age int(4),
    gender varchar(20),
    FOREIGN KEY(uid) references user(uid)
); 
desc patient;
use cureNearYou;
create table doctor(
	did varchar(30) not null primary key ,
    uid varchar(30),
    age int(4),
    gender varchar(20),
    specification varchar(20),
    FOREIGN KEY(uid) references user(uid)
);
desc doctor;
use cureNearYou;
create table hospital(
	hid varchar(30) not null primary key ,
    uid varchar(30),
    hlicenseno varchar(30),
    FOREIGN KEY(uid) references user(uid)
);
desc hospital;
use cureNearYou;
create table pharmacy(
		phid varchar(30) not null primary key ,
        uid varchar(30),
        ptype varchar(20),
        plicenseno varchar(30),
        FOREIGN KEY(uid) references user(uid)
);
desc pharmacy;
use cureNearYou;
create table bedAvail(
	bedid VARCHAR(30) primary key not null ,
    hid varchar(30),
    FOREIGN KEY(hid) references hospital(hid),
    bedtype varchar(30),
    bedcount int(7)
);
desc bedAvail;
use cureNearYou;
create table bloodAvail(
	bloodid int(30) primary key not null auto_increment,
    hid varchar(30),
    FOREIGN KEY(hid) references hospital(hid),
    bloodtype varchar(30),
    bloodunit int(7)
);