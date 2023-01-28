public class ArrayBidimensional {
    public static void main(String[] args) {
        int [][] numeros = {
                {1, 2, 3, 4 ,5 },
                {6, 7, 8, 9, 10}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Posición:[" + i + "][" + j + "] Valor: " + numeros[i][j]);
            }
            System.out.println();
        }
    }
}
