public class Porta {
    private int qntd;
    private String abertura;
    public int getQntd() {
        return qntd;
    }
    public String getAbertura() {
        return abertura;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }
    @Override
    public String toString() {
        return "Porta [qntd=" + qntd + ", abertura=" + abertura + "]";
    }

    
}
