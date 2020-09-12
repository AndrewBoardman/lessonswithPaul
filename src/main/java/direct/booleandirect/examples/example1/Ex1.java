package direct.booleandirect.examples.example1;

import direct.booleandirect.examples.example1.TextTransformer;

public class Ex1 {
    public static void main(String[] args) {
        var textTransformer = new TextTransformer();
        System.out.println(textTransformer.toUpperCase("fannies are nice"));
    }
}
