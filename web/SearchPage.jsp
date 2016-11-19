<%-- 
    Document   : SearchPage
    Created on : Nov 14, 2016, 11:01:52 AM
    Author     : patiz
--%>

<%@page import="Model.Staff"%>
<%@page import="Model.product"%>
<%@page import="Model.CustomersCompany"%>
<%@page import="Model.Ships"%>
<%@page import="Model.Captains"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SEARCH PAGE ::</title>
        <style>
            #s1{
                width: 16%;
                height: 50px;
                background-color: #777;
                text-align: center;
            }
            #s2{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }
            #s3{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }
            #s4{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }
            #s5{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }
            #s6{
                width: 16%;
                height: 50px;
                background-color: #DCDCDC;
                text-align: center;
            }


            /*                padding-left: 26%;
                            padding-left: 42%;
                            padding-left: 5%
                            padding-left: 75%;*/
        </style>
        <style>
            #cap{
                padding-left: 9%;
                position: absolute;
                visibility: hidden;
            }
            #ship{
                padding-left: 26%;
                position: absolute;
                visibility: hidden;
            }
            #company2{
                position: absolute;
                padding-left: 42%;
                visibility: hidden;
            }
            #product{
                padding-left: 58%;  
                position: absolute;
                top: auto;
                visibility: hidden;
            }
             #staff{
                padding-left: 75%;  
                position: absolute;
                top: auto;
                visibility: hidden;
            }
        </style>
        <script>
            function myFunction1() {
                document.getElementById("cap").style.visibility = "visible";
                document.getElementById("ship").style.visibility = "hidden";
                document.getElementById("company2").style.visibility = "hidden";
                document.getElementById("product").style.visibility = "hidden";
                
                     document.getElementById("staff").style.visibility = "hidden";
                document.getElementById("s6").style.backgroundColor = "#DCDCDC";
                document.getElementById("s2").style.backgroundColor = "#C0C0C0";
                document.getElementById("s3").style.backgroundColor = "#DCDCDC";
                document.getElementById("s4").style.backgroundColor = "#DCDCDC";
                document.getElementById("s5").style.backgroundColor = "#DCDCDC";
            }
            function myFunction2() {
                document.getElementById("cap").style.visibility = "hidden";
                document.getElementById("ship").style.visibility = "visible";
                document.getElementById("company2").style.visibility = "hidden";
                document.getElementById("product").style.visibility = "hidden";
                
                     document.getElementById("staff").style.visibility = "hidden";
                document.getElementById("s6").style.backgroundColor = "#DCDCDC";
                document.getElementById("s3").style.backgroundColor = "#C0C0C0";
                document.getElementById("s2").style.backgroundColor = "#DCDCDC";
                document.getElementById("s4").style.backgroundColor = "#DCDCDC";
                document.getElementById("s5").style.backgroundColor = "#DCDCDC";
            }
            function myFunction3() {
                document.getElementById("cap").style.visibility = "hidden";
                document.getElementById("ship").style.visibility = "hidden";
                document.getElementById("company2").style.visibility = "visible";
                document.getElementById("product").style.visibility = "hidden";
                  
                     document.getElementById("staff").style.visibility = "hidden";
                document.getElementById("s4").style.backgroundColor = "#C0C0C0";
                document.getElementById("s2").style.backgroundColor = "#DCDCDC";
                document.getElementById("s2").style.backgroundColor = "#DCDCDC";
                document.getElementById("s5").style.backgroundColor = "#DCDCDC";
                
                document.getElementById("s6").style.backgroundColor = "#DCDCDC";
            }
            function myFunction4() {
                document.getElementById("cap").style.visibility = "hidden";
                document.getElementById("ship").style.visibility = "hidden";
                document.getElementById("company2").style.visibility = "hidden";
                document.getElementById("product").style.visibility = "visible";
                     document.getElementById("staff").style.visibility = "hidden";
                document.getElementById("s5").style.backgroundColor = "#C0C0C0";
                document.getElementById("s3").style.backgroundColor = "#DCDCDC";
                document.getElementById("s4").style.backgroundColor = "#DCDCDC";
                document.getElementById("s2").style.backgroundColor = "#DCDCDC";
                document.getElementById("s6").style.backgroundColor = "#DCDCDC";
                
            }    function myFunction5() {
                document.getElementById("cap").style.visibility = "hidden";
                document.getElementById("ship").style.visibility = "hidden";
                document.getElementById("company2").style.visibility = "hidden";
                document.getElementById("product").style.visibility = "hidden";
                document.getElementById("staff").style.visibility = "visible";
                
                document.getElementById("s5").style.backgroundColor = "#DCDCDC";
                document.getElementById("s3").style.backgroundColor = "#DCDCDC";
                document.getElementById("s4").style.backgroundColor = "#DCDCDC";
                document.getElementById("s2").style.backgroundColor = "#DCDCDC";
                document.getElementById("s6").style.backgroundColor = "#C0C0C0";
            }
        </script>
        <style>
            #captable{
                visibility:hidden ${visible};
                position: absolute;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0;
            }
            #shipsTable{
                visibility:hidden ${visible2};
                position: absolute;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0;
            }
            #companyTable{
                visibility:hidden ${visible3};
               position: absolute;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0;
            }
            #productTable{
                visibility:hidden ${visible4};
               position: absolute;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0; 
            }#staffTable{
                   visibility:hidden ${visible6};
               position: absolute;
                margin-left: auto;
                margin-right: auto;
                left: 0;
                right: 0; 
            }
                
        </style>
    </head>
    <body>
        <jsp:include page="header/header.jsp"/>
        <div style="text-align: center">
            <label id="s2" onmouseover="myFunction1()"><h3>Search Captain</h3></label>
            <label id="s3" onmouseover="myFunction2()"><h3>Search Ship</h3></label>
            <label id="s4" onmouseover="myFunction3()"><h3>Search Company</h3></label>
            <label id="s5" onmouseover="myFunction4()"><h3>Search Product</h3></label>
            <label id="s6" onmouseover="myFunction5()"><h3>Search Staff</h3></label>
        </div>

        <form class="form-inline" id="cap" action="searchCaptain" method="post">
            <input class="form-control" type="text" name="name" placeholder="Search Captain" > <input type="submit" class="btn btn-default">
        </form>

        <form class="form-inline" id="ship" action="SearchShip" method="post">
            <input class="form-control" type="text" name="name" placeholder="Search Ship" > <input type="submit" class="btn btn-default">
        </form>

        <form class="form-inline" id="company2" action="SearchCompany" method="post">
            <input class="form-control" type="text" name="name" placeholder="Search Company" > <input type="submit" class="btn btn-default " onclick="cap()">
        </form>

        <form class="form-inline" id="product" action="searchProduct">
            <input class="form-control" type="text" name="name" placeholder="Search Product" > <input type="submit" class="btn btn-default">
        </form>
        <form class="form-inline" id="staff" action="searchStaff">
            <input class="form-control" type="text" name="name" placeholder="Search Staff" > <input type="submit" class="btn btn-default">
        </form>
    <center>

        <table id="captable" class="table table-hover" style="width: 70%;margin-top: 50px;">
            <%
                String name = (String) request.getAttribute("result");
                ArrayList<Captains> c = Captains.findByName(name);
            %>
            <tr>
                <td><b>CAPTAIN ID</b></td>
                <td><b>FIRST NAME</b></td>
                <td><b>LAST NAME</b></td>
                <td><b>LEVEL</b></td>
                <td><b>EMAIL</b></td>
                <td><b>TEL</b></td>
                <td><b>ADDRESS</b></td>
                <td><b>EXPENSES</b></td>
            </tr>
            <%
                for (Captains cap : c) {
            %>
            <tr>
                <td>
                    <%=cap.getId()%>
                </td>
                <td>
                    <%=cap.getFirstname()%>
                </td>
                <td>
                    <%=cap.getLastname()%>
                </td>
                <td>
                    <%=cap.getLevel()%>
                </td>
                <td><%=cap.getEmail()%>
                </td>
                <td> <%=cap.getTel()%>

                </td><td><%=cap.getAddress()%>
                </td><td>  <%=cap.getExpen()%>

                </td>
            </tr>
            <%
                }
            %>
        </table>

        <table id="shipsTable" class="table table-hover" style="width: 70%;margin-top: 50px;">
            <%
                String name2 = (String) request.getAttribute("result");
                ArrayList<Ships> s = Ships.findByName(name2);
            %> <tr>
                <td><b>SHIP ID</b></td>
                <td><b>SHIP NAME</b></td>
                <td><b>SHIP TYPE</b></td>
                <td><b>DISPLACEMENT</b></td>
                <td><b>EXPENSES</b></td>
            </tr>
            <%
                for (Ships ss : s) {
            %>
            <tr>
                <td>
                    <%=ss.getShipsId()%>
                </td>
                <td>
                    <%=ss.getShipsName()%>
                </td>
                <td>
                    <%=ss.getShipsType()%>
                </td>
                <td>
                    <%=ss.getDisplacement()%>
                </td>
                <td>
                    <%=ss.getExpen()%>
                </td>

            </tr>
            <%
                }
            %>
        </table >
        <table id="companyTable" class="table table-hover" style="width: 70%;margin-top: 50px;">
            <%
                  String name3 = (String) request.getAttribute("result");
                ArrayList<CustomersCompany> cust =CustomersCompany.findByName(name3);
                %>
                <tr>
                <td><b>COMPANY ID</b></td>
                <td><b>COMPANY NAME</b></td>
                <td><b>LV. COMPANY</b></td>
                <td><b>ADDRESS</b></td>
                <td><b>COUNTRY</b></td>
            </tr>
            <%
                for (CustomersCompany cs : cust) {
                    %>
                    <tr>
                <td>
                    <%=cs.getIdCompany()%>
                </td>
                <td>
                    <%=cs.getNameCompany()%>
                </td>
                <td>
                    <%=cs.getLvCompany()%>
                </td>
                <td>
                    <%=cs.getAddrCompany()%>
                </td>
                <td>
                    <%=cs.getCountry()%>
                </td>

            </tr>
                    <%
                        
                    }
                %>
        </table>
        <table id="productTable" class="table table-hover" style="width: 70%;margin-top: 50px;">
              <%
                  String name4 = (String) request.getAttribute("result");
                ArrayList<product> p =product.ListName(name4);
                %>
                 <tr>
                <td><b>PRODUCT ID</b></td>
                <td><b>PRODUCT NAME</b></td>
                <td><b>TYPE</b></td>
                <td><b>DESCRIPTION</b></td>
                <td><b>CUSTOMER</b></td>
            </tr>
            <%
            for (product pp : p) {
            %>
             <tr>
                <td>
                    <%=pp.getIdProduct()%>
                </td>
                <td>
                    <%=pp.getName()%>
                </td>
                <td>
                    <%=pp.getType()%>
                </td>
                <td>
                    <%=pp.getAbout()%>
                </td>
                <td>
                    <%=pp.getCustId()%>
                </td>
                <td>
                    <%=pp.getCustname()%>
                </td>

            </tr>
            <%
                }
            %>
        </table>
        <table id="staffTable" class="table table-hover" style="width: 70%;margin-top: 50px;">
            <%
                  String name5 = (String) request.getAttribute("result");
                ArrayList<Staff> staff =Staff.findByName(name5);
                %>
                <tr>
                <td><b>ID</b></td>
                <td><b>FIRST NAME</b></td>
                <td><b>LAST NAME</b></td>
                <td><b>EMAIL</b></td>
                <td><b>ADDRESS</b></td>
                <td><b>PASSWORD</b></td>
            </tr>
            <%
            for (Staff st : staff) {
                    %>
                    <tr>
                        <td><%=st.getId()%></td>
                        <td><%=st.getFistname()%></td>
                        <td><%=st.getLastname()%></td>
                        <td><%=st.getEmail()%></td>
                        <td><%=st.getAddress()%></td>
                        <td><%=st.getPassword()%></td>
                
            </tr>
                    <%
                }
            %>
        </table>
    </center>
</body>
</html>
