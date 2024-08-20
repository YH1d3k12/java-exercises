package Utilidades;
import java.util.Scanner;


public class GetValues {
    // Passa scanner como parâmetro para evitar a criação de um novo scanner.
    public static double getDoubleInput(String text, Scanner scanner) {
        double value = 0;
        boolean valid;
        do {
            valid = false;
            // Printa um texto informativo.
            System.out.println(text);
            try { 
                value = scanner.nextDouble();
                valid = true;
                // System.out.println("Valor informado: " + value);
            }
            catch (Exception e) {
                System.out.println("Valor invalido!\nErro: " + e);
                scanner.next(); // Limpa o buffer do scanner.
            }
        } while (!valid);
        return value;
    }

    
    public static int getIntInput(String text, Scanner scanner) {
        int value = 0;
        boolean valid;
        do {
            valid = false;
            // Printa um texto informativo.
            System.out.println(text);
            try { 
                value = scanner.nextInt();
                valid = true;
                // System.out.println("Valor informado: " + value);
            }
            catch (Exception e) {
                System.out.println("Valor invalido!\nErro: " + e);
                scanner.next(); // Limpa o buffer do scanner.
            }
        } while (!valid);
        return value;
    }


    public static String getStringInput(String text, Scanner scanner) {
        String value = "";
        boolean valid;
        do {
            valid = false;
            // Printa um texto informativo.
            System.out.println(text);
            try { 
                value = scanner.nextLine();
                valid = true;
                // System.out.println("Valor informado: " + value);
            }
            catch (Exception e) {
                System.out.println("Valor invalido!\nErro: " + e);
                scanner.next(); // Limpa o buffer do scanner.
            }
        } while (!valid);
        return value;
    }
}