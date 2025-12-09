import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String fala = input.next();
        try{
            if(fala.length()==3){
                throw new Exception("PROIBIDO!\n");	
            }
        }
        catch(Exception e){
            System.out.println("Mensagem: "+e.getMessage());
        }
        finally{
            System.out.println("FINALLY!");
            input.close();
        }
    }
}
