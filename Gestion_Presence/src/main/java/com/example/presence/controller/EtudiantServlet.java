package com.example.presence.controller;

import com.example.presence.model.Etudiant;
import com.example.presence.services.EtudiantService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/etudiants")
public class EtudiantServlet extends HttpServlet {
    private final EtudiantService etudiantService;

    public EtudiantServlet() {
        this.etudiantService = new EtudiantService(); // Assurez-vous de bien injecter le service
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Etudiant> etudiants = etudiantService.findAll();
        request.setAttribute("etudiants", etudiants);
        request.getRequestDispatcher("/WEB-INF/jsp/etudiants.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("name");
        String prenom = request.getParameter("prenom");
        String dateInscription = request.getParameter("dateInscription");

        Etudiant etudiant = new Etudiant(nom, prenom, dateInscription);
        etudiantService.save(etudiant);

        response.sendRedirect("etudiants"); // Redirige vers la liste des étudiants
    }

    // Ajoutez d'autres méthodes (doPut, doDelete) selon vos besoins
}
