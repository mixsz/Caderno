import java.util.ArrayList;
import java.util.Scanner;

public class TestePessoa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Pessoa> p = new ArrayList<>();
        char resp;
        String nomeLocal, telefoneLocal;
        while (true){
            resp = '0'; // reseta resp
            System.out.println("r: Registrar pessoa");
            System.out.println("d: Deletar pessoa");
            System.out.println("i: Imprime agenda");
            System.out.println("s: Sair\n");    

            while(resp != 'r' && resp != 'd' && resp != 'i' && resp != 's'){
                System.out.printf("Digite a opção: ");
                resp = input.nextLine().charAt(0);
                resp = Character.toLowerCase(resp); // deixa minusculo
            }

            if (resp == 'r'){ // cria pessoa
                System.out.printf("Nome: ");
                nomeLocal = input.nextLine();
                nomeLocal = nomeLocal.substring(0,1).toUpperCase() + nomeLocal.substring(1);
    //                               comeca no indice 0 e termina no 1(sem incluir o 1) + comeca no indice 1 e vai ate o final
                System.out.printf("Telefone: ");
                telefoneLocal = input.nextLine();
                p.add(new Pessoa(nomeLocal, telefoneLocal));
                System.out.println("Pessoa registrada!\n");
            }
            if (resp == 'd'){
                boolean a = false;
                System.out.printf("Nome: ");
                nomeLocal = input.nextLine();
                for (int i=0;i<p.size();i++){
                    Pessoa get = p.get(i);
                    if(get.getNome().equalsIgnoreCase(nomeLocal)){
                        System.out.printf("Perfil excluído: ID %d - %s - tel: %s\n",get.getId(),get.getNome(),get.getTelefone());
                        p.remove(i);
                        break;
                    }
                }
                if (!a){
                    System.out.println("\nNome não encontrado!\n");
                }
            }
            if (resp == 'i'){
                System.out.println();
                for (Pessoa pessoa : p){
                    System.out.printf("[%d] %s - tel: %s\n",pessoa.getId(),pessoa.getNome(),pessoa.getTelefone());
                }
                System.out.println();
            }
            if (resp == 's'){
                System.out.println("Tchau!");
                break;
            }
        }







        input.close();
    }
}