<%-- 
    Document   : vistafinal
    Created on : 27-feb-2023, 20:27:21
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Paises</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Continente</th>
                <th>Poblacion</th>
                <th>Año Independencia</th>
            </tr>
            <c:forEach items="${paises}" var="pais">
                <tr>
                    <td>${pais.name}</td>
                    <td>${pais.continent}</td>
                    <td>${pais.population}</td>
                    <td>${pais.indepyear}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
