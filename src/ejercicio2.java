import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "Álvarez", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        long count = personas.stream()
                .filter(p -> "AaÁáÀà" .indexOf(p.getLastName().charAt(0)) > 0)
                .count();
        System.out.println("Count: " + count);
    }
}
