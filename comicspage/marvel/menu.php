<!DOCTYPE html>
<html lang="en">

<!-- Marvel Comics Menu Web Version -->

<head>
	<!-- meta charset="utf-8" / -->
	<link rel="stylesheet" type="text/css" href="../../style_sheets/tree_menu.css">
</head>
<body>	
	<ol class="tree">
		<li><label class="home"><a href="../../index.php" target="_top">Home</a></label></li>
		<li><label class="search"><a href="search.php" target="_self">Search</a></label></li><br>
		<li><label class="dc"><a href="../dc/index.php" target="_parent">DC Comics</a></label></li>
		<li><label class="marvel"><a href="../marvel/index.php" target="_parent">Marvel Comics</a></label></li>
		<li><label class="indi"><a href="../small/index.php" target="_parent">Small & Indi Comics</a></label></li><br>
		
	<!-- Begin Marvel PHP Menu  -->
			
			<?php include '../../comicspage_menus/marvel_menu.php';?>
			
			
	<!-- End Marvel PHP Menu  -->
	</ol>	
</body>
</html> 