package model;

public class Chaves extends Decorator {
	public Chaves(NumeroUm umNumero){
		super(umNumero);
		antes = "{";
		depois = "}";
	}
}
