public class Empresario extends Agente {
    private String empresa;   

    
    public Empresario(String nome, String profissao, boolean modo_agente, String empresa) {
        super(nome, profissao, modo_agente);
        this.empresa = empresa;
    }

    public Empresario() {
    }


    public void apresentacao(){
        System.out.println("Nome: " + nome + ", profissão: "+ profissao + ", empresa: "+ empresa);
        if(modo_agente){
            System.out.println("AGENTE SMITH!");
        }
    }

    public void modo_agente_on() {
        modo_agente = true;
    }
}
