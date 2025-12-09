public class Matematica {

    int max3(int n1,int n2,int n3){

        int maior = n1;
        if (n1>=maior){
            maior = n1;
        }
        if(n2>= maior){
            maior = n2;
        }
        if(n3>= maior){
            maior = n3;
        }
        return maior;
    }

    boolean impar(boolean a, boolean b, boolean c){
        int qntd = 0;
        if (a){
            qntd += 1;
        }
        if (b){
            qntd += 1;
        }
        if (c){
            qntd += 1;
        }

        if (qntd % 2 == 1){
            return true;
        }
        else{
            return false;
        }
        // verdadeiro se um numero de entrada impar for true ---> 2 TRUE --> return false
                                                                // 1 ou 3 TRUE --> return true
    }
    
    boolean maioria(boolean a, boolean b, boolean c){
        // se dois ou mais boolean forem TRUE ---> true
        // se menos de dois forem TRUE ---> false
        // sem if
        int total = (a ? 1: 0) + (b ? 1: 0) + (c ? 1: 0); //significa que total será a soma de 1 para cada valor true em a, b e c e 0 para cada valor false.
        return total>=2;
    }
}
