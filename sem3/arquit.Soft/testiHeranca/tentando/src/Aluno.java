public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String sobrenome, int idade, String curso) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }
    

    public Aluno() {
        super("", "", 0);
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    void print(){
        System.out.println("Nome: " + nome + " " + sobrenome + " - " + idade + " anos - " + curso);
    }
    
}
