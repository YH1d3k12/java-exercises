/* 
    -----| Exercício 03 |-----
    3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
*/
package ExerciseListFour;
import java.util.Scanner;
import Utilidades.GetValues;

public class ArraysAddDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arrayDoubles = new double[10];
        double x = 0;

        System.out.println("Exercício 03, Adicionar Valores a Arrays.");

        for (int i = 0; i < 10; i++) {
            x = GetValues.getDoubleInput("Informe o " + (i+1) + "° valor: ", scanner);
            arrayDoubles[i] = x;
        }

        System.out.println("Valores informados");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "° valor: " + arrayDoubles[i]);
        }
    }
}
