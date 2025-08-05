import java.util.List;

public class Challenge8 {
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        Integer sumOfDigits = list.stream()
                .reduce(0, Integer::sum);

        System.out.println("Soma dos dígitos: " + sumOfDigits);
    }
}
