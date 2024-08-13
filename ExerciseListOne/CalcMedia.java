/* 
    -----| Exercício 01 |-----
    1) Crie um programa que calcule a média ((nota1 + nota2 + nota3 / 3)).
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


// Nome da classe deve ser o mesmo do arquivo.
public class CalcMedia {
    // Tudo precisa estar dentro do main para ser executado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0.0;
        
        System.out.println("Exercício 01, Calcular Média.");
        try {
            for (int i = 0; i < 3; i++) {
                media += GetValues.getDoubleInput("Digite a " + (i + 1) + "° nota: ", scanner);
            }
            // String.format igual ao C, formata o número para duas casas decimais.
            System.out.println("A média é: " + String.format("%.2f", (media / 3)));
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