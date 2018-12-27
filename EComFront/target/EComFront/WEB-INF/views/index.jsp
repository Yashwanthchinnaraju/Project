<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>   


<html>
<Head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 
</Head>

<body>
	<c:import url="navbar.jsp"></c:import>
	
<div style ="min-height:500px"> 
	<c:if test="${sliderpage}">
	<c:import url="slider.jsp"></c:import>
	</c:if>
	<c:if test="${aboutpage}">
	<c:import url="aboutus.jsp"></c:import>
	</c:if>
	<c:if test="${productpage}">
	<c:import url="product.jsp"></c:import>
	</c:if>
	<c:if test="${categorypage}">
	<c:import url="category.jsp"></c:import>
	</c:if>
	<c:if test="${loginpage}">
	<c:import url="login.jsp"></c:import>
	</c:if>
	<c:if test="${registerpage}">
	<c:import url="register.jsp"></c:import>
	</c:if>
	<c:if test="${contactpage}">
	<c:import url="contact.jsp"></c:import>
	</c:if>
	
	<c:import url="footer.jsp"></c:import>
</div>
</body>
</html>
