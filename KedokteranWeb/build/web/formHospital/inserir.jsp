<%-- 
    Document   : inserir
    Created on : 25/09/2017, 16:04:11
    Author     : cristopher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Primeiro trabalho de Engenharia de Software I - UNIOESTE">
    

    <title>Hospital Manager</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="../css/simple-sidebar.css" rel="stylesheet">
    <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet">

    <!-- Add icon -->
    <link rel="shortcut icon" href="../images/Icon.png">

</head>

<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="../index.html">Hospital</a>
                </li>
                <li>
                    <a href="../index.html"><i class="glyphicon glyphicon-home"></i> Home</a>
                </li>
               
                <li><a href="../medicos.jsp"><i class="glyphicon glyphicon-briefcase"></i> Médicos</a>
                </li>
               
               
                <li class="active"><a href="../hospitais.jsp"><i class="glyphicon glyphicon-plus-sign"></i> Hospitais</a>
                </li>
            </ul>
        </div>

        <!-- Page content -->
        <div id="page-content-wrapper">
            <div class="content-header">
                <h1>
                    <a id="menu-toggle" href="#" class="btn btn-default"><i class="icon-reorder"></i></a>
                    Hospital Manager
                </h1>
            </div>
            <!-- Keep all page content within the page-content inset div! -->
            <div class="page-content inset">
                <div class="principal">
                    
                    <p class="lead">Sistema de Gestão Hospitalar e Ambulatorial - Inserir hospital.</p>
                    <form action ="/KedokteranWeb/HospitalServlet" method="post" role="form">
                    <div class="form-group">
                        <label for="nome">Razão social</label>
                        <input name = nome type="text" class="form-control" id="nome" placeholder="Nome da empresa" required="">
                    </div>
                    <div class="form-group">
                        <label for="cnpj">CNPJ</label>
                        <input name = cnpj type="text" class="form-control" id="cnpj" placeholder="99.999.999/9999-99" required=""/>
                    </div>


                    <fieldset class="endereco">
                        <div class="form-group">
                            <div class="row">
                                   <div class="col-lg-4">
                                <label for="tipoLogradouro">Tipo Logradouro</label>
                                <select class="form-control">
                                    <option>Avenida</option>
                                    <option>Rua</option>
                                </select>
                            </div>
                                <div class="col-lg-8">
                                    <label for="logradouro">Logradouro</label>
                                    <input  name = logradouro type="text" class="form-control" placeholder="Jaqueira" id="rua" required=""/> 
                                </div>
                                <div class="col-lg-4">
                                    <label for="numero">Número</label>
                                    <input name = numero type="number" class="form-control" min="0" max="10000" id="numero" required="" placeholder="0"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-4">
                                    <label for="complemento">Complemento</label>
                                    <input name = complemento type="text" class="form-control" placeholder="Casa" id="complemento" required=""/> 
                                </div>
                                <div class="col-lg-8">
                                    <label for="bairro">Bairro</label>
                                    <input name = bairro type="text" class="form-control" placeholder="Laranjeiras" id="bairro" required=""/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-4">
                                    <label for="cep">CEP</label>
                                    <input name = cep type="text" class="form-control" placeholder="85.851-000" id="cep" required=""/> 
                                </div>
                                <div class="col-lg-8">
                                    <label for="cidade">Cidade</label>
                                    <input name = cidade type="text" class="form-control" placeholder="Foz do Iguaçu" id="cidade" required=""/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-4">
                                    <label for="uf">UF</label>
                                    <input name = uf type="text" class="form-control" placeholder="PR" id="uf" required=""/> 
                                </div>
                                <div class="col-lg-8">
                                    <label for="pais">País</label>
                                    <input name = pais type="text" class="form-control" placeholder="Brasil" id="pais" required=""/>
                                </div>
                            </div>                                
                        </div>
                    </fieldset>

                    <button type="submit" class="btn btn-primary">Salvar</button>
                    </form>
                    
                </div>
            </div>
        </div>
    </div>

    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>

    <!-- Custom JavaScript for the Menu Toggle -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("active");
    });
    </script>
</body>

</html>
