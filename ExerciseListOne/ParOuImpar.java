/* 
    -----| Exercício 08 |-----
    8) Crie um programa que teste se um valor é par ou ímpar 
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Exercício 08, Par ou Ìmpar.");

        numero = GetValues.getIntInput("Informe um número inteiro: ", scanner);
        
        try {
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            }
            else {
                System.out.println(numero + " é ímpar");
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