import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private Stack<Integer> stack;

    @Before
    public void setUp(){
        stack = new Stack<>();
    }

    @Test
    public void testPushPop(){
        //Para push
        stack.push(2);
        stack.push(4);
        stack.push(6);

        assertEquals((Integer) 6, stack.last());

        //Para pop
        assertEquals((Integer) 6, stack.last());

        assertEquals((Integer) 6, stack.pop());
        assertEquals((Integer) 4, stack.pop());
        assertEquals((Integer) 2, stack.pop());

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testLastOnEmpty() {
        // Verificar lanzar excepción cuando se llama a last() en un stack vacío.
        try {
            stack.last();
            fail("Debe lanzar IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    public void testPopOnEmptyStack() {
        // Verificar que lanzar excepción cuando se hace pop en un stack vacío.
        try {
            stack.pop();
            fail("Debe lanzar IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    public void testIsEmpty() {
        // Verificar que el stack está vacío.
        assertTrue(stack.isEmpty());

        // Verificar que el stack no está vacío después de push.
        stack.push(1);
        assertFalse(stack.isEmpty());

        // Verificar que el stack está vacío después de pop.
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
