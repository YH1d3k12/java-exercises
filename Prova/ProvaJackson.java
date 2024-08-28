package Prova;

import java.util.ArrayList;
import java.util.Scanner;
import Utilidades.GetValues;
import Prova.Aluno;


public class ProvaJackson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Integer action = 0, qtdO = 0, qtdB = 0, qtdS = 0, qtdI = 0, conceito, conceitoMaisAlto = 0;
        String nomeAluno;

        System.out.println("Consulta de Conceitos dos Alunos.");

        do {
            action = GetValues.getIntInput("Escolha uma opção do menu: \n[1] - Inserir Aluno\n[2] - Consultar Notas\n[3] - Exibir Quantidade de Cada Conceito\n[4] - Melhor Aluno\n[5] - Encerrar o Programa", scanner);
            switch (action) {
                case 1:
                    nomeAluno = GetValues.getStringInput("Digite o nome do aluno: ", scanner);
                    conceito = GetValues.getConceptInput("Informe o conceito: ", scanner);
                    Aluno novoAluno = new Aluno(nomeAluno, conceito);
                    listaAlunos.add(novoAluno);
                    break;
                case 2: 
                    for(Aluno value:listaAlunos) {
                       System.out.println(value);
                       System.out.println(value.getConceitoCaracter());
                    }
                    break;
                case 3:
                    // Resetando os valores.
                    qtdO = 0; 
                    qtdB = 0; 
                    qtdS = 0; 
                    qtdI = 0;

                    for(int i = 0; i < listaAlunos.size(); i++) {
                        Aluno alunoAtual = listaAlunos.get(i);
                        if (alunoAtual.conceito == 0) {
                            qtdI++;
                        }
                        else if (alunoAtual.conceito == 1) {
                            qtdS++;
                        }
                        else if (alunoAtual.conceito == 2) {
                            qtdB++;
                        }
                        else if (alunoAtual.conceito == 3) {
                            qtdO++;
                        }
                    }
                    System.out.println("Quantidade de Ótimos: " + qtdO);
                    System.out.println("Quantidade de Bom: " + qtdB);
                    System.out.println("Quantidade de Satisfatorios: " + qtdS);
                    System.out.println("Quantidade de Insatisfatorios: " + qtdI);
                    break;
                case 4: 
                    // ESTAVAMOS SEM TEMPO SOR, MALS AE, NÓS TRANSFORMARIAMOS EM FUNÇÃO ; -;
                    for(int i = 0; i < listaAlunos.size(); i++) {
                        Aluno alunoAtual = listaAlunos.get(i);

                        if (alunoAtual.getConceito() > conceitoMaisAlto) {
                            conceitoMaisAlto = alunoAtual.getConceito();
                        }
                    }
                    for (int i = 0; i < listaAlunos.size(); i++){
                        Aluno alunoAtual = listaAlunos.get(i);
                        if (alunoAtual.conceito == conceitoMaisAlto) {
                            System.out.println(alunoAtual);
                            System.out.println(alunoAtual.getConceitoCaracter());
                        }
                    }
                    break;
                default:
                System.out.println("Opção Inválida, digite novamente.");
                    break;
            }

        } while (action != 5);
    }
}