<%@page
	language="java"
	session="true"
	contentType="text/html; charset=utf-8"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html version="-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<meta
	http-equiv="Content - Type"
	content="text/html"
/>
<title>APARTMANI - OTOK MURTER | Murter | Murtersko otocje |
	Kornatsko otocje | Kornati |</title>

<meta
	name="Description"
	content="Povijesna bastina na otoku Murteru datira jos iz doba Liburna."
>
<meta
	name="Keywords"
	content="Otok Murter, Murtersko otocje, Kornatsko otocje, Kornati"
>

<link
	href="css/global.css"
	rel="stylesheet"
	type="text/css"
>
 <link href="css/layout.css" rel="stylesheet" type="text/css">
 <link href="css/jquery.fancybox.css" rel="stylesheet" media="screen">
 
 <script type="text/javascript" src="scripts/jquery-1.7.2.js"></script>
 <script type="text/javascript" src="scripts/jquery.bxSlider.js"></script>
 <script type="text/javascript" src="scripts/jquery.fancybox.pack.js"></script>
 
 <script type="text/javascript" src="scripts/jquery.galleryview-2.1.1.js"></script>
 <script type="text/javascript" src="scripts/jquery.timers-1.1.2.js"></script>
 <script type="text/javascript" src="scripts/jquery.easing.1.3.js"></script>

<link href="CSS/galleryview.css" rel="stylesheet" type="text/css" media="screen">

<script
	type="text/javascript"
	src="scripts/swfobject.js"
></script>

 <script type="text/javascript">    
    //Nested Side Bar Menu (Mar 20th, 09)
    //By Dynamic Drive: http://www.dynamicdrive.com/style/
    
    var menuids=["sidebar_meni"]; //Enter id(s) of each Side Bar Menu's main UL, separated by commas
    
    function initsidebarmenu(){
    for (var i=0; i<menuids.length; i++){
      var ultags=document.getElementById(menuids[i]).getElementsByTagName("ul");
        for (var t=0; t<ultags.length; t++){
        ultags[t].parentNode.getElementsByTagName("a")[0].className+=" subfolder_style";
      if (ultags[t].parentNode.parentNode.id==menuids[i]) //ako je ovo prvi level u submeni-u 
       ultags[t].style.left=ultags[t].parentNode.offsetWidth+"px"; //dynamically position first level submenus to be width of main menu item
      else //else, ako je ovo sub level u sub meni-u (ul)
        ultags[t].style.left=ultags[t-1].getElementsByTagName("a")[0].offsetWidth+"px"; //position menu to the right of menu item that activated it
        ultags[t].parentNode.onmouseover=function(){
        this.getElementsByTagName("ul")[0].style.display="block";
        };
        ultags[t].parentNode.onmouseout=function(){
        this.getElementsByTagName("ul")[0].style.display="none";
        };
        }
      for (var t=ultags.length-1; t>-1; t--){ //loop through all sub menus again, and use "display:none" to hide menus (to prevent possible page scrollbars
      ultags[t].style.visibility="visible";
      ultags[t].style.display="none";
      }
      }
    }
    
    if (window.addEventListener)
    window.addEventListener("load", initsidebarmenu, false);
    else if (window.attachEvent)
    window.attachEvent("onload", initsidebarmenu);
    
    </script>

</head>

<body class="main">

	<div id="container">

		<div id="header"><!-- top -->
			<div id="nav_container"><!--cijeli sadrzaj -->
				<ul id="nav_lst">
					<li><a href="/about/">ABOUT US</a></li>
					<li><a href="/contact/">CONTACT US</a> |</li>
					<li id="active"><a href="/home/" id="current">HOME</a> |</li>
				</ul>
			</div>
		</div>
		<div id="content_container">
			<div id="content_left">
				<div id="main_left">
					<div style="width: 290px; height: 210px;"><a href=""><img src="css/images/icon&logo_pics/trans.gif" border="0" height="210" width="290"></a></div>
					<div style="width: 290px; height: 210px;"><a href=""><img src="css/images/icon&logo_pics/trans.gif" border="0" height="40" width="290"></a></div>
					<div id="nav_container2">
						<div class="sidebar_menu">
							<ul id="sidebar_meni">
							<li><a style="text-transform: uppercase;" class="subfolder_style">Opis apartmana</a>
							<ul style="left: 230px; visibility: visible; display: none;">
							<li><a href="/opis_apartmana_0-opcenito/">Općenito</a></li>
							<li><a href="/opis_apartmana_0-gornji/">Sa pogledom na more i vrt</a></li>
							<li><a href="/opis_apartmana_0-donji/">Sa pogledom na vrt</a></li>
							</ul></li>
								<li><a
									style="text-transform: uppercase;"
									class="subfolder_style"
								>Atraktivne plaže</a>
									<ul style="left: 230px; visibility: visible; display: none;">
										<li><a href="/plaze_1/">Plaže u blizini</a></li>
									</ul></li>
								<li><a
									style="text-transform: uppercase;"
									class="subfolder_style"
								>Odmor u pokretu</a>
									<ul style="left: 230px; visibility: visible; display: none;">
										<li><a href="/aktivnosti_2-bicikl/">Biciklizam</a></li>
										<li><a href="/aktivnosti_2-setnja i trcanje/">Šetnje
												i trčanje</a></li>
										<li><a href="/aktivnosti_2-ribolov/">Ribolov</a></li>
									</ul></li>
									<li><a style="text-transform: uppercase;">Izlet u NP Kornati</a>
									</li>
									<li><a style="text-transform: uppercase;" class="subfolder_style">Izlet sa brodom</a>
									<ul style="left: 230px; visibility: visible; display: none;">
									<li><a href="/izlet_okolica_2-zminjak">Izlet na Zminjak</a></li>
									<li><a href="/izlet_okolica_2-vrgada">Izlet na Vrgadu</a></li>
									<li><a href="/izlet_okolica_2-maslenici">Izlet u maslenike</a></li>
									</ul></li>
							</ul>
						</div>
					</div>
					<br clear="all">
					<div class="prognoza_mod">
					<img alt="prognoza" src="css/images/icon&logo_pics/vremenska_prognoza_hr.png">
					<img class="vrijeme" alt="" src="css/images/icon&logo_pics/30.png">
					<p class="vrijeme_poruka">Djelomično oblačno</p>
					<p class="temeratura">17<sup>o</sup></p>
					</div>
				</div>
			</div>
			<div id="content">
			<div id="flash">
			<script type="text/javascript">
            var flashvars = {};
            flashvars.xml = "../include/flash/flash/config.xml";
            flashvars.font = "font.swf";
            var attributes = {};
            attributes.wmode = "transparent";
            attributes.id = "slider";
            swfobject.embedSWF("../include/flash/flash/cu3er.swf", "cu3er-container", "707", "210", "9", "../include/js/expressInstall.swf", flashvars, attributes);

			</script>
			</div>
			</div>
		</div>

	</div> <!-- end container -->
	
</body>
</html>
