/*CREATE DATABASE toDoList
USE toDoList*/
CREATE TABLE tasks (
ID int AUTO_INCREMENT NOT NULL PRIMARY KEY,
Name varchar(255) NOT NULL,
Description varchar(255),
Completed BIT NOT NULL
);
insert into tasks (name,description,Completed) VALUES ("Milk","Buy 3 litres of coconut milk",0 );
insert into tasks (name,description,Completed) VALUES ("Dog","Take the dog for a walk",0 );
insert into tasks (name,description,Completed) VALUES ("Trash","Throw away the trash",0 );
insert into tasks (name,description,Completed) VALUES ("Car","Take the car to the mechanic",0 );
SELECT * FROM tasks;
ALTER TABLE tasks ADD Priority varchar(255);
ALTER TABLE tasks ADD Entry_Date varchar(255);
ALTER TABLE tasks MODIFY COLUMN Entry_Date  date;
Update tasks SET priority = "High" WHERE id = 2;
Update tasks SET priority = "High" WHERE id = 3;
Update tasks SET priority = "Medium" WHERE id = 4;
Update tasks SET priority = "Low" WHERE id = 1;
Update tasks SET entry_date = '2000-07-07' WHERE id = 1;
Update tasks SET completed = 1 WHERE id = 1;
