import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        // Créer une liste des string
        List<String> list = Arrays.asList("A", "B", "A", "C", "A", "B", "D");

        // Trouvez toutes les chaines distinctes
        List<String> res = list.stream()
                .distinct()
                .collect(Collectors.toList());

        // Afficher le résultat
        System.out.println(res);
    }
}
