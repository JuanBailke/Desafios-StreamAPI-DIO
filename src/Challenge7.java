import java.util.List;

public class Challenge7 {
    //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        Integer secondHighest = list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("O segundo maior número da lista é: " + secondHighest);
    }
}
