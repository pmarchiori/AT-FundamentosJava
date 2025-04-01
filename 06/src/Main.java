public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("VLK9806", "Monza", 1982, 200000);
        Veiculo veiculo2 = new Veiculo("MJH7389", "Celta", 2010, 378000);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrarViagem(238.7);
        veiculo2.registrarViagem(29.1);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}