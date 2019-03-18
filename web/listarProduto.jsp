<%-- 
    Document   : ListarProduto
    Created on : 18/03/2019, 10:20:16
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listando Produto</title>
    </head>
    <body>
        <h1>Listando Produtos</h1>
        <table border="1">
            <tr>
                <th>Produto</th>
                <th>Cadastro</th>
                <th>Preço Compra</th>
                <th>Preço Venda</th>
                <th>Qtd</th>
                <th>Descrição</th>
            </tr>
            <c:forEach items="${listaProdutos}" var="produto">
                <tr>
                    <td>${produto.nome}</td>
                    <td><f:formatDate pattern="dd/MM/yyyy" value="${produto.cadastro}"/></td>
                    <td>${produto.precoCompra}</td>
                    <td>${produto.precoVenda}</td>
                    <td>${produto.quantidade}</td>
                    <td>${produto.descricao}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
