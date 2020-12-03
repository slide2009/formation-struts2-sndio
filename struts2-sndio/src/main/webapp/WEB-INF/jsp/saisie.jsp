<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<s:form action="rechercher">
		<s:textfield name="nom" label="Nom de la personne "></s:textfield>		
		<s:submit value="Rechercher"></s:submit>
	</s:form>
</body>
</html>