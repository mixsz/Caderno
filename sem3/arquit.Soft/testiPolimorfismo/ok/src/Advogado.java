public class Advogado extends Agente{
    private String OAB;

    public Advogado(String nome, String profissao, boolean modo_agente, String oAB) {
        super(nome, profissao, modo_agente);
        this.OAB = oAB;
    }

    public Advogado() {
    }

    public void apresentacao(){
        System.out.println("Nome: " + nome + ", profissão: "+ profissao + ", OAB: "+ OAB);
        if(modo_agente){
            System.out.println("AGENTE SMITH!");
        }

    }

    public void modo_agente_on() {
        modo_agente = true;
    }

    
}
