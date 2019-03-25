<%-- 
    Document   : listaDepartamento
    Created on : 25/03/2019, 10:26:07
    Author     : Dell
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Departamento</title>
    </head>
    <body>
        <h1>Lista de Departamento</h1>
        <c:if test="${msg != null}">
            <script>
                alert('${msg}');
            </script>
        </c:if>
        <table border="1">
            <tr>
                <th>Nome</th>
                <th>Responsável</th>
                <th>Cadastro</th>
                <th>Descrição</th>
            </tr>
            <c:forEach var="dep" items="${departamentos}">
                <tr>
                    <td>${dep.nome}</td>
                    <td>${dep.responsavel}</td>
                    <td><f:formatDate value="${dep.cadastro}" pattern="dd-MM-yyyy"/></td>
                    <td>${dep.descricao}</td>
                </tr>
            </c:forEach>
            
            
        </table>
    </body>
</html>
