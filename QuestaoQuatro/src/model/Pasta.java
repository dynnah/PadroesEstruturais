package model;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Item {
	private String nome;
	private List<Item> itens;
	
	public Pasta(String nome) {
		this.nome = nome;
		this.itens = new ArrayList<Item>();
	}
	
	public void inserir(Item it) {
		itens.add(it);
	}
	
	public void remover(Item it) {
		itens.remove(it);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void exibir() {
		System.out.println("Pasta: " + nome);
		for (int i = 0; i < this.itens.size(); i++){
			Item it = (Item)itens.get(i);
			it.exibir();
		}
	}
	
}

