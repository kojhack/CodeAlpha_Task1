package com.example.presence.Repository;


import com.example.presence.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findAll();

    Optional<Etudiant> findById(Long id);

    void deleteById(Long id);
    // Tu peux ajouter des méthodes de recherche personnalisées ici si nécessaire
}
