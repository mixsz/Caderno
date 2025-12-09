import java.util.*;

public class NaoSeiPtDois {

   public static void main (String[] args){

    Scanner tecladin = new Scanner(System.in);
    // tecladin.useLocale(Locale.US); aqui no caso muda o idioma do scan
    
    System.out.print("Digite o seu cuzinho: ");
    String cuzinho = tecladin.nextLine();

    System.out.print("Digite o tamanho do seu cuzinho: ");
    float tamanho = tecladin.nextFloat();
    System.out.println();

    System.out.printf("O tamanho do seu cuzinho chamado %s é %.2f\n", cuzinho, tamanho);
    tecladin.close();
   }
} 