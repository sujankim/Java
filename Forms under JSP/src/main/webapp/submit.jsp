<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>

Name:<%= request.getParameter("name") %><br />
Gender:<%= request.getParameter("gender") %><br />
Language Known: <% 
String[] countries = request.getParameterValues("language");
if(countries != null){
	for(int i =0; i<countries.length; i++){
		out.print("<br />");
		out.print(countries[i]);
	}
}else{
	out.print("None Selected");
}


%> <br />
Country:<%= request.getParameter("country") %><br />

</body>
</html>