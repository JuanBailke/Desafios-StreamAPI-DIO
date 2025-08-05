import java.util.List;

public class Challenge9 {
    //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        boolean allDistinct = list.stream()
                .distinct()
                .count() == list.size();

        System.out.println("Todos os números são distintos? " + allDistinct);
    }
}
