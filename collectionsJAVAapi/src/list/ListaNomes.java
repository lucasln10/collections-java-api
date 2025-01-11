package list;

import java.util.ArrayList;
import java.util.List;

public class ListaNomes {
	private List<Nomes> listaNomes;
	
	public ListaNomes(){
		this.listaNomes = new ArrayList<>();
	}
	
	public void adicionarNome(String nomes) {
		Nomes nome = new Nomes(nomes);
		listaNomes.add(nome);
	}
	public void removerNome (String nome) {
		List<Nomes> removerNome = new ArrayList<>();
		if (!listaNomes.isEmpty()) {
		for (Nomes n : listaNomes) {
			if (n.getListaNomes().equalsIgnoreCase(nome)) {
				removerNome.add(n);
			}
		}
		listaNomes.removeAll(removerNome);
		}
	}
	public void verificarNome (String nomes) {
		if (nomes.isEmpty()) {
			System.out.println("Escreva um nome valido: ");
		}
		else if (nomes instanceof String) {
			System.out.println("seu nome é " + nomes);
		}
		else {
			System.out.println("nome não está valido ");
		}
	}
	public void obterTodoNomes() {
		System.out.println("os nomes são " + listaNomes);
	}
	
	public static void main(String[] args) {
		ListaNomes names = new ListaNomes();
		
		names.adicionarNome("hershell");
		names.adicionarNome("hershell 01");
		names.adicionarNome("hershell 02");
		names.obterTodoNomes();
		
		names.removerNome("hershell 02");
		names.obterTodoNomes();
		names.verificarNome("");
		names.obterTodoNomes();
		
		
		
		
		
	}
}
