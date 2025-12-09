public class Motor {
    private int potencia, cilindro;
    private String tipo;
    public int getPotencia() {
        return potencia;
    }
    public int getCilindro() {
        return cilindro;
    }
    public String getTipo() {
        return tipo;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Motor [potencia=" + potencia + ", cilindro=" + cilindro + ", tipo=" + tipo + "]";
    }

    
}
