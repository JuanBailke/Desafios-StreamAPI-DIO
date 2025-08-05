import java.util.List;

public class Challenge2 {
    //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> lista = new ListExample().getNumbers();

        int somaPares = lista.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Soma dos números pares: " + somaPares);
    }

}
