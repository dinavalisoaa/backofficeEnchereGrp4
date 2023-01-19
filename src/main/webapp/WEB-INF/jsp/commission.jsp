<!DOCTYPE html>
<html lang="en">
    <%@page import="model.*" %>
        <%@page import="java.util.ArrayList" %>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>Dashio - Bootstrap Admin Template</title>

        <!-- Favicons -->
        <link href="../img/favicon.png" rel="icon">
        <link href="../img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Bootstrap core CSS -->
        <link href="../lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!--external css-->
        <link href="../lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <!-- Custom styles for this template -->
        <link href="../css/style.css" rel="stylesheet">
        <link href="../css/style-responsive.css" rel="stylesheet">

    
    </head>                        <% ArrayList<Commission> cor=(ArrayList<Commission>)request.getAttribute("commission");%>

    <body>
        <section id="container">
            
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <!--logo start-->
                <a href="index.html" class="logo"><b>DASH<span>IO</span></b></a>
                <!--logo end-->
                <div class="nav notify-row" id="top_menu">
                    <!--  notification start -->

                    <!--  notification end -->
                </div>

            </header>
        
            <aside>
                <div id="sidebar" class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">


                        <li class="sub-menu">
                            <a href="javascript:;">
                                <i class="fa fa-desktop"></i>
                                <span>Tableau de bord</span>
                            </a>
                        </li>
                        <li class="mt">
                            <a class="active" href="statistiques">
                                <i class="fa fa-calculator"></i>
                                <span>Statistique</span>
                            </a>
                        </li>

                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>
            <!--sidebar end-->
            <!-- **********************************************************************************************************************************************************
                MAIN CONTENT
                *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <h3><i class="fa fa-angle-right"></i> Basic Table Examples</h3>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="content-panel">
                                <div class="showback">
                                    <a href="classementCategorie">   <button type="button" class="btn btn-info">Classement des Categories</button></a>
                                    <a href="allcategorie">   <button type="button" class="btn btn-primary">Categorie</button></a>
                                    <a href="alldemandes">   <button type="button" class="btn btn-danger">Demande de rechargement</button></a>
                                    <a href="allcommissions">   <button type="button" class="btn btn-warning">Commission</button></a>
                                    <a href="allstatistiques">   <button type="button" class="btn btn-success">Statistiques</button></a>

                                </div>
                            </div>
                            <!-- Modal -->
                            <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="newCat" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title">Mis a jour des commissions</h4>
                                        </div>
                                        <div class="modal-body">                  <form action="addCommission" method="get">

                                                <p>TAUX DE COMMISSION</p>
                                                <input type="text" name="taux"value="<%=new Commission().getCurrentId().getTaux()%>" placeholder="nom" class="form-control placeholder-no-fix">
                                                </div>
                                                <div class="modal-footer">
                                                    <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                                    <button class="btn btn-theme" type="submit">Submit</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>        <!-- Modal -->


                            </div>
                        </div>
                        <!-- /col-md-12 -->

                        <!-- /col-md-12 -->
                        <!-- row -->
                        <div class="row mt">
                            <div class="col-md-12">
                                <div class="content-panel">
                                    
                                        <table style="width:80%" border="1" class="table table-striped table-responsive-md">
                                            <thead>
                                                <tr>
                                                    <th>Nom</th>          
                                                    <th>Valeur</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <% for(int i=0;i<cor.size();i++){%>
                                                <% if(i==0){%>
                                                <tr style="background-color: antiquewhite">
                                                    <% } %>
                                            <td><%=cor.get(i).getTaux()%></td>
                                            <td><%=cor.get(i).getDaty()%></td>
                                            <td>  <a data-toggle="modal" href="#newCat"> 
                                        <button class="btn btn-primary"><i class="fa fa-plus">Add</i></button></a>
                                  </td>
                                            </tr>
                                            <%
                                            } 
                                            %>
                                            </tbody>
                                        </table>

                                </div>
                            </div>
                            <!-- /col-md-12 -->
                        </div>
                        <!-- /row -->
                </section>
            </section>
            <!-- /MAIN CONTENT -->
            <!--main content end-->
            <!--footer start-->
            <footer class="site-footer">
                <div class="text-center">
                    <p>
                        &copy; Copyrights <strong>Dashio</strong>. All Rights Reserved
                    </p>
                    <div class="credits">
                        <!--
                          You are NOT allowed to delete the credit link to TemplateMag with free version.
                          You can delete the credit link only if you bought the pro version.
                          Buy the pro version with working PHP/AJAX contact form: https://templatemag.com/dashio-bootstrap-admin-template/
                          Licensing information: https://templatemag.com/license/
                        -->
                        Created with Dashio template by <a href="https://templatemag.com/">TemplateMag</a>
                    </div>
                    <a href="basic_table.html#" class="go-top">
                        <i class="fa fa-angle-up"></i>
                    </a>
                </div>
            </footer>
            <!--footer end-->
        </section>
        <!-- js placed at the end of the document so the pages load faster -->
        <script src="../lib/jquery/jquery.min.js"></script>
        <script src="../lib/bootstrap/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="../lib/jquery.dcjqaccordion.2.7.js"></script>
        <script src="../lib/jquery.scrollTo.min.js"></script>
        <script src="../lib/jquery.nicescroll.js" type="text/javascript"></script>
        <!--common script for all pages-->
        <script src="../lib/common-scripts.js"></script>
        <!--script for this page-->

    </body>

</html>