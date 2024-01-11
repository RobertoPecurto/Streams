import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce unas cuantas cadenas. Para finalizar utiliza el enter");
        String cadena;
        while (miScanner.hasNextLine()){
            cadena = miScanner.nextLine();
            cadenas.add(cadena);
            if (cadena.isBlank()){
                break;
            }
        }
        cadenas.stream()
                .forEach(System.out::println);
    }
}
