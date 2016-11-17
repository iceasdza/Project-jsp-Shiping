<%-- 
    Document   : addShipingDeatail
    Created on : Nov 17, 2016, 7:41:45 PM
    Author     : patiz
--%>

<%@page import="Model.Shipping"%>
<%@page import="Model.product"%>
<%@page import="Model.travel"%>
<%@page import="Model.Shippingdetailin"%>
<%@page import="Model.Staff"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.CustomersCompany"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
     
        <script type="text/javascript">
        function myFunction1() {
                         document.getElementById("shipin").style.visibility = "visible";
                         document.getElementById("shipout").style.visibility = "hidden";
            }
          function myFunction2() {
                         document.getElementById("shipout").style.visibility = "visible";
                         document.getElementById("shipin").style.visibility = "hidden";
            }   
        </script>
    </head>
    <body>
        
        <h1>Shipping detail</h1>
        <h1 style="color: green;text-align: center">${success}</h1>
        <h1 style="color: red;text-align: center">${msg}</h1>
          <p style="text-align: center">
            <button id="shipin1" type="button" class="btn btn-default btn-lg" onclick="myFunction1()">Add shipping in</button>
            <button id="shipout2" type="button" class="btn btn-default btn-lg" onclick="myFunction2()">Add shipping out</button>
</p>
        <form action="shippingInServlet" onSubmit="return check()" id="shipin"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: visible" name="myForm"  method="post" >
         <h3>Shipping in</h3>  
            <div class="form-group">
                <label class="col-sm-2 control-label" >Travel no</label>
                <div class="col-sm-10">
                    <select class="form-control" name="in" id="param2">
                      <%
                         ArrayList<Shipping> x = Shipping.ListShipping();
                         for (Shipping c : x) {
                                    %>
                                    <option><%=c.getTravelNo()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
            </div>
             
                    
                          <div class="form-group">
                <label class="col-sm-2 control-label" >Product name</label>
                <div class="col-sm-10">
                    <select class="form-control" name="product" id="param1">
                    <%
                         ArrayList<product> p = product.productList();
                         for (product pro : p) {
                                    %>
                                    <option><%=pro.getName()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
                          </div>
             <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add Shipping</button>
    </div>
  </div>
        </form>
                    
                    
                    
                    
                    
     <form action="shippingOutServlet" onSubmit="return check()" id="shipout"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: hidden" name="myForm"  method="post" >
         <h3>Shipping out</h3>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Travel no</label>
                <div class="col-sm-10">
                    <select class="form-control" name="in" id="param2">
                       <%
                         ArrayList<Shipping> z = Shipping.ListShipping();
                         for (Shipping c : z) {
                                    %>
                                    <option><%=c.getTravelNo()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
            </div>
             
                    
                          <div class="form-group">
                <label class="col-sm-2 control-label" >Product name</label>
                <div class="col-sm-10">
                    <select class="form-control" name="out" id="param1">
                    <%
                         ArrayList<product> v = product.productList();
                         for (product pro : v) {
                                    %>
                                    <option><%=pro.getName()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
                          </div>
                        
                  
                    
           
             <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add Shipping</button>
    </div>
  </div>
        </form>               
                    
    </body>
</html>
