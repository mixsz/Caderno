public class Aaa{
    
    public void sla(int x) throws Exception{
        if (x==1){
            throw new Erro("Número diferente de um!");
        }
        else if(x==2){
            throw new Erro2("Número diferente de dois!");
        }
        else if(x==3){
            throw new Erro3("Número diferente de três!");
        }
    }
}
