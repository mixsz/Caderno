import java.util.ArrayList;
import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args) {
        ArrayList<Livro> livro = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String livroLocal, autorLocal;
        int anoLocal;
        char confirma;
        while (true){
            int resp = -1;
            System.out.println("1. Cadastrar um novo livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Sair");
            while (resp < 1 || resp > 3){
                System.out.printf("Escolha uma opção: ");
                resp = input.nextInt();
            }
            if (resp == 1){
                input.nextLine();
                while (true){
                    System.out.printf("Digite o nome do livro: ");
                    livroLocal = input.nextLine();
                    livroLocal = livroLocal.substring(0,1).toUpperCase() + livroLocal.substring(1);
                    while (true){
                        System.out.println("[S] -> CONFIRMAR\n[N] -> Editar");
                        confirma = input.nextLine().charAt(0);
                        if (confirma == 's' || confirma == 'S'){
                            break;
                        }
                        else if (confirma == 'n' || confirma == 'N'){
                            break;
                        }
                    }
                    if (confirma == 's' || confirma == 'S'){
                        break;
                    }
                }
                while (true){
                    System.out.printf("Digite o autor do livro: ");
                    autorLocal = input.nextLine();
                    autorLocal = autorLocal.substring(0,1).toUpperCase() + autorLocal.substring(1);

                    while (true){
                        System.out.println("[S] -> CONFIRMAR\n[N] -> Editar");
                        confirma = input.nextLine().charAt(0);
                        if (confirma == 's' || confirma == 'S'){
                            break;
                        }
                        else if (confirma == 'n' || confirma == 'N'){
                            break;
                        }
                    }
                    if (confirma == 's' || confirma == 'S'){
                        break;
                    }
                }
                while (true){
                    System.out.printf("Digite o ano de publicação do livro: ");
                    anoLocal = input.nextInt();
                    input.nextLine();
                    while (true){
                        System.out.println("[S] -> CONFIRMAR\n[N] -> Editar");
                        confirma = input.nextLine().charAt(0);
                        if (confirma == 's' || confirma == 'S'){
                            break;
                        }
                        else if (confirma == 'n' || confirma == 'N'){
                            break;
                        }
                    }
                    if (confirma == 's' || confirma == 'S'){
                        break;
                    }
                }
                livro.add(new Livro(livroLocal,autorLocal,anoLocal));
                System.out.println("Livro cadastrado com sucesso!\n");
            }
            if (resp == 2){
                System.out.println("\nLivros cadastrados:");
                for (Livro livros : livro){
                    System.out.printf("%d. %s - %s - %d\n",livros.getId(),livros.getTitulo(),livros.getAutor(),livros.getAnoPublicacao());
                }
                System.out.println();
            }
            if (resp == 3){
                System.out.println("Goodbye!");
                break;
            }
        }
        input.close();
    }
}
