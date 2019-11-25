package model;

public class Teste {

	public static void main(String[] args) {
		
		NumeroUm numero1 = new NumeroUm();
		numero1 = new Chaves(numero1);
		numero1 = new Parenteses(numero1);

		System.out.println(numero1.getAntes() + NumeroUm.imprimir() + numero1.getDepois());

	}
}
