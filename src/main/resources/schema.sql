create table customers
(
    id int primary key auto_increment,
    name varchar(200) not null,
    surname varchar(250) not null,
    age int check ( age > 18 ),
    phone_number varchar(300) default '-'
);

create table orders
(
    id serial primary key not null,
    date timestamp default now(),
    customers_id int not null,
    product_name varchar(250) not null ,
    amount int check ( amount > 0 ),
    FOREIGN KEY (customers_id) references customers (id)
);


