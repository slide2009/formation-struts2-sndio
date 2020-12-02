<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<s:iterator value="listePersonnes">
		<div>		
			<s:property value="nom"/> 
			-
			<s:if test='"H".equals(sexe)'>Homme</s:if>
			<s:else>Femme</s:else>
			-
			<s:if test='age <23'>Jeune</s:if>
			<s:else>Vieux</s:else> (<s:property value="age"/> ans).
			 
			<a href="listeAgees?ageChoisi=<s:property value="age"/>">Voir les personnes plus âgées</a>  
		</div>
	</s:iterator>
	<a href="saisie">Retour à la saisie</a>
</body>
</html>