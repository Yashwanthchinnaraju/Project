<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Product</div>

				<div class="panel-body">
					<form:form modelAttribute="prodmodel" action="productadd"
						method="post">
						<div class="form-group">
							<label for="fname">Product Name</label>
							<form:input type="text" id="fname" class="form-control"
								name="fname" placeholder="Example-John" path="productName" />
						</div>
						<div class="form-group">
							<label for="lname">Product Description</label>
							<form:input type="text" id="lname" class="form-control"
								name="lname" placeholder="Exampl-Doe" path="productDesc" />
						</div>
						<div class="form-group">
							<label for="states">Category Name</label>
							<form:select path="category">
								<c:forEach items="${catlist}" var="c">
									<form:option value="${c.category_Id}">${c.categoryName}</form:option>
								</c:forEach>
							</form:select>
						</div>


						<div class="form-group">
							<label for="emailaddr">Price</label>
							<form:input type="text" id="emailaddr" class="form-control"
								name="email" placeholder="Example-john.doe@gmail.com"
								path="price" />
						</div>
						<div class="form-group">
							<label for="password">Quantity</label>
							<form:input type="password" id="password" class="form-control"
								name="password" placeholder="" path="quantity" />
						</div>

						<div class="form-group text-center">
							<button type="submit" class="btn btn-primary btn-lg"
								id="submitbtn" name="submit">Add Product</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>