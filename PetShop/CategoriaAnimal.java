package PetShop;

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
}