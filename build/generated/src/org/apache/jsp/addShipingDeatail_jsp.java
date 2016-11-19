package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Shipping;
import Model.product;
import Model.travel;
import Model.Shippingdetailin;
import Model.Staff;
import java.util.ArrayList;
import Model.CustomersCompany;

public final class addShipingDeatail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("     \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function myFunction1() {\n");
      out.write("                         document.getElementById(\"shipin\").style.visibility = \"visible\";\n");
      out.write("                         document.getElementById(\"shipout\").style.visibility = \"hidden\";\n");
      out.write("            }\n");
      out.write("          function myFunction2() {\n");
      out.write("                         document.getElementById(\"shipout\").style.visibility = \"visible\";\n");
      out.write("                         document.getElementById(\"shipin\").style.visibility = \"hidden\";\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            form{\n");
      out.write("                 position: absolute;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("            }\n");
      out.write("              #s1{\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1 style=\"text-align: center\">Shipping detail</h1>\n");
      out.write("        <h1 style=\"color: green;text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <h1 style=\"color: red;text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("<!--          <p style=\"text-align: center\">\n");
      out.write("            <button id=\"shipin1\" type=\"button\" class=\"btn btn-default btn-lg\" onmouseover=\"myFunction1()\">Add shipping in</button>\n");
      out.write("            <button id=\"shipout2\" type=\"button\" class=\"btn btn-default btn-lg\" onmouseover=\"myFunction2()\">Add shipping out</button>-->\n");
      out.write("</p><div style=\"text-align: center\">\n");
      out.write("    <label id=\"s2\" onmouseover=\"myFunction1()\" ><h3>Add shipping in</h3></label>\n");
      out.write("            <label id=\"s3\" onmouseover=\"myFunction2()\"><h3>SAdd shipping out</h3></label>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"shippingInServlet\" onSubmit=\"return check()\" id=\"shipin\"  class=\"form-horizontal\" style=\"width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: visible\" name=\"myForm\"  method=\"post\" >\n");
      out.write("         <h1>Shipping in</h1>  \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Travel no</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"in\" id=\"param2\">\n");
      out.write("                      ");

                         ArrayList<Shipping> x = Shipping.ListShipping();
                         for (Shipping c : x) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getTravelNo());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("                    \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Product name</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"product\" id=\"param1\">\n");
      out.write("                    ");

                         ArrayList<product> p = product.productList();
                         for (product pro : p) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(pro.getName());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                          </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">add Shipping</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("     <form action=\"shippingOutServlet\" onSubmit=\"return check()\" id=\"shipout\"  class=\"form-horizontal\" style=\"width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;border-radius: 25px;border-width: 10px;visibility: hidden\" name=\"myForm\"  method=\"post\" >\n");
      out.write("         <h1>Shipping out</h1>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Travel no</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"in\" id=\"param2\">\n");
      out.write("                       ");

                         ArrayList<Shipping> z = Shipping.ListShipping();
                         for (Shipping c : z) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getTravelNo());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("                    \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Product name</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"out\" id=\"param1\">\n");
      out.write("                    ");

                         ArrayList<product> v = product.productList();
                         for (product pro : v) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(pro.getName());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                          </div>\n");
      out.write("                        \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("           \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">add Shipping</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </form>               \n");
      out.write("                    \n");
      out.write("    </body>\n");
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
