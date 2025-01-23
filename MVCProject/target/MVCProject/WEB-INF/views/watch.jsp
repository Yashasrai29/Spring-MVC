<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Watch</title>
</head>
<body>
<h1>Watching
</h1>
<%String n=(String)request.getAttribute("name"); %>
<%=n %>
<h1>${name }</h1>
<h1>${address }</h1>

<h1>${login.email }</h1>
<h1>${login.password }</h1>

<form action="form" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" name="checkbox" onclick ="test()" value="true" id="yash" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label"  for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

<script type = "text/javascript">
	 
	function test(){
		var temp=return document.getElementById("yash").checked;
		  if (temp.checked == true){  
			    var y = document.getElementById("yash").value;  
			    return document.getElementById("result").innerHTML = y;   
			  }   
	}
</script>

</body>
</html>