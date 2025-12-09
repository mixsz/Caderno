public class Farol {
    private String cor;
    private int qntd;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQntd() {
        return qntd;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    @Override
    public String toString() {
        return "Farol [cor=" + cor + ", qntd=" + qntd + "]";
    }

    
}
