package view;

import model.*;

public class ProgramaItem {

	public static void main(String[] args) {
		
		Pasta p1 = new Pasta("Pasta 1");
		Pasta p2 = new Pasta("Pasta 2");
		Pasta p3 = new Pasta("Pasta 3");
		Pasta p4 = new Pasta("Pasta 4");
		Arquivo a1 = new Arquivo("Arquivo 1", 5);
		Arquivo a2 = new Arquivo("Arquivo 2", 10);
		Arquivo a3 = new Arquivo("Arquivo 3", 15);
		Arquivo a4 = new Arquivo("Arquivo 4", 20);
		Arquivo a5 = new Arquivo("Arquivo 5", 25);
		Arquivo a6 = new Arquivo("Arquivo 6", 30);

		p1.inserir(a1);
		p1.inserir(p2);
		p2.inserir(a2);
		p1.inserir(a3);
		p2.inserir(p3);
		p3.inserir(a4);
		p3.inserir(a5);
		p3.inserir(p4);
		p4.inserior(a6);
		
		
		p1.exibir();
		//p2.exibir();
		//p3.exibir();
		//p4.exibir();
		
	}

}
