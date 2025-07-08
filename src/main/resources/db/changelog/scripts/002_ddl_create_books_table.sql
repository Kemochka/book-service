create table books(
    id serial primary key,
    title varchar(255) not null,
    author_id int references authors(id),
    year int not null,
    genre varchar(255)
);