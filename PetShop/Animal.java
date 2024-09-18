package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;

// Classes.
import PetShop.CategoriaAnimal;
import PetShop.Tutor;

public class Animal {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String nome;
    public String raca;
    public Double peso;
    public CategoriaAnimal categoria;
    public Tutor tutor;
    // Lista.
    private static ArrayList<Animal> listaAnimal = new ArrayList<>();

    // Construtor.
    public Animal (
        String nome,
        String raca,
        Double peso,
        Integer idCategoriaAnimal,
        Integer idTutor,
        ArrayList<Tutor> listaTutor,
        ArrayList<CategoriaAnimal> listaCategoriaAnimal
    ) {
        this.id = autoIncrementId;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        
        for (int i = 0; i < listaTutor.size(); i++) {
            if (listaTutor.get(i).id == idTutor) {
                this.tutor = listaTutor.get(i);
                break;
            }
        }
        
        for (int j = 0; j < listaCategoriaAnimal.size(); j++) {
            if (listaCategoriaAnimal.get(j).id == idCategoriaAnimal) {
                this.categoria = listaCategoriaAnimal.get(j);
                break;
            }
        }

        autoIncrementId++;
    };


    public String toString() {
        return (
            "ID: " + id + 
            "\nNome: " + nome + 
            "\nRaça: " + raca + 
            "\nPeso: " + peso + 
            "\nCategoria Animal: " + categoria.descricao +
            "\nTutor: " + tutor.nome
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
        Animal novoAnimal = new Animal(
            nome, 
            raca, 
            peso, 
            idCategoriaAnimal, 
            idTutor, 
            Tutor.getListaTutor(), 
            CategoriaAnimal.getListaCategoriaAnimal()
        );
        listaAnimal.add(novoAnimal);
        return novoAnimal;
    }


    public static void listAnimal(
        ArrayList<Tutor> listaTutor,
        ArrayList<CategoriaAnimal> listaCategoriaAnimal
    ) {
        for (int i = 0; i < listaAnimal.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaAnimal.get(i));
        }
    }


    public static ArrayList<Animal> MockDataAnimal() {
        Animal novoAnimal;

        novoAnimal = new Animal(
            "Mongodongo", 
            "Shiba", 
            10.4, 
            1, 
            1,    
            Tutor.getListaTutor(),
            CategoriaAnimal.getListaCategoriaAnimal()
        );
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(
            "Xurupipa", 
            "fdp", 
            5.0, 
            3, 
            1,
            Tutor.getListaTutor(),
            CategoriaAnimal.getListaCategoriaAnimal()
        );
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(
            "Satanaz Caralho", 
            "Chihuahua ", 
            0.1, 
            1, 
            2,
            Tutor.getListaTutor(),
            CategoriaAnimal.getListaCategoriaAnimal()
        );
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(
            "Tom", 
            "Cartoon", 
            99.9, 
            2, 
            3,            
            Tutor.getListaTutor(),
            CategoriaAnimal.getListaCategoriaAnimal()
        );
        listaAnimal.add(novoAnimal);

        novoAnimal = new Animal(
            "Vagabundeco", 
            "Mico Ladrao Safado", 
            1.5, 
            4, 
            3,
            Tutor.getListaTutor(),
            CategoriaAnimal.getListaCategoriaAnimal()
        );
        listaAnimal.add(novoAnimal);

        return listaAnimal;
    }
}