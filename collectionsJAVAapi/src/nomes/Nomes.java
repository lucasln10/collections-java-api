package nomes;

public class Nomes {
	private String nomes;
	
	public Nomes(String nomes) {
		this.nomes = nomes;
	}
	
	public String getListaNomes() {
		return nomes;
	}
	
	@Override
	public String toString() {
		return nomes;
	}
}
