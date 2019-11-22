package view;

import model.*;

public class ProgramaItem {

	public static void main(String[] args) {
		
		Pasta p1 = new Pasta("Pasta 1");
		Pasta p2 = new Pasta("Pasta 2");
		Pasta p3 = new Pasta("Pasta 3");
		Arquivo a1 = new Arquivo("Arquivo 1", 15);
		Arquivo a2 = new Arquivo("Arquivo 2", 30);
		Arquivo a3 = new Arquivo("Arquivo 3", 60);
		Arquivo a4 = new Arquivo("Arquivo 4", 120);
		Arquivo a5 = new Arquivo("Arquivo 5", 240);

		p1.inserir(a1);
		p1.inserir(p2);
		p2.inserir(a2);
		p1.inserir(a3);
		p2.inserir(p3);
		p3.inserir(a4);
		p3.inserir(a5);
		
		
		p1.exibir();
		//p2.exibir();
		//p3.exibir();
		
	}

}
