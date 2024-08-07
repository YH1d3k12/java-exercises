package ExerciseListOne;
/* 
    -----| Exercício 05 |-----
    5) Crie um programa que calcule bhaskara.
*/
import java.util.Scanner;


public class Bhaskara {

    public static double getDoubleInput(String text, Scanner scanner) {
        boolean valid;
        double value = 0;
        do {
            valid = false;
            System.out.println(text);
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
        double delta = 0, coeA = 0, coeB = 0, coeC = 0;
        
        System.out.println("Exercício 05, Bhaskara.");

        coeA = getDoubleInput("Digite o valor do coeficiente A: ", scanner);
        coeB = getDoubleInput("Digite o valor do coeficiente B: ", scanner);
        coeC = getDoubleInput("Digite o valor do coeficiente C: ", scanner);

        try {
            if (coeA == 0) {
                System.out.println("O coeficiente A não pode ser zero.");
            } 
            else {
                delta = Math.pow(coeB, 2) - 4 * coeA * coeC;

                if (delta < 0) {
                    System.out.println("Não existe raiz real.");
                } else {
                    double x1 = (-coeB + Math.sqrt(delta)) / (2 * coeA);
                    double x2 = (-coeB - Math.sqrt(delta)) / (2 * coeA);
                    System.out.println("As raizes são: {" + String.format("%.2f", x1) + " e " + String.format("%.2f", x2) + "}");
                }
            }
        } catch (Exception e) {
            System.out.println("Você digitou valores invalidos, execute novamente.");
        } finally {
            // Boa práticar fechar o scanner após o seu uso.
            scanner.close();
        }
    }
}