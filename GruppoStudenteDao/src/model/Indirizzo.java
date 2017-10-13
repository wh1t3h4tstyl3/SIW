package model;

public class Indirizzo {
	
	private Long codice;
	private String nome;
	
	public Indirizzo() {
	
	}
	
	public Indirizzo(Long codice, String nome) {
		this.codice = codice;
		this.nome = nome;
	}

	public Long getCodice() {
		return codice;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
//	public int hashCode(){
//		return this.codice.hashCode() ^ this.codice.hashCode();
//	}
//	
//	public boolean equals(Object object) {
//		Indirizzo indirizzo = (Indirizzo)object;
//		return (this.getCodice() == indirizzo.getCodice() && this.getNome() == indirizzo.getNome());
//	}

	public String toString() {
		return "[" + this.getCodice() + ", " + 
			this.getNome() +"]"; 		
	}
}
