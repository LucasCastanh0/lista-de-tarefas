import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributos
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefalist) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Tarefa ");
        System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefa();


    }
}
