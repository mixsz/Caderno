public class Professor extends Agente{
    private String escola;
    
    public Professor(String nome, String profissao, boolean modo_agente, String escola) {
        super(nome, profissao, modo_agente);
        this.escola = escola;

    }

    public Professor() {
    }

    public void apresentacao(){
        System.out.println("Nome: " + nome + ", profissão: "+ profissao + ", escola: "+ escola);
        if(modo_agente){
            System.out.println("AGENTE SMITH!");
        }
    }
    public void modo_agente_on(){
        modo_agente = true;
    }


}