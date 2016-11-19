<%-- 
    Document   : header
    Created on : Nov 15, 2016, 8:47:00 PM
    Author     : Warhead_TH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="icon" href="../img/logo.png">

        <title>JSP Page</title>
    </head>
    <body>        
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <p class="navbar-brand">::SHIPPING COMPANY::</p>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="AddInfo.jsp">Add Information</a></li> 
                    <li><a href="addTravel.jsp">Add Travel</a></li> 
                    <li><a href="SearchPage.jsp">Search Information</a></li> 
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span>${user}</a></li>
                    <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span>Logout</a></li>
                </ul>
            </div>
        </nav>
    </body>
</html>
