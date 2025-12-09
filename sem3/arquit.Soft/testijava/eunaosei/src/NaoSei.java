import java.util.*; // importa tudo
import java.awt.Dimension; // resol
import java.awt.Toolkit;  // resol


public class NaoSei {
    public static void main(String[] args) {

        // horário      
        Date relogio = new Date();
        System.out.println("A hora é: ");
        System.out.println(relogio.toString() + "\n");

        // idioma 
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma é: ");
        System.out.println(idioma.getDisplayLanguage() + "\n");
        

        // resolução
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("A resolução é: ");
        System.out.println(largura + "X" + altura);
    }
}