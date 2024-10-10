<html>
<body>
<h2>Liste des étudiants</h2>
<form action="${pageContext.request.contextPath}/etudiant" method="post">
    Nom: <label>
    <input type="text" name="nom" />
</label><br />
    Prénom: <label>
    <input type="text" name="prenom" />
</label><br />
    Email: <label>
    <input type="text" name="email" />
</label><br />
    <input type="submit" value="Ajouter">
</form>
</body>
</html>
