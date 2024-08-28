package Prova;


public class Aluno {
    public String nome;
    public Integer conceito;

    public Aluno (String nome, Integer conceito) {
        this.nome = nome;
        this.conceito = conceito;
    };

    public String toString() {
        return "Nome: " + nome + ", Conceito: " + conceito;
    }

    public Integer getConceito() {
        return conceito;
    }

    public Character getConceitoCaracter() {
        Character valor = 'I';

        if (conceito == 0) {
            valor = 'I';
        }
        else if (conceito == 1) {
            valor = 'S';
        }
        else if (conceito == 2) {
            valor = 'B';
        }
        else if (conceito == 3) {
            valor = 'O';
        }

        return valor;
    }
}