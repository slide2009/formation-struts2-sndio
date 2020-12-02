<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<s:form action="enregistrer">
		<s:textfield name="personne.nom" label="Indiquez un nom "></s:textfield>		
		<s:textfield name="personne.age" label="Indiquez un âge "></s:textfield>		
		<s:select name="personne.sexe" label="Indiquez le sexe " list="{'H', 'F'}"></s:select>		
		<s:submit value="Enregistrer"></s:submit>
	</s:form>
</body>
</html>