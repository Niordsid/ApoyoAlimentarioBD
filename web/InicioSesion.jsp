<%-- 
    Document   : Registrarsocio
    Created on : 1/04/2015, 08:39:34 PM
    Author     : Andres
--%>


<%@page import="util.RHException"%>
<%@page import="datos.UsuarioDAO"%>
<%@page import="util.ServiceLocator"%>
<%@page import="negocio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Usuario user = new Usuario();

    user.setUser((String) session.getAttribute("USUARIO"));
    // user.setUser("ADMIN");
    user.setPasswd((String) session.getAttribute("CONT"));
    //user.setPasswd("ADMIN");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <meta charset="UTF-8">

        <title>Inicio de Sesion</title>

        <link rel="stylesheet" href="assets/css/login.css"/>

    </head>

    <body>

        <div class="logo"></div>
        <div class="login-block">
            <form action="menu/IndexPage.jsp" method="post">
                <h1>Login</h1>
                <input type="text" name="user" placeholder="Usuario" required>
                <input type="password" name='passwd' placeholder="Password" required> 
                <input type="submit" name="submit" value="Continuar" >
            </form>
        </div>
    </body>
</html>
