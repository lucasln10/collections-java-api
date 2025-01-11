package list;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<NumerosInteiros> numerosInt;
	
	public SomaNumeros () {
		this.numerosInt = new ArrayList<>();
	}
	public void adicionarNumero(int numero) {
		NumerosInteiros numb = new NumerosInteiros(numero);
		numerosInt.add(numb);
	}
	public void calcularSoma() {
		int valor = 0;
		for (NumerosInteiros numero : numerosInt) {
	        valor += numero.getNumero();
		}
		/*for (int i = 0; i < numerosInt.size(); i++) {
			valor += numerosInt.get(i);
		}*/
		System.out.println("o valor total da soma é " + valor);
	}
	public void encontrarMaiorNumero() {
		int numeroAtual = 0;
		for (NumerosInteiros n : numerosInt) {
			if (n.getNumero() > numeroAtual) {
				numeroAtual = n.getNumero();
			}
		}
		System.out.println("O maior numero é: " + numeroAtual);
	}
	public void encontrarMenorNumero() {
		int numeroAtual = numerosInt.size();
		for (NumerosInteiros n : numerosInt) {
			if (n.getNumero() < numeroAtual) {
				numeroAtual = n.getNumero();
			}
		}
		System.out.println("O menor numero é: " + numeroAtual);
	}
	public void exibirNumeros() {
		System.out.println("todos os numeros encontrados foram: " + numerosInt);
	}
	
	
	public static void main(String[] args) {
		SomaNumeros numero = new SomaNumeros();
		numero.adicionarNumero(15);
		numero.adicionarNumero(20);
		numero.adicionarNumero(58);
		numero.adicionarNumero(101);
		numero.adicionarNumero(523);
		numero.exibirNumeros();
		
		numero.calcularSoma();
		
		
		numero.encontrarMaiorNumero();
		numero.encontrarMenorNumero();
		
	}
	
}

