import java.util.List;

public class Challenge4 {
    //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        list.stream().filter(n -> n % 2 == 0).toList().forEach(System.out::println);
    }
}
