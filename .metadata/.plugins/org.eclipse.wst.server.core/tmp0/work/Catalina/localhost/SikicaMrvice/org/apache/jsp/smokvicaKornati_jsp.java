/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2012-09-27 14:09:50 UTC
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
      out.write(" <link href=\"css/global.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" <link href=\"css/jquery.fancybox.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery-1.7.2.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.bxSlider/jquery.bxSlider/jquery.bxSlider.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.fancybox.pack.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/* $(\"a.bottom_footer\").fancybox({ }); */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$('#gore_izdvojeno').bxSlider({\r\n");
      out.write("\t\t\t\tprev_img: 'css/images/icon&logo_pics/prev_.gif',\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tnext_img: 'css/images/icon&logo_pics/next_.gif'\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#dolje_izdvojeno').bxSlider({\r\n");
      out.write("\t\t\t\tprev_img: 'css/images/icon&logo_pics/prev_plavi.gif',\r\n");
      out.write("\t\t\t\tnext_img: 'css/images/icon&logo_pics/next_plavi.gif'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.galleryview-2.1.1.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.timers-1.1.2.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/galleryview.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("\r\n");
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
      out.write("<style type=\"text/css\" media=\"screen\">#cu3er-container {visibility:hidden}</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"header\"><!-- top -->\r\n");
      out.write("\t\t\t<div id=\"nav_container\"><!--cijeli sadrzaj -->\r\n");
      out.write("\t\t\t\t<ul id=\"nav_lst\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">ABOUT US</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">CONTACT US</a> |</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"active\"><a href=\"smokvicaKornati.jsp\" id=\"current\">HOME</a> |</li>\r\n");
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
      out.write("\t\t\t\t\t\t\t<li><a href=\"opis.html\">Općenito</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"gore.html\">Sa pogledom na more</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"dolje.html\">Sa pogledom na vrt</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"text-transform: uppercase;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"subfolder_style\"\r\n");
      out.write("\t\t\t\t\t\t\t\t>Atraktivne plaže</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://www.murter-kornati.com/plaze-otok-murter/plaze-murter\">Plaže u blizini</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"text-transform: uppercase;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"subfolder_style\"\r\n");
      out.write("\t\t\t\t\t\t\t\t>Odmor u pokretu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://www.murter-kornati.com/sport-i-rekreacija-murter\">Biciklizam</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://www.murter-kornati.com/sport-i-rekreacija-murter i trcanje/\">Šetnje\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ti trčanje</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://www.murter-kornati.com/sport-i-rekreacija-murter\">Ribolov</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a style=\"text-transform: uppercase;\">Izlet u NP Kornati</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a style=\"text-transform: uppercase;\" class=\"subfolder_style\">Izlet sa brodom</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul style=\"left: 230px; visibility: visible; display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"http://www.zminjak.com/\">Izlet na Zminjak</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"http://blog.dnevnik.hr/lili30/2008/09/1625332421/vrgada-otok-ribara-macaka-i-galebova.html\">Izlet na Vrgadu</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <li><a href=\"/izlet_okolica_2-maslenici\">Izlet u maslenike</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div class=\"mod_kornati\">\r\n");
      out.write("\t\t\t\t\t<a href=\"e_card\"><img src=\"css/images/Social_icons_pics/e_card_left_hr.jpg\" alt=\"e card\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"prognoza_mod\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"prognoza\" src=\"css/images/icon&logo_pics/vremenska_prognoza_hr.png\">\r\n");
      out.write("\t\t\t\t\t<img class=\"vrijeme\" alt=\"\" src=\"css/images/icon&logo_pics/30.png\">\r\n");
      out.write("\t\t\t\t\t<p class=\"vrijeme_poruka\">Djelomično oblačno</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"temeratura\">17<sup>o</sup></p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h4>Pratite nas:</h4>\r\n");
      out.write("\t\t\t\t\t<ul id=\"socNetworks\">\r\n");
      out.write("\t\t\t\t\t<li><a id=\"facebook\" target=\"_blank\" href=\"https://www.facebook.com/zlanusic\">Facebook</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a id=\"flickr\" target=\"_blank\" href=\"https://www.flickr.com/photos/62229308@N05/\">Flickr</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a id=\"twitter\" target=\"_blank\" href=\"https://twitter.com/zlanusic\">Twitter</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a id=\"youtube\" target=\"_blank\" href=\"http://www.youtube.com/MurterIsland\">Youtube</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a id=\"gearth\" target=\"_blank\" href=\"http://goo.gl/maps/NjfyC\">Google Earth</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div id=\"flash\">\r\n");
      out.write("\t\t\t<p><script type=\"text/javascript\" src=\"flash/CU3ER_islandOfMurter/js/swfobject.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"flash/CU3ER_islandOfMurter/js/CU3ER.js\"></script><br />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t  var browserExplorer = 0;\r\n");
      out.write("\t\t\t  var browserSafari = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t\t  if (navigator.appName.indexOf(\"Explorer\") > -1){\r\n");
      out.write("\t\t\t    browserExplorer = 1;\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t  if (navigator.userAgent.indexOf(\"Safari\") > -1 && navigator.userAgent.indexOf(\"Chrome\")==-1){\r\n");
      out.write("\t\t\t    browserSafari = 1;\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t  var vars = {folder_images:\"flash/CU3ER_islandOfMurter/images\", xml_location : 'flash/CU3ER_islandOfMurter/CU3ER-config.xml', width:'707', height:'210'};\r\n");
      out.write("\t\t\t\tvar params = { bgcolor : 'ffffff' };\r\n");
      out.write("\t\t\t\tvar attributes = { id:'cu3er-container', name:'CU3ER' }; // give an id to the flash object\r\n");
      out.write(" \t\t\t\t \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t  if (browserSafari == 1) {\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t    if (String(width).indexOf(\"%\") >-1) {\r\n");
      out.write("\t\t\t\t\t      width = window.screen.width;\r\n");
      out.write("\t\t\t\t\t    } else {\r\n");
      out.write("\t\t\t\t\t      width = parseFloat(width);\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t    if (height.indexOf(\"%\") >-1) {\r\n");
      out.write("\t\t\t\t\t      height = window.screen.height;\r\n");
      out.write("\t\t\t\t\t    } else {\r\n");
      out.write("\t\t\t\t\t      height = parseFloat(height);\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    left = (window.screen.width - width) / 2;\r\n");
      out.write("\t\t\t\t\t    top = (window.screen.height - height) / 2;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    window.moveTo(left, top);\r\n");
      out.write("\t\t\t\t\t    window.resizeTo(width+50,height+140);\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("        swfobject.embedSWF(\"flash/CU3ER_islandOfMurter/CU3ER.swf\", \"cu3er-container\", \"707\", \"210\", \"9.0.0\", \"flash/CU3ER_islandOfMurter/js/expressinstall.swf\", \r\n");
      out.write("        \t\tvars, params, attributes);\r\n");
      out.write("        var CU3ER_object = new cu3er_container(\"cu3er_container\");\r\n");
      out.write("            </script></p>\r\n");
      out.write("                        \r\n");
      out.write("\t\t\t  <div id=\"cu3er-container\">\r\n");
      out.write("\t\t\t   <noscript>\r\n");
      out.write("\t\t\t   <p>\r\n");
      out.write("\t\t\t   <a href=\"http://www.adobe.com/go/getflashplayer\">\r\n");
      out.write("\t\t\t   <img src=\"http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif\" alt=\"Get Adobe Flash player\" />\r\n");
      out.write("\t\t\t   </a>\r\n");
      out.write("\t\t\t   </p>\r\n");
      out.write("\t\t\t   </noscript>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              \t<div id=\"flash2\">\r\n");
      out.write("    <div class=\"home_index_apartman_gore\">\r\n");
      out.write("    <a href=\"gore_detaljno.html\">\r\n");
      out.write("    <img src=\"css/images/Social_icons_pics/suitcase_2.png\" width=\"354\" height=\"224\">\r\n");
      out.write("    </a></div>\r\n");
      out.write("    <div class=\"home_index_apartman_dolje\">\r\n");
      out.write("    <a href=\"dolje_detaljno.html\">\r\n");
      out.write("    <img src=\"css/images/Social_icons_pics/suitcase_3.png\" width=\"353\" height=\"224\">\r\n");
      out.write("    </a></div>\r\n");
      out.write("    <br clear=\"all\" />\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"flash3\">\r\n");
      out.write("    \t<div class=\"home_index_gore_content\">\r\n");
      out.write("    \t<div class=\"container\" style=\"overflow:hidden; position:relative; width:352px;\">\r\n");
      out.write("    \t<div id=\"gore_izdvojeno\" style=\"padding-top:20px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03428.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03426.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03427.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03428.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03429.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03431.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03432.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03433.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na unutrašnjost apartmana...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/apartmani_pics/DSC03434.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"home_index_dolje_content\">\r\n");
      out.write("\t\t\t\t<div class=\"container\" style=\"overflow:hidden; position:relative; width:352px;\">\r\n");
      out.write("\t\t\t\t<div id=\"dolje_izdvojeno\" style=\"padding-top:20px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03475.jpg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t    <div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03443.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03445.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03446.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03447.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03449.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03498.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03497.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"float:left; width:352px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"front_heading\"><h3>Pogled na nas vrt...</h3></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pic_wrapper\"><img src=\"css/images/vrt_pics/DSC03493.jpg\" ></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br clear=\"all\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div><!-- end flash3 -->\r\n");
      out.write("\t\t\t\t<a href=\"http://hr.wikipedia.org/wiki/Nacionalni_park_Kornati\"><img class=\"kornati_bottom\" src=\"css/images/Kornati_kucica_pics/kornati_bottom_hr.jpg\" alt=\"kornati\" /></a>                \r\n");
      out.write("                <br clear=\"all\">        \r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><!-- end content -->\r\n");
      out.write("   \r\n");
      out.write("   </div><!-- end content-container  -->\r\n");
      out.write("   <br clear=\"all\">\r\n");
      out.write("           <div id=\"footer\"><ul>\r\n");
      out.write("           <li class=\"ikona1\"><a href=\"http://www.facebook.com/media/set/?set=o.231400770471&ref=mf\">NA SMOKVICU</a> </li>\r\n");
      out.write("           <li class=\"ikona2\"><a target=\"blank\" href=\"http://www.manager.hr/adminmax/images/upload/KORNATI-kratka-prica.pdf\">PROSPEKT</a> </li>\r\n");
      out.write("           <li class=\"ikona3\"><a href=\"http://www.tzo-murter.hr/\">INFO</a> </li>\r\n");
      out.write("           <li class=\"ikona4\"><a href=\"http://www.flickr.com/photos/62229308@N05/\">GALERIJA</a></li>\r\n");
      out.write("           </ul>\r\n");
      out.write("           \r\n");
      out.write("           <div class=\"bottom_footer\">\r\n");
      out.write("           <a class=\"bottom_footer\" href=\"../scripts/ajax/bottom_footer.php?id=1&lang=hr\" title=\"Impressum\">Impressum</a>\r\n");
      out.write("           </div>\r\n");
      out.write("           </div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("</div> <!-- end container -->\r\n");
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
