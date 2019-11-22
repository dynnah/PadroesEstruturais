package view;
import model.*;

public class DemoBridge {

	public static void main(String[] args) {
		
		AbstracaoTamanho refrigerante = new TamanhoPequeno(new Guarana());
		refrigerante.beber();
				
		refrigerante = new TamanhoMedio(new CocaCola());
		refrigerante.beber();
				
		refrigerante = new TamanhoGrande(new Pepsi());
		refrigerante.beber();
		
	}

}
