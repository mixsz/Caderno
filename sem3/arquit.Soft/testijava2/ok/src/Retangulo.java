public class Retangulo {
    private int lado1;
    private int lado2;

    void setLado1(int lado1){
        this.lado1 = lado1;
    }
    void setLado2(int lado2){
        this.lado2 = lado2;
    }
    int getLado1(){
        return lado1;
    }
    int getLado2(){
        return lado2; 
    }
    int area(){
        return lado1 * lado2;
    }
    int perimetro(){
        return (2 * lado1) + (2 * lado2);
    }

}
