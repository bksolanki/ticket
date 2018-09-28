create database sales;
use sales;

create table items_reserve(
orderid varchar(255) ,
item_id int,
hold_expire int,
hold_cust_id int

);



CREATE TABLE Event (
    event_id int NOT NULL AUTO_INCREMENT,
    Artist varchar(255),
    venue varchar(255),
    event_date_time TIMEstamp,
    City varchar(255) ,
    state varchar(255) ,
    event_name varchar(255),
    
    PRIMARY KEY (event_id)
);


INSERT INTO Event ( Artist,venue,event_date_time, City, state, event_name)
VALUES ( 'Ed sheeran', 'Metlife stadium',now(), 'Jersey city', 'NJ' , 'Ed sheeran divide tour 2018');

CREATE TABLE Customer (
    cust_id int NOT NULL AUTO_INCREMENT,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255) ,
    email varchar(255),
    PRIMARY KEY (cust_id)
);



INSERT INTO Customer ( LastName ,FirstName,ADDRESS,City, email)
VALUES ( 'Scott', 'Micheal', 'Scranton', 'PA' , 'michealscott@dundermifflin.com');

INSERT INTO Customer ( LastName ,FirstName,ADDRESS,City, email)
VALUES ( 'Ryan', 'Howard', 'Scranton', 'PA' , 'ryan@dundermifflin.com');

INSERT INTO Customer ( LastName ,FirstName,ADDRESS,City, email)
VALUES ( 'Jim', 'Halpert', 'Philadelphia', 'PA' , 'jim@dundermifflin.com');


INSERT INTO Customer ( LastName ,FirstName,ADDRESS,City, email)
VALUES ( 'Kelly', 'kapoor', 'Philadelphia', 'PA' , 'jim@dundermifflin.com');

use sales;

create table item(
 Item_id int not null auto_increment,
TicketgroupId  int ,
 hasPdf boolean,
 Barcode varchar(255),
 Section varchar(255),
 irow varchar(255),
 Seat varchar(255),
 item_status varchar(255),
 hold_comment varchar(255),
 InternalNotes varchar(255),
 ExternalNotes varchar(255),
 Orderid  varchar(255),
 Purchase_cust_id int, 
 Amount float,
 currency varchar(255),
 Share bool,
 Invoice_id int(255),
 event_id int,
 PRIMARY KEY (item_id),
 FOREIGN KEY (Purchase_cust_id) REFERENCES customer(cust_id),
 FOREIGN KEY (event_id) REFERENCES event(event_id)
 );
 

 
 
 insert into item (TicketgroupId, hasPdf,Barcode , Section,irow,Seat,item_status, hold_comment, InternalNotes, ExternalNotes, Orderid, Purchase_cust_id, Amount, 
 currency, Share, Invoice_id, event_id)
 values (null, true, '1234', '100', '1', '1','available', null, null, null, null, null, 100.50,'usd', true, null, 1);
 
 insert into item (TicketgroupId, hasPdf,Barcode , Section,irow,Seat,item_status, hold_comment, InternalNotes, ExternalNotes, Orderid, Purchase_cust_id, Amount, 
 currency, Share, Invoice_id, event_id)
 values (null, true, '12345', '100', '1', '2','available', null, null, null, null, null, 100.50,'usd', true, null, 1);
 
  insert into item (TicketgroupId, hasPdf,Barcode , Section,irow,Seat,item_status, hold_comment, InternalNotes, ExternalNotes, Orderid, Purchase_cust_id, Amount, 
 currency, Share, Invoice_id, event_id)
 values (null, true, '12346', '100', '1', '3','available', null, null, null, null, null, 100.50,'usd', true, null, 1);
 
 
 insert into item (TicketgroupId, hasPdf,Barcode , Section,irow,Seat,item_status, hold_comment, InternalNotes, ExternalNotes, Orderid, Purchase_cust_id, Amount, 
 currency, Share, Invoice_id, event_id)
 values (null, true, '12346', '200', '1', '1','available', null, null, null, null, null, 200.50,'usd', true, null, 1);
 insert into item (TicketgroupId, hasPdf,Barcode , Section,irow,Seat,item_status, hold_comment, InternalNotes, ExternalNotes, Orderid, Purchase_cust_id, Amount, 
 currency, Share, Invoice_id, event_id)
 values (null, true, '12345', '200', '1', '2','available', null, null, null, null, null, 200.50,'usd', true, null, 1);
 
  insert into item (TicketgroupId, hasPdf,Barcode , Section,irow,Seat,item_status, hold_comment, InternalNotes, ExternalNotes, Orderid, Purchase_cust_id, Amount, 
 currency, Share, Invoice_id, event_id)
 values (null, true, '12346', '200', '1', '3','available', null, null, null, null, null, 200.50,'usd', true, null, 1);
 
