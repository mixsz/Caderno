public class Roda {
    private String cor, tipo;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Roda [cor=" + cor + ", tipo=" + tipo + "]";
    }
    
}
