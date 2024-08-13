/* 
    -----| Exercício 05 |-----
    5) Crie um programa que calcule bhaskara.
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double delta = 0, coeA = 0, coeB = 0, coeC = 0;
        
        System.out.println("Exercício 05, Bhaskara.");

        coeA = GetValues.getDoubleInput("Digite o valor do coeficiente A: ", scanner);
        coeB = GetValues.getDoubleInput("Digite o valor do coeficiente B: ", scanner);
        coeC = GetValues.getDoubleInput("Digite o valor do coeficiente C: ", scanner);

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
        } 
        catch (Exception e) {
            System.out.println("Você digitou valores invalidos, execute novamente.");
        } 
        finally {
            // Boa práticar fechar o scanner após o seu uso.
            scanner.close();
        }
    }
}