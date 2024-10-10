<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil - Gestion de Présence</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h1 {
            color: #333;
        }
        .container {
            width: 60%;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .links {
            margin-top: 20px;
        }
        .links a {
            text-decoration: none;
            padding: 10px;
            margin: 10px;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
        }
        .links a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Bienvenue dans le système de gestion de présence</h1>
    <p>Cliquez sur les liens ci-dessous pour accéder aux différentes sections de l'application.</p>
    <div class="links">
        <a href="etudiant">Gestion des Étudiants</a>
        <a href="presence">Gestion de la Présence</a>
    </div>
</div>
</body>
</html>
