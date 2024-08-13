/* 
    -----| Exercício 09 |-----
    9) Crie um programa que compare dois valores Strings 
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class CompararStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "", str2 = "";
        
        System.out.println("Exercício 09, Comparar Strings.");

        str1 = GetValues.getStringInput("Informe um texto: ", scanner);
        str2 = GetValues.getStringInput("Informe outro texto: ", scanner);

        try {
            if (str1.equals(str2)) {
                System.out.println("Os textos são iguais");
            }
            else {
                System.out.println("Os textos são diferentes");
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