import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Aluno> turma = new ArrayList<>();
        int idadeL;
        String nomeL, sobrenomeL, cursoL;

        System.out.printf("Nome: ");
        nomeL = input.nextLine();

        System.out.printf("Sobrenome: ");
        sobrenomeL = input.nextLine();

        System.out.printf("Curso: ");
        cursoL = input.nextLine();

        System.out.printf("Idade: ");
        idadeL = input.nextInt();

        turma.add(new Aluno());
        turma.add(new Aluno(nomeL, sobrenomeL, idadeL, cursoL));

        for(Aluno p : turma){
            p.print();
        }
        input.close();
    }
}