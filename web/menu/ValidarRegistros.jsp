<%-- 
    Document   : ValidarRegistros
    Created on : 17/11/2015, 06:49:47 PM
    Author     : AndreStereo
--%>

<%@page import="negocio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Usuario user = new Usuario();
    user.setPasswd((String) session.getAttribute("CONT"));
    user.setUser((String) session.getAttribute("USUARIO"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">


        <title>Programa deApoyo Alimentario</title>


        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <!-- Custom CSS -->
        <link href="css/menu.css" rel="stylesheet">
        <link href="css/font-awesome-4.4.0/css/font-awesome.css" rel="stylesheet">
        <link href="css/font-awesome-4.4.0/css/font-awesome.min.css" rel="stylesheet">
    </head>


    <body>

        <!-- BARRA DE MENU -->
        <div class="nav-side-menu">
            <div class="brand"><li><a href="IndexPage.jsp">Apoyo Alimentario</a></li></div>
            <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

            <div class="menu-list">

                <ul id="menu-content" class="menu-content collapse out">


                    <li  data-toggle="collapse" data-target="#Convocatoria" class="collapsed">
                        <a href="#"><span class="glyphicon glyphicon-calendar"></span> CONVOCATORIA</a>
                    </li>
                    <ul class="sub-menu collapse" id="Convocatoria">
                        <li><a href="CrearConvocatoria.jsp">Crear Convocatoria</a></li>
                        <li><a href="ActualizarConvocatoria.jsp">Actualizar Parametros Convocatoria</a></li>

                    </ul>


                    <li data-toggle="collapse" data-target="#Solicitud" class="collapsed">
                        <a href="#"><span class="glyphicon glyphicon-paste"></span> SOLICITUD</a>
                    </li>  
                    <ul class="sub-menu collapse" id="Solicitud">
                        <li><a href="RegistrarSolicitud.jsp">Registrar Solicitud</a></li>
                        <li><a href="ConsultarSolicitud.jsp">Consultar Estado Solicitud</a></li>
                        <li><a href="ValidarRegistros.jsp">Validar Solicitud</a></li>
                    </ul>


                    <li data-toggle="collapse" data-target="#Subsidio" class="collapsed">
                        <a href="#"><span class="glyphicon glyphicon-hand-right"></span> SUBSIDIO</a>
                    </li>
                    <ul class="sub-menu collapse" id="Subsidio">
                        <li><a href="AsignarBeneficio.jsp">Asignar Beneficio</a></li>
                        <!-- <li>New New 2</li> -->
                        <!-- <li>New New 2</li> -->
                    </ul>



                </ul>
            </div>
        </div>


        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

    </body>

</html>

