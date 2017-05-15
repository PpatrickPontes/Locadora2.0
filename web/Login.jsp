<%-- 
    Document   : Login
    Created on : 15/05/2017, 09:45:19
    Author     : sala308b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <h1>Locadora Piratex</h1>
        <hr> 
        <h3>Faça o login para começar o sofrimento!!! kkkkk</h3>
        <!-- Method = post os dados não vao ser enviados via URL
            e sim dentro do corpo da requisicao -->
        <form action="Autenticar" method="post">
            Nome: <input type="text" name="txtNome"><br><br>
            Senha: <input type="password" name="txtSenha"><br><br>
            <input type="submit" value="Logar">            
        </form>
        </div>
    </body>
</html>
