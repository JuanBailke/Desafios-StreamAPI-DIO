import java.util.List;

public class Challenge5 {
    //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        double average = list.stream().filter(n -> n > 5).mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println("A média dos números maiores que 5 é: " + average);
    }
}
