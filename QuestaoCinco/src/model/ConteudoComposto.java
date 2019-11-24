package model;

import java.util.ArrayList;

public class ConteudoComposto extends Conteudo {
	ArrayList lista = new ArrayList();

	public ConteudoComposto() {
		super();
	}

	public void imprimir() {
		System.out.println("\nTabela Impressa: ");
		for (int i =0; i<this.lista.size(); i++){
			Conteudo c = (Conteudo)lista.get(i);
			c.imprimir();
		}

	}

	public void adicionarC(Conteudo c) {
		System.out.println("Conteúdo adicionado");
		lista.add(c);

	}

	public void remover(int i) {
		System.out.println("Conteúdo " +i+ " apagado!");
		lista.remove(i);
	}

}
