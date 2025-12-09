public class Pessoa {
    String nome, sobrenome, cpf;
    int idade;
    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf; 
    }   

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public static void verifica_CPF(String cpf) throws Exception{
        for(int i=0;i<cpf.length();i++){
            if(cpf.charAt(i)=='-' || cpf.charAt(i)=='.'){
                throw new ErroCPF("O CPF contém hífen (-) e/ou ponto (.)!");
            }
        }
    }

    
}
