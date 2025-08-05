import java.util.List;

public class Challenge10 {
    //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        List<Integer> groupedValues = list.stream()
                .filter(n -> (n % 3 == 0 || n % 5 == 0))
                .distinct()
                .toList();

        System.out.println("Valores ímpares múltiplos de 3 ou 5: " + groupedValues);
    }
}
