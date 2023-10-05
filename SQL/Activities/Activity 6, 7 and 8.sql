REM   Script: Activity6, Activity7 and Activity8
REM   Activity6, Activity7 and Activity8

create table customers(customer id,cusname varchar(10) NOT NULL,contactname varchar(12),address varhcar(30),city varchar(30),postalcode varchar(15),country varchar(20));

create table customers(cusid int,cusname varchar(10) NOT NULL,contactname varchar(12),address varhcar(30),city varchar(30),postalcode varchar(15),country varchar(20));

create table customers(cusid int,cusname varchar(10) NOT NULL,contactname varchar(12),address varhcar(30),city varchar(30),postalcode varchar(15),country varchar(20)) 
;

create table customers(cusid int,cusname varchar(10) NOT NULL,contactname varchar(12),address varhcar(30),city varchar(30),postalcode varchar(15),country varchar(20) 
;

create table customers(cusid int,cusname varchar(10) NOT NULL,contactname varchar(12),address varhcar(30),city varchar(30),postalcode varchar(15),country varchar(20))) 
;

create table customers( 
    cusid int, 
    cusname varchar(10) NOT NULL, 
    contactname varchar(12), 
    address varhcar(30), 
    city varchar(30), 
    postalcode varchar(15), 
    country varchar(20) 
    ) 
;

create table customers( 
    cusid int, 
    cusname varchar(10) NOT NULL, 
    contactname varchar(12), 
    address varchar(30), 
    city varchar(30), 
    postalcode varchar(15), 
    country varchar(20) 
    ) 
;

create table customers( 
    cusid int, 
    cusname varchar(10) NOT NULL, 
    contactname varchar(12), 
    address varchar(30), 
    city varchar(30), 
    postalcode varchar(15), 
    country varchar(20) 
    ) 
describe customers 
;

create table customers( 
    cusid int, 
    cusname varchar(10) NOT NULL, 
    contactname varchar(12), 
    address varchar(30), 
    city varchar(30), 
    postalcode varchar(15), 
    country varchar(20) 
    ) 
//describe customers 
;

create table customers( 
    cusid int, 
    cusname varchar(10) NOT NULL, 
    contactname varchar(12), 
    address varchar(30), 
    city varchar(30), 
    postalcode varchar(15), 
    country varchar(20) 
    ) 
 
;

describe customers


alter table customers add Dateofbirth date;

alter table customers drop column Dateofbirth;

alter table customers drop column Dateofbirth;

describe customers


alter table customers modify postalcode varchar(25);

insert into customers(cusid,cusname,contactname,address,city,postalcode,country) values(1,'test','manager','123 streer','hyderabad','500048','india');

select * from customers;

insert into customers(cusid,cusname,contactname) values(2,'Dev','HR');

select * from customers;

insert all into customers values(3,'Isha','team member','1st phase','hyderabad','500048','india') 
into customers values(4,'Asha','team member','2nd phase','hyderabad','500048','india') select 1 from dual;

select * from customers;

select cusid,cusname from customer;

select cusid,cusname from customers;

select cusid,cusname from customers where cusid = 1;

select cusid,cusname from customers where cusid < 1;

update customers set cusname ='test',city ='Bangalore' where cusid =1;

select * from customers;

create table customers(  
    cusid int,  
    cusname varchar(10) NOT NULL,  
    contactname varchar(12),  
    address varchar(30),  
    city varchar(30),  
    postalcode varchar(15),  
    country varchar(20)  
    ) ;

describe customers


select * from customers;

create table emp(empid int, ename varchar2(20), deptid int);

create table dept(deptid int, dname varchar2(20));

insert all  
    into emp values(1,'ram',10) 
    into emp values(2,'krishna',20) 
    into emp values(3,'lohitha',10) 
    into emp values(4,'anjali',20) select 1 from dual;

insert all  
     into dept values(10,'sales') 
     into dept values(20,'finance') 
select 1 from dual;

select deptid,count(empid) as headcount from emp group by deptid order by deptid;

alter table emp add sal int;

update emp set sal=10000 where empid=1;

update emp set sal=1000 where empid=2 
update emp set sal=3000 where empid=3 
update emp set sal=50000 where empid=4;

update emp set sal=1000 where empid=2;

update emp set sal=3000 where empid=3;

update emp set sal=50000 where empid=4;

select * from emp;

select depid,min(sal) as min_sal from emp group by deptid order by deptid;

select deptid,min(sal) as min_sal from emp group by deptid order by deptid;

select deptid,count(empid) headcount from emp group by deptid order by headcount DESC;

select deptid,count(empid) headcount from emp group by deptid having max(sal)>2000 order by headcount DESC;

select deptid,count(empid) headcount from emp group by deptid having max(sal)>8000 order by headcount DESC;

select deptid,count(empid) headcount from emp group by deptid having max(sal)<1000 order by headcount DESC;

select deptid,count(empid) headcount from emp group by deptid having max(sal)<10000 order by headcount DESC;

select deptid,count(empid) headcount from emp group by deptid having max(sal)<90000 order by headcount DESC;

select deptid,count(empid) headcount from emp group by deptid having max(sal)<9000 order by headcount DESC;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from  orders;

select distinct salesman_id from orders;

select order_no, order_date from orders;

select order_no, order_date from orders order by order_date;

select order_no, purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount <500;

select * from orders where purchase_amount between 1000 and 2000;

select sum(purchase_amount) as total_purshare_amount from orders;

select avg(purchase_amount) as avg_purshare_amount from orders;

select max(purchase_amount) as max_purshare_amount from orders;

select min(purchase_amount) as min_purshare_amount from orders;

select count(salesman_id) as number_salesman from orders;

select count(distinct salesman_id) as number_salesman from orders;

select count(distinct salesman_id) as "number_salesman" from orders;

select customer_id, max(purchase_amount) as max_purchase from orders group by customer_id;

select salesman_id, order_date, max(purchase_amount) as max_purchase from orders where order_date=To_date('2012/08/17','YYYY/MM/DD') group by salesman_id, order_date;

select customer_id, order_date, max(purchase_amount) as max_purchase from orders group by customer_id, order_date having max(purchase_amount) IN(2030, 3450, 5760, 6000);

