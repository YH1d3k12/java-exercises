/* 
    -----| Exercício 02 |-----
    2) Crie um programa que imprima um array com Foreach. 
*/
package ExerciseListFour;

public class ArraysForEach {
    public static void main(String[] args) {
        // Array vázio, definido como tamanho 10.
        // int[] arrayInteiros = new int[10];

        // Array populado com dados.
        int[] arrayInteiros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Exercício 02, Imprimir Array com ForEach.");

        for (int i : arrayInteiros) {
            System.out.println("Valor: " + i);
        }
    }
}
