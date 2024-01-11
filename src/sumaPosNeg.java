import java.util.ArrayList;

public class sumaPosNeg {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(7);
        numeros.add(-3);
        numeros.add(1);
        numeros.add(-9);

        Long positivos = numeros.stream()
                .filter(n -> n > 0)
                .count();
        Long negativos = numeros.stream()
                .filter(n -> n < 0)
                .count();

        System.out.println("Hay " + positivos + " números positivos y " + negativos + " negativos");
    }
}
