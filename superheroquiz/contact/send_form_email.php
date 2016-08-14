<?php 
			if(isset($_POST['email'])) 
			{   		
				$email_to = "spiderbob007@gmail.com"; 
				$email_subject = "Email from Spider-Bob.com";     
			 
				function died($error) 
				{ 
					// your error code can go here 
					echo "We are very sorry, but there were error(s) found with the form you submitted. "; 
					echo "These errors appear below.<br /><br />"; 
					echo $error."<br /><br />"; 
					echo "Please go back and fix these errors.<br /><br />"; 
					die();
				 }
			  
				// validation expected data exists 
				if(!isset($_POST['screen_name']) || 
					!isset($_POST['superhero_id']) || 
					!isset($_POST['email']) ||        
					!isset($_POST['html_code'])) 
				{ 
					died('OOPS! There appears to be a problem with the form you submitted.'); 
				}     
			 
				$screen_name = $_POST['screen_name']; // required 
				$superhero_id = $_POST['superhero_id']; // required 
				$email_from = $_POST['email']; // required     
				$html_code = $_POST['html_code']; // required 
				$error_message = ""; 
				$email_exp = '/^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/';
			 
			  if(!preg_match($email_exp,$email_from)) 
			  { 
				$error_message .= 'The Email Address you entered does not appear to be valid.<br />'; 
			  }
			 
				$string_exp = "/^[A-Za-z .'-]+$/";
			 
			  if(!preg_match($string_exp,$screen_name)) 
			  { 
				$error_message .= 'The First Name you entered does not appear to be valid.<br />'; 
			  }
			 
			  if(!preg_match($string_exp,$superhero_id)) 
			  { 
				$error_message .= 'The Last Name you entered does not appear to be valid.<br />'; 
			  }
			 
			  if(strlen($html_code) < 2) 
			  { 
				$error_message .= 'The Comments you entered do not appear to be valid.<br />'; 
			  }
			 
			  if(strlen($error_message) > 0) 
			  { 
				died($error_message); 
			  }	 
				$email_message = "Form details below.\n\n";     
			 
				function clean_string($string) 
				{ 
				  $bad = array("content-type","bcc:","to:","cc:","href"); 
				  return str_replace($bad,"",$string); 
				}     
			 
				$email_message .= "First Name: ".clean_string($screen_name)."\n"; 
				$email_message .= "Last Name: ".clean_string($superhero_id)."\n"; 
				$email_message .= "Email: ".clean_string($email_from)."\n";     
				$email_message .= "Comments: ".clean_string($html_code)."\n";     
			 
				// create email headers 
				$headers = 'From: '.$email_from."\r\n". 
				'Reply-To: '.$email_from."\r\n" . 
				'X-Mailer: PHP/' . phpversion(); 
				@mail($email_to, $email_subject, $email_message, $headers); 
			 
?> 

			<?php
			  require_once('recaptchalib.php');
			  $privatekey = "6LcazvcSAAAAAOiIJECOixFopqQwJz_ldjDytKld";
			  $resp = recaptcha_check_answer ($privatekey,
					$_SERVER["REMOTE_ADDR"],
					$_POST["recaptcha_challenge_field"],
					$_POST["recaptcha_response_field"]);

				if (!$resp->is_valid) 
				{
					// What happens when the CAPTCHA was entered incorrectly
					die ("The reCAPTCHA wasn't entered correctly. Go back and try it again." .
					 "(reCAPTCHA said: " . $resp->error . ")");
				 } 
					else 
				 {
			?>
				<!-- include your own success html here --> 
				<!DOCTYPE html>
				<html lang="en">

				<head>
					<meta charset="utf-8" />
					<title>Contact Spider-Bob</title>	
					<link href="../../style_sheets/contact_quiz.css" rel="stylesheet" type="text/css">		
				</head>

				<body>					
					<div id="main">
						<h3>Thanks for submitting your results.<br>
						I'll add your profile as soon as possible.</h3>
					</div>	
				</body>
				</html>
			<?php	 
						} 
			?>				
<?php	 
			} 
?>