package com.example.presence.services;
import com.example.presence.Interface.IEtudiant;
import com.example.presence.model.Etudiant;
import com.example.presence.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EtudiantService implements IEtudiant {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(Long id) {
        return (Etudiant) etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @Override
    public void update(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteById(Long id) {
        etudiantRepository.deleteById(id);
    }
}

