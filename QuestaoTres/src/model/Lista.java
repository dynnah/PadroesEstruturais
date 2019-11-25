package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Lista {
		protected ListaImplementada listaimplementada;
		protected List<String> lista = new ArrayList<String>();
		
		public Lista(ListaImplementada lista) {
			this.listaimplementada = lista;
		}

		public abstract void imprimir();
		public abstract void adicionar(String s);
		
}
