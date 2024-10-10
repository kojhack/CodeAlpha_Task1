<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/10/2024
  Time: 06:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Gestion de la Présence</title>
</head>
<body>
<h1>Liste de Présence</h1>
<table border="1">
  <tr>
    <th>ID Étudiant</th>
    <th>Nom</th>
    <th>Date</th>
    <th>Présence</th>
  </tr>
  <c:forEach var="presence" items="${presences}">
    <tr>
      <td>${presence.etudiant.id}</td>
      <td>${presence.etudiant.nom}</td>
      <td>${presence.date}</td>
      <td>${presence.present ? 'Oui' : 'Non'}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>

