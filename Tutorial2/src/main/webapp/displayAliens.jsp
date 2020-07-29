<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp version</title>
</head>
<body>
display aliens here and the string should be here: ${obj.getBrand()}
<ul>
<li>${obj.getColor()}</li>
<li>${obj.getModel()}</li>
<li>${obj.getBrand()}</li>
<li>${obj.color}</li>
<li>${obj.model}</li>
<li>${obj.brand}</li>
</ul>
${stringExample}

</body>
</html>