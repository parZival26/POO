import java.time.LocalDate;

public class zoologico {
    public static void main(String[] args){
        Perro zeusPerro = new Perro("Zeus", LocalDate.of(2019, 07, 03), "Labrador y Cooker");
        System.out.printf("Hola mi nombre es %s", zeusPerro.getNombre());
        System.out.println(zeusPerro.ladrar());

        Gato bartoloGato = new Gato("Bartolo", LocalDate.of(2005, 06, 02), "Siames", "Negro con Blanco");
        System.out.println(bartoloGato.ronronear());
    }
}
