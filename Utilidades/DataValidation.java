package Utilidades;

public class DataValidation {
    public static boolean isValidCPF(String cpf) {
        // Remove caracteres não numéricos.
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se tem 11 dígitos.
        if (cpf.length() != 11) {
            return false;
        }
        else {
            return true;
        }
    }
}
