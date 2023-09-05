public class Tarefa {
    //satributo
    private String descricao;

    //construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    //metodos
    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
