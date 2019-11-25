package model;

public class Colchetes extends Decorator {

	public Colchetes(NumeroUm umNumero) {
		super(umNumero);
		antes = "[";
		depois = "]";
	}

}
