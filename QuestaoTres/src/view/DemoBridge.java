package view;

import model.*;

public class DemoBridge {
	
	public static void main(String[] args) {
		Lista lista = new ListaOrdenada(new Letra());
		lista.adicionar("Teste");
		
		Lista lista1 = new ListaOrdenada(new Marcador());
		lista1.adicionar("Teste");
		
		Lista lista2 = new ListaOrdenada(new Numero());
		lista2.adicionar("Teste");
		
		Lista lista3 = new ListaNaoOrdenada(new Letra());
		lista3.adicionar("Teste");
		
		lista.imprimir();
		lista1.imprimir();
		lista2.imprimir();
		lista3.imprimir();
		
	}


}
