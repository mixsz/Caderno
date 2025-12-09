import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Login conta = new Login("Cleiton69", "123456");
        String nomeL, senhaL;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Nome");
            nomeL = input.nextLine();
            System.out.println("Senha");
            senhaL = input.nextLine();
            try{
                conta.logar(nomeL, senhaL);
                System.out.println("\nLogin bem sucedido!");
                break;
            }
            catch (ErroLogin e){
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println("Tente novamente...\n");
            }
        }
        input.close();
    }
}
