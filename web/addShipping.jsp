<%-- 
    Document   : addShipping
    Created on : Nov 17, 2016, 12:50:01 AM
    Author     : patiz
--%>

<%@page import="Model.Staff"%>
<%@page import="Model.CustomersCompany"%>
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
        <script type="text/javascript">
            function check() {
                if (document.myForm.in.value == document.myForm.out.value) {
                    alert("Dont select same company");
                    return false;
                }
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
        </style>
        <title>ADD SHIPPING</title>
        
    </head>
    <body>
        
        <h1 style="text-align: center">Add shipping page!</h1>
        <h1 style="color: green;text-align: center">${success}</h1>
        <h1 style="color: red;text-align: center">${msg}</h1>
         <form onSubmit="return check()" id="captain"  class="form-horizontal" style="width: 750px;border: solid;padding: 20px;border-color: #DCDCDC;margin-bottom: 50px;border-radius: 0;border-width: 10px;visibility: visible" name="myForm" action="addShipping" method="post" >
         
            <div class="form-group">
                <label class="col-sm-2 control-label" >Customer-In</label>
                <div class="col-sm-10">
                    <select class="form-control" name="in" id="param2">
                     
                     <%
                         String in = (String)request.getAttribute("custin");
                         String str="" ;
                         ArrayList<CustomersCompany> cust = CustomersCompany.findByCountry(in);
                            for (CustomersCompany c : cust) 
                                                    {
                                                        
                                    %>
                                    <option><%=c.getNameCompany()%></option>
                                    <%
                                        str=c.getNameCompany();
                                }
                         %>
                    </select>
                </div>
            </div>
             
                    
                          <div class="form-group">
                <label class="col-sm-2 control-label" >Customer-Out</label>
                <div class="col-sm-10">
                    <select class="form-control" name="out" id="param1">
                  <%
                       String out2 = (String)request.getAttribute("custout");
                                cust = CustomersCompany.findByCountry(out2);
                            for (CustomersCompany c : cust) {
                               %>
                                <option><%=c.getNameCompany()%></option>
                                <%
                                    
                                }
                         %>
                    </select>
                </div>
                          </div>
                          <div class="form-group">
                <label class="col-sm-2 control-label" >Staff-ID </label>
                <div class="col-sm-10">
                 <select class="form-control" name="staff">
                     
                 <%
                         ArrayList<Staff> s = Staff.staffList();
                         for (Staff c : s) {
                                    %>
                                    <option><%=c.getFistname()+" "+c.getLastname()%></option>>
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
