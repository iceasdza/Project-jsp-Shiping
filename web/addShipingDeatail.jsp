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
                         document.getElementById("s1").style.backgroundColor = "#C0C0C0";
                         document.getElementById("s2").style.backgroundColor = "#DCDCDC";
            }
          function myFunction2() {
                         document.getElementById("shipout").style.visibility = "visible";
                         document.getElementById("shipin").style.visibility = "hidden";
                         document.getElementById("s2").style.backgroundColor = "#C0C0C0";
                         
                         document.getElementById("s1").style.backgroundColor = "#DCDCDC";
            }
            
        </script>
        <style>
            form{
                 position: absolute;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0;
            }
             #s1{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }
            #s2{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header/header.jsp"/>
        <h1 style="text-align: center">Shipping detail</h1>
        <h1 style="color: green;text-align: center">${success}</h1>
        <h1 style="color: red;text-align: center">${msg}</h1>
<!--          <p style="text-align: center">
            <button id="shipin1" type="button" class="btn btn-default btn-lg" onmouseover="myFunction1()">Add shipping in</button>
            <button id="shipout2" type="button" class="btn btn-default btn-lg" onmouseover="myFunction2()">Add shipping out</button>-->
    <div style="text-align: center">
            <label id="s1" onmouseover="myFunction1()" ><h3>Add shipping in</h3></label>
            <label id="s2" onmouseover="myFunction2()"><h3>Add shipping out</h3></label>
        </div>
        <form action="shippingInServlet" onSubmit="return check()" id="shipin"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: #DCDCDC;margin-bottom: 50px;border-radius: 0px;border-width: 10px;visibility: visible" name="myForm"  method="post" >
         <h1>Shipping in</h1>  
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
                    
                    
                    
                    
                    
     <form action="shippingOutServlet" onSubmit="return check()" id="shipout"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: #DCDCDC;margin-bottom: 50px;border-radius: 0px;border-width: 10px;visibility: hidden" name="myForm"  method="post" >
         <h1>Shipping out</h1>
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
