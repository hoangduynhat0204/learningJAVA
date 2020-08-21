Create Database BookDB2;
Use bookDB2;

Create table Category(
	id int primary key auto_increment,
    name varchar(50) not null, 
    description varchar(255)
)
Insert Into Category(name,description)
Values('Programming','Programming Book'),
	('Web Design','Web Design Book'),
    ('Database','Database Book')
Select * From Category;

Create Table Book(
	id int primary key auto_increment,
    name varchar(50) not null,
    author varchar(50),
    categoryId int not null,
    foreign key fk_book_cate (categoryId) references Category(id)
)
Insert Into Book(name, author, categoryId)
Values('Java','Joe Murach',1),
	('HTML','Mike Murach',2),
    ('PHP','John Murac',1)

Create table BookDetails(
	id int primary key auto_increment,
    isbn varchar(50),
    numberOfPage int,
    price double,
    publishedDate date,
    foreign key fk_bookDeatils_book (id) references book(id)
)
Insert Into BookDetails
Values(1,'1900-1-1',500,49.5,'2014-01-01'),
		(2,'1800-1-1',600,52.5,'2019-01-01'),
        (3,'1900-1-2',700,57.5,'2020-01-01')
