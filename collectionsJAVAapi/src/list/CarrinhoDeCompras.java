package list;

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
			total += item.getPreco() * item.getQuantidade();
		}
		System.out.println(total);
	}
	public void exibirItens() {
		System.out.println("os itens comprados foram: " + listaItens);
		/*for(Item i : listaItens) {
			System.out.println(i);
		}*/
	}
	public static void main(String[] args) {
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		compras.adicionarItem("nescau", 10.98, 2);
		compras.adicionarItem("arroz", 32.85, 3);
		compras.adicionarItem("feijao", 30.85, 3);
		
		compras.exibirItens();
		
		
	}
	
}
