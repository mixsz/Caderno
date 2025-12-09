public class Volante {
    private String material, tipoDirecao;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    @Override
    public String toString() {
        return "Volante [material=" + material + ", tipoDirecao=" + tipoDirecao + "]";
    }

   
    
}
