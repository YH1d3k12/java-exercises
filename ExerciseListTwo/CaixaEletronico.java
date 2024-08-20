/*
    -----| Desafio |-----
    Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
*/

package ExerciseListTwo;

import java.util.Scanner;
import Utilidades.GetValues;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dinheiro = 0, qtdR100 = 0, qtdR50 = 0, qtdR10 = 0, qtdR5 = 0, qtdR2 = 0, qtdR1 = 0;

        System.out.println("Desafio, Caixa Eletronico.");

        dinheiro = GetValues.getIntInput("Informe o dinheiro para sacar em nota: ", scanner);

        do {
            if (dinheiro >= 100) {
                dinheiro -= 100;
                qtdR100++;
            }
        } while (dinheiro >= 100);

        do {
            if (dinheiro >= 50) {
                dinheiro -= 50;
                qtdR50++;
            }
        } while (dinheiro >= 50);

        do {
            if (dinheiro >= 10) {
                dinheiro -= 10;
                qtdR10++;
            }
        } while (dinheiro >= 10);

        do {
            if (dinheiro >= 5) {
                dinheiro -= 5;
                qtdR5++;
            }
        } while (dinheiro >= 5);

        do {
            if (dinheiro >= 2) {
                dinheiro -= 2;
                qtdR2++;
            }
        } while (dinheiro >= 2);

        do {
            if (dinheiro >= 2) {
                dinheiro -= 2;
                qtdR2++;
            }
        } while (dinheiro >= 2);

        do {
            if (dinheiro >= 1) {
                dinheiro -= 1;
                qtdR1++;
            }
        } while (dinheiro >= 1);

        if (qtdR100 >= 1) System.out.println(qtdR100 + " notas de R$100,00");
        if (qtdR50 >= 1) System.out.println(qtdR50 + " notas de R$50,00");
        if (qtdR10 >= 1) System.out.println(qtdR10 + " notas de R$10,00");
        if (qtdR5 >= 1) System.out.println(qtdR5 + " notas de R$5,00");
        if (qtdR2 >= 1) System.out.println(qtdR2 + " notas de R$2,00");
        if (qtdR1 >= 1) System.out.println(qtdR1 + " notas de R$1,00");
    }
}
