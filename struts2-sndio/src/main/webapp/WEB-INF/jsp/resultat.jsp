<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formation Struts 2</title>
</head>
<body>
	<div>
		Le nom saisi est :
		<s:property value="nom" />
	</div>
	<div>
		Le nom en majuscule est :
		<s:property value="nom" />
	</div>
</body>
</html>