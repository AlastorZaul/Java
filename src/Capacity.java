import java.util.ArrayList;

public class Capacity {
    /**
     * Méthode qui permet d'augmenter la capacité d'une liste
     */
    public static void main(String[] args) {
        // Créer un ArrayList vide avec une capacité de 4
        ArrayList<String> language = new ArrayList<String>(4);

        // Ajouter des valeurs dans l'ArrayList
        language.add("Java");
        language.add("PHP");
        language.add("C++");
        language.add("Python");

        //Augmenter la capacité à 20
        language.ensureCapacity(20);

        // Afficher les éléments dans l'ArrayList
        for (String s : language) {
            System.out.println(s);
        }
    }
}
