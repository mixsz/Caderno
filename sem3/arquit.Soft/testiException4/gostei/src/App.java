import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        try{
            if(nome.equalsIgnoreCase("frango")){
                throw new EhFrango("CARALHO!\n");
            }
            System.out.println("Certo!");
        }
        catch(EhFrango e){
            System.out.println("Erro: "+e.getMessage());
        }
        finally{
            input.close();
        }
    }
}
