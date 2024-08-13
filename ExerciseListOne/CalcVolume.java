/* 
    -----| Exercício 03 |-----
    3) Crie um programa que calcule o volume (largura * altura * profundidade).
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class CalcVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largura = 0, altura = 0, profundidade = 0;
        
        System.out.println("Exercício 03, Calcular Volume.");

        // Captura o valor da largura.
        largura = GetValues.getDoubleInput("Informe a largura: ", scanner);
        // Captura o valor da altura.
        altura = GetValues.getDoubleInput("Informe a altura: ", scanner);
        // Captura o valor da profundidade.
        profundidade = GetValues.getDoubleInput("Informe a profundidade: ", scanner);

        try {
            System.out.println("O volume é: " + (largura * altura * profundidade));
            
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