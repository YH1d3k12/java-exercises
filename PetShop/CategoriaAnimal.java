package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;


public class CategoriaAnimal {
    public Integer id;
    public String descricao;

    public CategoriaAnimal (
        Integer id,
        String descricao
    ) {
        this.id = id;
        this.descricao = descricao;
    };


    public String toString() {
        return "ID: " + id + "\nDescrição: " + descricao;
    }

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


    public static void listCategoriaAnimal(
        ArrayList<CategoriaAnimal> listaCategoriaAnimal,
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


    public static ArrayList<CategoriaAnimal> MockDataCategoriaAnimal(ArrayList<CategoriaAnimal> listaCategoriaAnimal) {
        CategoriaAnimal novoCategoriaAnimal;

        novoCategoriaAnimal = new CategoriaAnimal(1, "Cachorro");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal(2, "Gato");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal(3, "Calango");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        novoCategoriaAnimal = new CategoriaAnimal(4, "Mico");
        listaCategoriaAnimal.add(novoCategoriaAnimal);

        return listaCategoriaAnimal;
    }
}