<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>Formation Struts 2</title>
</head>

<body>
	
	<s:select list="listePersonnes" listKey="nom" listValue="nom" id="listePersonnes"></s:select>
	
	<div id="detail"></div>

	<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
	<script type="text/javascript">
	
	const blocDetail = $("#detail");
	
	$("#listePersonnes").on('change', function() {
		const nom = this.value;
		$.get({
			url: 'http://localhost:8080/struts2-sndio/personne?nom='+ nom,
			success: function(reponse) {				
				const personne = reponse.personne;
				blocDetail.html("Voici le détail de " + personne.nom  + " :  " + personne.age + " ans.");
			}
		})
	})	
	</script>
</body>
</html>