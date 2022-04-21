import java.util.Arrays;
import java.util.List;

public class Peek {
    public static void main(String[] args) {
        // Créer une liste des entiers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        // peek sans opération terminal
        list.stream().peek(System.out::println).count();
    }
}
