package list;

public class NumerosInteiros {
	private int numero;
	
	public NumerosInteiros(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public String toString() {
		return String.format("%d", numero);
	}

}