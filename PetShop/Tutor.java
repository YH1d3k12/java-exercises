package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;


public class Tutor {
    // Outros.
    private static Integer autoIncrementId = 1;
    // Atributos.
    public Integer id;
    public String nome;
    public String telefone;
    public String email;
    // Lista.
    private static ArrayList<Tutor> listaTutor = new ArrayList<>();

    // Construtor.
    public Tutor (
        String nome,
        String telefone,
        String email
    ) {
        this.id = autoIncrementId;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

        autoIncrementId++;
    };


    public String toString() {
        return "ID: " + id + "\nNome: " + nome;
    }


    public static ArrayList<Tutor> getListaTutor() {
        return listaTutor;
    }

    // |--------------------------------------------------|
    // |---------------------- Tutor ---------------------|
    // |--------------------------------------------------|
    public static Tutor createTutor(Scanner scanner) {
        // Captura os campos necessários.
        String nome = Utilidades.GetValues.getStringInput("Informe o nome do tutor: ", scanner);
        String telefone = Utilidades.GetValues.getStringInput("Informe o telefone do tutor: ", scanner);
        String email = Utilidades.GetValues.getStringInput("Informe o email do tutor: ", scanner);
        
        // Cria um novo objeto e o retorna.
        Tutor novoTutor = new Tutor(nome, telefone, email);
        return novoTutor;
    }


    public static void listTutor(
        ArrayList<Animal> listaAnimal
    ) {
        int contador = 0;
        
        for (int i = 0; i < listaTutor.size(); i++) {
            System.out.println("---------------------------------------------------\n" + listaTutor.get(i));
            for (int j = 0; j < listaAnimal.size(); j++) {
                if (listaAnimal.get(j).idTutor == listaTutor.get(i).id) {
                    contador++;
                }
            }
            System.out.println("Quantidade de Animais do Tutor: " + contador);
            contador = 0;
        }
    }


    public static ArrayList<Tutor> MockDataTutor() {
        Tutor novoTutor;

        novoTutor = new Tutor("Samuel Perinlongo Kutz", "9999-9999", "pernilongo@hotmail.com");
        listaTutor.add(novoTutor);

        novoTutor = new Tutor("Luiz T-Rex Cordeiro", "2424-2424", "trexti@gmail.com");
        listaTutor.add(novoTutor);

        novoTutor = new Tutor("Miguel Marcha Ré Gonçalvez", "1111-1111", "miguel@hotmail.com");
        listaTutor.add(novoTutor);

        return listaTutor;
    }
}