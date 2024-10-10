package com.example.presence.Repository;

import com.example.presence.model.Presence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PresenceRepository extends JpaRepository<Presence, Long> {
    void deleteById(Long id);
    Optional<Presence> findById(Long id);

    List<Presence> findAll();
    // Tu peux ajouter des méthodes de recherche personnalisées ici si nécessaire
}

