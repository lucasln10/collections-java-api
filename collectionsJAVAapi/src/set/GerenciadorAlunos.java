package set;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
	private Set<Alunos> escola;
	
	public GerenciadorAlunos () {
		this.escola = new HashSet<>();
		
	}
	
	public void adicionarAluno(String nome, long matricula, double media) {
		Alunos alunoExistente = buscarAlunoPorMatricula(matricula);
		if (alunoExistente != null) {
			System.out.println("esta matricula " + matricula + " já existe");			
		}
		else if (media < 8) {
			System.out.println("sua nota não atinge os padrões exigidos para está escola");
		}
		else {
			escola.add(new Alunos(nome, matricula, media));
		}
	}
	
	
	public void removerAluno(long matricula) {
		Alunos verificarAluno = buscarAlunoPorMatricula(matricula);
		Alunos removerAluno = null;
			if (verificarAluno != null) {
				removerAluno = verificarAluno;
			}
			escola.remove(removerAluno);
		}
	
	
	public void exibirAlunosPorNome() {
		for (Alunos a : escola) {
			String nomes = a.getNome();
			System.out.println("nome do aluno " + nomes);
		}
	}
	
	
	public void exibirAlunosPorNota() {
		for (Alunos a : escola) {
		 int notas = (int) a.getNota();
			System.out.println("nota do aluno " + notas);
		}
	}
	
	
	public void exibirAlunos() {
		System.out.println(escola);
	}
	
	
	//metodo para verificar se a matricula já exite
	private Alunos buscarAlunoPorMatricula(long matricula) {
		for (Alunos aluno : escola) {
		    if (aluno.getMatricula() == matricula) {
		       return aluno;
		    }
		}
		return null; // Retorna null se não encontrar o aluno
	}
	
	
	
	public static void main(String[] args) {
		GerenciadorAlunos aluno = new GerenciadorAlunos();
		
		aluno.adicionarAluno("Davi", 12345, 8);
		aluno.adicionarAluno("julio", 123456, 7);
		aluno.adicionarAluno("Davi", 12345, 8);
		aluno.adicionarAluno("manuela", 1234567, 9);
		
		aluno.exibirAlunos();
		
		aluno.removerAluno(1234567);
		
		aluno.exibirAlunos();
		
		aluno.exibirAlunosPorNota();
		aluno.exibirAlunosPorNome();
		
	}
	
}
