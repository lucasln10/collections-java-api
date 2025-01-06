package ordenacao;

public class Numeros implements Comparable<Numeros> {
	private int numero;
	
	
	public Numeros(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String toString() {
		return "numero = " + numero;
	}
	
	@Override
	public int compareTo(Numeros n) {
		// TODO Auto-generated method stub
		return Integer.compare(numero, n.getNumero());
	}

}
