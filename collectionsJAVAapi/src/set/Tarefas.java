package set;


public class Tarefas {
	private String descricao;
	private boolean tarefaFeita;
	
	public Tarefas (String descricao, boolean tarefaFeita) {
		this.descricao = descricao;
		this.tarefaFeita = false;
	}
	
	public void setTarefaFeita(boolean tarefaFeita) {
		this.tarefaFeita = tarefaFeita;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean getTarefaFeita () {
		return tarefaFeita;
	}
	
	@Override
	public String toString() {
	return  "tarefa: " + descricao + ". Concluida: " + tarefaFeita;
	}
}
