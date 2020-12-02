<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<s:iterator value="listeAgees">
		<div>		
			<s:property value="nom"/>.
			<s:property value="age"/> ans. 
			<s:property value="sexe"/>. 
		</div>
	</s:iterator>
	
	<a href="saisie">Retour à la saisie</a>	
</body>
</html>