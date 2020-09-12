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


//        String output = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
//        if (output.isEmpty()) {
//            output = String.valueOf(i);
//        }
        // return output;

//        String output = "";
//        if (i % 3 == 0) {
//            output += "Fizz";
//        }
//        if (i % 5 == 0) {
//            output += "Buzz";
//        }
//        if (output.isEmpty()) {
//            output = String.valueOf(i);
//        }
//        return output;


//        if (i % 3 == 0 && i % 5 == 0) {
//            return "FizzBuzz";
//        } else if (i % 3 == 0) {
//            return "Fizz";
//        } else if (i % 5 == 0) {
//            return "Buzz";
//        } else {
//            return String.valueOf(i);
//        }
    }
}
