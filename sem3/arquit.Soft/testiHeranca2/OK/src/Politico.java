public class Politico {
    protected String nome, partido, estado, funcao;

    public Politico() {
    }
    

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }


    void apresentacao(){
        System.out.printf("Nome: %s - Partido: %s (%s) - Funcao: %s",nome,partido,estado,funcao);
    }
}
