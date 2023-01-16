<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	<div>
		Aujourd'hui : <s:property value="date2"/>
		Request parameter <s:property value="#parameters.nom"/>
		<s:iterator value="tousNoms" status="status">
			<br/>
			<s:property/>
			<s:property value="#status.odd"/>
		</s:iterator>
	</div>
</body>
</html>