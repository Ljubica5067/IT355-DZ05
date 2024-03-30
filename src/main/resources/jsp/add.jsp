<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unos Korisnika</title>
</head>
<body>
<div align="center">
    <h2>Unos podataka za iznajmljivanje</h2>
    <p>Automobil: ${param.marka} ${param.model} (${param.godProizvodnje})</p>
    <form action="add" method="post">
        Ime: <input type="text" name="ime" required><br>
        Prezime: <input type="text" name="prezime" required><br>
        Kontakt: <input type="text" name="kontakt" required><br>
        <input type="submit" value="Potvrdi iznajmljivanje" />
    </form>
</div>
</body>
</html>