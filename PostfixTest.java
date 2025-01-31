import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostfixTest {
    private Postfix postfix;

    @BeforeEach
    void setUp() {
        postfix = new Postfix(); 
    }

    @Test
    void testSuma() {
        assertEquals(7, postfix.operate("3 4 +"));
    }

    @Test
    void testResta() {
        assertEquals(2, postfix.operate("5 3 -"));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(15, postfix.operate("5 3 *"));
    }

    @Test
    void testDivision() {
        assertEquals(2, postfix.operate("6 3 /"));
    }

    @Test
    void testModulo() {
        assertEquals(1, postfix.operate("10 3 %"));
    }

    @Test
    void testExpresionCompleja() {
        assertEquals(14, postfix.operate("5 1 2 + 4 * + 3 -"));
    }

    @Test
    void testOperacionVacia() {
        assertEquals(0, postfix.operate(""));
    }

    @Test
    void testOperacionInvalida() {
        assertThrows(IllegalStateException.class, () -> {
            postfix.operate("5 +");
        });
    }
}
