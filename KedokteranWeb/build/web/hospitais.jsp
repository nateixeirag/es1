<%-- 
    Document   : hospitais
    Created on : 25/09/2017, 15:26:38
    Author     : cristopher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<html lang="pt-br">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <title> Kedokteran Hospital Manager</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">

        <!-- Add custom CSS here -->
        <link href="css/simple-sidebar.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">

        <!-- Add icon -->
        <link rel="shortcut icon" href="images/Icon.png">

    </head>

    <body>

        <div id="wrapper">

            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <li class="sidebar-brand">
                        <a href="index.html">Hospital</a>
                    </li>
                    <li>
                        <a href="index.html"><i class="glyphicon glyphicon-home"></i> Home</a>
                    </li>


                    <li><a href="medicos.jsp"><i class="glyphicon glyphicon-briefcase"></i> Médicos</a>
                    </li>

                    <li class="active"><a href="hospitais.jsp"><i class="glyphicon glyphicon-plus-sign"></i> Hospitais</a>
                    </li>
                </ul>
            </div>

            <!-- Page content -->
            <div id="page-content-wrapper">
                <div class="content-header">
                    <h1>
                        <a id="menu-toggle" href="#" class="btn btn-default"><i class="icon-reorder"></i></a>
                        Kedokteran Hospital Manager
                    </h1>
                </div>
                <!-- Keep all page content within the page-content inset div! -->
                <div class="page-content inset">
                    <div class="principal">

                        <p class="lead">Sistema de Gestão Hospitalar  - Configurações.</p>

                        <div id="conteudo">
                            <div class="table-responsive" id="tabela">
                                <table class="table table-condensed table-hover" id="_tabela">
                                    <thead>
                                        <tr>
                                            <th>Hospital</th> <th>CNPJ</th> <th>Responsável</th> <th>CEP</th> 
                                            <th>Rua</th> <th>Número</th> <th>Complemento</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr> <td>Santa Luzia</td></td> <td>30.471.798/0001-24</td> <td>Gabriela Custódio</td> <td>85.854-000</td> <td>Avenida Safira</td> <td>241</td> <td>Complemento</td> </tr>

                                        <tr> <td>Costa Cavalcanti</td></td> <td>80.471.798/0001-01</td> <td>Gabriel Custódio</td> <td>85.868-000</td> <td>Avenida Paraná</td> <td>1001</td> <td>Complemento</td> </tr>
                                    </tbody>
                                </table>
                            </div>
                            <fieldset>
                                <label><a href="formHospital/inserir.jsp" class="btn btn-primary" role="button">Inserir</a></label>
                                <label><a href="#" class="btn btn-warning" role="button">Alterar</a></label>
                                <label><a href="#" class="btn btn-danger" role="button">Remover</a></label>
                            </fieldset>
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <!-- JavaScript -->
        <script src="js/jquery-1.10.2.js"></script>
        <script src="js/bootstrap.js"></script>

        <!-- Custom JavaScript for the Menu Toggle -->
        <script>
            $("#menu-toggle").click(function (e) {
                e.preventDefault();
                $("#wrapper").toggleClass("active");
            });
        </script>
    </body>

</html>
