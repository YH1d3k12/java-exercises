package PetShop;

// Código de Terceiros.
import java.util.ArrayList;
import java.util.Scanner;


public class Tutor {
    public Integer id;
    public String nome;
    public String telefone;
    public String email;

    public Tutor (
        Integer id,
        String nome,
        String telefone,
        String email
    ) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    };

    public String toString() {
        return "ID: " + id + "\nNome: " + nome;
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


    public static void listTutor(
        ArrayList<Tutor> listaTutor,
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
}