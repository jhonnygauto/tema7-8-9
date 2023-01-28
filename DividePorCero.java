public class DividePorCero {
    public static void main(String[] args) throws ArithmeticException{
        try {
            System.out.println(dividePorCero(5));
        }catch (Exception e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
    static int dividePorCero(int numero){
        return numero / 0;
    }
}
