<%-- 
    Document   : DiligenciarFomato
    Created on : 17/11/2015, 06:51:00 PM
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

        <!-- CONTENIDO PAGINA -->
        <div class="container">

            <div class="row">
                <div class="col-lg-12">

                    <h1 class="page-header">Registrar Solicitud</h1>
                </div>


            </div>
            <!-- HTML Form (wrapped in a .bootstrap-iso div) -->
            <!-- HTML Form (wrapped in a .bootstrap-iso div) -->
            <div class="bootstrap-iso">
                <div class="container-fluid">
                    <div class="row">
                        <!-- <div class="col-md-6 col-sm-6 col-xs-12"> -->
                        <form method="post">

                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label class="control-label requiredField" for="select">
                                            &iquest;Cual es su estrato Socioeconomico de la vivienda en la cual reside?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="select" name="select">
                                            <option value="Estrato socioeconomico 1">
                                                Estrato socioeconomico 1
                                            </option>
                                            <option value="Estrato socioeconomico 2">
                                                Estrato socioeconomico 2
                                            </option>
                                            <option value="Estrato socioeconomico 3">
                                                Estrato socioeconomico 3
                                            </option>
                                            <option value="Estrato socioeconomico 4">
                                                Estrato socioeconomico 4
                                            </option>
                                            <option value="Otro Estrato">
                                                Otro Estrato
                                            </option>
                                        </select>
                                    </div>
                                </div>



                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-1" type="file" class="file">

                                </div>
                            </div>


                            <div class="row">                   
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label class="control-label requiredField" for="ingresos">
                                            &iquest;Cual es el valor Mensual de Ingresos familiares o propios?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="ingresos" name="ingresos">
                                            <option value="Ingreso de 0 a 1 SMMV">
                                                Ingreso de 0 a 1 SMMV
                                            </option>
                                            <option value="Ingreso de 1 a 2 SMMV">
                                                Ingreso de 1 a 2 SMMV
                                            </option>
                                            <option value="Ingreso de 2 a 3 SMMV">
                                                Ingreso de 2 a 3 SMMV
                                            </option>
                                            <option value="ngreso de 3 o mas SMMV">
                                                ngreso de 3 o mas SMMV
                                            </option>
                                            <option value="Otro ingreso">
                                                Otro ingreso
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-2" type="file" class="file">

                                </div>
                            </div>

                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="sostener">
                                            &iquest;Como estudiante sostiene el lugar donde vive?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="sostener" name="sostener">
                                            <option value="Sostengo el hogar en el que vivo">
                                                Sostengo el hogar en el que vivo
                                            </option>
                                            <option value="No Sostengo el hogar">
                                                No Sostengo el hogar
                                            </option>
                                        </select>
                                    </div>
                                </div>

                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-3" type="file" class="file">

                                </div>
                            </div>



                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="sostener2">
                                            &iquest;Como estudiante se sostiene econ&oacute;micamente a si mismo?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="sostener2" name="sostener2">
                                            <option value="Me sostengo economicamente">
                                                Me sostengo economicamente
                                            </option>
                                            <option value="No me sostengo economicamente">
                                                No me sostengo economicamente
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-4" type="file" class="file">

                                </div>
                            </div>

                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="nucleo">
                                            &iquest;Vive fuera de su n&uacute;cleo familiar de origen (pap&aacute;, mam&aacute;, hermanos)?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="nucleo" name="nucleo">
                                            <option value="Vivo con personas que no son nucleo familiar inmediato">
                                                Vivo con personas que no son nucleo familiar inmediato
                                            </option>
                                            <option value="Vivo con mi nucleo familiar inmediato">
                                                Vivo con mi nucleo familiar inmediato
                                            </option>
                                        </select>
                                    </div>
                                </div>

                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-5" type="file" class="file">

                                </div>
                            </div>


                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="responsabilidad">
                                            &iquest;Como estudiante tiene personas a cargo?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="responsabilidad" name="responsabilidad">
                                            <option value="Si, Tengo conyuge o hijos u otras personas a cargo">
                                                Si, Tengo conyuge o hijos u otras personas a cargo
                                            </option>
                                            <option value="No, No Tengo conyuge e hijos u otras personas a cargo">
                                                No, No Tengo conyuge e hijos u otras personas a cargo
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-6" type="file" class="file">

                                </div>
                            </div>

                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="proviene">
                                            &iquest;Proviene de Municipios o ciudades distintos a Bogot&aacute;?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="proviene" name="proviene">
                                            <option value="Si, provengo de municipios distintos a Bogota">
                                                Si, provengo de municipios distintos a Bogota
                                            </option>
                                            <option value="No provengo de algun municipio">
                                                No provengo de algun municipio
                                            </option>
                                        </select>
                                    </div>
                                </div>   
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-7" type="file" class="file">

                                </div>
                            </div>

                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="select7">
                                            &iquest;De estas condiciones cuales presenta su nucleo familiar?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="select7" name="select7">
                                            <option value="Condicion de desplazamiento forzado">
                                                Condicion de desplazamiento forzado
                                            </option>
                                            <option value="Mujer Cabeza de Hogar">
                                                Mujer Cabeza de Hogar
                                            </option>
                                            <option value="Desmovilizado">
                                                Desmovilizado
                                            </option>
                                            <option value="Ninguna">
                                                Ninguna
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-8" type="file" class="file">

                                </div>
                            </div>


                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="discapacidad">
                                            &iquest;Presenta alg&uacute;n tipo de discapacidad f&iacute;sica o mental?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="discapacidad" name="discapacidad">
                                            <option value="Si Presento discapacidad fisica o mental">
                                                Si Presento discapacidad fisica o mental
                                            </option>
                                            <option value="No presento ningun tipo de discapacidad">
                                                No presento ningun tipo de discapacidad
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-9" type="file" class="file">

                                </div>
                            </div>


                            <div class="row">  
                                <div class="col-lg-6">
                                    <div class="form-group ">
                                        <label class="control-label requiredField" for="nutricion">
                                            &iquest;Presenta alguna patolog&iacute;a asociado con la nutrici&oacute;n y la alimentaci&oacute;n?
                                            <span class="asteriskField">
                                                *
                                            </span>
                                        </label>
                                        <select class="select form-control" id="nutricion" name="nutricion">
                                            <option value="Sufro de problemas alimentacios">
                                                Sufro de problemas alimentacios
                                            </option>
                                            <option value="No tengo problemas alimenticios">
                                                No tengo problemas alimenticios
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <br>
                                    <input id="input-10" type="file" class="file">

                                </div>
                            </div>

                            <div class="form-group">
                                <div>
                                    <button class="btn btn-primary " name="submit" type="submit">
                                        Enviar
                                    </button>
                                </div>
                            </div>
                        </form>
                        <!-- </div>*-->
                    </div>
                </div>
            </div>


        </div>

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>

