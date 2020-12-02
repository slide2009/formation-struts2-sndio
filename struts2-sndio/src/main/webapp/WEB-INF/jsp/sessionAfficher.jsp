<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts2</title>
</head>
<body>
	Démos SessionAware : choisissez une personne préférée
	<s:form action="sessionSubmit">
		<s:select list="listePersonnes" listKey="nom" listValue="nom +' - '+ age + ' ans'" 
 				name="nomChoisi"/>
		<s:submit value="Valider cette personne"></s:submit>
	</s:form>
</body>
</html>