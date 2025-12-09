import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ArrayList <Prefeito> pref = new ArrayList<>();
        ArrayList <Vereador> vere = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.printf("Nome: ");
        String nomeL = input.nextLine();

        System.out.printf("Partido: ");
        String partidoL = input.nextLine();

        System.out.printf("Estado: ");
        String estadoL = input.nextLine();

        System.out.printf("Municipio: ");
        String municipioL = input.nextLine();

        pref.add(new Prefeito(nomeL,partidoL,estadoL,municipioL));
        pref.add(new Prefeito("nome","partido","estadoL","municipioL"));
        pref.add(new Prefeito("Caralho","CUS","Vagina","Sla"));

        vere.add(new Vereador(nomeL,partidoL,estadoL,municipioL));
        vere.add(new Vereador("nome","partido","estadoL","municipioL"));
        vere.add(new Vereador("Caralho","CUS","Vagina","Sla"));
        System.out.println();
        for(Prefeito p : pref){
            p.apresentacao();
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(Vereador v : vere){
            v.apresentacao();
            System.out.println();
        }

        input.close();
    }
}
