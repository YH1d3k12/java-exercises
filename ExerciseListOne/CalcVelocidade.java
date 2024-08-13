/* 
    -----| Exercício 06 |-----
    6) Crie um programa que calcule a velocidade média de uma viagem (distancia (km) / tempo (h))
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class CalcVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distancia = 0, tempo = 0;
        
        System.out.println("Exercício 06, Calcular velocidade média.");

        distancia = GetValues.getDoubleInput("Digite o valor da distância em km: ", scanner);
        tempo = GetValues.getDoubleInput("Digite o valor do tempo em horas: ", scanner);
        
        try {
            System.out.println("A velocidade média é: " + (distancia / tempo));
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