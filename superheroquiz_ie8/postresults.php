<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8" />
	<meta  name="viewport" content=" initial-scale=1.0; minimum-scale=1.0, width=device-width, maximum-scale=1.0" />
	<title>Post Your Results</title>	
	<link href="../style_sheets/contact_ie8.css" rel="stylesheet" type="text/css">		
</head>

<body>
	<!-- Banner Begin -->
		<div id="home"><a href="../index.php" target="_self"><img src="../images/SpiderBobSnippet01.png" alt="Take me home."  title="Take me home." width="80" height="80"></a></div>
	<!-- Banner End -->
	
	<!-- Form Begin -->
	<div id="main">
		<h3>Post your quiz results below.</h3>
		
		<form name="contactform" method="post" action="send_form_email.php"> 
			<table width="500px"> 
				<tr> 
				 <td valign="top"> 
				  <label for="screen_name">Screen Name *</label> 
				 </td> 
				 <td valign="top"> 
				  <input  type="text" name="screen_name" maxlength="50" size="45"> 
				 </td> 
				</tr> 
				<tr> 
				 <td valign="top""> 
				  <label for="superhero_id">Super Identity *</label> 
				 </td> 
				 <td valign="top"> 
				  <input  type="text" name="superhero_id" maxlength="50" size="45"> 
				 </td> 
				</tr> 
				<tr> 
				 <td valign="top"> 
				  <label for="email">Email *</label> 
				 </td> 
				 <td valign="top"> 
				  <input  type="text" name="email" maxlength="80" size="45"> 
				 </td> 
				</tr> 				
				<tr> 
				 <td valign="top"> 
				  <label for="html_code">HTML Code *</label> 
				 </td> 
				 <td valign="top"> 
				  <textarea  name="html_code" maxlength="5000" cols="35" rows="10" placeholder="Copy and paste the code from thesuperheroquiz.com results here."></textarea> 
				 </td> 
				</tr> 
				<tr> 
				 <td valign="top"> 
				  <label for="comments">Captcha *</label> 
				 </td> 
				 <td valign="top"> 
					<?php
					  require_once('recaptchalib.php');
					  $publickey = "6LcazvcSAAAAAGnpEJcbertXttR5NFx9vbLFvlCH"; // you got this from the signup page
					  echo recaptcha_get_html($publickey);
					?>
				 </td> 
				</tr> 				
				<tr> 
				<td colspan="2" style="text-align:right">
				  <input id="submit" type="submit" value="Submit">  
				 </td> 
				</tr> 
			</table> 
		</form>
	</div>
	<!-- Form End -->
</body>
</html>