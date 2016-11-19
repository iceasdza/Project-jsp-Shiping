<%-- 
    Document   : register
    Created on : Oct 16, 2016, 11:41:40 AM
    Author     : Patiz
--%>

<%@page import="Model.CustomersCompany"%>
<%@page import="Model.Ships"%>
<%@page import="Model.Country"%>
<%@page import="Model.Captains"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <style>
            form{
                position: absolute;
                margin-left: auto;
margin-right: auto;
left: 0;
right: 0;
                
            }
        </style>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
        <script type="text/javascript">
          function myFunction1() {
                         document.getElementById("ships").style.visibility = "visible";
                         document.getElementById("captain").style.visibility = "hidden";
                         document.getElementById("Customer").style.visibility = "hidden";
                              document.getElementById("Staff").style.visibility = "hidden";
                              
                         document.getElementById("Product").style.visibility = "hidden";
            }
          function myFunction2() {
                         document.getElementById("captain").style.visibility = "visible";
                         document.getElementById("ships").style.visibility = "hidden";
                         document.getElementById("Customer").style.visibility = "hidden";
                              document.getElementById("Staff").style.visibility = "hidden";
                              
                         document.getElementById("Product").style.visibility = "hidden";
            }
          function myFunction3() {
                         document.getElementById("Customer").style.visibility = "visible";
                         document.getElementById("ships").style.visibility = "hidden";
                         document.getElementById("captain").style.visibility = "hidden";
                         document.getElementById("Staff").style.visibility = "hidden";
                         
                         document.getElementById("Product").style.visibility = "hidden";
            }
          function myFunction4() {
                         document.getElementById("Staff").style.visibility = "visible";
                         document.getElementById("Customer").style.visibility = "hidden";
                         document.getElementById("ships").style.visibility = "hidden";
                         document.getElementById("captain").style.visibility = "hidden";  
                         document.getElementById("Product").style.visibility = "hidden";
            }
          function myFunction5() {
                         document.getElementById("Product").style.visibility = "visible";
                         document.getElementById("Customer").style.visibility = "hidden";
                         document.getElementById("ships").style.visibility = "hidden";
                         document.getElementById("captain").style.visibility = "hidden";
                          document.getElementById("Staff").style.visibility = "hidden";
            }
            function showpass(){
                    document.getElementById("pass").type = "text";
            }
            function hidepass(){
                    document.getElementById("pass").type = "password";
            }
        </script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
     
    </head>
    <body style="background-color: white">
        <jsp:include page="header/header.jsp"/>
        <h1 style="text-align: center">::: Add information Page :::</h1>
        <h1 style="color: green;text-align: center">${success}</h1>
        <h1 style="color: red;text-align: center">${msg}</h1>
        <h1 style="color: red;text-align: center">${repaeat}</h1>
      
        <p style="text-align: center">
            <button id="shipbutton" type="button" class="btn btn-default btn-lg" onmouseover="myFunction2() ">Add captain</button>
            <button id="capbutton" type="button" class="btn btn-default btn-lg" onmouseover="myFunction1()">Add ship</button>
            <button id="customerbutton" type="button" class="btn btn-default btn-lg" onmouseover="myFunction3()">Add customer</button>
            <button id="Productbutton" type="button" class="btn btn-default btn-lg" onmouseover="myFunction5()">Add Product</button>
</p>
        
    <center>
        <form id="captain"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: visible;" name="myForm" action="addCaptains" method="post" >
            <div class="form-group">
                <label class="col-sm-2 control-label" >First name</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="fname" placeholder="First Name" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Last name</label>
                <div class="col-sm-10">
                <input class="form-control" type="text" name="lname" placeholder="Last Name" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Level</label>
                <div class="col-sm-10">
                <input class="form-control" type="number" name="level" placeholder="level" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Email</label>
                <div class="col-sm-10">
                <input class="form-control" type="email" name="email" placeholder="Email" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Telephone</label>
                <div class="col-sm-10">
                <input class="form-control" type="text" name="tel" placeholder="Tel" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Address</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="addr" placeholder="Address" style="resize: none"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Expenses</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" name="expen" placeholder="expen" required="">
                </div>
            </div>
             <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add captains</button>
    </div>
  </div>
        </form>






