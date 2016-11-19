<%-- 
    Document   : newjsp
    Created on : Oct 29, 2016, 10:57:34 PM
    Author     : Warhead_TH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.IOException" %>
<%@page import="java.io.PrintWriter" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="javax.servlet.ServletException" %>
<%@page import="javax.servlet.http.HttpServlet" %>
<%@page import="javax.servlet.http.HttpServletRequest" %>
<%@page import="javax.servlet.http.HttpServletResponse" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


second table

<%  
Class.forName("com.mysql.jdbc.Driver");

System.out.println("driver loaded");
System.out.println("Driver is loaded");
Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:1527/PamoolPic?user=pamool&password=pamool");
System.out.println("Connection created");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from currenttravel");%>

<table align="center" border="1">

  
   <% while (rs.next()) {%>
  <tr>
   <td><%=rs.getInt("notravel")%></td>
    <td ><%=rs.getString("country") %></td>
    <td><%=rs.getString("ship") %></td>
    <td><%=rs.getString("caption") %></td>

  </tr>
 <%}%>
</table>
</form>
</body>
</html>
    </body>
</html>
