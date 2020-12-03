<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<s:iterator value="listePersonnes">
	<div>
			<s:property value="nom"/> - <s:if test='"H".equals(sexe) ' > Homme</s:if> <s:else>Femme</s:else>
			<a href="rechercher?ageChoisi=<s:property value="age"/>"> Voir les personnes plus âgées</a>
	</div>		
	
	</s:iterator>
	<div>
		
	</div>
</body>
</html>