import static org.junit.Assert.*;
import org.junit.Test;

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
