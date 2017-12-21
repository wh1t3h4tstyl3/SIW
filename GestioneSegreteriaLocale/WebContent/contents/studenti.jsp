<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head lang="it">
<meta charset="utf-8">
<title>Gestione Segreteria Studenti</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/utility.js"></script>
<link href="https://fonts.googleapis.com/css?family=Gloria+Hallelujah"
	rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/libraries/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css">
<script src="${pageContext.request.contextPath}/libraries/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/libraries/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/prova.css" rel="stylesheet" type="text/css" >
</head>
<body>
	<header>
		<h1>Elenco studenti</h1>
		<h2>Portale per la gestione degli studenti afferenti a qualche
			corso di laurea</h2>

<div class="table-responsive">
		<table class="table">
			<caption>Nominativi degli studenti iscritti</caption>
			<thead>
				<tr>
					<th>Matricola</th>
					<th>Nome</th>
					<th>Cognome</th>
					<th>Data di nascita</th>
					<th>Indirizzo di studi</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<td><a href="javascript:onclick=orderStudent('matricola')">Ordina
							per Matricola</a></td>
					<td><a href="javascript:onclick=orderStudent('nome')">Ordina
							per Nome</a></td>
					<td><a href="javascript:onclick=orderStudent('cognome')">Ordina
							per Cognome</a></td>
					<td><a href="javascript:onclick=orderStudent('data')">Ordina
							per Data di nascita</a></td>
					<td><a href="javascript:onclick=orderStudent('indirizzo')">Ordina
							per Indirizzo</a></td>
				</tr>
			</tfoot>
			<tbody id="allStudent">
			<c:forEach var="stud" items="${studenti}" varStatus="loopStatus">
				<tr class="${loopStatus.index % 2 == 0 ? 'active studente' : 'success studente'}">
					<td>${stud.matricola}</td>
					<td>${stud.nome}</td>
					<td>${stud.cognome}</td>
					<td><time>${date[loopStatus.index]}</time></td>
					<td>${stud.indirizzo}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</header>
</body>
</html>