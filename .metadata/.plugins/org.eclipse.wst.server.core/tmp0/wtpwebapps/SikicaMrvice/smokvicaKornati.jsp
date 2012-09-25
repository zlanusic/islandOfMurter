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

<link href="css/galleryview.css" rel="stylesheet" type="text/css" media="screen">


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
					<br>
					<div class="mod_kornati">
					<a href="e_card"><img src="css/images/Social_icons_pics/e_card_left_hr.jpg" alt="e card"></a>
					</div>
					
					<div class="prognoza_mod">
					<img alt="prognoza" src="css/images/icon&logo_pics/vremenska_prognoza_hr.png">
					<img class="vrijeme" alt="" src="css/images/icon&logo_pics/30.png">
					<p class="vrijeme_poruka">Djelomično oblačno</p>
					<p class="temeratura">17<sup>o</sup></p>
					
					<h4>Pratite nas:</h4>
					<ul id="socNetworks">
					<li><a id="facebook" target="_blank" href="https://www.facebook.com/zlanusic">Facebook</a></li>
					<li><a id="flickr" target="_blank" href="http://www.flickr.com/photos/62229308@N05/">Flickr</a></li>
					<li><a id="twitter" target="_blank" href="https://twitter.com/zlanusic">Twitter</a></li>
					<li><a id="youtube" target="_blank" href="http://www.youtube.com/MurterIsland">Youtube</a></li>
					<li><a id="gearth" target="_blank" href="http://goo.gl/maps/NjfyC">Google Earth</a></li>
					</ul>
					</div>
				</div>
			</div>
			<div id="content">
			<div id="flash">
			<p><script type="text/javascript" src="flash/CU3ER_islandOfMurter/js/swfobject.js"></script>
			<script type="text/javascript" src="flash/CU3ER_islandOfMurter/js/CU3ER.js"></script><br />
			
			<script type="text/javascript">
			  var browserExplorer = 0;
			  var browserSafari = 0;

			  if (navigator.appName.indexOf("Explorer") > -1){
			    browserExplorer = 1;
			  }

			  if (navigator.userAgent.indexOf("Safari") > -1 && navigator.userAgent.indexOf("Chrome")==-1){
			    browserSafari = 1;
			  }

			  var vars = {folder_images:"flash/CU3ER_islandOfMurter/images", xml_location : 'flash/CU3ER_islandOfMurter/CU3ER-config.xml', width:'707', height:'210'};
				var params = { bgcolor : 'ffffff' };
				var attributes = { id:'cu3er-container', name:'CU3ER' }; // give an id to the flash object
 				 
				
				  if (browserSafari == 1) {
					   
					    if (String(width).indexOf("%") >-1) {
					      width = window.screen.width;
					    } else {
					      width = parseFloat(width);
					    }
					    if (height.indexOf("%") >-1) {
					      height = window.screen.height;
					    } else {
					      height = parseFloat(height);
					    }


					    left = (window.screen.width - width) / 2;
					    top = (window.screen.height - height) / 2;

					    window.moveTo(left, top);
					    window.resizeTo(width+50,height+140);
					  }
						
						

        swfobject.embedSWF("flash/CU3ER_islandOfMurter/CU3ER.swf", "cu3er-container", "707", "210", "9.0.0", "flash/CU3ER_islandOfMurter/js/expressinstall.swf", 
        		vars, params, attributes);
        var CU3ER_object = new cu3er_container("cu3er_container");
            </script></p>
                        
			  <div id="cu3er-container">
			   <noscript>
			   <p>
			   <a href="http://www.adobe.com/go/getflashplayer">
			   <img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" />
			   </a>
			   </p>
			   </noscript>
                </div>
              </div>
              	<div id="flash2">
    <div class="home_index_jezera_head"><a href="jezera"><img src="css/images/Social_icons_pics/suitcase_2.png" width="354" height="224"></a></div>
    <div class="home_index_tisno_head"><a href="tisno"><img src="css/images/Social_icons_pics/suitcase_3.png" width="353" height="224"></a></div>
<!--     <div class="home_index_murter_head"><a href="murter"><img src="css/images/Social_icons_pics/murter.jpg" width="177" height="224"></a></div>
    <div class="home_index_betina_head"><a href="betina"><img src="css/images/Social_icons_pics/murter.jpg" width="176" height="224"></a></div>
 -->    <br clear="all" />
    </div>
              
              </div>
              </div>
              
              </div> <!-- end container -->
	
</body>
</html>
