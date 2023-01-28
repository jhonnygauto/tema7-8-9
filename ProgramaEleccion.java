import java.io.InputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class ProgramaEleccion {
    public static void main(String[] args) {
        /*
        - Crear mapa capitales
        - Agregar claves(keys) y valores(values)
        - Imprimir en consola el mapa capitales
         */
        Map <String, String> capitales = new HashMap<>();

        capitales.put("Paraguay", "Asunción");
        capitales.put("Brasil", "Brasilia");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Chile", "Santiago");
        capitales.put("Colombia", "Bogotá");

        System.out.println("---Mapa capitales:\n" + capitales);

//      ------------------------------------------------------------------------------------------------------
        /*
        - Instanciar e inicializar objeto PrintStream
        - Como parámetro crear fichero mapa.txt
        - Con el método println escribir en el fichero el mapa capitales
         */
        try {
            PrintStream ps = new PrintStream("C:mapa.txt");
            ps.println(capitales);
            ps.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//      ------------------------------------------------------------------------------------------------------
        /*
        - Instanciar e inicializar objeto InputStream
        - Nuevo FileInputStram como parámetro la ruta y nombre del fichero creado anteriormente
        - Crear un array de binarios y cargar los datos del fichero leído
        - Recorrer array y mostrar por consola el fichero
         */
        try {
            InputStream is = new FileInputStream("C:\\Users\\Windows 7\\IdeaProjects\\tema-7-8-9\\mapa.txt");

            System.out.println("---InputStream: ");
            byte []datos = is.readAllBytes();
            for (byte dato : datos){
                System.out.print((char)dato);
            }
            is.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//      ------------------------------------------------------------------------------------------------------
        /*
        - ArrayList de las claves(keys) e imprimir por consola
         */
        List<String> listaKeys = new ArrayList<>(capitales.keySet());
        System.out.println("---ArrayList:\n" + listaKeys);

        /*
        - Vector de los valores(values) e imprimir por consola
         */
        Vector <String> vectorValues = new Vector<>(capitales.values());
        System.out.println("---Vector:\n " + vectorValues);

        /*
        - Array String de los valores(values) e imprimir por consola
         */
        System.out.println("---Array String");
        String[] arrayValues = capitales.values().toArray(new String[0]);
        for (String arrayValue : arrayValues) {
            System.out.println(arrayValue);
        }


    }
}
