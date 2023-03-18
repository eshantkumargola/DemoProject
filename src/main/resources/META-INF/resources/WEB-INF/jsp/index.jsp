<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css" rel="stylesheet"/> 
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.css"/>
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1>Welcome ${username}</h1>
		
		<form >			
			<h2>Welcome to the Demo Project</h2>
			<h3>Click here to move to the login page </h3>
			<a href="/login" class="btn-button-success">Click here to Login </a>
		</form>
	</div>
	<script src="webjars/bootstrap/5.2.1/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>	
</body>
</html>