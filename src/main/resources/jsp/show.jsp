<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Automobili</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Lista automobila</h2></caption>
        <tr>
            <th>ID</th>
            <th>Marka</th>
            <th>Model</th>
            <th>Godina proizvodnje</th>
            <th>Korisnik</th>
            <th>Kontakt</th>
        </tr>
        <c:forEach var="iznm" items="${iznajmljivanje}">
            <tr>
                <td>${iznm.id}</td>
                <td>${iznm.auto.marka}</td>
                <td>${iznm.auto.model}</td>
                <td>${iznm.auto.godProizvodnje}</td>
                <td>${iznm.korisnik.ime} ${iznm.korisnik.prezime} </td>
                <td>${iznm.korisnik.kontakt}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>