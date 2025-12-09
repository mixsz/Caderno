public class Estudante {
    private String nome, sobrenome;
    private int identificador;
    public static int proximoId = 1;


    public Estudante(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = proximoId++;
    }
    



    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public int getIdentificador() {
        return identificador;
    }
    public static int getProximoId() {
        return proximoId;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public static void setProximoId(int proximoId) {
        Estudante.proximoId = proximoId;
    }
    
    
    
}
