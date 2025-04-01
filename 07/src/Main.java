import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Nota 1: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Nota 3: ");
        float nota3 = scanner.nextFloat();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        aluno.verificarAprovacao();

        scanner.close();
    }
}