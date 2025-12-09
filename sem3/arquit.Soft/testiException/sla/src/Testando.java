import java.util.Scanner;

public class Testando {
    public static void main(String[] args) {
        int deno;
        Scanner input = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Denominador");
                deno = Integer.parseInt(input.nextLine());
                System.out.println("\nResultado 1/" + deno + " = " + 1.0 / deno);
                break;
            } 
            catch(ArithmeticException e){
                System.out.println("Diferente de 0...\n");
            }
            catch(NumberFormatException e){
                System.out.println("Número...");
            }
        }
        input.close();
    }
}
