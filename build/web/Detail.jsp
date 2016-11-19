<%-- 
    Document   : Detail
    Created on : Nov 5, 2016, 9:01:44 PM
    Author     : Warhead_TH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail ${cur.notravel}</title>
        <link rel="icon" href="img/logo.png">
    </head>
    <body>
        <%@include file="header/header.jsp"%>
        <c:if test="${cur != null}">
            <h1>Travel Detail:::</h1>
            <table class="table table-responsive">
                <tr><td>No.:<td><input class="col-sm-4 center-block" type="text" value="${cur.notravel}" readonly></td><td></td></td></tr>
                <tr><td>Country:<td><input class="col-sm-4 center-block" type="text" value="${cur.country_to}" readonly></td></td></tr>
                <tr><td>Ship:<td><input class="col-sm-4 center-block" type="text" value="${cur.ship}" readonly></td></td></tr>
                <tr><td>Captain:<td><input class="col-sm-4 center-block" type="text" value="${cur.captain}" readonly></td></td></tr>
                <tr><td>status:<td><input class="col-sm-4 center-block" type="text" value="${cur.status}" readonly></td></td></tr>
                <tr><td>Customer(From ${cur.country_from}):<td><input class="col-sm-4 center-block" type="text" value="${s.customer_in}" readonly></td></td></tr>
                <tr><td>Customer(To ${cur.country_to}):<td><input class="col-sm-4 center-block" type="text" value="${s.customer_out}" readonly></td></td></tr>
                <tr><td>Start Time:<td><input class="col-sm-4 center-block" type="text" value="${cur.starttime}" readonly></td></td></tr>
                <tr><td>Finish Time:<td><input class="col-sm-4 center-block" type="text" value="${cur.finishtime}" readonly></td></td></tr>
                <tr><td>Person in care:<td><input class="col-sm-4 center-block" type="text" value="${s.pic}" readonly></td></td></tr>
            </table>
        </c:if>
        <c:if test="${cur == null}">
            <h1 class="text-center" style="color: red;font-size: 100px" >Not Found Data!!</h1>
        </c:if>
        <a href="index.jsp" class="btn-block">Back</a>
    </body>
</html>
