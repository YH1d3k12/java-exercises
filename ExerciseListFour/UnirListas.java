/* 
    -----| Exercício 06 |-----
    6) Crie um programa que una duas listas de inteiros.
*/
package ExerciseListFour;
import java.util.ArrayList;

public class UnirListas {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(1 + i);
            list2.add(11 + i);
        }

        newList.addAll(list);
        newList.addAll(list2);

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
