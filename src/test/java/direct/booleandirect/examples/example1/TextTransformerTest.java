package direct.booleandirect.examples.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTransformerTest {

    @Test
    void toUpperCase() {
        var textTransformer = new TextTransformer();
        var result = textTransformer.toUpperCase("farts");
        assertEquals("FARTS", result);
    }
}