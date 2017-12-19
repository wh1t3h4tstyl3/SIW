function Studente(matricola, nome, cognome, dataNascita, indirizzo) {
	this.matricola = matricola;
	this.nome = nome;
	this.cognome = cognome;
	this.dataNascita = dataNascita;
	this.indirizzo = indirizzo;

	this.info = function() {
		return this.matricola + ", " + this.nome + ", " + this.cognome + ", "
				+ this.dataNascita.toDateString() + ", " + this.indirizzo;
	}
}

function orderStudent(orderBy) {
	var studentRows = $("#allStudent");
	var studentTag = $("#allStudent .studente");

	var students = new Array();
	var size = studentTag.length;

	for (var i = 0; i < size; ++i) {
		var elementTd = studentTag.first();
		var element = elementTd.find("td").first();
		var matricola = element.text();
		element = element.next();
		var nome = element.text();
		element = element.next();
		var cognome = element.text();
		element = element.next();
		var dataNascita = element.text();
		element = element.next();
		var indirizzo = element.text();
		element = element.next();

		var student = new Studente(matricola, nome, cognome, new Date(
				dataNascita), indirizzo);
		students.push(student);

		studentTag = studentTag.next();
	}

	// if(students[0].matricola < students[1].matricola)
	// alert(students[1].matricola);
	// else
	// alert("minore");

	for (var i = 1; i < size; ++i) {
		for (var j = i; j > 0; j--) {
			var switchStudents = false;
			switch (orderBy) {
			case "nome":
				if(students[j].nome < students[j-1].nome)
					switchStudents = true;
				break;
			case "cognome":
				if(students[j].cognome < students[j-1].cognome)
					switchStudents = true;
				break;
			case "data":
				if(students[j].dataNascita < students[j-1].dataNascita)
					switchStudents = true;
				break;
			case "indirizzo":
				if(students[j].indirizzo < students[j-1].indirizzo)
					switchStudents = true;
				break;
			case "matricola":

			default:
				if(students[j].matricola < students[j-1].matricola)
					switchStudents = true;
				break;
			}
			if (switchStudents) {
				var tmp = students[j];
				students[j] = students[j - 1];
				students[j - 1] = tmp;
			}
		}
	}

	for (var i = 0; i < size; ++i) {
		alert(students[i].info());
	}

}