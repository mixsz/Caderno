public class Vereador extends Politico {
    private String municipio;

    public Vereador() {
    }

    public Vereador(String nome, String partido, String estado, String municipio) {
        super(nome, partido, estado, "Vereador");
        this.municipio = municipio;
    }

    void apresentacao(){
        System.out.printf("Nome: %s - Partido: %s (%s) - Funcao: %s - Muni: %s",nome,partido,estado,funcao,municipio);
    }

    
}
