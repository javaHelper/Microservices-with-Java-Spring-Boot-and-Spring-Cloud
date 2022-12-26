
use university;

create table address (
       id bigint not null auto_increment,
        city varchar(255),
        street varchar(255),
        primary key (id)
    ) engine=InnoDB;
    
INSERT INTO `address` VALUES (1,'Happy Street','Delhi'),(2,'Down the town Street','NY');

