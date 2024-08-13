/* 
    -----| Exercício 07 |-----
    7) Crie um programa que calcule o percentual de imposto pago (faturamento \ qtd imposto) 
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class CalcImposto {
    // Tudo precisa estar dentro do main para ser executado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double faturamento = 0, imposto = 0;
        
        System.out.println("Exercício 07, Calcular Imposto.");

        faturamento = GetValues.getDoubleInput("Informe o valor do faturamento: ", scanner);
        imposto = GetValues.getDoubleInput("Informe o valor do imposto em %: ", scanner);
        
        try {
            System.out.println("Valor do faturamento: R$" + faturamento);
            System.out.println("Imposto: " + imposto + "%");
            imposto = (faturamento * (imposto / 100 + 1)) - faturamento;
            System.out.println("Valor do Imposto: R$" + String.format("%.2f", imposto));
            System.out.println("Faturamento Final: R$" + String.format("%.2f", (faturamento - imposto)));
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