import java.util.List;

public class Challenge3 {
    // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        boolean allPositive = list.stream().allMatch(n -> n > 0);

        System.out.println("Todos os números são positivos? " + allPositive);
    }
}
