public class EhFrango extends Exception{
    EhFrango(String mensagem){
        super(mensagem);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
