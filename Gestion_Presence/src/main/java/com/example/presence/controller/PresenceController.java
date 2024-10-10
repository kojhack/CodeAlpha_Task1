package com.example.presence.controller;

import com.example.presence.model.Presence;
import com.example.presence.services.PresenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/presences")
public class PresenceController {

    @Autowired
    private PresenceService presenceService;

    @GetMapping
    public String listPresences(Model model) {
        List<Presence> presences = presenceService.findAll();
        model.addAttribute("presences", presences);
        return "presence/list"; // nom de la vue
    }

    @GetMapping("/new")
    public String showNewPresenceForm(Model model) {
        Presence presence = new Presence();
        model.addAttribute("presence", presence);
        return "presence/new"; // vue pour le formulaire
    }

    @PostMapping
    public String savePresence(@ModelAttribute("presence") Presence presence) {
        presenceService.save(presence);
        return "redirect:/presences"; // redirection vers la liste
    }

    @GetMapping("/{id}/edit")
    public String showEditPresenceForm(@PathVariable("id") Long id, Model model) {
        Presence presence = presenceService.findById(id);
        model.addAttribute("presence", presence);
        return "presence/edit"; // vue pour le formulaire d'édition
    }

    @PostMapping("/{id}")
    public String updatePresence(@PathVariable("id") Long id, @ModelAttribute("presence") Presence presence) {
        presence.setId(id);
        presenceService.update(presence);
        return "redirect:/presences"; // redirection vers la liste
    }

    @GetMapping("/{id}/delete")
    public String deletePresence(@PathVariable("id") Long id) {
        presenceService.deleteById(id);
        return "redirect:/presences"; // redirection vers la liste
    }
}
