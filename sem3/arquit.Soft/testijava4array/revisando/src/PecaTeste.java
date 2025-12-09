import java.util.ArrayList;
import java.util.Scanner;

public class PecaTeste {
    public static void main(String[] args) {
        ArrayList <Peca> p = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i=0;i<32;i++){ // cria pecas
            if (i<8){
                p.add(new Peca("peão","preto","b"+String.valueOf(i + 1)));
            }
            else if(i>=8 && i<10){
                p.add(new Peca("torre","preto","a"+String.valueOf(i-8 + 1)));
            }
            else if(i>=10 && i<12){
                p.add(new Peca("cavalo","preto","a"+String.valueOf(i-8 + 1)));
            }
            else if(i>=12 && i<14){
                p.add(new Peca("bispo","preto","a"+String.valueOf(i-8 + 1)));
            }
            else if(i==14){
                p.add(new Peca("rainha","preto","a"+String.valueOf(i-8 + 1)));
            }
            else if(i == 15){
                p.add(new Peca("rei","preto","a"+String.valueOf(i-8 + 1)));
            }
            else if (i<24){
                p.add(new Peca("peão","branco","g"+String.valueOf(i-16 + 1)));
            }
            else if(i>=24 && i<26){
                p.add(new Peca("torre","branco","h"+String.valueOf(i-24 + 1)));
            }
            else if(i>=26 && i<28){
                p.add(new Peca("cavalo","branco","h"+String.valueOf(i-24 + 1)));
            }
            else if(i>=28 && i<30){
                p.add(new Peca("bispo","branco","h"+String.valueOf(i-24 + 1)));
            }
            else if(i==30){
                p.add(new Peca("rainha","branco","h"+String.valueOf(i-24 + 1)));
            }
            else if(i == 31){
                p.add(new Peca("rei","branco","h"+String.valueOf(i-24 + 1)));
            }
        }
        for (int i=0;i<p.size();i++){
            Peca ola = p.get(i);
            System.out.printf("%d - ",i+1);
            System.out.printf(ola.getTipo());
            System.out.printf(" - ");
            System.out.printf(ola.getCor());
            System.out.printf(" - ");
            System.out.println(ola.getPosicao());
            if (i == p.size()/2-1){
                System.out.println("\n");
            }
        }

        System.out.printf("Posição a ser excluída: ");
        String resp = input.nextLine();

        for(int i=0;i<p.size();i++){
            Peca ola = p.get(i);
            if (resp.equalsIgnoreCase(ola.getPosicao())){
                p.remove(i);
                break;
            }
        }
        for (int i=0;i<p.size();i++){
            Peca ola = p.get(i);
            System.out.printf("%d - ",i+1);
            System.out.printf(ola.getTipo());
            System.out.printf(" - ");
            System.out.printf(ola.getCor());
            System.out.printf(" - ");
            System.out.println(ola.getPosicao());
            if (i == p.size()/2-1){
                System.out.println("\n");
            }
        }
        input.close();
    }
}
