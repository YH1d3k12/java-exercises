/* 
    -----| Exercício 04 |-----
    4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        
        System.out.println("Exercício 04, Comparação de Números.");

        num1 = GetValues.getDoubleInput("Digite o primeiro número: ", scanner);
        num2 = GetValues.getDoubleInput("Digite o segundo número: ", scanner);

        try {
            if (num1 > (num2 * 2)) {
                System.out.println("O primeiro número é maior que o dobro do segundo número.");
            } 
            else if (num1 == (num2 * 2)) {
                System.out.println("O primeiro número é igual ao dobro do segundo número.");
            }
            else {
                System.out.println("O primeiro número não é maior que o dobro do segundo número.");
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