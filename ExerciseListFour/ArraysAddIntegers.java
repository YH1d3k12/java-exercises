/* 
    -----| Exercício 04 |-----
    4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
*/
package ExerciseListFour;
import java.util.Scanner;
import Utilidades.GetValues;

public class ArraysAddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayIntegers = new int[10];
        int x = 0;

        System.out.println("Exercício 04, Adicionar Valores Inteiros a Arrays e Verificar se é Par ou Ímpar.");

        for (int i = 0; i < 10; i++) {
            x = GetValues.getIntInput("Informe o " + (i+1) + "° valor: ", scanner);
            arrayIntegers[i] = x;
        }

        System.out.println("Valores informados");
        for (int i = 0; i < 10; i++) {
            if (arrayIntegers[i] % 2 == 0) {
                System.out.println((i+1) + "° valor é par");
            }
            else {
                System.out.println((i+1) + "° valor é ímpar");
            }
        }
    }
}
