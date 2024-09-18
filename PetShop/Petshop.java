package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;

// Meu Código.
import Utilidades.GetValues;

// Classes.
import PetShop.CategoriaAnimal;
import PetShop.Animal;
import PetShop.Tutor;


public class Petshop {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = 0;

        // Mockando os dados nas listas para agilizar os testes.
        CategoriaAnimal.MockDataCategoriaAnimal();        
        Tutor.MockDataTutor();
        Animal.MockDataAnimal();


        System.out.println("Bem Vindo ao Sistema da Pet Shop!");
        do {
            action = GetValues.getIntInput("Escolha uma opção do menu: \n[1] - Cadastrar Categoria de Animal\n[2] - Cadastrar Tutor\n[3] - Cadastrar Animal\n[4] - Listar Categorias de Animais\n[5] - Listar Tutores\n[6] - Listar Animais\n[7] - Encerrar o Programa.", scanner);
            switch (action) {
                case 1:
                    clearTerminalGambiarra();
                    CategoriaAnimal.createCategoriaAnimal(scanner);
                    System.out.println("\n");
                    break;
                case 2:
                    clearTerminalGambiarra();
                    Tutor.createTutor(scanner);
                    System.out.println("\n");
                    break;
                case 3:
                    clearTerminalGambiarra();
                    Animal.createAnimal(scanner);
                    System.out.println("\n");
                    break;
                case 4:
                    clearTerminalGambiarra();
                    CategoriaAnimal.listCategoriaAnimal(Animal.getListaAnimal());
                    System.out.println("\n");
                    break;
                case 5:
                    clearTerminalGambiarra();
                    Tutor.listTutor(Animal.getListaAnimal());
                    System.out.println("\n");
                    break;
                case 6:
                    clearTerminalGambiarra();
                    Animal.listAnimal(Tutor.getListaTutor(), CategoriaAnimal.getListaCategoriaAnimal());
                    System.out.println("\n");
                    break;
                default:
                    break;
            }
        } while (action != 7);
    }


    // Eu faria essas funções de create recebendo os parametros... No entanto para este exercício
    // com intuito de não poluir o menu com informações e focar só na funcionalidade fiz dessa maneira.

    // O único proposito desta função é de limpar o terminal dando um monte de espaçamento :V
    public static void clearTerminalGambiarra() {
        for (int i = 0; i < 10; i++) {
            System.out.println(".");
        }
    }
}