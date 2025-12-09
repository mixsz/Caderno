import java.util.Scanner;

public class AULAAULAFACULDADE {
    public static void main(String[] args) {
        int numero = -1;
        int soma = 0;
        Scanner tecladin = new Scanner (System.in);
        while(numero != 0){
            System.out.print("DIGITE O NUMEROOO: ");
            numero = tecladin.nextInt();
            soma += numero;
        }
        System.out.printf("A soma do caralho é %d",soma);
        tecladin.close();
    }
}
