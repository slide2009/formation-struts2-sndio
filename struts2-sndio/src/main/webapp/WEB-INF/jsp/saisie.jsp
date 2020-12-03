<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<s:form action="enregistrer">
		<s:textfield name="personne.nom" label="Nom 1"></s:textfield>		
		<s:textfield name="personne.enfant.nom" label="Nom 2"></s:textfield>		
		<s:submit value="Valider"></s:submit>
	</s:form>
</body>
</html>