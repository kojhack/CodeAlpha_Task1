
\c GestionPresence;

CREATE TABLE etudiants (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100),
                          surname VARCHAR(200),
                          email VARCHAR(100),
                          departement VARCHAR(50),
                          date_inscription TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);