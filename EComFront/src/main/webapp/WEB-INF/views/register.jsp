<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="resources/css/login.css">
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">Thank you for Sign Up!</div>
                <div class="panel-body">
                    <form:form modelAttribute="usermodel" action="adduser"
						method="post">
						<div class="form-group">
							<label for="fname">User Name</label>
							<form:input type="text" id="fname" class="form-control" name="fname" placeholder="Example: John" path="User_name"/>
						</div>
                        <div class="form-group">
							<label for="lname">Email ID</label>
							<form:input type="email" id="lname" class="form-control" name="lname" placeholder="Example: 123@mail.com" path="email_id"/>
                        </div>
						
						<div class="form-group">
							<label for="emailaddr">Phone Number</label>
							<form:input type="mobile" id="emailaddr" class="form-control" name="email" placeholder="Example: +91-123456789" path="Phonenumber"/>
                        </div>
						<div class="form-group">
							<label for="password">Password</label>
							<form:input type="password" id="password" class="form-control" name="password" placeholder="" path="user_pass"/>
                        </div>
						
						<div class="form-group text-center">
							<button type="submit" class="btn btn-primary btn-lg" id="submitbtn" name="submit">Sign up!</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>