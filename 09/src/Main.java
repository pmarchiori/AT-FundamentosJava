public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Cláudio");

        conta.exibirSaldo();
        conta.depositar(100);
        conta.sacar(40);
        conta.sacar(270);
        conta.exibirSaldo();
    }
}