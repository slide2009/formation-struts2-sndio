<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<div>
		<s:form action="enregistrer">
			<s:textfield name="personneChoisie.nom" label="Nom de la personne "></s:textfield>
			<s:textfield name="personneChoisie.age" label="Age "></s:textfield>			
			<s:select name="personneChoisie.sexe" label="Indiquez le sexe " list="{'H', 'F'}"></s:select>		
			<s:submit value="Enregistrer"></s:submit>
		</s:form>
	</div>
</body>
</html>