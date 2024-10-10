CREATE TABLE presence (
                          id SERIAL PRIMARY KEY,
                          etudiant_id INT NOT NULL,
                          date_presence TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          statut VARCHAR(20) CHECK (statut IN ('present', 'absent', 'retard')),
                          commentaires TEXT,

                          CONSTRAINT fk_etudiant
                              FOREIGN KEY (etudiant_id)
                                  REFERENCES etudiant(id)
                                  ON DELETE CASCADE
);
