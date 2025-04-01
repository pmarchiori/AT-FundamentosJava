public class Veiculo {
    String placa;
    String modelo;
    int ano;
    double quilometragem;

    public Veiculo(String placa, String modelo, int ano, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.println("\nPlaca do carro: " + placa);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Quilometragem do carro: " + quilometragem);
    }

    public void registrarViagem(double km){
        quilometragem += km;
    }
}
