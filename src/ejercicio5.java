import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce un números. Para finalizar usa un negativo");
        Integer numero = 0;
        while (miScanner.hasNextLine()){
            numero = miScanner.nextInt();
            if (numero < 0){
                break;
            }
            numeros.add(numero);
        }
        numeros.stream()
                .forEach(System.out::println);
    }
}
