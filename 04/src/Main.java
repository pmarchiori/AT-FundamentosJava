import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int installments;
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite o valor do empréstimo: ");
        double loanValue = scanner.nextDouble();

        do{
            System.out.println("Digite a quantidade de parcelas: (Mínimo 6 e máximo 48)");
            installments = scanner.nextInt();
        } while(installments < 6 || installments > 48);

        double monthlyFee = 0.03;
        double monthlyPayment = loanValue / installments * (1 + monthlyFee);
        double finalPayment = monthlyPayment * installments;

        System.out.println("Valor total a ser pago: R$ " + finalPayment);
        System.out.println("Valor da parcela mensal: R$ " + monthlyPayment);

        scanner.close();
    }
}