package ExerciseListOne;
/* 
    -----| Exercício 04 |-----
    4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
*/
import java.util.Scanner;


public class CompareTwoNumbers {

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
        double num1 = 0, num2 = 0;
        
        System.out.println("Exercício 04, Comparação de Números.");

        num1 = getDoubleInput("Digite o primeiro número: ", scanner);
        num2 = getDoubleInput("Digite o segundo número: ", scanner);

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
        } catch (Exception e) {
            System.out.println("Você digitou valores invalidos, execute novamente.");
        } finally {
            // Boa práticar fechar o scanner após o seu uso.
            scanner.close();
        }
    }
}