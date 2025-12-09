public class Pessoa {
    private String nome, telefone;
    private int id;
    private static int proximoId = 1;


    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = proximoId++;
    }



    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public int getId() {
        return id;
    }
    public static int getProximoId() {
        return proximoId;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static void setProximoId(int proximoId) {
        Pessoa.proximoId = proximoId;
    }

    
}
