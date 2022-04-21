import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Melange {
    /**
     * Méthode pour mélanger les éléments d'une liste
     * */
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Java", "PHP", "Python", "C++");
        System.out.println("Liste avant le mélange : "+ l);
        Collections.shuffle(l);
        System.out.println("Liste après le mélange : "+ l);
    }
}
