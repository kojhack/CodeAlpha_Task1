package com.example.presence.Repository;

import com.example.presence.model.Presence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresenceRepository extends JpaRepository<Presence, Long> {
    // Tu peux ajouter des méthodes de recherche personnalisées ici si nécessaire
}

