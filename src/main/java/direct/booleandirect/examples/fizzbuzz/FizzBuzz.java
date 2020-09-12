package direct.booleandirect.examples.fizzbuzz;

import java.util.Optional;

public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().run();
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(printFizzBuzz(i));
        }
    }

    public String printFizzBuzz(int i) {
        return Optional.of(i)
                .map(v -> (v % 3 == 0 ? "Fizz" : "") + (v % 5 == 0 ? "Buzz" : ""))
                .map(v -> v.isEmpty() ? String.valueOf(i) : v)
                .get();
    }
}
