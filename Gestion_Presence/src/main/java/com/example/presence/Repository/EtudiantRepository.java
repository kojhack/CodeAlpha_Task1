package com.example.presence.Repository;


import com.example.presence.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // Tu peux ajouter des méthodes de recherche personnalisées ici si nécessaire
}
