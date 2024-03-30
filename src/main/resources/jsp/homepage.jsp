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
            <th>Marka</th>
            <th>Model</th>
            <th>Godina proizvodnje</th>
            <th>Action</th>
        </tr>
            <c:forEach var="auto" items="${automobili}">
                <tr>
                    <td>${auto.marka}</td>
                    <td>${auto.model}</td>
                    <td>${auto.godProizvodnje}</td>
                    <td><form id="iznajmiForm" action="add" method="post" onsubmit="return false;">
                        <input type="hidden" name="marka" value="${auto.marka}" />
                        <input type="hidden" name="model" value="${auto.model}" />
                        <input type="hidden" name="godProizvodnje" value="${auto.godProizvodnje}" />
                        <input type="button" value="Iznajmi" onclick="redirectToAddPage()" />
                    </form></td>
                </tr>
            </c:forEach>
    </table>
    <script>
        function redirectToAddPage() {
            var form = document.getElementById("iznajmiForm");
            var marka = form.querySelector("input[name='marka']").value;
            var model = form.querySelector("input[name='model']").value;
            var godProizvodnje = form.querySelector("input[name='godProizvodnje']").value;

            var url = "/add?marka=" + marka + "&model=" + model + "&godProizvodnje=" + godProizvodnje;
            window.location.href = url;
        }
    </script>

    <p onclick="window.location.href='/automobili/show'">Prikazi Iznajmljivanja</p>
</div>
</body>
</html>