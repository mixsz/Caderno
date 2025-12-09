import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Televisao t1 = new Televisao();
        Televisao t2 = new Televisao();
        System.out.println("Digite o modelo da TV 1: ");
        String modelo1 = teclado.nextLine();
        t1.setModelo(modelo1);
        System.out.println("Digite o preço da TV 1: ");
        float preco1 = teclado.nextFloat();
        t1.setPreco(preco1);
        System.out.println("Digite o tamanho da TV 1: ");
        float tamanho1 = teclado.nextFloat();
        t1.setTamanho(tamanho1);
        System.out.println("Digite o canal da TV 1: ");
        int canal1 = teclado.nextInt();
        t1.setCanal(canal1);
        System.out.println("Digite o volume da TV 1: ");
        int volume1 = teclado.nextInt();
        t1.setVolume(volume1);
        t1.setLigada(true);

        teclado.nextLine(); // BUFFER

        System.out.println("Digite o modelo da TV 2: ");
        String modelo2 = teclado.nextLine();
        t2.setModelo(modelo2);
        System.out.println("Digite o preço da TV 2: ");
        float preco2 = teclado.nextFloat();
        t2.setPreco(preco2);
        System.out.println("Digite o tamanho da TV 2: ");
        float tamanho2 = teclado.nextFloat();
        t2.setTamanho(tamanho2);
        System.out.println("Digite o canal da TV 2: ");
        int canal2 = teclado.nextInt();
        t2.setCanal(canal2);
        System.out.println("Digite o volume da TV 2: ");
        int volume2 = teclado.nextInt();
        t2.setVolume(volume2);
        t2.setLigada(true);

        System.out.println("\n\nCanal da TV 1: " + t1.getCanal());
        System.out.println("Volume da TV 1: " + t1.getVolume());

        System.out.println("\nCanal da TV 2: " + t2.getCanal());
        System.out.println("Volume da TV 2: " + t2.getVolume());
    
     // MUDA VOLUME E CANAL DA TV 1

        System.out.println("\nMude o volume da TV 1: ");
        volume1 = teclado.nextInt();
        t1.alteraVolume(volume1);

        char muda_canal;
        System.out.println("Mude o canal da TV 1 (+/-): ");
        muda_canal = teclado.next().charAt(0);
        t1.alteraCanal(muda_canal);

    // TV 2

        System.out.println("\nMude o volume da TV 2: ");
        volume2 = teclado.nextInt();
        t2.alteraVolume(volume2);

        System.out.println("Mude o canal da TV 2 (+/-): ");
        muda_canal = teclado.next().charAt(0);
        t2.alteraCanal(muda_canal);

    // ALTERA CANAL E VOLUME

        System.out.println("Novo canal da TV 1: " + t1.getCanal());
        System.out.println("Novo volume da TV 1: " + t1.getVolume());

        System.out.println("\nNovo canal da TV 2: " + t2.getCanal());
        System.out.println("Novo volume da TV 2: " + t2.getVolume());

        t2.setLigada(false);
    
        teclado.close();
    }
}
