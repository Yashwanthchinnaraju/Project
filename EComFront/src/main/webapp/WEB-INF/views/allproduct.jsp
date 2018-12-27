<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
 .thumbnail{
 min-height: 400px;
 }   
 * {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
.item1 {
  position: relative;
  
  border: 1px solid #333;
  margin: 2%;
  overflow: hidden;
  width: 540px;
}
.item1 img {
  max-width: 100%;
  
  -moz-transition: all 0.3s;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
}
.item1:hover {
  -moz-transform: scale(1.3);
  -webkit-transform: scale(1.3);
  transform: scale(1.3);
}
}
</style>
<div class="container">
<div class="row"  style="margin: 2%;">
 <c:forEach items="${prodlist}" var="p">
 <div class="col-sm-3 col-md-3">
  <div class="thumbnail w3-container w3-center w3-animate-bottom">
  <h4 class="text-center">
   <span class="label label-info"></span>
  </h4>
  <img class="item1" src="resources/pimage/${p.productId}.jpg" height="200" width="200">
 <div class="row">
  <div class="text-center">
   <h3>${p.procuctName}</h3>
   <h3>Rs. ${p.price}</h3>
  </div>
 </div>
 <div class="myclass">
  <a href="showoneproduct?productName=${p .procuctName}" class="btn btn- btn-product"><span class="glyphicon glyphicon-shopping-cart"></span>View Details</a>
 </div>
 </div>
 </div>
</c:forEach>
</div>
</div>