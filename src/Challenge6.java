import java.util.List;

public class Challenge6 {
    //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> list = new ListExample().getNumbers();

        boolean hasGreaterThanTen = list.stream().anyMatch(n -> n > 10);

        System.out.println("A lista contém algum número maior que 10? " + hasGreaterThanTen);
    }
}
