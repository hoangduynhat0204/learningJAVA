<%-- 
    Document   : list-question
    Created on : Aug 10, 2020, 10:23:59 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Online quiz</title>
        <!-- Favicon-->
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!-- Bootstrap Core Css -->
        <link href="../resources/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Waves Effect Css -->
        <link href="../resources/plugins/node-waves/waves.css" rel="stylesheet" />

        <!-- Animation Css -->
        <link href="../resources/plugins/animate-css/animate.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="../resources/css/style.css" rel="stylesheet">

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="../resources/css/themes/theme-green.css" rel="stylesheet" />

        <link href="../resources/css/custom.css" rel="stylesheet">    
    </head>

    <body class="theme-green">
        <!-- Page Loader -->
        <div class="page-loader-wrapper">
            <div class="loader">
                <div class="preloader">
                    <div class="spinner-layer pl-green">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>
                </div>
                <p>Please wait...</p>
            </div>
        </div>
        <!-- #END# Page Loader -->
        <!-- Overlay For Sidebars -->
        <div class="overlay"></div>
        <!-- #END# Overlay For Sidebars -->
        <!-- Search Bar -->
        <div class="search-bar">
            <div class="search-icon">
                <i class="material-icons">search</i>
            </div>
            <input type="text" placeholder="START TYPING...">
            <div class="close-search">
                <i class="material-icons">close</i>
            </div>
        </div>
        <!-- #END# Search Bar -->
        <!-- Top Bar -->
        <nav class="navbar">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
                    <a href="javascript:void(0);" class="bars"></a>
                    <a class="navbar-brand" href="../"></a>
                </div>
                <div class="collapse navbar-collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <!-- Call Search -->
                        <li><a href="javascript:void(0);" class="js-search" data-close="true"><i class="material-icons">search</i></a></li>
                        <!-- #END# Call Search -->
                    </ul>
                </div>
            </div>
        </nav>
        <!-- #Top Bar -->
        <section>
            <!-- Left Sidebar -->
            <aside id="leftsidebar" class="sidebar">
                <!-- Menu -->
                <div class="menu">
                    <ul class="list">
                        <li class="header">MENU</li>
                        <li>
                            <a href="../">
                                <span>Home</span>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <span>Question management</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../question/list">Question list</a>
                                </li>
                                <li>
                                    <a href="../question/showForm">Create question</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <span>Test management</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../test/list">Test list</a>
                                </li>
                                <li>
                                    <a href="../test/showForm">Create test</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!-- #Menu -->
                <!-- Footer -->
                <div class="legal">
                    <div class="copyright">
                        &copy; 2018 <a href="javascript:void(0);">abc123</a>.
                    </div>
                    <div class="version">
                        <b>Version: </b> 1.0.0
                    </div>
                </div>
                <!-- #Footer -->
            </aside>
            <!-- #END# Left Sidebar -->
        </section>

        <section class="content">
            <div class="container-fluid">
                <div class="block-header align-center">
                    <h2>QUESTION MANAGAMENT</h2>
                </div>
                <!-- Basic Table -->
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <a href="create-question.html" class="btn btn-success waves-effect">Create question</a>
                            </div>
                            <div class="body table-responsive">
                                <table class="table table-bordered table-striped">
                                    <thead class="btn-success">
                                        <tr>
                                            <th style="width: 25%">Question content</th>
                                            <th style="width: 15%">Correct Answer</th>
                                            <th style="width: 15%">Answer 1</th>
                                            <th style="width: 15%">Answer 2</th>
                                            <th style="width: 15%">Answer 3</th>
                                            <th style="width: 15%"></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="tempQuestion" items="${pagedListHolder.pageList}">

                                            <!-- construct an "update" link with customer id -->
                                            <c:url var="updateLink" value="../question/updateForm">
                                                <c:param name="questionId" value="${tempQuestion.question_id}" />
                                            </c:url>

                                            <!-- construct an "delete" link with customer id -->
                                            <c:url var="deleteLink" value="../question/delete">
                                                <c:param name="questionId" value="${tempQuestion.question_id}" />
                                            </c:url>

                                            <tr>
                                                <td>${tempQuestion.content}</td>
                                                <td>${tempQuestion.correct_answer}</td>
                                                <td>${tempQuestion.answer_1}</td>
                                                <td>${tempQuestion.answer_2}</td>
                                                <td>${tempQuestion.answer_3}</td>

                                                <td>
                                                    <a href="${deleteLink}" class="btn btn-danger btn-delete"><i class="material-icons"  
                                                       onclick="if (!(confirm('Are you sure you want to delete this customer?')))
                                                                return false">delete</i></a>
                                                    <a href="${updateLink}" class="btn btn-info"><i class="material-icons font-16">edit</i></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <center>
                                    <ul class="pagination">
                                        <li><a href="#">&laquo</a></li>
                                        <li class="active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">&raquo</a></li>
                                    </ul>
                                </center>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #END# Basic Table -->
            </div>
        </section>

        <!-- Jquery Core Js -->
        <script src="../resources/plugins/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core Js -->
        <script src="../resources/plugins/bootstrap/js/bootstrap.js"></script>

        <!-- Select Plugin Js -->
        <script src="../resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>

        <!-- Slimscroll Plugin Js -->
        <script src="../resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

        <!-- Waves Effect Plugin Js -->
        <script src="../resources/plugins/node-waves/waves.js"></script>

        <!-- Custom Js -->
        <script src="../resources/js/admin.js"></script>
    </body>
</html>
