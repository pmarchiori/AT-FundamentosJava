public class Aluno {
    String nome;
    String matricula;
    float nota1;
    float nota2;
    float nota3;

    public Aluno(String nome, String matricula, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao(){
        float media = calcularMedia();

        if(media >= 7){
            System.out.println("Parabéns! Você foi aprovado.");
        }
        else{
            System.out.println("Você foi reprovado.");
        }
    }
}
