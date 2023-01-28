import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import java.io.IOException;
import java.io.FileNotFoundException;

public class InputPrintImplementar {
    public static void main(String[] args) {
        try {
            InputStream fileIn = new FileInputStream("C://example.txt");

            try {
                byte []datos = fileIn.readAllBytes();
                fileIn.close();

                PrintStream fileOut = new PrintStream("copia.txt");
                fileOut.write(datos);
                fileOut.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
