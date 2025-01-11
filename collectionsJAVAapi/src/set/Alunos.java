package set;

public class Alunos {
	private String nome;
	private long matricula;
	private double nota;
	
	public Alunos (String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public long getMatricula() {
		return matricula;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	
	@Override
	public String toString() {
		return "aluno: " + nome + ". matricula: " + matricula + ". nota:" + nota ;
	}
}
