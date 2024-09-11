package PetShop;

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

    public String toString() {
        return (
            "ID: " + id + 
            "\nNome: " + nome + 
            "\nRaça: " + raca + 
            "\nPeso: " + peso + 
            "\nCategoria Animal: " + idCategoriaAnimal +
            "\nTutor: " + idTutor
        );
    }
}