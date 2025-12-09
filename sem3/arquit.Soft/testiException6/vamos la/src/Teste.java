import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa;
        int idade = 0;
        String cpf = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Nome");
        String nome = input.nextLine();
        System.out.println("Sobrenome");
        String sobrenome = input.nextLine();
        System.out.println("Idade");
        while(true){
            try{
                idade = input.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Idade inválida!");
                input.nextLine();
            }
        }
        input.nextLine();
        System.out.println("CPF");
        while (true) {     
            try{
                cpf = input.nextLine();
                Pessoa.verifica_CPF(cpf);
                break;
            }
            catch(Exception e){
                System.out.println("\nErro encontrado!\n"+e.getMessage());
                System.out.println("Digite novamente...");
            }
        }
        pessoa = new Pessoa(nome, sobrenome, idade, cpf);
        input.close();
      
        System.out.println("Pessoa criada");
        System.out.println(pessoa.getNome()+" "+pessoa.getSobrenome());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println("CPF: "+pessoa.getCpf());
    }
}
