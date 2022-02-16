create database test1;
use test1;

  
create table department(
deptNo  INT NOT NULL,
deptName VARCHAR(45) NULL,
location VARCHAR(45) NULL,
PRIMARY KEY(deptNO));

desc department;
-- DDL Data Definition Language it uses ANSI SQL
CREATE TABLE employee(
  empNo INT NOT NULL,
  empName VARCHAR(45) NULL,
  job VARCHAR(45) NULL,
  mgr INT NULL,
  deptNo INT NULL,
  PRIMARY KEY (empNo),
  CONSTRAINT DEPTNO
    FOREIGN KEY (deptNo)
    REFERENCES department (deptNo)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

create table address(
	addressId INT NOT NULL,
    city VARCHAR(45) NULL,
    state VARCHAR(45) NULL,
    street VARCHAR(45) NULL,
    PRIMARY KEY (addressId)
);
-- drop table remove the complete table structure
drop table address;

-- Inserting a new record in the Department table 
INSERT INTO department VALUES (1,"IT","Bengaluru");
INSERT INTO department(deptNo,deptName,location) VALUES (2,"Marketing","New Delhi");
-- Inserting a row in department table giving some values
INSERT INTO department(deptNo,deptName) VALUES (3,"Finance");
-- Retrieving the all records from deparmtent table
select * from department;

-- Insert a new record in employee table
-- INSERT INTO employee VALUES(11,"Janhavi Thakur","Analyst",3); --  Column count doesn't match value count
INSERT INTO employee VALUES(11,"Janhavi Thakur","Analyst",NULL,3);
select * from employee;
select * from department;
INSERT INTO employee(empNo,empName,job) VALUES(12,"Aasaf Mahiuddin Ansari","Developer");
INSERT INTO employee(empNo,empName,job,mgr) VALUES(14,"Aman Singh","Developer",11);
-- INSERT INTO department values(&deptNo,&deptName,&location); 
INSERT INTO employee VALUES(13,"Shreyasi","Trainee",2,3);

-- Update statement
UPDATE employee SET deptNo=1 WHERE empNo=12;
UPDATE employee SET mgr=12 WHERE empNo=11;

INSERT INTO employee(empNo,empName) VALUES(15,"Aditi Suhane");
UPDATE employee SET mgr=12,job="Clerk",deptNo=2 WHERE empNo=14;

-- Delete rows from a table
DELETE FROM employee WHERE empNo=14; -- Delete all records about employee whose empNo is 10
DELETE FROM employee; -- Delete all rows from employee table 
-- Using a subquery to do an update example
UPDATE employee SET deptNo=(SELECT deptNo from department where deptName="IT") where empNo=14;
-- Removes all the rows from a table without using any condition
truncate employee;

select * from department;
select deptName from department;
select deptName,location from department;
select deptName as "Department Name",location as "Office Location"from department;
select * from employee where empName LIKE 'A%';
select * from employee where empNo IN (13,5,6,15);
select * from employee where empNo NOT IN (13,5,6,15);
select * from employee where empNo BETWEEN 1 AND 10;
select * from employee where empNo NOT BETWEEN 1 AND 10;

select * from employee where empName NOT LIKE 'A%';
select * from employee where mgr IS NULL;
select * from employee where mgr = 2 OR mgr=12;

INSERT INTO employee VALUES(16,'Aditya Purohit','Clerk',11,2);
INSERT INTO employee VALUES(17,'Anajali Kumari','Clerk',11,2);
-- DISTINCT clause - this is used to eliminate duplicate rows
select * from employee where deptNo=2;
select mgr from employee where deptNo=2;
select DISTINCT mgr from employee  where deptNo=2;
select * from employee order by empName;
-- Below query is displaying the result in which we are getting count of employees in a particular department
select count(empNo),deptNo from employee group by deptNo;
-- select count(empNo),empNo from employee group by deptNo;
select count(empNo) as "Count of Emp",deptNo from employee group by deptNo order by count(empNo) desc;

select deptNo from employee union select deptNo from department;

select city from customer union select city from supplier;
select city from customer union all select city from supplier;
select city,country from customer  where country = 'India' union all select city,country from supplier where country='India';
-- Using INNER JOIN we can perform  instersect  set operation on two tables
select customer.city from customer INNER JOIN supplier where customer.city=supplier.city;
 -- Left JOIN
 select customer.customername,supplier.supplierID
 from customer
 LEFT JOIN supplier ON customer.country=supplier.country
 ORDER BY customer.customername;
 
 -- Right JOIN
  select supplier.supplierName,customer.customerName
 from supplier
 RIGHT JOIN customer ON supplier.country=customer.country
 ORDER BY supplier.supplierName;
 
 -- Full JOIN
  select customer.customerName,supplier.supplierID
 from customer
 FULL JOIN supplier ON customer.country=supplier.country
 WHERE customer.city='Bengaluru'
 ORDER BY customer.customerName;