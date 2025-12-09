import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o lado 1 do retângulo 1: ");
        int lado01 = input.nextInt();
        ret1.setLado1(lado01);
        System.out.println("Digite o lado 2 do retângulo 1: ");
        int lado02 = input.nextInt();
        ret1.setLado2(lado02);

        System.out.println("Digite o lado 1 do retângulo 2: ");
        int lado11 = input.nextInt();
        ret2.setLado1(lado11);
        System.out.println("Digite o lado 2 do retângulo 2: ");
        int lado22 = input.nextInt();
        ret2.setLado2(lado22);

        System.out.println("\nRetângulo 1: Lado 1: " + ret1.getLado1() + " - Lado 2: " + ret1.getLado2());
        System.out.println("Retângulo 2: Lado 1: " + ret2.getLado1() + " - Lado 2: " + ret2.getLado2());

        System.out.println("\nÁrea do Retângulo 1: " + ret1.area() + " - Perímetro Retângulo 1: " + ret1.perimetro());
        System.out.println("Área do Retângulo 2: " + ret2.area() + " - Perímetro Retângulo 2: " + ret2.perimetro() + "\n\n\n");

        input.close();
    }
}


