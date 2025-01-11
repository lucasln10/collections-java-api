package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionario;

	public Dicionario() {
		this.dicionario = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		if (!dicionario.isEmpty()) {
			System.out.println("Estas são as palavras e suas definições: " + dicionario);
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String retorno = null;
		if (!dicionario.isEmpty()) {
			retorno = dicionario.get(palavra);
		}
		return retorno;
}
	
	public static void main(String[] args) {
		Dicionario burro = new Dicionario();
		
		burro.adicionarPalavra("Caderno", "Objeto utilizado para escrita");
		burro.adicionarPalavra("Faca", "instrumento constituído por lâmina cortante presa a um cabo");
		burro.adicionarPalavra("Átomo", "Os átomos são parcelas muito pequenas da matéria, tão pequenas que não podem ser enxergadas com microscópios comuns. Sua estrutura é formada por um núcleo infinitamente pequeno e denso, composto por prótons e nêutrons e por uma eletrosfera composta por elétrons.");
		burro.exibirPalavras();
		
		burro.adicionarPalavra("Papel", "substância constituída por elementos fibrosos de origem vegetal, os quais formam uma pasta que se faz secar sob a forma de folhas delgadas, para diversos fins: escrever, imprimir, embrulhar");
		burro.removerPalavra("Faca");
		burro.exibirPalavras();
		
		System.out.println(burro.pesquisarPorPalavra("Átomo"));
		
	}
	
	

}
