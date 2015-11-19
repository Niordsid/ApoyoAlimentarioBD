<%-- 
    Document   : CrearConvocatoriaRTA
    Created on : 16/11/2015, 03:38:56 PM
    Author     : Carlos Suarez
--%>

<%@page import="datos.ConvocatoriaDAO"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="negocio.Convocatoria"%>
<%@page import="negocio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Usuario user = new Usuario();
    user.setPasswd((String) session.getAttribute("CONT"));
    user.setUser((String) session.getAttribute("USUARIO"));

    Convocatoria conv = new Convocatoria();
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
            <div class="brand"><li><a href="indexpage.html">Apoyo Alimentario</a></li></div>
            <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

            <div class="menu-list">

                <ul id="menu-content" class="menu-content collapse out">


                    <li  data-toggle="collapse" data-target="#Convocatoria" class="collapsed">
                        <a href="#"><span class="glyphicon glyphicon-calendar"></span> CONVOCATORIA</a>
                    </li>
                    <ul class="sub-menu collapse" id="Convocatoria">
                        <li><a href="crear_convocatoria.html">Crear Convocatoria</a></li>
                        <li><a href="actualizar_convocatoria.html">Actualizar Parametros Convocatoria</a></li>

                    </ul>


                    <li data-toggle="collapse" data-target="#Solicitud" class="collapsed">
                        <a href="#"><span class="glyphicon glyphicon-paste"></span> SOLICITUD</a>
                    </li>  
                    <ul class="sub-menu collapse" id="Solicitud">
                        <li><a href="registrar_solicitud.html">Registrar Solicitud</a></li>
                        <li><a href="consultar_estado.html">Consultar Estado Solicitud</a></li>
                        <li><a href="validar_registro.html">Validar Solicitud</a></li>
                    </ul>


                    <li data-toggle="collapse" data-target="#Subsidio" class="collapsed">
                        <a href="#"><span class="glyphicon glyphicon-hand-right"></span> SUBSIDIO</a>
                    </li>
                    <ul class="sub-menu collapse" id="Subsidio">
                        <li><a href="asignar_beneficio.html">Asignar Beneficio</a></li>
                        <!-- <li>New New 2</li> -->
                        <!-- <li>New New 2</li> -->
                    </ul>



                </ul>
            </div>
        </div>


        <!--CONTENIDO PAGINA -->

        <div class="container">

            <div class="row">
                <div class="col-lg-12">

                    <h1 class="page-header">Crear Convocatoria</h1>
                </div>


            </div>


            <div class="row">
                <div class="col-lg-12">
                    <form>
                        <div class="row">
                            <%StringTokenizer st = new StringTokenizer(request.getParameter("fechain"), "-", true);
                                String ano = "";
                                while (st.hasMoreTokens()) {
                                    ano = st.nextToken() + ano;
                                }
                                StringTokenizer st2 = new StringTokenizer(request.getParameter("fechafin"), "-", true);
                                String ano2 = "";
                                while (st2.hasMoreTokens()) {
                                    ano2 = st2.nextToken() + ano2;
                                }
                                conv.setId_convocatoria(request.getParameter("id_convocatoria"));
                                conv.setFecha_inicioconvocatoria(ano);
                                conv.setFecha_finconvocatoria(ano2);
                                conv.setV_cupos_A(Integer.parseInt(request.getParameter("tipoA")));
                                conv.setV_cupos_B(Integer.parseInt(request.getParameter("tipoB")));
                                conv.setV_cupos_C(Integer.parseInt(request.getParameter("tipoC")));

                                ConvocatoriaDAO convDao = new ConvocatoriaDAO();
                                String rta[] = convDao.crearConvocatoria(conv, user);

                            %>
                            <h3><%out.println(rta[0]+ " Convocatoria "+conv.getId_convocatoria());%></h3>
                      

                            <div align="left"><a class="btn btn-primary" href="IndexPage.jsp" role="button">Volver</a></div>

                        </div>



                    </form>

                </div>

            </div>



        </div>

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>

