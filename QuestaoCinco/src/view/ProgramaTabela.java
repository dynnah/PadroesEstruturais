package view;

import model.*;

public class ProgramaTabela {

	public static void imprimir() {
		ConteudoComposto c = new ConteudoComposto();

		Tabela t1 = new Tabela();
		Linha l1 = new Linha();
		Celula c1 = new Celula("testecomquinze1");
		Linha l2 = new Linha();
		Celula c2 = new Celula("testecomquinze2");
		Linha l3 = new Linha();
		Celula c3 = new Celula("testecomquinze3");

		c.adicionarC(t1);
		c.adicionarC(l1);
		c.adicionarC(c1);
		c.adicionarC(l2);
		c.adicionarC(c2);
		c.adicionarC(l3);
		c.adicionarC(c3);


		c.imprimir();
	}

	public static void main(String[] args) {
		imprimir();

	}
}
