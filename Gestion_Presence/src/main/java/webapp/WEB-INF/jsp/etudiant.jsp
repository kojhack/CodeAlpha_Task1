<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/10/2024
  Time: 06:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestion des Étudiants</title>
</head>
<body>
<h1>Liste des Étudiants</h1>
<table border="1">
    <tr>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Département</th>
        <th>Date d'inscription</th>
    </tr>
    <c:forEach var="etudiant" items="${etudiants}">
        <tr>
            <td>${etudiant.name}</td>
            <td>${etudiant.surname}</td>
            <td>${etudiant.departement}</td>
            <td>${etudiant.date_inscription}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

