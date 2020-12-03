<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<s:iterator value="listePersonnesPlusAgees">
<!-- 		Nom1 - Homme - vieux (l'âge). Lien hypertexte -->
	<div>
			<s:property value="nom"/> - <s:if test='"H".equals(sexe) ' > Homme</s:if> <s:else>Femme</s:else>
	</div>		
	
	</s:iterator>
	<div>
		
	</div>
</body>
</html>