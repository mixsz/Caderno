public class Aprende {
    public static void main(String[] args) throws Exception {
        Integer[] sla = null;

        try{
            for(Integer slaa : sla){
                System.out.println(slaa);
            }
        }
        catch(NullPointerException e){
            System.out.println("ERROR...");
            System.err.println(e+"\n");
        }
    }
}
