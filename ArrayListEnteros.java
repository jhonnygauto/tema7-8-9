import java.util.ArrayList;

public class ArrayListEnteros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }
//        }

        for (int i = numeros.size() - 1; i >= 0; i--){
            if ((numeros.get(i) % 2) == 0){
                //System.out.println(numeros.indexOf(numeros.get(i)));
                numeros.remove(i);
            }
        }

        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + "\t");
        }

    }
}
