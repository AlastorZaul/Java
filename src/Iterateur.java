import java.util.ArrayList;
import java.util.Iterator;

public class Iterateur {
    public static void main(String[] args) {
        // Créer un ArrayList vide
        ArrayList<String> language = new ArrayList<String>();

        // Ajouter des valeurs dans l'ArrayList
        language.add("Java");
        language.add("PHP");
        language.add("C++");
        language.add("Python");

        Iterator<String> it = language.iterator();
        System.out.println("Les éléments de la liste language sont: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
