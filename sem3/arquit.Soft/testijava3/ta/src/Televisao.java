public class Televisao {
    private String modelo;
    private float tamanho, preco;
    private int canal, volume;
    private boolean ligada;

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

    int getCanal(){
        return canal;
    }
    String getModelo(){
        return modelo;
    }
    float getTamanho(){
        return tamanho;
    }
    float getPreco(){
        return preco;
    }
    int getVolume(){
        return volume;
    }
    boolean ligada(){
        return ligada;
    }

    void alteraVolume(int volumenovo){
        if (volumenovo < 0 || volumenovo > 100){
            volumenovo = 0;
        }
        this.volume = volumenovo;
    }
    void alteraCanal(char valor){
        if(valor == '+'){
            this.canal += 1;
        }
        else if(valor == '-'){
            this.canal -= 1;
        }    
    }


}
