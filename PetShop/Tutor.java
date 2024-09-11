package PetShop;

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
}