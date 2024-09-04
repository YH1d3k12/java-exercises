package ExerciseListFive;

import java.util.ArrayList;
import java.util.Scanner;
import Utilidades.GetValues;

public class MenuPessoa {
    public static void main(String[] args) {
        int opt = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        do {
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - IMC Pessoa");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Sair");
            try {
                opt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scanner.nextLine();
                continue;
            }
            switch (opt) {
                case 1:
                    String nome = GetValues.getStringInput("Digite o nome: ", scanner);
                    Double altura = GetValues.getDoubleInput("Digite a altura: ", scanner);
                    Double peso = GetValues.getDoubleInput("Digite o peso: ", scanner);
                    String dtNasc = GetValues.getStringInput("Digite a data de nascimento: ", scanner);
                    Pessoa pessoa = new Pessoa(nome, altura, peso, dtNasc);
                    pessoas.add(pessoa);
                    break;
                case 2:
                    int pos = GetValues.getIntInput("Digite a posição do Pessoa: ", scanner);
                    if (pos < 0 || pos >= pessoas.size()) {
                        System.out.println("Pessoa não encontrado");
                        break;
                    }
                    System.out.println(pessoas.get(pos).nome + " tem imc de: " + pessoas.get(pos).calcularIMC());
                    break;
                case 3:
                    for (Pessoa PessoaPrint : pessoas) {
                        System.out.println("Nome: " + PessoaPrint.nome);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        } while (opt != 4);

        scanner.close();
    }
}