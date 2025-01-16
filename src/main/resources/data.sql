CREATE TABLE IF NOT EXISTS movie (
    id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    director VARCHAR(255),
    release_date DATE
);

INSERT INTO movie (id, title, director, release_date) VALUES (1, 'Inception', 'Christopher Nolan', '2010-07-16');
INSERT INTO movie (id, title, director, release_date) VALUES (2, 'Interstellar', 'Christopher Nolan', '2014-11-07');
