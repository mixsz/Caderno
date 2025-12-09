public class SavingAccount extends Account{
    private double juros;

    public double getJuros() {
        return juros;
    }

    public SavingAccount(double saldo, double juros) {
        super(saldo);
        this.saldo = this.saldo * (1+juros/100);
        this.juros = juros;
    }

    public double calculateInterest(){
        return saldo * (juros/100);
    }

    
}