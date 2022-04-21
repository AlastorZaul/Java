import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        //Créer une liste des entiers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // incrémenter et afficher les éléments de la liste
        list.stream().map(x -> x + 1).forEach(System.out::println);

        //Créer une liste des strings
        List<String> liste = Arrays.asList("a", "b", "c", "waytolearnx");

        // convertir des minuscules en majuscules
        List<String> res = liste.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // afficher le nouveau stream
        System.out.println(res);
    }
}
