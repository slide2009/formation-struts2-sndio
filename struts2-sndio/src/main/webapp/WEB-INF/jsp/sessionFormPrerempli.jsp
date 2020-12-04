<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts2</title>
</head>
<body>
	
	Formulaire prérempli :
	<s:form action="sessionSubmit">
		<s:textfield name="personne.nom" value="%{personneParDefaut.nom}" label="Nom"></s:textfield>
		<s:textfield name="personne.sexe" value="%{personneParDefaut.sexe}" label="Sexe"></s:textfield>
		<s:textfield name="personne.age" value="%{personneParDefaut.age}" label="Age"></s:textfield>
		<s:submit value="Enregistrer"></s:submit>
	</s:form>
	
	<!-- Accès direct aux variables de session dans la Jsp : -->
	<!-- 
	<s:form action="tpSaisieFormulaireSubmit">
		<s:textfield name="personne.nom" value="%{#session.SESSION_PERSONNE_PREFEREE.nom}" label="Nom"></s:textfield>
		<s:textfield name="personne.sexe" value="%{#session.SESSION_PERSONNE_PREFEREE.sexe}" label="Sexe"></s:textfield>
		<s:textfield name="personne.age" value="%{#session.SESSION_PERSONNE_PREFEREE.age}" label="Age"></s:textfield>
		<s:submit value="Enregistrer"></s:submit>
	</s:form>
	 -->
</body>
</html>