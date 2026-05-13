package Apps3;
import GeneralClasses3.DebuggerContador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DebuggerContadorTest {
    
    private DebuggerContador contador;
    
    @Before
    public void setUp() {
        contador = new DebuggerContador();
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(contador);
        assertEquals(0, contador.getResultado());
    }
    
    @Test
    public void testSumaSingleNumber() {
        contador.sumaN(1);
        assertEquals(0, contador.getResultado());
    }
    
    @Test
    public void testSumaSmallNumbers() {
        contador.sumaN(5);
        // Sum of 0+1+2+3+4 = 10
        assertEquals(10, contador.getResultado());
    }
    
    @Test
    public void testSumaTenNumbers() {
        contador.sumaN(10);
        // Sum of 0 to 9
        assertEquals(45, contador.getResultado());
    }
    
    @Test
    public void testSumaZero() {
        contador.sumaN(0);
        assertEquals(0, contador.getResultado());
    }
    
    @Test
    public void testGetResultado() {
        contador.sumaN(3);
        int result = contador.getResultado();
        assertTrue(result >= 0);
    }
    
    @Test
    public void testToString() {
        String result = contador.toString();
        assertNotNull(result);
        assertTrue(result.contains("Detail Formatter"));
    }
}
