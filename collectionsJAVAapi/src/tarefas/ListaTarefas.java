package tarefas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class ListaTarefas {
	Set<Tarefas> listaTarefa;
	Scanner sc = new Scanner(System.in);
	
	
	public ListaTarefas () {
		this.listaTarefa = new HashSet<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		Tarefas addtarefa = new Tarefas(descricao, false);
		listaTarefa.add(addtarefa);
	}
	
	public void removerTarefa(String descricao) {
		Tarefas removerTarefas = null;
		
		for (Tarefas t : listaTarefa) {
			if (t.getDescricao().equals(descricao)) {
				removerTarefas = t;
				break;
			}
			else {
				System.out.println("você não tem está tarefa entre a lista de tarefas? ");
			}
		}
		listaTarefa.remove(removerTarefas);
	}
	
	
	public void exibirTarefas() {
		System.out.println(listaTarefa);
	}
	
	public void contarTarefas() {
		System.out.println("quantidade de taferas: " + listaTarefa.size());
	}
	
	public void obterTarefasConcluidas() {
		for (Tarefas t : listaTarefa) {
			if (t.getTarefaFeita()) {
				System.out.println("tarefas concluidas: " + t);
				
			}
			
		}
	}
	
	public void obterTarefasPendentes() {
		for (Tarefas t : listaTarefa) {
			if (!t.getTarefaFeita()) {
				System.out.println("tarefas pendentes: " + t);
				
			}
		}
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefas t : listaTarefa) {
			if (t.getDescricao().equals(descricao) && !t.getTarefaFeita()) {
				t.setTarefaFeita(true);
				break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for (Tarefas t : listaTarefa) {
			if (t.getDescricao().equals(descricao)) {
				t.setTarefaFeita(false);
				break;
			}
		}
			
	}
	
	public void limparListaTarefas() {
		listaTarefa.removeAll(listaTarefa);
		
	}
	

	public static void main(String[] args) {
		ListaTarefas tarefa = new ListaTarefas();
		
		tarefa.adicionarTarefa("lavar a louça");
		tarefa.adicionarTarefa("limpar o chão");
		tarefa.adicionarTarefa("limpar o banheiro");
		tarefa.adicionarTarefa("limpar os vidros");
		tarefa.exibirTarefas();
		tarefa.contarTarefas();
		
		tarefa.marcarTarefaConcluida("lavar a louça");
		tarefa.marcarTarefaConcluida("limpar os vidros");
		
		tarefa.marcarTarefaPendente("lavar o banheiro");
		tarefa.marcarTarefaPendente("limpar o chão");
		
		tarefa.obterTarefasConcluidas();
		tarefa.obterTarefasPendentes();
		
		tarefa.limparListaTarefas();
		tarefa.exibirTarefas();
	}
	
	
}