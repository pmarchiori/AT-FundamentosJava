public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
        else{
            System.out.println("Não é possível depositar valores negativos.");
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Não é possível sacar valores negativos.");
        }
        else if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual da conta de " + titular + ": R$" + saldo);
    }
}
