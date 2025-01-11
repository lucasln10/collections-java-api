package map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private Map<String, Integer> palavras;

	public ContagemPalavras() {
		this.palavras = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		palavras.put(palavra, contagem);
	}
	
	
	public void removerPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			if (palavras.containsKey(palavra)) {
				palavras.remove(palavra);
			}else {
				System.out.println("Não consigo encontrar esta palavra");
			}
		}else {
			System.out.println("Está lista está vazia");
		}
	}
	
	
	public void exibirContagemPalavras() {
		if (palavras.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Contagem de palavras:");
            for (Map.Entry<String, Integer> p : palavras.entrySet()) {
                System.out.println("Palavra: " + p.getKey() + ", Contagem: " + p.getValue());
            }
        }
	}

	
	public void encontrarPalavraMaisFrequente() {
		if (palavras.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
		}
		 String palavraMaisFrequente = null;
	        int maiorFrequencia = 0;

	        for (Map.Entry<String, Integer> p : palavras.entrySet()) {
	            if (p.getValue() > maiorFrequencia) {
	                maiorFrequencia = p.getValue();
	                palavraMaisFrequente = p.getKey();
	            }
	        }

	        System.out.println("Palavra mais frequente: " + palavraMaisFrequente + " (Frequência: " + maiorFrequencia + ")");
	}
	
	
	
	public static void main(String[] args) {
		ContagemPalavras contagem = new ContagemPalavras();
		
		contagem.adicionarPalavra("faca", 5);
		contagem.adicionarPalavra("garfo", 7);
		contagem.adicionarPalavra("short", 6);
		contagem.exibirContagemPalavras();
		contagem.encontrarPalavraMaisFrequente();
		
		contagem.removerPalavra("faca");
		contagem.exibirContagemPalavras();
		contagem.encontrarPalavraMaisFrequente();
		
	}
	
}
