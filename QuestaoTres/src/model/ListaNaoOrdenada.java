package model;

public class ListaNaoOrdenada extends Lista{
	
	public ListaNaoOrdenada(ListaImplementada l) {
		super(l);
	}
	
	public void adicionar(String s) {
		lista.add(s);
	}
	
	public void imprimir() {
		for (String nome : lista) {
			System.out.print(nome + listaimplementada.imprimir());
			
		}
	}
	
}
