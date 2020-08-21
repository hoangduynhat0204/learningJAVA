<%-- 
    Document   : create-test
    Created on : Aug 10, 2020, 10:22:38 PM
    Author     : Hoang Duy Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

        <!-- Bootstrap Select Css -->
        <link href="../resources/plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />

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
            <div class="block-header align-center">
                <h2>CREATE TEST</h2>
            </div>
            <!-- Horizontal Layout -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="body">
                            <form:form action="saveTest" cssClass="form-horizontal"
                                       method="POST" modelAttribute="testModel">
                                <form:hidden path="test_id" value="${test_id}" />

                                <div class="row clearfix">
                                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                        <label for="test_name">Test name:</label>
                                    </div>
                                    <div class="col-lg-10 col-md-10 col-sm-8 col-xs-7">
                                        <div class="form-group">
                                            <div class="form-line">
                                                <form:input type="text" id="test_name" class="form-control" path="test_name" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                        <label for="description">Description:</label>
                                    </div>
                                    <div class="col-lg-10 col-md-10 col-sm-8 col-xs-7">
                                        <div class="form-group">
                                            <div class="form-line">
                                                <form:textarea rows="4"  id="description" class="form-control no-resize" path="description"></form:textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row clearfix">
                                        <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                            <label for="test_time">Test time (minutes):</label>
                                        </div>
                                        <div class="col-lg-2 col-md-2 col-sm-2 col-xs-1">
                                            <div class="form-group">
                                                <div class="form-line">
                                                <form:input type="number" id="test_time" class="form-control" min="0000" max="9999" path="test_time" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                        <label for="question_number">Question number:</label>
                                    </div>
                                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-1">
                                        <div class="form-group">
                                            <div class="form-line">
                                                <form:input type="number" id="question_number" class="form-control" min="0000" max="9999" path="question_number"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                        <label for="test_type_id">Type name:</label>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-2 col-xs-1">
                                        <div class="form-group">
                                            <div class="form-line">
                                                <form:select path="test_type_id">
                                                    <form:option value="">--Please select an item--</form:option>
                                                    <form:options items="${testType}" itemValue="test_type_id"
                                                                  itemLabel="test_type_id" />
                                                </form:select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                        <label for="password">Password:</label>
                                    </div>
                                    <div class="col-lg-3 col-md-3 col-sm-2 col-xs-1">
                                        <div class="form-group">
                                            <div class="form-line">
                                                <form:input type="password" id="password" class="form-control" path="password"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row clearfix">
                                    <div class="col-lg-offset-2 col-md-offset-2 col-sm-offset-4 col-xs-offset-5">
                                        <form:button type="submit" class="btn btn-success m-t-15 w-90 waves-effect">Save</form:button>
                                        <form:button type="button" class="btn btn-warning m-t-15 w-90 waves-effect">Cancel</form:button>
                                        </div>
                                    </div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Horizontal Layout -->
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