<form  action="addShip" id="ships"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: hidden;" name="myForm" method="post" >
            <div class="form-group">
                <label class="col-sm-2 control-label" >Ship name</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="shipname" placeholder="Shipname" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Ship type</label>
                <div class="col-sm-10">
                    <select class="form-control" name="type">
                        <option value="SMALL">SMALL</option>
                        <option value="MEDIUM">MEDIUM</option>
                        <option value="LARGE">LARGE</option>
                        <option value="EXTRA LARGE">EXTRA LARGE</option>
                    </select>
                </div>
            </div>
            
            <div class="form-group">
                <label class="col-sm-2 control-label" >Displacement</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" name="displace" placeholder="Displacement" required="">
                </div>
            </div>
             <div class="form-group">
                <label class="col-sm-2 control-label" >Expenses</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" name="expen" placeholder="expen" required="">
                </div>
            </div>
            <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add ship</button>
    </div>
        </form>
        





<form id="Customer" action="addCustomer" id="ships"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: hidden;" name="myForm" method="post" >
            <div class="form-group">
                <label class="col-sm-2 control-label" >Company Name</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="companyName" placeholder="Company Name" required="">
                </div>
            </div>
       <div class="form-group">
                <label class="col-sm-2 control-label" >Level</label>
                <div class="col-sm-10">
                <input class="form-control" type="number" name="level" placeholder="level" required="">
                </div>
            </div>
     <div class="form-group">
                <label class="col-sm-2 control-label" >Address</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="addr" placeholder="Address" style="resize: none"></textarea>
                </div>
            </div>
     <div class="form-group">
                <label class="col-sm-2 control-label" >Country ID</label>
                <div class="col-sm-10">
                    <select class="form-control" name="countryId">
                        <%
                         ArrayList<Country> x = Country.countryList();
                         for (Country c : x) {
                                    %>
                                    <option><%=c.getIdCountry()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
            </div>
           
            <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add customer</button>
    </div>
        </form>




<form id="Staff" action="addStaff" id="Staff"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: hidden;" name="myForm" method="post" >
           <div class="form-group">
                <label class="col-sm-2 control-label" >First name</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="fname" placeholder="First Name" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Last name</label>
                <div class="col-sm-10">
                <input class="form-control" type="text" name="lname" placeholder="Last Name" required="">
                </div>
            </div>
     <div class="form-group">
                <label class="col-sm-2 control-label" >Email</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="email" placeholder="Email" required="">
                </div>
            </div>
    <div class="form-group">
                <label class="col-sm-2 control-label" >Address</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="addr" placeholder="Address" style="resize: none"></textarea>
                </div>
            </div>
     <div class="form-group">
                <label class="col-sm-2 control-label" >Password</label>
                <div class="col-sm-10">
                    <input id="pass" class="form-control" type="password" name="password" placeholder="Password" required="">
                    
                </div>
                
                <div class="col-sm-offset-2 col-sm-10"  >
                    <h6 onmouseover="showpass()" onmouseout="hidepass()">see password</h6>
        </div>
            </div>
           
            <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add customer</button>
    </div>
        </form>

                    
                    
                    
                    
                    

<form id="Product" action="addProduct" id="Staff"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: hidden;" name="myForm" method="post" >
           <div class="form-group">
                <label class="col-sm-2 control-label" >Product name</label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name="name" placeholder="Product" required="">
                </div>
            </div>
             <div class="form-group">
                <label class="col-sm-2 control-label" >Product type</label>
                <div class="col-sm-10">
                    <select class="form-control" name="type">
                        <option value="SMALL">FOOD</option>
                        <option value="MEDIUM">WEAPON</option>
                        <option value="LARGE">PET</option>
                        <option value="EXTRA LARGE">TOY</option>
                        <option value="EXTRA LARGE">ELECTORNICS</option>
                    </select>
                </div>
            </div>
    <div class="form-group">
                <label class="col-sm-2 control-label" >Descriprtion</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="des" placeholder="Descriprtion" style="resize: none"></textarea>
                </div>
            </div>   
    
    <div class="form-group">
                <label class="col-sm-2 control-label" >Company</label>
                <div class="col-sm-10">
                 <select class="form-control" name="cust">
                     
                     <%
                         ArrayList<CustomersCompany> s  = CustomersCompany.customerList();
                         for (CustomersCompany c : s) {
                                    %>
                                    <option><%=c.getNameCompany()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
                          </div>
           
            <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add Product</button>
    </div>
        </form>
                    </center>   
</body>
</html>