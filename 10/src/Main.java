import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Path arquivo = Path.of("compras.txt");

    public static void main(String[] args) throws IOException {
        cadastrarCompras();
        exibirCompras();
    }

    private static void cadastrarCompras() throws IOException {
        var builder = new StringBuilder();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Cadastro da compra " + i + ":");
            System.out.print("Produto: ");
            String produto = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.print("Preço unitário: ");
            double preco = Double.parseDouble(scanner.nextLine());

            builder.append(produto).append(", ").append(quantidade).append(", ").append(preco).append("\n");
        }

        Files.writeString(arquivo, builder.toString(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        System.out.println("Compras registradas no arquivo: " + arquivo.toAbsolutePath());
    }

    private static void exibirCompras() throws IOException {
        if (Files.exists(arquivo)) {
            System.out.println("\nCompras registradas:");
            List<String> linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);
            linhas.forEach(System.out::println);
        } else {
            System.out.println("Arquivo de compras não encontrado!");
        }
    }
}
