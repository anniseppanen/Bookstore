DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS app_user;

CREATE TABLE category (
    category_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

INSERT INTO category (name)
VALUES ('Horror'),
       ('Thriller'),
       ('Romance');

CREATE TABLE book (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    author VARCHAR(50) NOT NULL,
    publication_year INTEGER,
    isbn VARCHAR(50) NOT NULL,
    price FLOAT,
    category_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);

INSERT INTO book (title, author, publication_year, isbn, price, category_id) 
VALUES ('Title', 'Author', 2000, '1234', 20, 1);

CREATE TABLE app_user ( 
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    password_hash VARCHAR(250) NOT NULL,
    email VARCHAR(100) NOT NULL,
    role VARCHAR(100) NOT NULL
);

INSERT INTO app_user (username, password_hash, email, role) 
VALUES ('user', '$2a$12$usVKZCf8sy181z.oxwno6ubp6Vnp6ketU4C9u1y6mQFXBTmkp8szG', 'user@example.com', 'USER'), 
       ('admin', '$2a$12$moydUO8UiNAilmXQVDXZbOBB3pwGNcx4IizV1EHMMKnxj2SAAViey', 'admin@example.com', 'ADMIN');

SELECT * FROM category;
SELECT * FROM book;
SELECT * FROM app_user;
