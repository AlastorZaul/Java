import java.util.*;

public class TrimToSize {
    public static void main(String[] args) {
        // Créer un ArrayList vide avec une capacité de 100
        ArrayList<String> language = new ArrayList<String>(100);

        // Ajouter des valeurs dans l'ArrayList
        language.add("Java");
        language.add("PHP");
        language.add("C++");
        language.add("Python");
        language.add("JavaScript");

        // réduit la capacité de l'ArrayList
        language.trimToSize();

        // Afficher les éléments dans l'ArrayList
        for (String s : language) {
            System.out.println(s);
        }
    }
}
