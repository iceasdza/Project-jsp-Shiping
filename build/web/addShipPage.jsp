<%-- 
    Document   : addShipPage
    Created on : Nov 11, 2016, 5:20:02 PM
    Author     : patiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADD THE SHIP</h1>
        <form method="post" name="myForm" action="addShipServlet"><br>
            SHIP NAME  <input type="text" name="shipName" placeholder="shipname" required="">
            Ship type <select name="type" required="">
                <option>small</option>
                <option>medium</option>
                <option>large</option>
                <option>SUPER LARGE</option>
            </select><br>
            DISPLACEMENT  <input type="text" name="displace" placeholder="displacement" required=""><br>
            expenses  <input type="number" name="expenses" placeholder="expenses" required=""><br>
            
            <input type="submit" value="OK SAD">
            <h1>${msg}</h1>
            <h1>${alert}</h1>
        </form>
    </body>
</html>
