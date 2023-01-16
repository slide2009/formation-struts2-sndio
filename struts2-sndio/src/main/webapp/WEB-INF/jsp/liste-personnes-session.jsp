<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<div>
		<s:form action="mettre-en-session">
			<s:select list="listePersonnes" listKey="nom" listValue="nom" name="nom"></s:select>
			<s:submit value="Valider"></s:submit>
		</s:form>
	</div>
	
</body>
</html>