import java.util.*;

public class IteratorList {
    public static void main(String[] args) {
        // Créer un ArrayList vide
        ArrayList<String> language = new ArrayList<String>();

        // Ajouter des valeurs dans l'ArrayList
        language.add("Java");
        language.add("PHP");
        language.add("C++");
        language.add("Python");

        System.out.println("Liste des langages :" + language);

        // obtenir un objet ListIterator
       ListIterator it = language.listIterator();

    /* Utilisez les méthodes hasNext() et next() pour
       parcourir les éléments dans l'ordre normal. */
        System.out.println("**** Itéreration dans l'ordre normal ****");
        while(it.hasNext())
            System.out.println(it.next());

    /* Utilisez les méthodes hasPrevious() et previous() pour
       parcourir les éléments dans l'ordre inverse. */
        System.out.println("**** Itéreration dans l'ordre inverse ****");
        while(it.hasPrevious())
            System.out.println(it.previous());
    }
}
