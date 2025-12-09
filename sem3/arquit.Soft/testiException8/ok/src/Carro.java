public class Carro {
    double velocidade, velocidadeMax;

    public Carro(double velocidade, double velocidadeMax) {
        this.velocidade = velocidade;
        this.velocidadeMax = velocidadeMax;
    }

    public Carro() {
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    
    public void acelerar(int valor)throws ExceptionCarro{
        if(velocidade+valor > velocidadeMax){
            throw new ExceptionCarro("RÁPIDO DEMAIS!");
        }
        velocidade += valor;
        for(int i=0;i<valor;i++){
            System.out.printf("VRUUM! ");
        }
        System.out.println();
    }
    public void frear(int valor)throws ExceptionCarro{
        if(velocidade-valor < 0){
            throw new ExceptionCarro("LENTO DEMAIS!");
        }
        velocidade -= valor;
        for(int i=0;i<valor;i++){
            System.out.printf("VIRRRR! ");
        }
        System.out.println();
    }
}
