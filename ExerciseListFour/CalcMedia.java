/* 
    -----| Exercício 01 |-----
    1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
*/
package ExerciseListFour;
import java.util.Scanner;
import Utilidades.GetValues;



public class CalcMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int tamNotas = 0;

        System.out.println("Exercício 01, Calcular Média.");
        
        tamNotas = GetValues.getIntInput("Informe a quantidade de notas a serem inseridas: ", scanner);

        try {
            for (int i = 0; i < tamNotas; i++) {
                media += GetValues.getDoubleInput("Digite a " + (i + 1) + "° nota: ", scanner);
            }
            // String.format igual ao C, formata o número para duas casas decimais.
            System.out.println("A média é: " + String.format("%.2f", (media / tamNotas)));
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