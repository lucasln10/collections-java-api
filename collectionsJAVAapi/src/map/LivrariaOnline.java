package map;

import java.util.HashMap;
import java.util.Map;

public class LivrariaOnline {
	private Map<String, Livro> livraria;
	public LivrariaOnline() {
		this.livraria = new HashMap<>();
	}
	
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		Livro livro = new Livro(titulo, autor, preco);
		livraria.put(link, livro);
	}
	
	
	public void removerLivro(String titulo) {
		
	}
	
	
	public void exibirLivrosOrdenadosPorPreco() {
		
	}
	
	
	public void pesquisarLivrosPorAutor(String autor) {
		
	}
	
	
	public void obterLivroMaisCaro() {
		
	}
	
	
	public void exibirLivroMaisBarato() {
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
