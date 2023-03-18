<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css" rel="stylesheet"/> 
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.css"/>
<title>Welcome Page</title>
</head>
<body>
	<div class="container">
		<h2>Welcome ${username} !</h2>	 	
		<form >			
			<h1>Demo Project</h1>
			<h4>Click here to check the Credit Score via Tradtional API response </h4>
			<a href="/orchestrator/${userid}">Check Credit Score for ${username}  (using Tradtional API )</a>
			
			<h4>Click here to check the Credit Score via WebClient Strategy</h4>
			<a href="webclient/get-score/${userid}">Credit Score for ${username} (using WebClient)</a>
			
			<br/><br/>
			<a href="/login">Logout</a>
			
		</form>
	</div>
	<script src="webjars/bootstrap/5.2.1/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>		
	
</body>
</html>