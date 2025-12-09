abstract class Agente {
    protected String nome, profissao;
    protected boolean modo_agente;

    abstract void apresentacao();
    abstract void modo_agente_on();
    public Agente(String nome, String profissao, boolean modo_agente) {
        this.nome = nome;
        this.profissao = profissao;
        this.modo_agente = modo_agente;
    }
    public Agente() {
    }

    
}
