package School;

public class Person {
    private String name;
    private String birthday;
    private String cpf;

    // Constructor.
    public Person(
        String name,
        String birthday,
        String cpf
    ) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
    }

    // Setters.
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    // Getters.
    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthday;
    }

    public String getCPF() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name
            + "\nData de Nascimento: " + this.birthday
            + "\nCPF: " + this.cpf;
    }
}