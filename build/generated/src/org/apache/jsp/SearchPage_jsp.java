package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Staff;
import Model.product;
import Model.CustomersCompany;
import Model.Ships;
import Model.Captains;
import java.util.ArrayList;

public final class SearchPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SEARCH PAGE ::</title>\n");
      out.write("        <style>\n");
      out.write("            #s1{\n");
      out.write("                width: 16%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #777;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #s2{\n");
      out.write("                width: 16%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #DCDCDC;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #s3{\n");
      out.write("                width: 16%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #DCDCDC;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #s4{\n");
      out.write("                width: 16%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #DCDCDC;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #s5{\n");
      out.write("                width: 16%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #DCDCDC;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #s6{\n");
      out.write("                width: 16%;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #DCDCDC;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            /*                padding-left: 26%;\n");
      out.write("                            padding-left: 42%;\n");
      out.write("                            padding-left: 5%\n");
      out.write("                            padding-left: 75%;*/\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #cap{\n");
      out.write("                padding-left: 9%;\n");
      out.write("                position: absolute;\n");
      out.write("                visibility: hidden;\n");
      out.write("            }\n");
      out.write("            #ship{\n");
      out.write("                padding-left: 26%;\n");
      out.write("                position: absolute;\n");
      out.write("                visibility: hidden;\n");
      out.write("            }\n");
      out.write("            #company2{\n");
      out.write("                position: absolute;\n");
      out.write("                padding-left: 42%;\n");
      out.write("                visibility: hidden;\n");
      out.write("            }\n");
      out.write("            #product{\n");
      out.write("                padding-left: 58%;  \n");
      out.write("                position: absolute;\n");
      out.write("                top: auto;\n");
      out.write("                visibility: hidden;\n");
      out.write("            }\n");
      out.write("             #staff{\n");
      out.write("                padding-left: 75%;  \n");
      out.write("                position: absolute;\n");
      out.write("                top: auto;\n");
      out.write("                visibility: hidden;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function myFunction1() {\n");
      out.write("                document.getElementById(\"cap\").style.visibility = \"visible\";\n");
      out.write("                document.getElementById(\"ship\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"company2\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"product\").style.visibility = \"hidden\";\n");
      out.write("                \n");
      out.write("                     document.getElementById(\"staff\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"s6\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s2\").style.backgroundColor = \"#C0C0C0\";\n");
      out.write("                document.getElementById(\"s3\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s4\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s5\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("            }\n");
      out.write("            function myFunction2() {\n");
      out.write("                document.getElementById(\"cap\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"ship\").style.visibility = \"visible\";\n");
      out.write("                document.getElementById(\"company2\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"product\").style.visibility = \"hidden\";\n");
      out.write("                \n");
      out.write("                     document.getElementById(\"staff\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"s6\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s3\").style.backgroundColor = \"#C0C0C0\";\n");
      out.write("                document.getElementById(\"s2\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s4\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s5\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("            }\n");
      out.write("            function myFunction3() {\n");
      out.write("                document.getElementById(\"cap\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"ship\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"company2\").style.visibility = \"visible\";\n");
      out.write("                document.getElementById(\"product\").style.visibility = \"hidden\";\n");
      out.write("                  \n");
      out.write("                     document.getElementById(\"staff\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"s4\").style.backgroundColor = \"#C0C0C0\";\n");
      out.write("                document.getElementById(\"s2\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s2\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s5\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                \n");
      out.write("                document.getElementById(\"s6\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("            }\n");
      out.write("            function myFunction4() {\n");
      out.write("                document.getElementById(\"cap\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"ship\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"company2\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"product\").style.visibility = \"visible\";\n");
      out.write("                     document.getElementById(\"staff\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"s5\").style.backgroundColor = \"#C0C0C0\";\n");
      out.write("                document.getElementById(\"s3\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s4\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s2\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s6\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                \n");
      out.write("            }    function myFunction5() {\n");
      out.write("                document.getElementById(\"cap\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"ship\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"company2\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"product\").style.visibility = \"hidden\";\n");
      out.write("                document.getElementById(\"staff\").style.visibility = \"visible\";\n");
      out.write("                \n");
      out.write("                document.getElementById(\"s5\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s3\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s4\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s2\").style.backgroundColor = \"#DCDCDC\";\n");
      out.write("                document.getElementById(\"s6\").style.backgroundColor = \"#C0C0C0\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            #captable{\n");
      out.write("                visibility:hidden ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${visible}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("                position: absolute;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("            }\n");
      out.write("            #shipsTable{\n");
      out.write("                visibility:hidden ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${visible2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("                position: absolute;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("            }\n");
      out.write("            #companyTable{\n");
      out.write("                visibility:hidden ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${visible3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("               position: absolute;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("            }\n");
      out.write("            #productTable{\n");
      out.write("                visibility:hidden ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${visible4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("               position: absolute;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0; \n");
      out.write("            }#staffTable{\n");
      out.write("                   visibility:hidden ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${visible6}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("               position: absolute;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0; \n");
      out.write("            }\n");
      out.write("                \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("        <div style=\"text-align: center\">\n");
      out.write("            <label id=\"s2\" onmouseover=\"myFunction1()\"><h3>Search Captain</h3></label>\n");
      out.write("            <label id=\"s3\" onmouseover=\"myFunction2()\"><h3>Search Ship</h3></label>\n");
      out.write("            <label id=\"s4\" onmouseover=\"myFunction3()\"><h3>Search Company</h3></label>\n");
      out.write("            <label id=\"s5\" onmouseover=\"myFunction4()\"><h3>Search Product</h3></label>\n");
      out.write("            <label id=\"s6\" onmouseover=\"myFunction5()\"><h3>Search Staff</h3></label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form class=\"form-inline\" id=\"cap\" action=\"searchCaptain\" method=\"post\">\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Search Captain\" > <input type=\"submit\" class=\"btn btn-default\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form class=\"form-inline\" id=\"ship\" action=\"SearchShip\" method=\"post\">\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Search Ship\" > <input type=\"submit\" class=\"btn btn-default\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form class=\"form-inline\" id=\"company2\" action=\"SearchCompany\" method=\"post\">\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Search Company\" > <input type=\"submit\" class=\"btn btn-default \" onclick=\"cap()\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form class=\"form-inline\" id=\"product\" action=\"searchProduct\">\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Search Product\" > <input type=\"submit\" class=\"btn btn-default\">\n");
      out.write("        </form>\n");
      out.write("        <form class=\"form-inline\" id=\"staff\" action=\"searchStaff\">\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Search Staff\" > <input type=\"submit\" class=\"btn btn-default\">\n");
      out.write("        </form>\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("        <table id=\"captable\" class=\"table table-hover\" style=\"width: 70%;margin-top: 50px;\">\n");
      out.write("            ");

                String name = (String) request.getAttribute("result");
                ArrayList<Captains> c = Captains.findByName(name);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><b>CAPTAIN ID</b></td>\n");
      out.write("                <td><b>FIRST NAME</b></td>\n");
      out.write("                <td><b>LAST NAME</b></td>\n");
      out.write("                <td><b>LEVEL</b></td>\n");
      out.write("                <td><b>EMAIL</b></td>\n");
      out.write("                <td><b>TEL</b></td>\n");
      out.write("                <td><b>ADDRESS</b></td>\n");
      out.write("                <td><b>EXPENSES</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (Captains cap : c) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cap.getId());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cap.getFirstname());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cap.getLastname());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cap.getLevel());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>");
      out.print(cap.getEmail());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td> ");
      out.print(cap.getTel());
      out.write("\n");
      out.write("\n");
      out.write("                </td><td>");
      out.print(cap.getAddress());
      out.write("\n");
      out.write("                </td><td>  ");
      out.print(cap.getExpen());
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <table id=\"shipsTable\" class=\"table table-hover\" style=\"width: 70%;margin-top: 50px;\">\n");
      out.write("            ");

                String name2 = (String) request.getAttribute("result");
                ArrayList<Ships> s = Ships.findByName(name2);
            
      out.write(" <tr>\n");
      out.write("                <td><b>SHIP ID</b></td>\n");
      out.write("                <td><b>SHIP NAME</b></td>\n");
      out.write("                <td><b>SHIP TYPE</b></td>\n");
      out.write("                <td><b>DISPLACEMENT</b></td>\n");
      out.write("                <td><b>EXPENSES</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (Ships ss : s) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(ss.getShipsId());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(ss.getShipsName());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(ss.getShipsType());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(ss.getDisplacement());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(ss.getExpen());
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table >\n");
      out.write("        <table id=\"companyTable\" class=\"table table-hover\" style=\"width: 70%;margin-top: 50px;\">\n");
      out.write("            ");

                  String name3 = (String) request.getAttribute("result");
                ArrayList<CustomersCompany> cust =CustomersCompany.findByName(name3);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <td><b>COMPANY ID</b></td>\n");
      out.write("                <td><b>COMPANY NAME</b></td>\n");
      out.write("                <td><b>LV. COMPANY</b></td>\n");
      out.write("                <td><b>ADDRESS</b></td>\n");
      out.write("                <td><b>COUNTRY</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (CustomersCompany cs : cust) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cs.getIdCompany());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cs.getNameCompany());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cs.getLvCompany());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cs.getAddrCompany());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(cs.getCountry());
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("                    ");

                        
                    }
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <table id=\"productTable\" class=\"table table-hover\" style=\"width: 70%;margin-top: 50px;\">\n");
      out.write("              ");

                  String name4 = (String) request.getAttribute("result");
                ArrayList<product> p =product.ListName(name4);
                
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                <td><b>PRODUCT ID</b></td>\n");
      out.write("                <td><b>PRODUCT NAME</b></td>\n");
      out.write("                <td><b>TYPE</b></td>\n");
      out.write("                <td><b>DESCRIPTION</b></td>\n");
      out.write("                <td><b>CUSTOMER</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            for (product pp : p) {
            
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(pp.getIdProduct());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(pp.getName());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(pp.getType());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(pp.getAbout());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(pp.getCustId());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(pp.getCustname());
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <table id=\"staffTable\" class=\"table table-hover\" style=\"width: 70%;margin-top: 50px;\">\n");
      out.write("            ");

                  String name5 = (String) request.getAttribute("result");
                ArrayList<Staff> staff =Staff.findByName(name5);
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <td><b>ID</b></td>\n");
      out.write("                <td><b>FIRST NAME</b></td>\n");
      out.write("                <td><b>LAST NAME</b></td>\n");
      out.write("                <td><b>EMAIL</b></td>\n");
      out.write("                <td><b>ADDRESS</b></td>\n");
      out.write("                <td><b>PASSWORD</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            for (Staff st : staff) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(st.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.getFistname());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.getLastname());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.getAddress());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.getPassword());
      out.write("</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("                    ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
