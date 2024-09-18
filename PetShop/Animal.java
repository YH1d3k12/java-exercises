package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;


public class Animal {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String nome;
    public String raca;
    public Double peso;
    public Integer idCategoriaAnimal;
    public Integer idTutor;
    // Lista.
    private static ArrayList<Animal> listaAnimal = new ArrayList<>();

    // Construtor.
    public Animal (
        String nome,
        String raca,
        Double peso,
        Integer idCategoriaAnimal,
        Integer idTutor
    ) {
        this.id = autoIncrementId;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idCategoriaAnimal = idCategoriaAnimal;
        this.idTutor = idTutor;

        autoIncrementId++;
    };


    public String toString(
        ArrayList<Tutor> listaTutor,
        ArrayList<CategoriaAnimal> listaCategoriaAnimal
    ) {
        String nomeTutor = "";
        String descricaoCategoriaAnimal = "";

        for (int i = 0; i < listaTutor.size(); i++) {
            if (listaTutor.get(i).id == idTutor) {
                nomeTutor = listaTutor.get(i).nome;
                break;
            }
        }

        for (int j = 0; j < listaCategoriaAnimal.size(); j++) {
            if (listaCategoriaAnimal.get(j).id == idCategoriaAnimal) {
                descricaoCategoriaAnimal = listaCategoriaAnimal.get(j).descricao;
                break;
            }
        }

        return (
            "ID: " + id + 
            "\nNome: " + nome + 
            "\nRaça: " + raca + 
            "\nPeso: " + peso + 
            "\nCategoria Animal: " + descricaoCategoriaAnimal +
            "\nTutor: " + nomeTutor
        );
    }


    public static ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }


    // |--------------------------------------------------|
    // |--------------------- Animal ---------------------|
    // |--------------------------------------------------|
    public static Animal createAnimal(Scanner scanner) {
        // Captura os campos necessários.
        String nome = Utilidades.GetValues.getStringInput("Informe o nome do animal: ", scanner);
        String raca = Utilidades.GetValues.getStringInput("Informe a raça do animal: ", scanner);
        Double peso = Utilidades.GetValues.getDoubleInput("Informe o peso do animal: ", scanner);

        // Futuramente implementar do while e função que garanta que o id de categoria exista.
        Integer idCategoriaAnimal = Utilidades.GetValues.getIntInput("Informe o id da categoria do animal: ", scanner);
        Integer idTutor = Utilidades.GetValues.getIntInput("Informe o id da categoria do animal: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Animal novoAnimal = new Animal(nome, raca, peso, idCategoriaAnimal, idTutor);
        listaAnimal.add(novoAnimal);
        return novoAnimal;
    }


    public static void listAnimal(
        ArrayList<Tutor> listaTutor,
        ArrayList<CategoriaAnimal> listaCategoriaAnimal
    ) {
        for (int i = 0; i < listaAnimal.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaAnimal.get(i).toString(listaTutor, listaCategoriaAnimal));
        }
    }


    public static ArrayList<Animal> MockDataAnimal() {
        Animal novoAnimal;

        novoAnimal = new Animal("Mongodongo", "Shiba", 10.4, 1, 1);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal("Xurupipa", "fdp", 5.0, 3, 1);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal("Satanaz Carvalho", "Chihuahua ", 0.1, 1, 2);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal("Tom", "Cartoon ", 99.9, 2, 3);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal("Vagabundeco", "Mico Ladrao Safado ", 1.5, 4, 3);
        listaAnimal.add(novoAnimal);

        return listaAnimal;
    }
}