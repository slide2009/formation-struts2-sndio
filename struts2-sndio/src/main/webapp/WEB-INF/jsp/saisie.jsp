<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts2</title>
<s:head/>
</head>
<body>
	<div><s:actionerror/>
	</div>
	Démo validation :
	<s:form action="enregistrer">
		<s:textfield name="personne.nom" label="Nom"></s:textfield>
		<s:select label="Sexe" list="{'H','F'}" name="personne.sexe"></s:select>
		<s:textfield name="personne.age" label="Age"></s:textfield>
		<s:submit value="Enregistrer"></s:submit>
	</s:form>
</body>
</html>