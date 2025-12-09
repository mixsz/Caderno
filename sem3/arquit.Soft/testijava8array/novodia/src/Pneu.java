public class Pneu {
    private int qntd;
    private String marca;
    public int getQntd() {
        return qntd;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Pneu [qntd=" + qntd + ", marca=" + marca + "]";
    }

    
}
