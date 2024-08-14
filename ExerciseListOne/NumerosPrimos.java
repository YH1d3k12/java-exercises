/* 
    -----| Desafio |-----
    Crie um programa que teste se um número é primo
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, qtdDivisores = 0;
        boolean valid;
        
        System.out.println("Desafio, Verificar Número Primo.");

        // Garante que o número informado é maior do que 0.
        do {
            valid = false;
            num = GetValues.getIntInput("Informe um número inteiro positivo", scanner);

            if (num <= 0) {
                System.out.println("Apenas números naturais maiores que 0 podem ser primos");
            }
            else {
                valid = true;
            }
        } while (!valid);

        try {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    qtdDivisores++;
                }
            }

            if (qtdDivisores > 2) {
                System.out.println(num + " não é um número primo");
            }
            else {
                System.out.println(num + " é um número primo");
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