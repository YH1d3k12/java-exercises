package Utilidades;
import java.util.Scanner;


public class GetValues {
    // Recebe o scanner como parâmetro para evitar a criação de um novo scanner.
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


    // Recebe o scanner como parâmetro para evitar a criação de um novo scanner.
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


    // Função especial para a prova, pois conceito só pode ser entre 0 a 3.
    public static Integer getConceptInput(String text, Scanner scanner) {
        Integer value = 0;
        boolean valid;
        do {
            valid = false;
            // Printa um texto informativo.
            System.out.print(text);
            try { 
                value = scanner.nextInt();
                if (value == 0 || value == 1 || value == 2 || value == 3) {
                    valid = true;
                }
                // System.out.println("Valor informado: " + value);
            }
            catch (Exception e) {
                System.out.println("Valor invalido!\nErro: " + e);
                scanner.next(); // Limpa o buffer do scanner.
            }
        } while (!valid);
        return value;
    }


    
    // Recebe o scanner como parâmetro para evitar a criação de um novo scanner.
    public static String getStringInput(String text, Scanner scanner) {
        String value = "";
        boolean valid;
        do {
            valid = false;
            // Printa um texto informativo.
            System.out.print(text);
            try { 
                value = scanner.next();
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