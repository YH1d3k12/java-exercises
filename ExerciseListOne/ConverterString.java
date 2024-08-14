/* 
    -----| Exercício 10 |-----
    10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class ConverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "12.4";
        Integer num = 0;
        
        System.out.println("Exercício 10, Converter String para Inteiro");

        str = GetValues.getStringInput("Informe um número decimal: ", scanner);
        // Substitui quaisquer , por .
        str = str.replace(",", ".");
        try {
            // Converte a string para double primeiro.
            double decimalValue = Double.parseDouble(str);
            // Faz um casting do valor decimal.
            num = (int) decimalValue;
            System.out.println("Valor convertido: " + num);
        } 
        catch (Exception e) {
            System.out.println("Você digitou valores invalidos, execute novamente." + e);
        } 
        finally {
            // Boa práticar fechar o scanner após o seu uso.
            scanner.close();
        }
    }
}