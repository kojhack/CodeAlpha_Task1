package com.example.presence.services;


import com.example.presence.Interface.IPresence;
import com.example.presence.model.Presence;
import com.example.presence.Repository.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PresenceService implements IPresence {

    @Autowired
    private PresenceRepository presenceRepository;

    @Override
    public List<Presence> findAll() {
        return presenceRepository.findAll();
    }

    @Override
    public Presence findById(Long id) {
        return presenceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Presence presence) {
        presenceRepository.save(presence);
    }

    @Override
    public void update(Presence presence) {
        presenceRepository.save(presence);
    }

    @Override
    public void deleteById(Long id) {
        presenceRepository.deleteById(id);
    }
}

