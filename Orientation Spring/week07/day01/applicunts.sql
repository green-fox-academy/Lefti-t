/*create database applicunts;
use applicunts;*/
CREATE TABLE applicants (
ID int AUTO_INCREMENT NOT NULL PRIMARY KEY,
Name varchar(255) NOT NULL,
Country varchar(255),
Age int 
);
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",24 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",33 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",37 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",21 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",31);
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",18 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",29 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",37 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",20 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",39 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",35 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",23 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",40 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",27 );
insert into applicants (name,country,age) VALUES ("Bořivoj Souček","Czech Republic",33 );
Update applicants SET age = 21 WHERE id = 6;
Update applicants SET country = "Austria" WHERE id = 2;
Update applicants SET name = "sporos" WHERE id = 8;
select * from applicants;
select name ,age  from applicants where country = "Czech Republic" order by age asc limit 5 ;