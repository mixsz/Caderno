import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Carro gol = new Carro(0, 150);
        Scanner input = new Scanner(System.in);
        int valor;
        int i=0;
        while (true){
            if(i%2==0){
                System.out.println("\nVAMOS ACELERAR!\n");
            }
            else{
                System.out.println("\nVAMOS FREAR!\n");
            }
            System.out.printf("VALOR: ");
            try{
                valor = input.nextInt();
            }
            catch(Exception e){
                System.out.println("IMPOSSIBLE!\n");
                input.nextLine();
                continue;
            }
            if(valor<0){
                break;
            }

            if(i%2==0){
                try{
                    gol.acelerar(valor);
                }
                catch(ExceptionCarro e){
                    System.out.println(e.getMessage());
                }
            }
            if(i%2!=0){
                try{
                    gol.frear(valor);
                }
                catch(ExceptionCarro e){
                    System.out.println(e.getMessage());
                }
            }
            i += 1;
        }
        input.close();
    }
}
