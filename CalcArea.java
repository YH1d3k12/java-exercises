/* 
    -----| Exercício 02 |-----
    2) Crie um programa que calcule a área (lado1 * lado2).
*/
import java.util.Scanner;


// Nome da classe deve ser o mesmo do arquivo.
public class CalcArea {

    // Função provida pelo gpt para executar um "clear" no terminal. "Melhor deixar por fora, funções de terminal tendem a dar errado -- Jackson".
    /*
        public static void clear() {
            try {
                // Executa o comando "cls" do Windows.
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    */


    /*
        Em Java, o tipo de uma variável é determinado em tempo de compilação e não pode ser verificado diretamente em tempo de execução. 
        Portanto, não é possível verificar diretamente se um valor não é do tipo double através de um if ou outros controles de fluxo típicos.
        - GPT.
    */

    // Tudo precisa estar dentro do main para ser executado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        double lado1 = 0, lado2 = 0;
        
        System.out.println("Exercício 02, Calcular Área.");
        // Removido por recomendação do professor.
        // clear();

        do {
            System.out.println("Informe o valor do primeiro lado: ");
            try { 
                lado1 = scanner.nextDouble();
                valid = true;
                System.out.println("Valor informado: " + lado1);
            }
            catch (Exception e) {
                System.out.println("Valor invalido!");
                scanner.next(); // Limpa o buffer do scanner.
            }
        } while (!valid);

        try {
            System.out.println("Informe o valor do segundo lado: ");
            lado2 = scanner.nextDouble();
            
            System.out.println("O valor da área é: " + (lado1 * lado2));
        } catch (Exception e) {
            System.out.println("Você digitou valores invalidos, execute novamente.");
        } finally {
            // Boa práticar fechar o scanner após o seu uso.
            scanner.close();
        }
    }
}