<%-- 
    Document   : inserir
    Created on : 25/09/2017, 16:00:42
    Author     : cristopher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Primeiro trabalho de Engenharia de Software I - UNIOESTE">
    <meta name="author" content="Cristopher Vidal Machado">

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
                
                <li class="active"><a href="../medicos.jsp"><i class="glyphicon glyphicon-briefcase"></i> Médicos</a>
                </li>
               
             
                <li><a href="../hospitais.jsp"><i class="glyphicon glyphicon-plus-sign"></i> Hospitais</a>
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
                    
                    <p class="lead">Sistema de Gestão Hospitalar e Ambulatorial - Inserir médico.</p>
                    <form action = "/KedokteranWeb/MedicoServlet" method="post" role="form">
                        
                        
                    <div class="form-group">
                        <label for="nome">Nome</label>
                        <input name = nome type="text" class="form-control" id="nome" placeholder="Nome do Médico" required="">
                    </div>
                          <div class="form-group">
                        <label for="sobrenome">Sobrenome </label>
                        <input name = sobrenome type="text" class="form-control" id="sobrenome" placeholder="Sobrenome do Médico" required="">
                    </div>
                    <div class="form-group">
                        <div class="row">
                            <div class="col-lg-4">
                                <label for="cpf">CPF</label>
                                <input  name = cpf type="text" class="form-control" id="cpf" placeholder="999.999.999-99" required="" maxlength = "14"/>
                            </div>
                            <div class="col-lg-4">
                                <label for="crm">CRM</label>
                                <input name = crm type="text" class="form-control" id="crm" placeholder="0123456789/UF" required="" maxlength = "14"/>
                            </div>
                            <div class="col-lg-4">
                                <label for="hospital">Hospital</label>
                                <select class="form-control">
                                    <option>Costa Cavalcanti</option>
                                    <option>Santa Luzia</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <fieldset class="endereco">
                        <div class="form-group">
                            <div class="row">
                                <div class="col-lg-8">
                                    <label for="rua">Rua</label>
                                    <input name = rua type="text" class="form-control" placeholder="Jaqueira" id="rua" required=""/> 
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

