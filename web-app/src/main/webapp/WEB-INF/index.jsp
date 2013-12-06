<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="m" uri="http://swiftelan.com/modular" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<html>
<head>
	<m:resources/>
</head>
<body>
	<div class="container">
	<h1>Modular Application</h1>
		<p><a href="${pageContext.request.contextPath}/Jar.action">Access a JSP in a JAR</a></p>
	</div>
</body>
</html>