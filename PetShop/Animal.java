package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;


public class Animal {
    public Integer id;
    public String nome;
    public String raca;
    public Double peso;
    public Integer idCategoriaAnimal;
    public Integer idTutor;

    public Animal (
        Integer id,
        String nome,
        String raca,
        Double peso,
        Integer idCategoriaAnimal,
        Integer idTutor
    ) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idCategoriaAnimal = idCategoriaAnimal;
        this.idTutor = idTutor;
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


    public static void listAnimal(
        ArrayList<Animal> listaAnimal,
        ArrayList<Tutor> listaTutor,
        ArrayList<CategoriaAnimal> listaCategoriaAnimal
    ) {
        for (int i = 0; i < listaAnimal.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaAnimal.get(i).toString(listaTutor, listaCategoriaAnimal));
        }
    }


    public static ArrayList<Animal> MockDataAnimal(ArrayList<Animal> listaAnimal) {
        Animal novoAnimal;

        novoAnimal = new Animal(1, "Mongodongo", "Shiba", 10.4, 1, 1);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(2, "Xurupipa", "fdp", 5.0, 3, 1);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(3, "Satanaz Carvalho", "Chihuahua ", 0.1, 1, 2);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(4, "Tom", "Cartoon ", 99.9, 2, 3);
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(5, "Vagabundeco", "Mico Ladrao Safado ", 1.5, 4, 3);
        listaAnimal.add(novoAnimal);

        return listaAnimal;
    }
}