<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<s:if test="personneTrouvee != null">
		<div>
			Parent : <s:property value="personne.nom"/>. Détails : <s:property value="personneTrouvee.age"/> ans
		</div>
	</s:if>
	<s:else>
		<div><s:property value="personne.nom"/> n'existe pas</div>
	</s:else>
	
	<s:if test="enfant != null">		
		<div>
			Enfant : <s:property value="personne.enfant.nom"/>. Détails : <s:property value="enfant.age"/> ans
		</div>
	</s:if>
	<s:else>
		<div><s:property value="personne.enfant.nom"/> n'existe pas</div>
	</s:else>
	
</body>
</html>