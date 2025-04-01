public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Anderson", 3000);
        Estagiario estagiario = new Estagiario("Rafael" , 1900);

        System.out.println("Salário final do gerente: " + gerente.calcularSalario());
        System.out.println("Salário final do estagiário: " + estagiario.calcularSalario());
    }
}