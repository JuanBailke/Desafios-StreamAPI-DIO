import java.util.List;

public class Challenge1 {

    // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        list.stream().sorted().forEach(System.out::println);
    }
}
