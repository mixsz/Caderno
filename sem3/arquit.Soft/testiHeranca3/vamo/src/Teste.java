import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList <Funcionario> f = new ArrayList<>();
        ArrayList <Gerente> g = new ArrayList<>();

        f.add(new Funcionario("Testa",12312312312L,new Data(12,3,1999),new Data(1, 1, 1000), 19990));
        f.add(new Funcionario("Rafael",12457312342L,new Data(12,3,149),new Data(5, 7, 9000), 1934590));
        f.add(new Funcionario("Annal",12012300012L,new Data(17,9,1969),new Data(1, 1, 1900), 1934590));
        f.add(new Funcionario("Cuzin",12245612234L,new Data(12,3,159),new Data(787, 5, 10990), 155990));


        g.add(new Gerente("Nome1",12301231,new Data(12,3,1999), new Data(12,7,149), 44444, 2, new Data(12,677,1999)));
        g.add(new Gerente("Nome2",12301231,new Data(12,3,1999), new Data(12,7,149), 44444, 2, new Data(12,677,1999)));
        g.add(new Gerente("Nome3",12301231,new Data(12,3,1999), new Data(12,7,149), 44444, 2, new Data(12,677,1999)));
        g.add(new Gerente("Nome4",12301231,new Data(12,3,1999), new Data(12,7,149), 44444, 2, new Data(12,677,1999)));

        for(Funcionario func : f){
            System.out.println(func);
            System.out.println();
        }

        for(Gerente ger : g){
            System.out.println(ger);
            System.out.println();
        }
    }
}
