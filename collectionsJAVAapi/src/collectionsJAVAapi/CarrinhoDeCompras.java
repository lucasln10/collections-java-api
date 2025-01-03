package collectionsJAVAapi;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listaItens;
	
	public CarrinhoDeCompras() {
		this.listaItens = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.listaItens.add(item);
	}
	@SuppressWarnings("unlikely-arg-type")
	public void removerItem(String nome) { 
		this.listaItens.remove(nome);
	}
	public void calcularValorTotal() {
		double total = 0.0;
		
		for (Item item : listaItens) {
			total  = item.getPreco() * item.getQuantidade();
		}
	}
	public void exibirItens() {
		for(Item i : listaItens) {
			System.out.println(i);
		}
	}
	
}
