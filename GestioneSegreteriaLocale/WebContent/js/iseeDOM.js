function maschera(studente) {
	document.getElementById("selStudente").innerHTML = "<h4>" + studente.matricola + " - " + studente.nome + 
														" " + studente.cognome + "</h4>";
	var numComponenti = document.getElementById("numComponenti");
	numComponenti.addEventListener("blur", aggiungiRedditoPatrimonio);
}

function aggiungiRedditoPatrimonio() {
	var numComponenti = document.getElementById("numComponenti");
	var valori = document.getElementById("valori");
	numComp = numComponenti.value;

	svuota();
	
	for(var i = 0; i < numComp; i++) {
		var redd = document.createElement("div");
		redd.setAttribute("class", "form-group");
		redd.innerHTML = "<label>REDDITO del componente " + (i+1) +  " </label><input id='redditoComponente' type='text' class='form-control'/>";
		
		var patr = document.createElement("div");
		patr.setAttribute("class", "form-group");
		patr.innerHTML = "<label>PATRIMONIO del componente " + (i+1) +  " </label><input id='patrimonioComponente' type='text' class='form-control'/>";

		valori.appendChild(redd);
		valori.insertBefore(patr, redd.nextSibling);
	}
}

function svuota() {
	var valori = document.getElementById("valori");
	while (valori.hasChildNodes()) {   
	    valori.removeChild(valori.firstChild);
	}
}

function calcolaISEE() {
	alert("Inizio calcolo ISEE per lo studente " + studente.info());
	
	
	
	
	var numeroComponenti = numComp;
	var redditoComplessivo = 0;
	var patrimonioComplessivo = 0;
	var i = 0;
	for (i = 0; i < numeroComponenti; ++i) {
		//redditoComplessivo += 
		//patrimonioComplessivo = 
	}

	var ISR = redditoComplessivo;
	var ISP = patrimonioComplessivo;
	var ISE = ISR + ISP * 20 / 100;
	var scalaEquivalenza = {
		"1" : 1,
		"2" : 1.57,
		"3" : 2.04,
		"4" : 2.46,
		"5" : 2.85
	};

	var calcolaSE = function(numeroComponenti) {
		var SE = 0;
		if (numeroComponenti <= 5)
			SE = scalaEquivalenza[numeroComponenti];
		else
			SE = 2.85 + 0.2 * (numeroComponenti - 5);
		return SE;
	};
	
	var SE = calcolaSE(numeroComponenti);
	var ISEE = ISE / SE;
	var reportISEE = "Report ISEE calcolato\n";
	reportISEE += "Numero componenti: " + numeroComponenti + "\n";
	reportISEE += "Reddito complessivo: " + redditoComplessivo + "\n";
	reportISEE += "Patrimonio complessivo: " + patrimonioComplessivo + "\n";
	reportISEE += "Valore ISE: " + ISE + "\n";
	reportISEE += "Scala equivalenza: " + SE + "\n";
	reportISEE += "Valore ISEE: " + ISEE + "\n";
	alert(reportISEE);
}