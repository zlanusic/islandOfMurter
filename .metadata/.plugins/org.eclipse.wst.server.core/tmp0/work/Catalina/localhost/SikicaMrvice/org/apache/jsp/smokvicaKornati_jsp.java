/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2012-09-20 16:30:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class smokvicaKornati_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html version=\"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta\r\n");
      out.write("\thttp-equiv=\"Content - Type\"\r\n");
      out.write("\tcontent=\"text/html\"\r\n");
      out.write("/>\r\n");
      out.write("<title>APARTMANI - OTOK MURTER | Murter | Murtersko otocje |\r\n");
      out.write("\tKornatsko otocje | Kornati |</title>\r\n");
      out.write("\r\n");
      out.write("<meta\r\n");
      out.write("\tname=\"Description\"\r\n");
      out.write("\tcontent=\"Povijesna bastina na otoku Murteru datira jos iz doba Liburna.\"\r\n");
      out.write(">\r\n");
      out.write("<meta\r\n");
      out.write("\tname=\"Keywords\"\r\n");
      out.write("\tcontent=\"Otok Murter, Murtersko otocje, Kornatsko otocje, Kornati\"\r\n");
      out.write(">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"css/global.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\"\r\n");
      out.write(">\r\n");
      out.write(" <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <link href=\"css/jquery.fancybox.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery-1.7.2.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.bxSlider.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.fancybox.pack.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.galleryview-2.1.1.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.timers-1.1.2.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"CSS/galleryview.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\ttype=\"text/javascript\"\r\n");
      out.write("\tsrc=\"scripts/swfobject.js\"\r\n");
      out.write("></script>\r\n");
      out.write("\r\n");
      out.write(" <script type=\"text/javascript\">    \r\n");
      out.write("    //Nested Side Bar Menu (Mar 20th, 09)\r\n");
      out.write("    //By Dynamic Drive: http://www.dynamicdrive.com/style/\r\n");
      out.write("    \r\n");
      out.write("    var menuids=[\"sidebar_meni\"]; //Enter id(s) of each Side Bar Menu's main UL, separated by commas\r\n");
      out.write("    \r\n");
      out.write("    function initsidebarmenu(){\r\n");
      out.write("    for (var i=0; i<menuids.length; i++){\r\n");
      out.write("      var ultags=document.getElementById(menuids[i]).getElementsByTagName(\"ul\");\r\n");
      out.write("        for (var t=0; t<ultags.length; t++){\r\n");
      out.write("        ultags[t].parentNode.getElementsByTagName(\"a\")[0].className+=\" subfolder_style\";\r\n");
      out.write("      if (ultags[t].parentNode.parentNode.id==menuids[i]) //ako je ovo prvi level u submeni-u \r\n");
      out.write("       ultags[t].style.left=ultags[t].parentNode.offsetWidth+\"px\"; //dynamically position first level submenus to be width of main menu item\r\n");
      out.write("      else //else, ako je ovo sub level u sub meni-u (ul)\r\n");
      out.write("        ultags[t].style.left=ultags[t-1].getElementsByTagName(\"a\")[0].offsetWidth+\"px\"; //position menu to the right of menu item that activated it\r\n");
      out.write("        ultags[t].parentNode.onmouseover=function(){\r\n");
      out.write("        this.getElementsByTagName(\"ul\")[0].style.display=\"block\";\r\n");
      out.write("        };\r\n");
      out.write("        ultags[t].parentNode.onmouseout=function(){\r\n");
      out.write("        this.getElementsByTagName(\"ul\")[0].style.display=\"none\";\r\n");
      out.write("        };\r\n");
      out.write("        }\r\n");
      out.write("      for (var t=ultags.length-1; t>-1; t--){ //loop through all sub menus again, and use \"display:none\" to hide menus (to prevent possible page scrollbars\r\n");
      out.write("      ultags[t].style.visibility=\"visible\";\r\n");
      out.write("      ultags[t].style.display=\"none\";\r\n");
      out.write("      }\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    if (window.addEventListener)\r\n");
      out.write("    window.addEventListener(\"load\", initsidebarmenu, false);\r\n");
      out.write("    else if (window.attachEvent)\r\n");
      out.write("    window.attachEvent(\"onload\", initsidebarmenu);\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"header\"><!-- top -->\r\n");
      out.write("\t\t\t<div id=\"nav_container\"><!--cijeli sadrzaj -->\r\n");
      out.write("\t\t\t\t<ul id=\"nav_lst\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/about/\">ABOUT US</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/contact/\">CONTACT US</a> |</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"active\"><a href=\"/home/\" id=\"current\">HOME</a> |</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content_container\">\r\n");
      out.write("\t\t\t<div id=\"content_left\">\r\n");
      out.write("\t\t\t\t<div id=\"main_left\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 290px; height: 210px;\"><a href=\"\"><img src=\"css/images/icon&logo_pics/trans.gif\" border=\"0\" height=\"210\" width=\"290\"></a></div>\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 290px; height: 210px;\"><a href=\"\"><img src=\"css/images/icon&logo_pics/trans.gif\" border=\"0\" height=\"40\" width=\"290\"></a></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"nav_container2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"sidebar_meni\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a style=\"text-transform: uppercase;\" class=\"subfolder_style\">Opis apartmana</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/opis_apartmana_0-opcenito/\">Općenito</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/opis_apartmana_0-gornji/\">Sa pogledom na more i vrt</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/opis_apartmana_0-donji/\">Sa pogledom na vrt</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"text-transform: uppercase;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"subfolder_style\"\r\n");
      out.write("\t\t\t\t\t\t\t\t>Atraktivne plaže</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"/plaze_1/\">Plaže u blizini</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"text-transform: uppercase;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"subfolder_style\"\r\n");
      out.write("\t\t\t\t\t\t\t\t>Odmor u pokretu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"/aktivnosti_2-bicikl/\">Biciklizam</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"/aktivnosti_2-setnja i trcanje/\">Šetnje\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ti trčanje</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"/aktivnosti_2-ribolov/\">Ribolov</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a style=\"text-transform: uppercase;\">Izlet u NP Kornati</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a style=\"text-transform: uppercase;\" class=\"subfolder_style\">Izlet sa brodom</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/izlet_okolica_2-zminjak\">Izlet na Zminjak</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/izlet_okolica_2-vrgada\">Izlet na Vrgadu</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/izlet_okolica_2-maslenici\">Izlet u maslenike</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br clear=\"all\">\r\n");
      out.write("\t\t\t\t\t<div class=\"prognoza_mod\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"prognoza\" src=\"css/images/icon&logo_pics/vremenska_prognoza_hr.png\">\r\n");
      out.write("\t\t\t\t\t<img class=\"vrijeme\" alt=\"\" src=\"css/images/icon&logo_pics/30.png\">\r\n");
      out.write("\t\t\t\t\t<p class=\"vrijeme_poruka\">Djelomično oblačno</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"temeratura\">17<sup>o</sup></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div id=\"flash\">\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("            var flashvars = {};\r\n");
      out.write("            flashvars.xml = \"../include/flash/flash/config.xml\";\r\n");
      out.write("            flashvars.font = \"font.swf\";\r\n");
      out.write("            var attributes = {};\r\n");
      out.write("            attributes.wmode = \"transparent\";\r\n");
      out.write("            attributes.id = \"slider\";\r\n");
      out.write("            swfobject.embedSWF(\"../include/flash/flash/cu3er.swf\", \"cu3er-container\", \"707\", \"210\", \"9\", \"../include/js/expressInstall.swf\", flashvars, attributes);\r\n");
      out.write("\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div> <!-- end container -->\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
