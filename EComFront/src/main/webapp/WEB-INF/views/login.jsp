<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<link rel="stylesheet" href="resources/css/login.css">

<div class = "container">
	<c:if test="${error}">
		<span class="alert alert-danger form-control">Check entered
			data </span>
	</c:if>
	<div class="wrapper">
		<form action="perform_login" method="post" name="Login_Form" class="form-signin">       
		    <h3 class="form-signin-heading">Welcome Back! Please Sign In</h3>
			  <hr class="colorgraph">
			  
			  <input type="text" class="form-control" name="Username" id="Username" placeholder="Username"  autofocus="" />
			  <input type="password" class="form-control" name="Password" id="Password" placeholder="Password" />     		  
			 
			  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
		</form>			
	</div>
</div>