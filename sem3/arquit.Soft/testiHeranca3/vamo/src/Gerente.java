public class Gerente extends Funcionario {
    private int departamento;
    private Data promocaoGerente;

    public Gerente(String nome, long cpf, Data nascimento, Data admissao, double salario, int departamento,
            Data promocaoGerente) {
        super(nome, cpf, nascimento, admissao, salario);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    public int getDepartamento() {
        return departamento;
    }

    public Data getPromocaoGerente() {
        return promocaoGerente;
    }

    @Override
    public String toString() {
        return "Gerente [Nome: "+getNome()+", departamento=" + departamento + ", promocaoGerente=" + promocaoGerente + ", Admissao()=" + getAdmissao() + ", Salario()=" + getSalario() + ", Cpf()="
                + getCpf() + ", Departamento()=" + getDepartamento() + "]";
    }

    



    
    
    
}
