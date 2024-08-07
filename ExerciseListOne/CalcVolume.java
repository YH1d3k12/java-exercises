package ExerciseListOne;
/* 
    -----| Exercício 03 |-----
    3) Crie um programa que calcule o volume (largura * altura * profundidade).
*/
import java.util.Scanner;


public class CalcVolume {

    // Passa scanner como parâmetro para evitar a criação de um novo scanner.
    // Poderia ser colocado em outro escopo...
    public static double getDoubleInput(String dimension, Scanner scanner) {
        boolean valid;
        double value = 0;
        do {
            valid = false;
            System.out.println("Informe o valor da " + dimension + ": ");
            try { 
                value = scanner.nextDouble();
                valid = true;
                System.out.println("Valor informado: " + value);
            }
            catch (Exception e) {
                System.out.println("Valor invalido!");
                scanner.next(); // Limpa o buffer do scanner.
            }
        } while (!valid);
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largura = 0, altura = 0, profundidade = 0;
        
        System.out.println("Exercício 03, Calcular Volume.");

        // Captura o valor da largura.
        largura = getDoubleInput("largura", scanner);
        // Captura o valor da altura.
        altura = getDoubleInput("altura", scanner);
        // Captura o valor da profundidade.
        profundidade = getDoubleInput("profundidade", scanner);

        try {
            System.out.println("O volume é: " + (largura * altura * profundidade));
            
        } catch (Exception e) {
            System.out.println("Você digitou valores invalidos, execute novamente.");
        } finally {
            // Boa práticar fechar o scanner após o seu uso.
            scanner.close();
        }
    }
}