package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("          function myFunction1() {\n");
      out.write("                         document.getElementById(\"ships\").style.visibility = \"visible\";\n");
      out.write("                         document.getElementById(\"captain\").style.visibility = \"hidden\";\n");
      out.write("                         document.getElementById(\"Customer\").style.visibility = \"hidden\";\n");
      out.write("            }\n");
      out.write("          function myFunction2() {\n");
      out.write("                         document.getElementById(\"captain\").style.visibility = \"visible\";\n");
      out.write("                         document.getElementById(\"ships\").style.visibility = \"hidden\";\n");
      out.write("                         document.getElementById(\"Customer\").style.visibility = \"hidden\";\n");
      out.write("            }\n");
      out.write("          function myFunction3() {\n");
      out.write("                         document.getElementById(\"Customer\").style.visibility = \"visible\";\n");
      out.write("                         document.getElementById(\"ships\").style.visibility = \"hidden\";\n");
      out.write("                         document.getElementById(\"captain\").style.visibility = \"hidden\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: white\">\n");
      out.write("        <h1 style=\"text-align: center\">::: Add information Page :::</h1>\n");
      out.write("        <h1 style=\"color: green;text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <h1 style=\"color: red;text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <h1 style=\"color: red;text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${repaeat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("      \n");
      out.write("        <p style=\"text-align: center\">\n");
      out.write("            <button id=\"shipbutton\" type=\"button\" class=\"btn btn-default btn-lg\" onclick=\"myFunction2()\">Add captain</button>\n");
      out.write("            <button id=\"capbutton\" type=\"button\" class=\"btn btn-default btn-lg\" onclick=\"myFunction1()\">Add ship</button>\n");
      out.write("            <button id=\"customerbutton\" type=\"button\" class=\"btn btn-default btn-lg\" onclick=\"myFunction3()\">Add customer</button>\n");
      out.write("</p>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form id=\"captain\"  class=\"form-horizontal\" style=\"width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: visible\" name=\"myForm\" action=\"addCaptains\" method=\"post\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >First name</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"fname\" placeholder=\"First Name\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Last name</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"lname\" placeholder=\"Last Name\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Level</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                <input class=\"form-control\" type=\"number\" name=\"level\" placeholder=\"level\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Email</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                <input class=\"form-control\" type=\"email\" name=\"email\" placeholder=\"Email\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Telephone</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"tel\" placeholder=\"Tel\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Address</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <textarea class=\"form-control\" name=\"addr\" placeholder=\"Address\" style=\"resize: none\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Expenses</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"expen\" placeholder=\"expen\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">add captains</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form  action=\"addShip\" id=\"ships\"  class=\"form-horizontal\" style=\"width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: hidden\" name=\"myForm\" method=\"post\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Ship name</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"shipname\" placeholder=\"Shipname\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Ship type</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"type\">\n");
      out.write("                        <option value=\"SMALL\">SMALL</option>\n");
      out.write("                        <option value=\"MEDIUM\">MEDIUM</option>\n");
      out.write("                        <option value=\"LARGE\">LARGE</option>\n");
      out.write("                        <option value=\"EXTRA LARGE\">EXTRA LARGE</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Displacement</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"displace\" placeholder=\"Displacement\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Expenses</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"expen\" placeholder=\"expen\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">add ship</button>\n");
      out.write("    </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form id=\"Customer\" action=\"addCustomer\" id=\"ships\"  class=\"form-horizontal\" style=\"width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: hidden\" name=\"myForm\" method=\"post\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Company Name</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"companyName\" placeholder=\"Company Name\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Level</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                <input class=\"form-control\" type=\"number\" name=\"level\" placeholder=\"level\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Address</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <textarea class=\"form-control\" name=\"addr\" placeholder=\"Address\" style=\"resize: none\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Country ID</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"countryId\">\n");
      out.write("                        <option>TH</option>\n");
      out.write("                        <option>JPN</option>\n");
      out.write("                        <option>USA</option>\n");
      out.write("                        <option>HK</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">add customer</button>\n");
      out.write("    </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
