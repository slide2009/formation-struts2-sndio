<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<div>Détails concernant <s:property value="personneTrouvee.nom"/> : </div> 
	<div>
		Nom : <s:property value="personneTrouvee.nom"/>. 
		Age : <s:property value="personneTrouvee.age"/> ans
		Sexe : <s:property value="personneTrouvee.sexe"/>
	</div>
	<div><s:property value="message" /></div>
	
	<div>Nombre de personnes au-dessus de l'âge limite : <s:property value="nombrePersonnesAuDessus" /></div>
</body>
</html>