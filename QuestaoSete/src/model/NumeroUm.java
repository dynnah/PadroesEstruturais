package model;

public class NumeroUm {
	public String antes;
	public String depois;

	public NumeroUm() {
		super();
		this.antes = "";
		this.depois = "";
	}

	public String getAntes() {
		return antes;
	}

	public void setAntes(String antes) {
		this.antes = antes;
	}

	public String getDepois() {
		return depois;
	}

	public void setDepois(String depois) {
		this.depois = depois;
	}

	public static String imprimir() {
		return "1";
	}
	
}
