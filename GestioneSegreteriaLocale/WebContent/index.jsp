<%@page contentType="text/html" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head lang="it">
<meta charset="utf-8">
<title>Gestione Segreteria Studenti</title>
<link href="https://fonts.googleapis.com/css?family=Gloria+Hallelujah"
	rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="libraries/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css">
<script src="libraries/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js"></script>
<script src="libraries/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/prova.css" type="text/css">
</head>
<body>
	<header id="headerUp" class="row">
	<div align="center" class="col-lg-4">
		<figure>
			<a href="http://www.unical.it"><img src="images/logo_unical.png"
				alt="Sito Unical" width="50%"/></a>
			<figcaption>Il sito dell'Unical</figcaption>
		</figure>
		<a href="http://www.unical.it">Clicca qui</a> per accedere al sito
		dell'<strong>Unical</strong>
	</div>
		<div align="center" class="col-lg-4">
			<h1>Portale Segreteria Studenti</h1>
			<h2>Portale per la gestione degli studenti afferenti a qualche
				corso di laurea</h2>
			<figure>
				<a href="images/Informatica_Unical.jpg">
				 <img class="img-thumbnail" src="images/Informatica_Unical.jpg">
				</a>
				<figcaption>La nostra segreteria studenti</figcaption>
			</figure>
			<a href="checkLogin">Login</a>
		</div>
	</header>
	<p align="center">
		Benvenuti nel portale di gestione delle <br> Segreterie Studenti.
	</p>
	<p align="center">
		Qui di seguito trovi le funzionalitÃ  previste dal portale. <br> <strong>
			Naviga tra i seguenti link </strong> per gestire le varie funzionalitÃ .
	</p>
	
	<nav class="navbar navbar-inverse" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Segreteria Studenti </a>
			</div>
			<ol class="nav navbar-nav">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Studenti <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="">Soli nominativi</a></li>
						<li><a href="contents/studentiNominativiIndirizzi.html">Nominativi
								e indirizzi</a></li>
						<li><a href="contents/studentiInfoComplete.html">Informazioni
								complete</a></li>
						<li><a href="tuttiStudenti">Info Complete Temporaneo DB</a></li>
						<li><a href="services/iscriviStudente.html">Iscrivi
								studente</a></li>
						<li><a href="services/isee.html">Calcolo ISEE</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Gruppi<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="contents/gruppi.html">Soli nominativi</a></li>
						<li><a href="contents/studentiPerGruppo.html">Studenti
								per gruppo</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Indirizzi<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="contents/indirizzi.html">Soli nominativi</a></li>
						<li><a href="contents/studentiPerIndirizzo.html">Studenti
								per indirizzo</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Corsi<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="contents/corsi.html">Solo nominativi</a></li>
						<li><a href="contents/corsiECorsiDiLaurea.html">Nominativi
								e corsi di laurea</a></li>
						<li><a href="contents/corsiConStudentiIscritti.html">Corsi
								e studenti iscritti</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Corsi di Laurea<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="contents/corsiDiLaurea.html">Nominativi e
								dipartimento</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Dipartimenti<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="contents/dipartimenti.html">Nominativi</a></li>
						<li><a href="contents/dipartimentiECorsiDiLaurea.html">Corsi
								di laurea</a></li>
					</ul></li>
			</ol>
		</div>
	</nav>

	<section id="unical" draggable="true">
		<div align="center">Vuoi vedere il portale dell'Unical?</div>
	</section>

	<section id="information">
		<article id="aboutUs">
			<header>
				<h1>Dicono di Noi</h1>
			</header>
			La Segreteria è un servizio di riferimento per informazione e
			procedure burocratiche riguarda all´immatricolazione, iscrizione,
			registrazione esami, richiesta e rilascia di certificati, gestione
			della didattica e delle laure. Ogni corso di Laurea ha la propria
			segreteria dove si può rivolgersi per qualsiasi informazione riguardo
			alla didattica dell'Ateneo.
		</article>
		<article id="ictCenter">
			<header>
				<h1>Centro ICT di Ateneo</h1>
			</header>
			Dalla pagina accessibile da <a
				href="http://www.unical.it/portale/strutture/centri/centroict/serviziict/homeservizicentro/"><strong>qui</strong></a>
			E' possibile accedere a tutti i servizi ed al Centro Customer
			Satisfaction (CCS) del Centro ICT d'Ateneo. E' possibile trovare il
			servizio desiderato sia attraverso degli elenchi di servizi
			organizzati secondo la tipologia di utenza sia attraverso la ricerca
			per parole chiave con un motore di ricerca locale google. Per ogni
			servizio è stata approntata una scheda descrittiva contenente tutte
			le informazioni sullo stesso. Dal CCS invece è possibile valutare,
			accedere alle statistiche d'uso o sporgere reclami sui servizi.
		</article>
	</section>

	<footer>
		<div align="right" draggable="true">
			<small> Sito Web realizzato per il corso Web Computing. <br>
				Contatta l'esercitatore a <a href="mailto:reale@dlvsystem.com">
					reale@dlvsystem.com </a>
			</small>
		</div>
	</footer>
</body>
</html>