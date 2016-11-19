<%-- 
    Document   : addTravel
    Created on : Nov 16, 2016, 11:42:19 PM
    Author     : patiz
--%>

<%@page import="Model.Country"%>
<%@page import="Model.Ships"%>
<%@page import="Model.Captains"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>::: ADD TRAVEL :::</title>
    </head>
    <body>
         <jsp:include page="header/header.jsp"/>
        <h1 style="text-align: center">::: ADD TRAVEL :::</h1>
        <form id="captain"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: visible" name="myForm" action="addTravel" method="post" >
            <div class="form-group">
                <label class="col-sm-2 control-label" >STATUS</label>
                <div class="col-sm-10">
                    <select class="form-control" name="status" >
                        <option>BACK</option>
                        <option>GOING</option>
                        <option>CANCELED</option>
                    </select>
                </div>
            </div>
           <div class="form-group">
                <label class="col-sm-2 control-label" >START TIME</label>
                <div class="col-sm-10">
                    <input class="form-control" type="datetime-local" name="stime" placeholder="" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >FINISH TIME</label>
                <div class="col-sm-10">
                    <input class="form-control" type="datetime-local" name="ftime" placeholder="" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" >Captain</label>
                <div class="col-sm-10">
                 <select class="form-control" name="cap">
                     
                     <%
                         ArrayList<Captains> cap = Captains.captainsList();
                            for (Captains c : cap) {
                                    %>
                                    <option><%=c.getFirstname()+" "+c.getLastname()%></option>
                                    <%
                                }
                         %>
                    </select>
                </div>
            </div>
                    
                    
                          <div class="form-group">
                <label class="col-sm-2 control-label" >Ship</label>
                <div class="col-sm-10">
                 <select class="form-control" name="ship">
                     
                     <%
                         ArrayList<Ships> s  = Ships.shipList();
                         for (Ships c : s) {
                                    %>
                                    <option><%=c.getShipsName()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
                          </div>
                          <div class="form-group">
                <label class="col-sm-2 control-label" >From</label>
                <div class="col-sm-10">
                 <select class="form-control" name="from">
                     
                 <%
                         ArrayList<Country> a = Country.countryList();
                         for (Country c : a) {
                                    %>
                                    <option><%=c.getIdCountry()%></option>>
                                    <%
                                }
                         %>
                    </select>
                </div>
                          </div>
                    
                          <div class="form-group">
                <label class="col-sm-2 control-label" >To</label>
                <div class="col-sm-10">
                 <select class="form-control" name="To">
                     
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
                    
                  
                    
           
             <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">add Travel</button>
    </div>
  </div>
        </form>
    </body>
</html>
