public class Banco {
    private String material;
    private int qntd;
    
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public int getQntd() {
        return qntd;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    @Override
    public String toString() {
        return "Banco [material=" + material + ", qntd=" + qntd + "]";
    }

       
}
