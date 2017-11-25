function Studente(matricola, nome, cognome, dataNascita) {
	this.matricola = matricola;
	this.nome = nome;
	this.cognome = cognome;
	this.dataNascita = dataNascita;

	this.info = function() {
		return this.matricola + ", " + this.nome + ", " + this.cognome + ", "
				+ this.dataNascita;
	}
}

function calcola(studente) {

	alert("Inizio calcolo ISEE per lo studente " + studente.info());
	var numeroComponenti = prompt("Inserisci il numero dei componenti del nucleo familiare");
	var redditoComplessivo = 0;
	var patrimonioComplessivo = 0;
	var i = 0;
	for (i = 0; i < numeroComponenti; ++i) {
		redditoComplessivo += parseInt(prompt("Inserire il REDDITO del componente "
				+ (i + 1)));
		patrimonioComplessivo = parseInt(prompt("Inserire il PATRIMONIO del componente "
				+ (i + 1)));
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
