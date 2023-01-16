<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<div>
		<s:form action="dqs">
			<s:textfield name="nom" label="Nom à rechercher" value="%{personne.nom}"></s:textfield>
			<s:submit value="Rechercher"></s:submit>
		</s:form>
	</div>
</body>
</html>
