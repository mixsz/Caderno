public class Funcionario extends Pessoa{
    private Data admissao;
    private double salario;

    public Funcionario(String nome, long cpf, Data nascimento, Data admissao, double salario) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public Data getAdmissao() {
        return admissao;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario [Nome: "+ getNome()+", admissao=" + admissao + ", salario=" + salario + ", Cpf()="
                + getCpf() + ", Nascimento()=" + getNascimento() + "]";
    }

    

    
}
