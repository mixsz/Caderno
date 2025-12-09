import java.util.ArrayList;

public class TesteCarro {
    public static void main(String[] args) {
        ArrayList <Carro> carro = new ArrayList<>();

        Roda roda = new Roda();
        roda.setCor("Cinza");
        roda.setTipo("Esportiva");

        Motor motor = new Motor();
        motor.setCilindro(9999);
        motor.setPotencia(88888);
        motor.setTipo("Anal");

        Porta porta = new Porta();
        porta.setAbertura("Butterfly");
        porta.setQntd(2);

        Banco banco = new Banco();
        banco.setMaterial("Bosta");
        banco.setQntd(2);

        Volante volante = new Volante();
        volante.setMaterial("Merda");
        volante.setTipoDirecao("Caralho");


        Som som = new Som();
        som.setBluetooth(true);
        som.setQntd(1);

        Farol farol = new Farol();
        farol.setCor("Azul");
        farol.setQntd(4);

        Vidro vidro = new Vidro();
        vidro.setCor("Preto");
        vidro.setProvaDeBala(false);
        vidro.setQntd(2);

        Pneu pneu = new Pneu();
        pneu.setMarca("KRL");
        pneu.setQntd(4);

        Spoiler spoiler = new Spoiler();
        spoiler.setCor("Preto");
        spoiler.setTipo("Rua");

        carro.add (new Carro(roda,motor,porta,banco,volante,som,farol,vidro,pneu,spoiler));

        System.out.println(carro.get(0));
    }
}