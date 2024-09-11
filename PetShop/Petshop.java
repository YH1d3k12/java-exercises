package PetShop;

import java.util.ArrayList;
import java.util.Scanner;

import Utilidades.GetValues;

import PetShop.CategoriaAnimal;
import PetShop.Animal;
import PetShop.Tutor;


public class Petshop {
    
    // Integer idCategoriaAnimal = 1;
    // Integer idTutor = 1;
    // Integer idAnimal = 1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = 0;
        
        // Mockando os dados nas listas para agilizar os testes.
        ArrayList<CategoriaAnimal> listaCategoriaAnimal = new ArrayList<>();
        listaCategoriaAnimal = MockDataCategoriaAnimal(listaCategoriaAnimal);

        ArrayList<Tutor> listaTutor = new ArrayList<>();
        listaTutor = MockDataTutor(listaTutor);

        ArrayList<Animal> listaAnimal = new ArrayList<>();
        listaAnimal = MockDataAnimal(listaAnimal);


        System.out.println("Bem Vindo ao Sistema da Pet Shop!");
        do {
            action = GetValues.getIntInput("Escolha uma opção do menu: \n[1] - Cadastrar Categoria de Animal\n[2] - Cadastrar Tutor\n[3] - Cadastrar Animal\n[4] - Listar Categorias de Animais\n[5] - Listar Tutores\n[6] - Listar Animais\n[7] - Encerrar o Programa.", scanner);
            switch (action) {
                case 1:
                    clearTerminalGambiarra();
                    listaCategoriaAnimal.add(createCategoriaAnimal(scanner));
                    System.out.println("\n");
                    break;
                case 2:
                    clearTerminalGambiarra();
                    listaTutor.add(createTutor(scanner));
                    System.out.println("\n");
                    break;
                case 3:
                    clearTerminalGambiarra();
                    listaAnimal.add(createAnimal(scanner));
                    System.out.println("\n");
                    break;
                case 4:
                    clearTerminalGambiarra();
                    listCategoriaAnimal(listaCategoriaAnimal);
                    System.out.println("\n");
                    break;
                case 5:
                    clearTerminalGambiarra();
                    listTutor(listaTutor);
                    System.out.println("\n");
                    break;
                case 6:
                    clearTerminalGambiarra();
                    listAnimal(listaAnimal);
                    System.out.println("\n");
                    break;
                default:
                    break;
            }
        } while (action != 7);
    }


    // Eu faria essas funções de create recebendo os parametros... No entanto para este exercício
    // com intuito de não poluir o menu com informações e focar só na funcionalidade fiz dessa maneira.

    // |--------------------------------------------------|
    // |---------------- Categoria Animal ----------------|
    // |--------------------------------------------------|
    public static CategoriaAnimal createCategoriaAnimal(Scanner scanner) {
        // Captura os campos necessários.
        Integer id = Utilidades.GetValues.getIntInput("Informe o id: ", scanner);
        String descricao = Utilidades.GetValues.getStringInput("Informe a descrição da categoria: ", scanner);
        
        // Cria um novo objeto e o retorna.
        CategoriaAnimal novaCategoriaAnimal = new CategoriaAnimal(id, descricao);
        return novaCategoriaAnimal;
    }


    public static void listCategoriaAnimal(ArrayList<CategoriaAnimal> listaCategoriaAnimal) {
        for (int i = 0; i < listaCategoriaAnimal.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaCategoriaAnimal.get(i));
        }
    }


    public static ArrayList<CategoriaAnimal> MockDataCategoriaAnimal(ArrayList<CategoriaAnimal> listaCategoriaAnimal) {
        CategoriaAnimal novoCategoriaAnimal;

        novoCategoriaAnimal = new CategoriaAnimal(1, "Cachorro");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal(2, "Gato");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal(3, "Calango");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        return listaCategoriaAnimal;
    }

    // |--------------------------------------------------|
    // |---------------------- Tutor ---------------------|
    // |--------------------------------------------------|
    public static Tutor createTutor(Scanner scanner) {
        // Captura os campos necessários.
        Integer id = Utilidades.GetValues.getIntInput("Informe o id: ", scanner);
        String nome = Utilidades.GetValues.getStringInput("Informe o nome do tutor: ", scanner);
        String telefone = Utilidades.GetValues.getStringInput("Informe o telefone do tutor: ", scanner);
        String email = Utilidades.GetValues.getStringInput("Informe o email do tutor: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Tutor novoTutor = new Tutor(id, nome, telefone, email);
        return novoTutor;
    }

    public static void listTutor(ArrayList<Tutor> listaTutor) {
        for (int i = 0; i < listaTutor.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaTutor.get(i));
        }
    }


    public static ArrayList<Tutor> MockDataTutor(ArrayList<Tutor> listaTutor) {
        Tutor novoTutor;

        novoTutor = new Tutor(1, "Samuel Perinlongo Kutz", "9999-9999", "pernilongo@hotmail.com");
        listaTutor.add(novoTutor);

        novoTutor = new Tutor(2, "Luiz T-Rex Cordeiro", "2424-2424", "trexti@gmail.com");
        listaTutor.add(novoTutor);

        novoTutor = new Tutor(3, "Miguel Marcha Ré Gonçalvez", "1111-1111", "miguel@hotmail.com");
        listaTutor.add(novoTutor);

        return listaTutor;
    }


    // |--------------------------------------------------|
    // |--------------------- Animal ---------------------|
    // |--------------------------------------------------|
    public static Animal createAnimal(Scanner scanner) {
        // Captura os campos necessários.
        Integer id = Utilidades.GetValues.getIntInput("Informe o id: ", scanner);
        String nome = Utilidades.GetValues.getStringInput("Informe o nome do animal: ", scanner);
        String raca = Utilidades.GetValues.getStringInput("Informe a raça do animal: ", scanner);
        Double peso = Utilidades.GetValues.getDoubleInput("Informe o peso do animal: ", scanner);

        // Futuramente implementar do while e função que garanta que o id de categoria exista.
        Integer idCategoriaAnimal = Utilidades.GetValues.getIntInput("Informe o id da categoria do animal: ", scanner);
        Integer idTutor = Utilidades.GetValues.getIntInput("Informe o id da categoria do animal: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Animal novoAnimal = new Animal(id, nome, raca, peso, idCategoriaAnimal, idTutor);
        return novoAnimal;
    }


    public static void listAnimal(ArrayList<Animal> listaAnimal) {
        for (int i = 0; i < listaAnimal.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaAnimal.get(i));
        }
    }


    public static ArrayList<Animal> MockDataAnimal(ArrayList<Animal> listaAnimal) {
        Animal novoAnimal;

        novoAnimal = new Animal(1, "Mongodongo", "Shiba", 10.4, 1, 1);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(2, "Xurupipa", "fdp", 5.0, 3, 1);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(3, "Satanaz Caralho", "Chihuahua ", 0.1, 1, 2);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(4, "Tom", "Cartoon ", 99.9, 2, 3);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(5, "Vagabundeco", "Mico Ladrao Safado ", 1.5, 2, 3);
        listaAnimal.add(novoAnimal);

        return listaAnimal;
    }

    // O único proposito desta função é de limpar o terminal dando um monte de espaçamento :V
    public static void clearTerminalGambiarra() {
        for (int i = 0; i < 10; i++) {
            System.out.println(".");
        }
    }
}