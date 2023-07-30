<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Controller" method="get">
	Full Name:<input type="text" name="name" required><br />
	Gender: <input type="radio" name="gender" value="male" checked="checked">Male
			<input type="radio" name="gender" value="female">Female<br />
	Language know: <input type="checkbox" name="language" value="English">English
					<input type="checkbox" name="language" value="Nepali">Nepali
					<input type="checkbox" name="language" value="Hindi">Hindi <br />
	Country: <select name="country">
				<option value="nepal">Nepal</option>
				<option value="inida">India</option>
				<option value="china">China</option>
				<option value="finland">Finland</option>
			</select><br />
			<input type="submit" value="Submit">

</form>
</body>
</html>