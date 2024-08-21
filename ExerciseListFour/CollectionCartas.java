/* 
    -----| Exercício 05 |-----
    5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas.
*/
package ExerciseListFour;
import java.util.HashMap;

public class CollectionCartas {
    
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        String[] nomes = {
            "Ás de Espadas", "2 de Espadas", "3 de Espadas", "4 de Espadas", "5 de Espadas", "6 de Espadas", "7 de Espadas", "8 de Espadas", "9 de Espadas", "10 de Espadas", "Valete de Espadas", "Dama de Espadas", "Rei de Espadas",
            "Ás de Copas", "2 de Copas", "3 de Copas", "4 de Copas", "5 de Copas", "6 de Copas", "7 de Copas", "8 de Copas", "9 de Copas", "10 de Copas", "Valete de Copas", "Dama de Copas", "Rei de Copas",
            "Ás de Ouros", "2 de Ouros", "3 de Ouros", "4 de Ouros", "5 de Ouros", "6 de Ouros", "7 de Ouros", "8 de Ouros", "9 de Ouros", "10 de Ouros", "Valete de Ouros", "Dama de Ouros", "Rei de Ouros",
            "Ás de Paus", "2 de Paus", "3 de Paus", "4 de Paus", "5 de Paus", "6 de Paus", "7 de Paus", "8 de Paus", "9 de Paus", "10 de Paus", "Valete de Paus", "Dama de Paus", "Rei de Paus"
        };

        System.out.println("Exercício 05, Collection de Cartas.");
        for (int i = 0; i < 52; i++) {
            map.put(i, nomes[i]);
            System.out.println(map.get(i));
        }
    }
}
