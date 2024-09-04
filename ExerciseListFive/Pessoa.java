package ExerciseListFive;


public class Pessoa {
    String nome;
    Double altura;
    Double peso;
    String dtNasc;

    public Pessoa (
        String nome,
        Double altura,
        Double peso,
        String dtNasc
    ) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dtNasc = dtNasc;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}