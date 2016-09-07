create table TODOS(
id int primary_key auto_increment,
text varchar(50),
completed boolean
);

insert into todos.TODOS(1,'Learn Spring',false);