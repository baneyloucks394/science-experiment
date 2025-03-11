  import java.util.*;

class RandomNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}