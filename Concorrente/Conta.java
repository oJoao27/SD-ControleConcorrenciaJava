
public class Conta {
    
    private double saldo = 0;
    
    /** Creates a new instance of Conta */
    public Conta(double saldo) {
        this.saldo = saldo;
        System.out.println("Conta criada. Saldo inicial: R$" + saldo);
    }

    public Conta() {
        this.saldo = 0;
        System.out.println("Conta criada. Saldo inicial: R$0");
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}