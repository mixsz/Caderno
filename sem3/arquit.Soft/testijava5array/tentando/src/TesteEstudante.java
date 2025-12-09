import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeLocal, sobrenomeLocal;
        ArrayList <Estudante> estudante = new ArrayList<>();
        
        for (int i=0;i<10;i++){
            System.out.printf("Nome: ");
            nomeLocal = input.nextLine();

            System.out.printf("Sobrenome: ");
            sobrenomeLocal = input.nextLine();

            estudante.add(new Estudante(nomeLocal, sobrenomeLocal));
        }

        for (int i=0;i<estudante.size();i++){
            Estudante mostra = estudante.get(i);
            System.out.printf("%d - %s %s\n",mostra.getIdentificador(),mostra.getNome(),mostra.getSobrenome());
        }
        input.close();
    }
}
