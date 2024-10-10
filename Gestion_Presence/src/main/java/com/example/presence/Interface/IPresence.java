package com.example.presence.Interface;
import com.example.presence.model.Presence;
import java.util.List;

public interface IPresence {
    List<Presence> findAll();
    Presence findById(Long id);
    void save(Presence presence);
    void update(Presence presence);
    void deleteById(Long id);
}

