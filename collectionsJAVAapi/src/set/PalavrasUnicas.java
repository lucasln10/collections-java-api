package set;

import java.util.HashSet;
import java.util.Set;


public class PalavrasUnicas {
	  private Set<String> palavrasUnicasSet;

	  public PalavrasUnicas() {
	    this.palavrasUnicasSet = new HashSet<>();
	  }

	  public void adicionarPalavra(String palavra) {
	    palavrasUnicasSet.add(palavra);
	  }

	  public void removerPalavra(String palavra) {
	    if (!palavrasUnicasSet.isEmpty()) {
	      if (palavrasUnicasSet.contains(palavra)) {
	        palavrasUnicasSet.remove(palavra);
	      } else {
	        System.out.println("Palavra não encontrada no conjunto!");
	      }
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }

	  public boolean verificarPalavra(String palavra) {
	    return palavrasUnicasSet.contains(palavra);
	  }

	  public void exibirPalavrasUnicas() {
	    if(!palavrasUnicasSet.isEmpty()) {
	      System.out.println(palavrasUnicasSet);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }

	  public static void main(String[] args) {
	    PalavrasUnicas conjuntoLinguagens = new PalavrasUnicas();

	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    conjuntoLinguagens.exibirPalavrasUnicas();

	   
	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();

	   
	    conjuntoLinguagens.removerPalavra("Swift");

	    // Verificando se uma linguagem está no conjunto
	    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
	    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

	    // Exibindo as linguagens únicas atualizadas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();
	  }
}
