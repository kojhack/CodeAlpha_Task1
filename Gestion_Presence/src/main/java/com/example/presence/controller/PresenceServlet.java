package com.example.presence.controller;
import com.example.presence.services.PresenceService;
import com.example.presence.model.Presence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/presence")
public class PresenceServlet extends HttpServlet {

    private final PresenceService presenceService;

    public PresenceServlet() {
        this.presenceService = new PresenceService(); // Ou utilisez l'injection de dépendance
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Logique pour récupérer toutes les présences
        List<Presence> presences = presenceService.findAll();
        request.setAttribute("presences", presences);

        // Redirection vers la JSP
        request.getRequestDispatcher("/WEB-INF/jsp/presence.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Logique pour traiter l'enregistrement d'une présence
        String etudiantId = request.getParameter("etudiant_id");
        LocalDate date = LocalDate.parse(request.getParameter("date_presence"));

        Presence presence = new Presence();
        presence.setEtudiantId(Long.parseLong(etudiantId));
        presence.setDatePresence(date);

        presenceService.save(presence);

        // Redirection après l'enregistrement
        response.sendRedirect(request.getContextPath() + "/presence");
    }
}
