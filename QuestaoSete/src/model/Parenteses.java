package model;

public class Parenteses extends Decorator {
	public Parenteses(NumeroUm umNumero){
		super(umNumero);
		antes = "(";
		depois = ")";
	}
}
