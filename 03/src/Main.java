import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float tax = 0.0f;
        float finalSalary;

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite seu salário mensal: ");
        float monthlySalary = scanner.nextFloat();

        float annualSalary = monthlySalary * 12;

        if(annualSalary <= 22847.76)
        {
            System.out.println("Isento de imposto, salário anual é de: R$ "+ annualSalary);
        }
        else if(annualSalary >=  22847.77 && annualSalary <= 33919.80)
        {
            tax = annualSalary * 0.075f;
            finalSalary = annualSalary - tax;
            System.out.println("Valor do imposto: R$ " + tax + ". Salário final é de: R$ "+ finalSalary);
        }
        else if (annualSalary >= 33919.81 && annualSalary <= 45012.60)
        {
            tax = annualSalary * 0.15f;
            finalSalary = annualSalary - tax;
            System.out.println("Valor do imposto: R$ " + tax + ". Salário final é de: R$ "+ finalSalary);
        }
        else
        {
            tax = annualSalary * 0.275f;
            finalSalary = annualSalary - tax;
            System.out.println("Valor do imposto: R$ " + tax + ". Salário final é de: R$ "+ finalSalary);
        }

        scanner.close();
    }
}