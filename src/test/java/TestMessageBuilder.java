import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        assertEquals("GG Gaming Adik-Adik", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber8() {
        assertEquals(8, MessageBuilder.getNumber8());
    }

}
