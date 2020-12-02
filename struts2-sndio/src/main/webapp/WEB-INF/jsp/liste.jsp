<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2</title>
</head>

<body>
	<s:form action="enregistrer">
	<div>
		<s:checkboxlist list="listeNoms" name="nomsChoisis"></s:checkboxlist>
	</div>
	<div>
		<s:submit value="Enregistrer"></s:submit>
	</div>
	</s:form>
</body>
</html>