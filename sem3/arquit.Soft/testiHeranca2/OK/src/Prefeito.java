public class Prefeito extends Politico{
    private String municipio;

    public Prefeito(String municipio) {
        this.municipio = municipio;
    }

    public Prefeito(String nome, String partido, String estado, String municipio) {
        super(nome, partido, estado, "Prefeito");
        this.municipio = municipio;
    }

    void apresentacao(){
        System.out.printf("Nome: %s - Partido: %s (%s) - Funcao: %s - Muni: %s",nome,partido,estado,funcao,municipio);
    }
}
