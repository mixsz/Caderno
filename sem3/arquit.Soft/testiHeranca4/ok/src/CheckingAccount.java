public class CheckingAccount extends Account{
    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public CheckingAccount(double saldo, double taxa) {
        super(saldo);
        this.taxa = taxa;
    }

    public boolean credit(double valor){
        valor = valor - (valor * taxa/100);
        return super.credit(valor);

        //falta o CARALHO do debit!
    }
}