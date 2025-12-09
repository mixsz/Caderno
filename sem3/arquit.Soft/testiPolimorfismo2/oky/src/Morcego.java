public class Morcego extends Animal implements IWalkable, IFlyable {

    public Morcego(String nome) {
        super(nome);
    }

    public void andar(){
        System.out.println("Morcego anda!");
    }

    public void voar(){
        System.out.println("Morcego voa!");
    }

}
