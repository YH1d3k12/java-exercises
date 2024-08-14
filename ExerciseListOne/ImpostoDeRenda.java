/* 
    -----| Exercício 11 |-----
    11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
    
    Base	                    Alíquota
    Até 1.903,98	            Isento
    De 1.903,99 até 2.826,65	7,5%
    De 2.826,66 até 3.751,05	15%
    De 3.751,06 até 4.664,68	22,5%
    Acima de 4.664,68	        27,5%
*/
package ExerciseListOne;
import java.util.Scanner;
import Utilidades.GetValues;


public class ImpostoDeRenda {
    // Tudo precisa estar dentro do main para ser executado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renda = 0, imposto = 0;
        
        System.out.println("Exercício 11, Informar Taxa de Imposto de Renda.");

        renda = GetValues.getDoubleInput("Informe o valor da renda: ", scanner);
        
        try {
            // Não dá para fazer com switch case, pq ele não aceita float/double pela sua conversão imprecisa.
            if (renda <= 1903.98) {
                imposto = 0;
            }
            else if (renda <=  2826.65) {
                imposto = 7.5;
            }
            else if (renda <=  3751.05) {
                imposto = 15;
            }
            else if (renda <=  4664.68) {
                imposto = 22.5;
            }
            else {
                imposto = 27.5;
            }
            System.out.println("Valor da Renda: R$" + renda);
            System.out.println("Imposto: " + imposto + "%");
            imposto = (renda * (imposto / 100 + 1)) - renda;
            System.out.println("Valor do Imposto: R$" + String.format("%.2f", imposto));
            System.out.println("Renda Final: R$" + String.format("%.2f", (renda - imposto)));
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