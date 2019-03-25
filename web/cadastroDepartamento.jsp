<%-- 
    Document   : cadastroDepartamento
    Created on : 25/03/2019, 10:16:33
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Departamento</title>
    </head>
    <body>
        <h1>Cadastro Departamento</h1>
        <form action="DepartamentoControle?cmd=salvar" method="post">
            <label>Departamento</label>
            <input name="nome" type="text" required="true" /> <br/><br/>
            
            <label>Responsável</label>
            <input name="responsavel" type="text" required="true" /> <br/><br/>
            
            <label>Descrição</label>
            <textarea name="descricao" type="text" required="true" cols="50" rows="10"> </textarea> <br/><br/>
            
            <input type="submit" value="Salvar" />
        </form>
    </body>
</html>
