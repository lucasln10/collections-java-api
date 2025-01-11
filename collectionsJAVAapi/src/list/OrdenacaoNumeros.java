package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Numeros> numeroInt;
	
	public OrdenacaoNumeros() {
		this.numeroInt = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
		Numeros numb = new Numeros(numero);
		numeroInt.add(numb);
	}
	
	public List<Numeros> ordenarAscendente() {
		List<Numeros> numeroAscendente = new ArrayList<Numeros>(numeroInt);
		Collections.sort(numeroAscendente);
		return numeroAscendente;
	}
	
	public List<Numeros> ordenarDescendente() {
		List<Numeros> numeroAscendente = new ArrayList<Numeros>(numeroInt);
		Collections.sort(numeroAscendente, Collections.reverseOrder());
		return numeroAscendente;
	}
	

	
	
	
	
	public static void main(String[] args) {
		OrdenacaoNumeros numbers = new OrdenacaoNumeros();
		
		numbers.adicionarNumero(1);
		numbers.adicionarNumero(2);
		numbers.adicionarNumero(3);
		numbers.adicionarNumero(4);
		numbers.adicionarNumero(5);
		numbers.adicionarNumero(6);
		System.out.println(numbers.ordenarAscendente());
		System.out.println(numbers.ordenarDescendente());
		
	}
}
