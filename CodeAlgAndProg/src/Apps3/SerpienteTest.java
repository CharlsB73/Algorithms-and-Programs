package Apps3;
import GeneralClasses3.Serpiente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SerpienteTest {
    
    private Serpiente serpiente;
    
    @Before
    public void setUp() {
        serpiente = new Serpiente("Python", 101, "Carnívoro", 1);
    }
    
    @Test
    public void testConstructorWithClaveOnly() {
        Serpiente testSnake = new Serpiente(999);
        assertNotNull(testSnake);
        assertEquals(999, testSnake.getClave());
    }
    
    @Test
    public void testConstructorFull() {
        assertNotNull(serpiente);
        assertEquals("Python", serpiente.getNombre());
        assertEquals(101, serpiente.getClave());
        assertEquals("Carnívoro", serpiente.getAlimentacion());
        assertEquals(1, serpiente.getTipo());
    }
    
    @Test
    public void testGetNombre() {
        assertEquals("Python", serpiente.getNombre());
    }
    
    @Test
    public void testGetClave() {
        assertEquals(101, serpiente.getClave());
    }
    
    @Test
    public void testGetAlimentacion() {
        assertEquals("Carnívoro", serpiente.getAlimentacion());
    }
    
    @Test
    public void testGetTipo() {
        assertEquals(1, serpiente.getTipo());
    }
    
    @Test
    public void testEquals() {
        Serpiente other = new Serpiente("Cobra", 101, "Carnívoro", 2);
        assertTrue(serpiente.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        Serpiente other = new Serpiente("Anaconda", 102, "Carnívoro", 1);
        assertFalse(serpiente.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        Serpiente other = new Serpiente("Cobra", 105, "Carnívoro", 1);
        int result = serpiente.compareTo(other);
        assertTrue(result < 0);
    }
    
    @Test
    public void testToString() {
        String result = serpiente.toString();
        assertNotNull(result);
        assertTrue(result.contains("Python"));
        assertTrue(result.contains("101"));
    }
}
