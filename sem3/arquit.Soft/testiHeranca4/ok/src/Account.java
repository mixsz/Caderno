import java.util.Scanner;

public class Account {
   protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public Account(double saldo) {
        if (saldo < 0){
            saldo = 0;
            System.out.println("Saldo inválido!\n");
        }
        this.saldo = saldo;
    }

   public boolean credit(double depositoL){

        Scanner input = new Scanner(System.in);

        if(depositoL<0){
            System.out.println("Valor inválido!\n");
            input.close();
            return false;
        }
        else{
            saldo += depositoL;
            System.out.println("Depósito bem sucedido!\n");
            input.close();
            return true;
        }
   }

   public boolean debit(double saqueL){
        Scanner input = new Scanner(System.in);


        if(saqueL<0 || saqueL>saldo){
            System.out.println("Valor inválido!\n");
            input.close();
            return false;
        }
        else{
            saldo -= saqueL;
            System.out.println("Saque bem sucedido!\n");
            input.close();
            return true;
        }
   }

   public void getBalance(){
    System.out.println("Saldo atual: " + saldo);
   }
}
