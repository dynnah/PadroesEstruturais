package model;

public abstract class Decorator extends NumeroUm {
	NumeroUm numero;

	public Decorator(NumeroUm umNumero) {
		numero = umNumero;
	}

	public String getAntes() {
		return numero.getAntes() + antes; 

	}

	public String getDepois() {
		return numero.getDepois() + depois; 
	}

}
