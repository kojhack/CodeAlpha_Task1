
\c attendance_management;

CREATE TABLE etudiants (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100),
                          email VARCHAR(100),
                          department VARCHAR(50)
);

CREATE TABLE presence (
                            id SERIAL PRIMARY KEY,
                            student_id INT REFERENCES students(id),
                            date DATE,
                            status VARCHAR(10)
);
