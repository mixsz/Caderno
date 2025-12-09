public class Carro {
   private Roda roda;
   private Motor motor;
   private Porta porta;
   private Banco banco;
   private Volante volante;
   private Som som;
   private Farol farol;
   private Vidro vidro;
   private Pneu pneu;
   private Spoiler spoiler;

   public Carro(Roda roda, Motor motor, Porta porta, Banco banco, Volante volante, Som som, Farol farol, Vidro vidro,
        Pneu pneu, Spoiler spoiler) {
    this.roda = roda;
    this.motor = motor;
    this.porta = porta;
    this.banco = banco;
    this.volante = volante;
    this.som = som;
    this.farol = farol;
    this.vidro = vidro;
    this.pneu = pneu;
    this.spoiler = spoiler;
    }

    public Roda getRoda() {
        return roda;
    }
    public void setRoda(Roda roda) {
        this.roda = roda;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Porta getPorta() {
        return porta;
    }
    public void setPorta(Porta porta) {
        this.porta = porta;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public Volante getVolante() {
        return volante;
    }
    public void setVolante(Volante volante) {
        this.volante = volante;
    }
    public Som getSom() {
        return som;
    }
    public void setSom(Som som) {
        this.som = som;
    }
    public Farol getFarol() {
        return farol;
    }
    public void setFarol(Farol farol) {
        this.farol = farol;
    }
    public Vidro getVidro() {
        return vidro;
    }
    public void setVidro(Vidro vidro) {
        this.vidro = vidro;
    }
    public Pneu getPneu() {
        return pneu;
    }
    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }
    public Spoiler getSpoiler() {
        return spoiler;
    }
    public void setSpoiler(Spoiler spoiler) {
        this.spoiler = spoiler;
    }

    @Override
    public String toString() {
        return "Carro [roda=" + roda + ", motor=" + motor + ", porta=" + porta + ", banco=" + banco + ", volante="
                + volante + ", som=" + som + ", farol=" + farol + ", vidro=" + vidro + ", pneu=" + pneu + ", spoiler="
                + spoiler + "]";
    }

   
}

