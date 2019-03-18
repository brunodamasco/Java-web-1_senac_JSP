<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- 
    Document   : produto
    Created on : 18/03/2019, 09:29:42
    Author     : Dell
--%>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head> 
    <body>
        <h1>Primeiro Exemplo</h1>
        <form method="post" action="ProdutoControle?cmd=salvar">
            <label>Produto</label>
            <input name="produto" type="text" required="true" size="40" maxlength="10"/>
            <br/> <br/>
            
            <label>Preço Compra</label>
            <input name="precoCompra" type="number" required="true" />
            <br/> <br/>    
            
            <label>Preço Venda</label>
            <input name="precoVenda" type="number" required="true" />
            <br/> <br/>  
            
            <label>Quantidade</label>
            <input name="qtd" type="number" required="true" />
            <br/> <br/>
            
            <label>Descrição</label>
            <textarea name="descricao" rows ="10" cols="50"  type="text" required="true" placeholder="descrição do produto"></textarea>
            <br/> <br/>
            
            <input type="submit" value="Salvar" />   
            
            <br/> <br/>
           </form>
    </body>
</html>

