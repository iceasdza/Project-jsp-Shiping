package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Country;
import Model.Ships;
import Model.Captains;
import java.util.ArrayList;
import java.util.ArrayList;

public final class addTravel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("     \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>::: ADD TRAVEL :::</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("        <h1 style=\"text-align: center\">::: ADD TRAVEL :::</h1>\n");
      out.write("        <form id=\"captain\"  class=\"form-horizontal\" style=\"width: 750px;border: solid;padding: 20px;border-color: lightskyblue;margin-bottom: 50px;margin-left: 300px;border-radius: 25px;border-width: 10px;position: absolute;visibility: visible\" name=\"myForm\" action=\"addTravel\" method=\"post\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >STATUS</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\" name=\"status\" >\n");
      out.write("                        <option>BACK</option>\n");
      out.write("                        <option>GOING</option>\n");
      out.write("                        <option>CANCELED</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >START TIME</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input class=\"form-control\" type=\"datetime-local\" name=\"stime\" placeholder=\"\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >FINISH TIME</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input class=\"form-control\" type=\"datetime-local\" name=\"ftime\" placeholder=\"\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Captain</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                 <select class=\"form-control\" name=\"cap\">\n");
      out.write("                     \n");
      out.write("                     ");

                         ArrayList<Captains> cap = Captains.captainsList();
                            for (Captains c : cap) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getFirstname()+" "+c.getLastname());
      out.write("</option>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >Ship</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                 <select class=\"form-control\" name=\"ship\">\n");
      out.write("                     \n");
      out.write("                     ");

                         ArrayList<Ships> s  = Ships.shipList();
                         for (Ships c : s) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getShipsName());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >From</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                 <select class=\"form-control\" name=\"from\">\n");
      out.write("                     \n");
      out.write("                 ");

                         ArrayList<Country> a = Country.countryList();
                         for (Country c : a) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getIdCountry());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                          </div>\n");
      out.write("                    \n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                <label class=\"col-sm-2 control-label\" >To</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                 <select class=\"form-control\" name=\"To\">\n");
      out.write("                     \n");
      out.write("                 ");

                         ArrayList<Country> x = Country.countryList();
                         for (Country c : x) {
                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(c.getIdCountry());
      out.write("</option>>\n");
      out.write("                                    ");

                                }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                          </div>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("           \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\">add Travel</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </form>\n");
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
