<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des étudiants</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
	<table class="table align-middle">
	  <thead>
	    <tr>
	      <th scope="col">Id</th>
	      <th scope="col">Nom</th>
	      <th scope="col">Prénom</th>
	      <th scope="col">Téléphone</th>
	      <th scope="col">Email</th>
	      <th scope="col">Actions</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="etu" items="${ listeE }">
	    <tr>	    
	      <th scope="row"><a href="afficherE?id=${ etu.id }">${ etu.id }</a></th>	      
	      <td>${ etu.nom }</td>
	      <td>${ etu.prenom }</td>
	      <td>${ etu.tel }</td>
	      <td>${ etu.mail }</td>
	    
	      <td>
	        <a href="deleteE?id=${ etu.id }">
	          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-lg" viewBox="0 0 16 16">
  <path d="M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 0 0 1-.708-.708L7.293 8 2.146 2.854Z"/>
</svg>
	        </a>
	      </td>
	    </tr>
	   </c:forEach>
	  </tbody>
	</table>
</body>
</html>