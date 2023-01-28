import java.util.Vector;

public class VectorImplementar {
    public static void main(String[] args) {
        Vector<Integer> numeros = new Vector<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int i = numeros.size() - 1; i >= 0; i--){
            if(numeros.get(i) == 3 || numeros.get(i) == 2){
                numeros.remove(i);
            }
        }

        System.out.println(numeros);
        System.out.println("Tamaño: " + numeros.size() + " Capacidad: " + numeros.capacity());

        /*
        --El inconveniente de utilizar el Vector es que en el momento de que se rebasa la capacidad(capacity)
        del mismo, este automáticamente lo dobla.
        --Eso hace que ocupe mucha más memoria como en el caso de que hubiera 1000 elementos en el Vector.
         */
    }
}
