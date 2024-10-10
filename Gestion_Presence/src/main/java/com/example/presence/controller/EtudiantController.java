package com.example.presence.controller;
import com.example.presence.model.Etudiant;
import com.example.presence.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public String listEtudiants(Model model) {
        List<Etudiant> etudiants = etudiantService.findAll();
        model.addAttribute("etudiants", etudiants);
        return "etudiant/list"; // nom de la vue
    }

    @GetMapping("/new")
    public String showNewEtudiantForm(Model model) {
        Etudiant etudiant = new Etudiant();
        model.addAttribute("etudiant", etudiant);
        return "etudiant/new"; // vue pour le formulaire
    }

    @PostMapping
    public String saveEtudiant(@ModelAttribute("etudiant") Etudiant etudiant) {
        etudiantService.save(etudiant);
        return "redirect:/etudiants"; // redirection vers la liste
    }

    @GetMapping("/{id}/edit")
    public String showEditEtudiantForm(@PathVariable("id") Long id, Model model) {
        Etudiant etudiant = etudiantService.findById(id);
        model.addAttribute("etudiant", etudiant);
        return "etudiant/edit"; // vue pour le formulaire d'édition
    }

    @PostMapping("/{id}")
    public String updateEtudiant(@PathVariable("id") Long id, @ModelAttribute("etudiant") Etudiant etudiant) {
        etudiant.setId(id);
        etudiantService.update(etudiant);
        return "redirect:/etudiants"; // redirection vers la liste
    }

    @GetMapping("/{id}/delete")
    public String deleteEtudiant(@PathVariable("id") Long id) {
        etudiantService.deleteById(id);
        return "redirect:/etudiants"; // redirection vers la liste
    }
}
