package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		String livroRemover = null;
		for (Map.Entry<String, Livro> livro : livraria.entrySet()) {
			if (livro.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				livroRemover = livro.getKey();
				break;
			}
		}	
		if (livroRemover != null) {
	        livraria.remove(livroRemover);
	        System.out.println("Livro removido com sucesso: " + titulo);
	    } else {
	        System.out.println("Não temos este livro em nossas prateleiras.");
	    }
	}
	
	
	public void exibirLivrosOrdenadosPorPreco() {
		List<Livro> ordenadorPorPreco = livraria.values().stream().sorted(Comparator.comparingDouble(Livro::getPreco)).collect(Collectors.toList());
		
		for (Livro livro : ordenadorPorPreco) {
			System.out.println(livro);
		}
	}
	
	
	public void pesquisarLivrosPorAutor(String autor) {
			boolean encontrou = false;
				for (Livro livro : livraria.values()) {
					if (livro.getAutor().equalsIgnoreCase(autor)) {
						System.out.println(livro.getTitulo());
						encontrou = true;
					}
				}
				
				if (!encontrou) {
			        System.out.println("Nenhum livro encontrado para o autor: " + autor);
			    }
		
	}
	
	
	public void obterLivroMaisCaro() {
		 // Encontrar o livro mais caro usando Stream e max()
	    Livro livroMaisCaro = livraria.values().stream().max(Comparator.comparingDouble(Livro::getPreco)).orElse(null); // Retorna null se o Map estiver vazio

	    // Exibir o resultado
	    if (livroMaisCaro != null) {
	        System.out.println("O livro mais caro é: " + livroMaisCaro.getTitulo() +
	                           " com o valor de: R$ " + livroMaisCaro.getPreco());
	    } else {
	        System.out.println("Não há livros na livraria.");
	    }
		
	}
	
	
	public void exibirLivroMaisBarato() {
		Livro livroMaisBarato = livraria.values().stream().min(Comparator.comparingDouble(Livro::getPreco)).orElse(null); // Retorna null se o Map estiver vazio

	    // Exibir o resultado
	    if (livroMaisBarato != null) {
	        System.out.println("O livro mais barato é: " + livroMaisBarato.getTitulo() + " com o valor de: R$ " + livroMaisBarato.getPreco());
	    } else {
	        System.out.println("Não há livros na livraria.");
	    }
	}
	
	
	public static void main(String[] args) {
		LivrariaOnline livros = new LivrariaOnline();
		
		livros.adicionarLivro("001", "O Senhor dos Anéis", "J.R.R. Tolkien", 59.90);
		livros.adicionarLivro("002", "1984", "George Orwell", 39.90);
		livros.adicionarLivro("003", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 29.90);
		livros.adicionarLivro("004", "A Revolução dos Bichos", "George Orwell", 19.90);
		
		livros.exibirLivrosOrdenadosPorPreco();
		
		livros.exibirLivroMaisBarato();
		livros.obterLivroMaisCaro();
		
		livros.pesquisarLivrosPorAutor("jose");
		livros.removerLivro("A Revolução dos Bichos");
		
		livros.exibirLivroMaisBarato();
	}
		
}
