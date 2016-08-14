<!DOCTYPE html>
<html lang="en">

<head>
	<!-- Marvel Comics Mobile Version  -->
	<meta name="description" content="Marvel Comics encyclopedia featuring characters such as Ant-Man, Captain America, Hulk, Iron Man, 
	Spider-Man, Thor, Wolverine, and teams such as the Avengers, Fantastic Four, Guardians of the Galaxy, and X-Men.">
	<meta itemprop="name" content="Spider-Bob&#39;s Comic Book Encyclopedia">
	<meta itemprop="description" content="Marvel Comics encyclopedia featuring characters such as Ant-Man, Captain America, Hulk, Iron Man, 
	Spider-Man, Thor, Wolverine, and teams such as the Avengers, Fantastic Four, Guardians of the Galaxy, and X-Men.">
	<meta itemprop="image" content="http://spider-bob.com/images/SpiderBobSnippet01.png">
	<title>Spider-Bob's Comic Book Encyclopedia</title>	
	
	<script type="text/javascript">			
		if (navigator.userAgent.indexOf('Safari') != -1 && navigator.userAgent.indexOf('Chrome') == -1) {
			document.location = "index_safari.php";
		}
	</script>

	<link href="../../style_sheets/marvel_comics_ref_mobile.css" rel="stylesheet" type="text/css">
	<link href="../../style_sheets/slide_menu.css" rel="stylesheet" type="text/css">	
</head>

<body>		
	<input type="checkbox" id="drawer-toggle" name="drawer-toggle"/>
	<label for="drawer-toggle" id="drawer-toggle-label"></label>   
	<nav id="drawer">
		<div id="menu">
			<iframe class="menu" src="menu.php" name="menu">
				<p>Look for the listen icon on each page to use your browser's reader.</p>
				<p aria-hidden="true">Your browser does not support iframes.</p>				
			</iframe>
		</div>
	</nav>
	
	 <div id="page-content">	
		<iframe class="ref" src="ref.php" name="ref">
			<p aria-hidden="true">Your browser does not support iframes.</p>
		</iframe>
	</div>	
	
	<!-- Begin Google Analytics -->
	<script>
		(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
		m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

		ga('create', 'UA-28491173-1', 'spider-bob.com');
		ga('send', 'pageview');
	</script>
	<!-- End Google Analytic -->
	
</body>
</html>