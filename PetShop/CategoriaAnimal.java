package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;


public class CategoriaAnimal {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String descricao;
    // Lista.
    private static ArrayList<CategoriaAnimal> listaCategoriaAnimal = new ArrayList<>();

    // Construtor.
    public CategoriaAnimal (
        String descricao
    ) {
        this.id = autoIncrementId;
        this.descricao = descricao;

        autoIncrementId++;
    };


    public String toString() {
        return "ID: " + id + "\nDescrição: " + descricao;
    }


    public static ArrayList<CategoriaAnimal> getListaCategoriaAnimal() {
        return listaCategoriaAnimal;
    }

    // |--------------------------------------------------|
    // |---------------- Categoria Animal ----------------|
    // |--------------------------------------------------|
    public static CategoriaAnimal createCategoriaAnimal(Scanner scanner) {
        // Captura os campos necessários.
        String descricao = Utilidades.GetValues.getStringInput("Informe a descrição da categoria: ", scanner);
        
        // Cria um novo objeto e o retorna.
        CategoriaAnimal novaCategoriaAnimal = new CategoriaAnimal(descricao);
        listaCategoriaAnimal.add(novaCategoriaAnimal);
        return novaCategoriaAnimal;
    }


    public static void listCategoriaAnimal(
        ArrayList<Animal> listaAnimal
    ) {
        int contador = 0;

        for (int i = 0; i < listaCategoriaAnimal.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaCategoriaAnimal.get(i));
            for (int j = 0; j < listaAnimal.size(); j++) {
                if (listaAnimal.get(j).idCategoriaAnimal == listaCategoriaAnimal.get(i).id) {
                    contador++;
                }
            }
            System.out.println("Quantidade: " + contador);
            contador = 0;
        }
    }


    public static ArrayList<CategoriaAnimal> MockDataCategoriaAnimal() {
        CategoriaAnimal novoCategoriaAnimal;

        novoCategoriaAnimal = new CategoriaAnimal("Cachorro");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal("Gato");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal("Calango");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal("Mico");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        return listaCategoriaAnimal;
    }
}