package com.example.presence.Interface;

import com.example.presence.model.Etudiant;
import java.util.List;

public interface IEtudiant {
    List<Etudiant> findAll();
    Etudiant findById(Long id);
    void save(Etudiant etudiant);
    void update(Etudiant etudiant);
    void deleteById(Long id);
}

