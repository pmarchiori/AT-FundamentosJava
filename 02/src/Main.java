import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        String password;

        do {
            System.out.print("Digite sua senha: ");
            password = scanner.nextLine();

            if (!PasswordValidator.validatePassword(password)) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres, conter uma letra maiúscula, um número e um caractere especial.");
            }

        } while (!PasswordValidator.validatePassword(password));

        System.out.println("\nUsuário " + name + " cadastrado com sucesso!");
        scanner.close();
    }
}

