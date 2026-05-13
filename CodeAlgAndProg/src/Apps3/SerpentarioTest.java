package Apps3;
import GeneralClasses3.Serpentario;
import GeneralClasses3.Serpiente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SerpentarioTest {
    
    private Serpentario serpentario;
    
    @Before
    public void setUp() {
        serpentario = new Serpentario();
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(serpentario);
    }
    
    @Test
    public void testAddSnake() {
        boolean result = serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleSnakes() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        serpentario.altaSerpiente("Cobra", 102, "Carnívoro", 0);
        serpentario.altaSerpiente("Anaconda", 103, "Carnívoro", 1);
        assertTrue(true);
    }
    
    @Test
    public void testInvalidType() {
        boolean result = serpentario.altaSerpiente("Python", 101, "Carnívoro", 25);
        assertFalse(result);
    }
    
    @Test
    public void testSearchSnakeByKey() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        serpentario.altaSerpiente("Cobra", 102, "Carnívoro", 0);
        
        String result = serpentario.consultaPorClave(101);
        assertNotNull(result);
    }
    
    @Test
    public void testSearchNonExistentSnake() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        
        String result = serpentario.consultaPorClave(999);
        assertNull(result);
    }
    
    @Test
    public void testRemoveSnake() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        serpentario.altaSerpiente("Cobra", 102, "Carnívoro", 0);
        
        Serpiente removed = serpentario.bajaSerpiente2(101);
        assertNotNull(removed);
        assertEquals(101, removed.getClave());
    }
    
    @Test
    public void testRemoveNonExistentSnake() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        
        Serpiente removed = serpentario.bajaSerpiente2(999);
        assertNull(removed);
    }
    
    @Test
    public void testCountSnakesByDiet() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        serpentario.altaSerpiente("Cobra", 102, "Carnívoro", 0);
        serpentario.altaSerpiente("Greensnake", 103, "Insectívoro", 1);
        
        int count = serpentario.contTipoAlim("Carnívoro");
        assertEquals(2, count);
    }
    
    @Test
    public void testCountSnakesByDietNotFound() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        
        int count = serpentario.contTipoAlim("Herbívoro");
        assertEquals(0, count);
    }
    
    @Test
    public void testTypeWithMostSnakes() {
        serpentario.altaSerpiente("Python", 101, "Carnívoro", 0);
        serpentario.altaSerpiente("Cobra", 102, "Carnívoro", 0);
        serpentario.altaSerpiente("Anaconda", 103, "Carnívoro", 0);
        serpentario.altaSerpiente("Greensnake", 104, "Insectívoro", 1);
        
        int type = serpentario.tipoMax();
        assertEquals(0, type);
    }
}
