/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2012-05-27 19:00:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IslandOfMurter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write(" <html lang=\"en\">\r\n");
      out.write(" <head>\r\n");
      out.write(" <meta http-equiv=\"Content - Type\" content=\"text/html\" charset=\"utf-8\"/>\r\n");
      out.write("  <title>\r\n");
      out.write(" APARTMANI - OTOK MURTER | Murter | Murtersko otocje | Kornatsko otocje | Kornati | \r\n");
      out.write(" </title>\r\n");
      out.write(" \r\n");
      out.write(" <meta name=\"Description\" content=\"Povijesna bastina na otoku Murteru datira jos iz doba Liburna.\">\r\n");
      out.write(" <meta name=\"Keywords\" content=\"Otok Murter, Murtersko otocje, Kornatsko otocje, Kornati\">\r\n");
      out.write(" \r\n");
      out.write(" <link href=\"css/global.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <!--link href=\"CSS/jquery.fancybox.css\" rel=\"stylesheet\" media=\"screen\"-->\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery-1.7.2.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.bxSlider.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.fancybox.pack.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.galleryview-2.1.1.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.timers-1.1.2.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.easing.1.3.js\"></script>\r\n");
      out.write(" <!--link href=\"CSS/galleryview.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"-->\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/swfobject.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write(" <div class=\"wrapper\">\r\n");
      out.write(" \r\n");
      out.write(" <div class=\"header\">\r\n");
      out.write("  <ul id=\"horizontalmenutop\">\r\n");
      out.write(" <li id=\"active\"><a href=\"current\">HOME</a> |</li>\r\n");
      out.write(" <li><a href=\"contact\">CONTACT</a>\r\n");
      out.write("  </ul>\r\n");
      out.write(" </div>\r\n");
      out.write("  \r\n");
      out.write(" <div class=\"push\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("  <ul id=\"horizontalmenufoot\">\r\n");
      out.write("  <li id=\"booklet\"><a href=\"brochure\">PRELISTAJTE POVIJEST</a></li>\r\n");
      out.write("  <li id=\"islands\"><a href=\"info\">OKRUNJENI OTOCI</a></li>\r\n");
      out.write("  <li id=\"impressum\"><a href=\"write\">KNJIGA IMPRESIJA I UTISAKA</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("   </body>\r\n");
      out.write("   \r\n");
      out.write(" </html>\r\n");
      out.write(" ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
