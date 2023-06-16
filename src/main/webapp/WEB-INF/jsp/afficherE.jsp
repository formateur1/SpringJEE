<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher un étudiant</title>
</head>
<body>
	<div class="card" style="width: 18rem;">
	  <img src="https://mdbcdn.b-cdn.net/img/new/standard/city/062.webp" class="card-img-top" alt="Chicago Skyscrapers"/>
	  <div class="card-body">
	    <h5 class="card-title">${ etu.nom } - ${ etu.prenom }</h5>
	  </div>
	  <ul class="list-group list-group-light list-group-small">
	    <li class="list-group-item px-4">${ etu.id }</li>
	    <li class="list-group-item px-4">${ etu.tel }</li>
	    <li class="list-group-item px-4">${ etu.mail }</li>
	  </ul>
	</div>
</body>
</html>