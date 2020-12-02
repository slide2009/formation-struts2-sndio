<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<s:form action="valider">
	<div>
		<s:select list="listePersonnes" listKey="nom" listValue="nom + ' - ' + sexe" label="Personne" name="nom"></s:select>
	</div>
	<div>
		<s:textfield name="age" value="21" label="Age limite"></s:textfield>
	</div>
		
	<s:submit value="Voir"></s:submit>
	</s:form>
</body>
</html>