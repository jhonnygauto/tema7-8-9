public class InvertirString {
    static String stringInverso(String texto){
        String textoInvertido = "";
        for(int i = texto.length() - 1; i >= 0; i--){
            textoInvertido += texto.charAt(i);
        }
        return textoInvertido;
    }
    public static void main(String[] args) {
        System.out.println(stringInverso("Hola Mundo"));
    }
}
