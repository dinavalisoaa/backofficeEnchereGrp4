<!DOCTYPE html>
<html lang="en">
    <%@page import="model.*" %>
    <%@page import="java.util.*" %>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>Dashio - Bootstrap Admin Template</title>

        <!-- Favicons -->
        <link href="img/favicon.png" rel="icon">
        <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Bootstrap core CSS -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!--external css-->
        <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-responsive.css" rel="stylesheet">

        <!-- =======================================================
          Template Name: Dashio
          Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
          Author: TemplateMag.com
          License: https://templatemag.com/license/
        ======================================================= -->
    </head>
    <%%>
    <% ArrayList<Users>cor=(ArrayList<Users>)request.getAttribute("classement");%>

    <body>
        <section id="container">
            <!-- **********************************************************************************************************************************************************
                TOP BAR CONTENT & NOTIFICATIONS
                *********************************************************************************************************************************************************** -->
            <!--header start-->
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <!--logo start-->
                <a href="index.html" class="logo"><b>DASH<span>IO</span></b></a>
                <!--logo end-->
                <div class="nav notify-row" id="top_menu">
                    <!--  notification start -->
                    <ul class="nav top-menu">
                        <!-- settings start -->
                        <li class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                                <i class="fa fa-tasks"></i>
                                <span class="badge bg-theme">4</span>
                            </a>
                            <ul class="dropdown-menu extended tasks-bar">
                                <div class="notify-arrow notify-arrow-green"></div>
                                <li>
                                    <p class="green">You have 4 pending tasks</p>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <div class="task-info">
                                            <div class="desc">Dashio Admin Panel</div>
                                            <div class="percent">40%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                                <span class="sr-only">40% Complete (success)</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <div class="task-info">
                                            <div class="desc">Database Update</div>
                                            <div class="percent">60%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                                <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <div class="task-info">
                                            <div class="desc">Product Development</div>
                                            <div class="percent">80%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                                <span class="sr-only">80% Complete</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <div class="task-info">
                                            <div class="desc">Payments Sent</div>
                                            <div class="percent">70%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                                                <span class="sr-only">70% Complete (Important)</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li class="external">
                                    <a href="#">See All Tasks</a>
                                </li>
                            </ul>
                        </li>
                        <!-- settings end -->
                        <!-- inbox dropdown start-->
                        <li id="header_inbox_bar" class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                                <i class="fa fa-envelope-o"></i>
                                <span class="badge bg-theme">5</span>
                            </a>
                            <ul class="dropdown-menu extended inbox">
                                <div class="notify-arrow notify-arrow-green"></div>
                                <li>
                                    <p class="green">You have 5 new messages</p>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="photo"><img alt="avatar" src="img/ui-zac.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Zac Snider</span>
                                            <span class="time">Just now</span>
                                        </span>
                                        <span class="message">
                                            Hi mate, how is everything?
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="photo"><img alt="avatar" src="img/ui-divya.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Divya Manian</span>
                                            <span class="time">40 mins.</span>
                                        </span>
                                        <span class="message">
                                            Hi, I need your help with this.
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="photo"><img alt="avatar" src="img/ui-danro.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Dan Rogers</span>
                                            <span class="time">2 hrs.</span>
                                        </span>
                                        <span class="message">
                                            Love your new Dashboard.
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="photo"><img alt="avatar" src="img/ui-sherman.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Dj Sherman</span>
                                            <span class="time">4 hrs.</span>
                                        </span>
                                        <span class="message">
                                            Please, answer asap.
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">See all messages</a>
                                </li>
                            </ul>
                        </li>
                        <!-- inbox dropdown end -->
                        <!-- notification dropdown start-->
                        <li id="header_notification_bar" class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                                <i class="fa fa-bell-o"></i>
                                <span class="badge bg-warning">7</span>
                            </a>
                            <ul class="dropdown-menu extended notification">
                                <div class="notify-arrow notify-arrow-yellow"></div>
                                <li>
                                    <p class="yellow">You have 7 new notifications</p>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                                        Server Overloaded.
                                        <span class="small italic">4 mins.</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="label label-warning"><i class="fa fa-bell"></i></span>
                                        Memory #2 Not Responding.
                                        <span class="small italic">30 mins.</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                                        Disk Space Reached 85%.
                                        <span class="small italic">2 hrs.</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">
                                        <span class="label label-success"><i class="fa fa-plus"></i></span>
                                        New User Registered.
                                        <span class="small italic">3 hrs.</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="index.html#">See all notifications</a>
                                </li>
                            </ul>
                        </li>
                        <!-- notification dropdown end -->
                    </ul>
                    <!--  notification end -->
                </div>
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="login.html">Logout</a></li>
                    </ul>
                </div>
            </header>
            <!--header end-->
            <!-- **********************************************************************************************************************************************************
                MAIN SIDEBAR MENU
                *********************************************************************************************************************************************************** -->
            <!--sidebar start-->
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
                    <h3><i class="fa fa-angle-right"></i> Chartjs Charts</h3>
                    <div class="content-panel">
                        <div class="showback">
                            <a href="classementCategorie">   <button type="button" class="btn btn-info">Classement des Categories</button></a>
                            <a href="categorie">   <button type="button" class="btn btn-primary">Categorie</button></a>
                            <a href="demandes">   <button type="button" class="btn btn-danger">Demande de rechargement</button></a>
                            <a href="commissions">   <button type="button" class="btn btn-warning">Commission</button></a>
                            <a href="statistiques">   <button type="button" class="btn btn-success">Statistiques</button></a>
                        </div>
                    </div>
                    <div class="main-panel">
                        <div class="content-wrapper">
          <div class="row">
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
              
                </div>
              </div>
            </div>
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Centre d'interet des Utilisatuer</h4>
                  <canvas id="barChart"></canvas>
                </div>
              </div>
            </div>
          </div>
          
          <div class="row">
          </div>
                    </div>

                </section>
            </section>
            <!--footer end-->
        </section>
        <script src="js/js/vendor.bundle.base.js"></script>
        <script src="js/js.chart.js/Chart.min.js"></script>
        <!-- End plugin js for this page -->
        <!-- inject:js -->
        <script src="js/off-canvas.js"></script>
        <script src="js/hoverable-collapse.js"></script>
        <script src="js/template.js"></script>
        <script src="js/settings.js"></script>
        <script src="js/todolist.js"></script>
        <!-- endinject -->
        <!-- Custom js for this page-->
        <!--<script src="js/chart.js"></script>-->
        <!-- End custom js for this page-->
        <script src="lib/chartjs-conf.js"></script>
    </body>
    <script>

        /* ChartJS
         * -------
         * Data and config for chartjs
         */
        'use strict';
        var data = {
        labels: [<% for(int i=0;i<cor.size();i++){ %>
        "<%=cor.get(i).getNom() %>",
        <% } %>],
                datasets: [{
                label: 'Interreser',
                        data: [
        <% for(int i=0;i<cor.size();i++){ %>
        <%=cor.get(i).getPersInteresser()%>,
        <%} %>
                        ],
                        data: [10, 19, 3, 5, 2, 3],
                        backgroundColor: [
        <% for(int i=0;i<cor.size();i++){ %>
                        'rgba(54, 162, 235, 0.2)',
        <%} %>
                        ],
                        borderColor: [
        <% for(int i=0;i<cor.size();i++){ %>
                        'rgba(54, 162, 235, 0.2)',
        <%} %>

                        ],
                        borderWidth: 1,
                        fill: false
                }]
        };
        var multiLineData = {
        labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
                datasets: [{
                label: 'Dataset 1',
                        data: [12, 19, 3, 5, 2, 3],
                        borderColor: [
                                '#587ce4'
                        ],
                        borderWidth: 2,
                        fill: false
                },
                {
                label: 'Dataset 2',
                        data: [5, 23, 7, 12, 42, 23],
                        borderColor: [
                                '#ede190'
                        ],
                        borderWidth: 2,
                        fill: false
                },
                {
                label: 'Dataset 3',
                        data: [15, 10, 21, 32, 12, 33],
                        borderColor: [
                                '#f44252'
                        ],
                        borderWidth: 2,
                        fill: false
                }
                ]
        };
        var options = {
        scales: {
        yAxes: [{
        ticks: {
        beginAtZero: true
        }
        }]
        },
                legend: {
                display: false
                },
                elements: {
                point: {
                radius: 0
                }
                }

        };
        var doughnutPieData = {
        datasets: [{
        data: [
        <% for(int i=0;i<cor.size();i++){ %>
        <%=cor.get(i).getPersInteresser()%>,
        <%} %>
        ],
                backgroundColor: [
                      
        <% for(int i=0;i<cor.size();i++){ %>
        <% if(i%2==0){ %>
                        'rgba(255, 99, 132, 0.5)',
        <%  %>
                        'rgba(75, 192, 192, 0.5)',
        <% } %>
        <%} %>
                        ],
                       
                }],
                // These labels appear in the legend and in the tooltips when hovering different arcs
                labels: [
                        <% for(int i=0;i<cor.size();i++){ %>
 "<%=cor.get(i).getNom()%>",
                      <% } %>
                ]
        };
        var doughnutPieOptions = {
        responsive: true,
                animation: {
                animateScale: true,
                        animateRotate: true
                }
        };
        var areaData = {
        labels: [<% for(int i=0;i<cor.size();i++){ %>
        "<%=cor.get(i).getNom() %>",
        <% } %>],
                datasets: [{
                label: '# of Votes',
                        data: [
        <% for(int i=0;i<cor.size();i++){ %>
        <%=cor.get(i).getPersInteresser()%>,
        <%} %>
                        ],
                        backgroundColor: [
                                'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(255, 159, 64, 0.2)'
                        ],
                        borderColor: [
                                'rgba(255,99,132,1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                        ],
                        borderWidth: 1,
                        fill: true, // 3: no fill
                }]
        };
        var areaOptions = {
        plugins: {
        filler: {
        propagate: true
        }
        }
        }

        var multiAreaData = {
        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
                datasets: [{
                label: 'Facebook',
                        data: [8, 11, 13, 15, 12, 13, 16, 15, 13, 19, 11, 14],
                        borderColor: ['rgba(255, 99, 132, 0.5)'],
                        backgroundColor: ['rgba(255, 99, 132, 0.5)'],
                        borderWidth: 1,
                        fill: true
                },
                {
                label: 'Twitter',
                        data: [7, 17, 12, 16, 14, 18, 16, 12, 15, 11, 13, 9],
                        borderColor: ['rgba(54, 162, 235, 0.5)'],
                        backgroundColor: ['rgba(54, 162, 235, 0.5)'],
                        borderWidth: 1,
                        fill: true
                },
                {
                label: 'Linkedin',
                        data: [6, 14, 16, 20, 12, 18, 15, 12, 17, 19, 15, 11],
                        borderColor: ['rgba(255, 206, 86, 0.5)'],
                        backgroundColor: ['rgba(255, 206, 86, 0.5)'],
                        borderWidth: 1,
                        fill: true
                }
                ]
        };
        var multiAreaOptions = {
        plugins: {
        filler: {
        propagate: true
        }
        },
                elements: {
                point: {
                radius: 0
                }
                },
                scales: {
                xAxes: [{
                gridLines: {
                display: false
                }
                }],
                        yAxes: [{
                        gridLines: {
                        display: false
                        }
                        }]
                }
        }

        var scatterChartData = {
        datasets: [{
        label: 'First Dataset',
                data: [{
                x: - 10,
                        y: 0
                },
                {
                x: 0,
                        y: 3
                },
                {
                x: - 25,
                        y: 5
                },
                {
                x: 40,
                        y: 5
                }
                ],
                backgroundColor: [
                        'rgba(255, 99, 132, 0.2)'
                ],
                borderColor: [
                        'rgba(255,99,132,1)'
                ],
                borderWidth: 1
        },
        {
        label: 'Second Dataset',
                data: [{
                x: 10,
                        y: 5
                },
                {
                x: 20,
                        y: - 30
                },
                {
                x: - 25,
                        y: 15
                },
                {
                x: - 10,
                        y: 5
                }
                ],
                backgroundColor: [
                        'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                        'rgba(54, 162, 235, 1)',
                ],
                borderWidth: 1
        }
        ]
        }

        var scatterChartOptions = {
        scales: {
        xAxes: [{
        type: 'linear',
                position: 'bottom'
        }]
        }
        }
        // Get context with jQuery - using jQuery's .get() method.
        if ($("#barChart").length) {
        var barChartCanvas = $("#barChart").get(0).getContext("2d");
        // This will get the first returned node in the jQuery collection.
        var barChart = new Chart(barChartCanvas, {
        type: 'bar',
                data: data,
                options: options
        });
        }

        if ($("#lineChart").length) {
        var lineChartCanvas = $("#lineChart").get(0).getContext("2d");
        var lineChart = new Chart(lineChartCanvas, {
        type: 'line',
                data: data,
                options: options
        });
        }

        if ($("#linechart-multi").length) {
        var multiLineCanvas = $("#linechart-multi").get(0).getContext("2d");
        var lineChart = new Chart(multiLineCanvas, {
        type: 'line',
                data: multiLineData,
                options: options
        });
        }

        if ($("#areachart-multi").length) {
        var multiAreaCanvas = $("#areachart-multi").get(0).getContext("2d");
        var multiAreaChart = new Chart(multiAreaCanvas, {
        type: 'line',
                data: multiAreaData,
                options: multiAreaOptions
        });
        }

        if ($("#doughnutChart").length) {
        var doughnutChartCanvas = $("#doughnutChart").get(0).getContext("2d");
        var doughnutChart = new Chart(doughnutChartCanvas, {
        type: 'doughnut',
                data: doughnutPieData,
                options: doughnutPieOptions
        });
        }

        if ($("#pieChart").length) {
        var pieChartCanvas = $("#pieChart").get(0).getContext("2d");
        var pieChart = new Chart(pieChartCanvas, {
        type: 'pie',
                data: doughnutPieData,
                options: doughnutPieOptions
        });
        }

        if ($("#areaChart").length) {
        var areaChartCanvas = $("#areaChart").get(0).getContext("2d");
        var areaChart = new Chart(areaChartCanvas, {
        type: 'line',
                data: areaData,
                options: areaOptions
        });
        }

        if ($("#scatterChart").length) {
        var scatterChartCanvas = $("#scatterChart").get(0).getContext("2d");
        var scatterChart = new Chart(scatterChartCanvas, {
        type: 'scatter',
                data: scatterChartData,
                options: scatterChartOptions
        });
        }

        if ($("#browserTrafficChart").length) {
        var doughnutChartCanvas = $("#browserTrafficChart").get(0).getContext("2d");
        var doughnutChart = new Chart(doughnutChartCanvas, {
        type: 'doughnut',
                data: browserTrafficData,
                options: doughnutPieOptions
        });
        }



    </script>
</html>
