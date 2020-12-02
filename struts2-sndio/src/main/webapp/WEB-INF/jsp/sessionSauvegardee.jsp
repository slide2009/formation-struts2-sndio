<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts2</title>
</head>
<body>
	Vous avez mis en session
	<s:property value="#session.SESSION_PERSONNE_PREFEREE.nom"/>
	<div>
	Cette page utilise l'élément mis en session <s:a value="sessionFormulairePrerempli">Lien</s:a> 
	</div>	
</body>
</html>