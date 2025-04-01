import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosSorteados = new int[6];
        int[] numerosUsuario = new int[6];

        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = random.nextInt(60) + 1;
        }

        System.out.println("\nDigite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = scanner.nextInt();
        }

        int acertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numerosUsuario[i] == numerosSorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("\nVocê acertou " + acertos + " números");
        scanner.close();
    }
}
