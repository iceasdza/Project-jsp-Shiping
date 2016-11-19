<%-- 
    Document   : login
    Created on : Oct 14, 2016, 10:32:18 PM
    Author     : Warhead_TH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="icon" href="img/logo.png">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript">
            function check() {
                if (document.myForm.userName.value == "") {
                    alert("Plase enter you username!!");
                    return false;
                } else if (document.myForm.password.value == "") {
                    alert("Plase enter you Password!!");
                    return false;
                }
            }
        </script>
        
    </head>
    <body>
        
        <div class="form-horizontal">
            <div class="form-group">
                <h1 class="text-center" style="font-size: 50px">WELCOME</h1>
            </div>
            <div class="form-group">
                    <img src="img/logo.png" width="280px" height="280px" class="img-responsive center-block">
            </div>
            </div>
        <h2 class="text-center" style="color: red"><c:out value="${mess}" default=" "/></h2>
        </div>
        <form class="form-horizontal" name="myForm" action="Login2" method="post" onSubmit="return check()">
            <div class="form-group">
                <label class="control-label col-sm-4">E-mail::</label>
                <div class="control-label">
                    <input type="text" class="col-sm-4 center-block" name="userName"><br>
                </div>
            </div>    
            <div class="form-group">
                <label class="control-label col-sm-4">Password::</label>
                <div class="control-label">
                    <input type="password" class="col-sm-4 center-block" name="password" ><br>
                </div>
            </div>
            <div class="col-sm-4 control-label">
                <input type="submit" class="btn btn-info" value="LOGIN">
            </div> 
        </form>
        <br>
        
    </body>
</html>
