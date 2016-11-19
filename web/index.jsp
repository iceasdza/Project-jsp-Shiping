<%-- 
    Document   : index
    Created on : Oct 14, 2016, 11:00:45 PM
    Author     : Warhead_TH
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Login"%>
<%@page import="Model.CurrentTravel"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="icon" href="img/logo.png">
    </head>
    <body>
        <jsp:include page="header/header.jsp"/>
        <table class="table table-striped">
            <tr>
                <td>No.</td>
                <td>From</td>
                <td>To</td>
                <td>Start Time</td>
                <td>Finish Time</td>
                <td>Status</td>
            </tr>

            <c:forEach items="${cur}" var="cur" >
                <tr>   
                    <td>${cur.notravel}</td>
                    <td>${cur.country_from}</td>
                    <td>${cur.country_to}</td>
                    <td>${cur.starttime}</td>
                    <td>${cur.finishtime}</td>
                    <td>${cur.status}</td>
                    <td><a href="DetailServlet?id=${cur.notravel}">Detail..</a></td>
                </tr>
            </c:forEach>
            <h1>${mess}</h1>

        </table>
    </body>
</html>
