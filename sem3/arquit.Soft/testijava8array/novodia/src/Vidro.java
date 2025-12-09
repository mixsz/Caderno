public class Vidro {
    private int qntd;
    private String cor;
    private boolean provaDeBala;
    public int getQntd() {
        return qntd;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isProvaDeBala() {
        return provaDeBala;
    }
    public void setProvaDeBala(boolean provaDeBala) {
        this.provaDeBala = provaDeBala;
    }
    @Override
    public String toString() {
        return "Vidro [qntd=" + qntd + ", cor=" + cor + ", provaDeBala=" + provaDeBala + "]";
    }

    
}
