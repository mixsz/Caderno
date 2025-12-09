import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Agente> agentes = new ArrayList<>();
        int i=1;
        String nomeL, profissaoL, trabalhoL;
        boolean modoL=false;
        while (true){
            System.out.println("Nome:");
            nomeL = input.nextLine();
            System.out.println();

            System.out.println("Profissão:");

            while (true){
                profissaoL = input.nextLine();
                profissaoL = profissaoL.substring(0, 1).toLowerCase() + profissaoL.substring(1);
                if(profissaoL.equalsIgnoreCase("empresario" )|| profissaoL.equalsIgnoreCase("advogado") || profissaoL.equalsIgnoreCase("professor")){
                System.out.println();            
                    break;
                }
            }
            if(profissaoL.equalsIgnoreCase("empresario")){
                System.out.println("Empresa:");
                trabalhoL = input.nextLine();
                agentes.add(new Empresario(nomeL,profissaoL,modoL,trabalhoL));
                if(i % 3 == 0){
                    agentes.get(i-1).modo_agente_on();
                }

            }   

            if(profissaoL.equalsIgnoreCase("advogado")){
                System.out.println("OAB:");
                trabalhoL = input.nextLine();
                agentes.add(new Advogado(nomeL,profissaoL,modoL,trabalhoL));
                if(i % 3 == 0){
                    System.out.println();
                    agentes.get(i-1).modo_agente_on();
                }      
                  }   
            if(profissaoL.equalsIgnoreCase("professor")){
                System.out.println("Escola:");
                trabalhoL = input.nextLine();
                agentes.add(new Professor(nomeL,profissaoL,modoL,trabalhoL));
                if(i % 3 == 0){
                    agentes.get(i-1).modo_agente_on();
                }
            }  
            i++; 
            if (i==6){
                input.close();
                break;
            }
            System.out.println();
        }
        System.out.println();

        for (Agente ag : agentes){
            ag.apresentacao();
            System.out.println();
        }
    }
}
