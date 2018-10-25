<%-- 
    Document   : listar
    Created on : 25/10/2018, 07:22:18
    Author     : Ricardo Job
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
        <h1>Listagem de Pessoas</h1>

        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Cpf</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="pessoa" items="${lista}">
                    <tr>
                        <td>${pessoa.nome}</td>
                        <td>${pessoa.cpf}</td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </body>
</html>
