package model;

public class Arquivo extends Item {
	private String nome;
	private int tamanho;
	
	public Arquivo(String nome, int tamanho) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void exibir() {
		System.out.println("Arquivo: " + nome + " Tamanho: " + tamanho);
	}
	
}
