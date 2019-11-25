package model;

import java.util.Collections;

public class ListaOrdenada extends Lista {
	
	public ListaOrdenada(ListaImplementada l) {
		super(l);
	}
	
	public void adicionar(String s) {
		lista.add(s);
		Collections.sort(lista);
	}
	
	public void imprimir() {
		for (String s : lista) {
			System.out.println(listaimplementada.imprimir() + s);
			
		}
	}

}
