import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCadenas {
    public static void main(String[] args) {
        ArrayList<String> nombres1 = new ArrayList<>();

        nombres1.add("Pablo");
        nombres1.add("Ana");
        nombres1.add("Roberto");
        nombres1.add("Romina");

        System.out.println("ArrayList: ");
        for (String nombre1 : nombres1) {
            System.out.println(nombre1);
        }

        System.out.println("\nLinkedList: ");
        LinkedList<String> nombres2 = new LinkedList<>(nombres1);
        for (String nombre2 : nombres2) {
            System.out.println(nombre2);
        }
    }
}
