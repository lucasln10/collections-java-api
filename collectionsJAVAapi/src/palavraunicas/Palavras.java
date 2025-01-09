package palavraunicas;

import java.util.Objects;
import java.util.Set;

public class Palavras {
	private String palavrasUnicas;
	
	public Palavras(String palavrasUnicas) {
		this.palavrasUnicas = palavrasUnicas;
	}
	
	public String getPalavrasUnicas() {
		return palavrasUnicas;
	}
	



	@Override
	public int hashCode() {
		return Objects.hash(palavrasUnicas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Palavras)) {
			return false;
		}
		Palavras other = (Palavras) obj;
		return Objects.equals(palavrasUnicas, other.palavrasUnicas);
	}

	@Override
	public String toString() {
		return "As palavras são " + palavrasUnicas; 
	}
}
