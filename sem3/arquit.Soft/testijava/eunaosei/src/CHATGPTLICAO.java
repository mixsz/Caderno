import java.util.Scanner;

public class CHATGPTLICAO {
    public static void main(String[] args) {
        boolean verificar = false;
        float bosta = 0;
        int resultado = 1;
        Scanner teclado = new Scanner (System.in);
        while (!verificar){
            System.out.print("Digite o número fatorial escolhido: ");
            bosta = teclado.nextFloat();
            if (bosta < 0 || bosta != (int)bosta){
                System.out.println("NAO FUNCIONA!");
            }
            else{
                verificar = true;
            }
        }
        for(int i=1 ; i <= (int)bosta ; i++){
            resultado *= i;
            if (i != (int)bosta){
                System.out.printf("%d * ",i);
            }
            else{
                System.out.println(i + " = " + resultado);
            }
        }
        teclado.close();
    }
}
