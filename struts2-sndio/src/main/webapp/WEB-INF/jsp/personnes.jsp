<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2 CNIO</title>
</head>

<body>
	
		<s:select list="listePersonnes" listKey="nom" listValue="nom" id="listePersonnes" onchange="onChange(this)"></s:select>
	
		<div id="detail"></div>

	<script type="text/javascript">
		const blocDetail = document.getElementById("detail");		
		const onChange = e => {
			fetch(new Request('http://localhost:8080/struts2-sndio/personne?nom=' + e.value))
				.then(reponse => reponse.json())
				.then(reponse => {
					const personne = reponse.personne;
					blocDetail.innerHTML = "Voici le détail de " + personne.nom  + " :  " + personne.age + " ans.";
				})
		}
	</script>
</body>
</html>