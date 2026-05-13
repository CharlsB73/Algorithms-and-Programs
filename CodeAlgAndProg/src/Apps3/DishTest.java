package Apps3;
import GeneralClasses3.Dish;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DishTest {
    
    private Dish dish;
    
    @Before
    public void setUp() {
        dish = new Dish("Pasta", "Spaghetti with tomato sauce", 12.99);
    }
    
    @Test
    public void testConstructorWithClave() {
        Dish testDish = new Dish(1);
        assertNotNull(testDish);
        assertEquals(1, testDish.getClave());
    }
    
    @Test
    public void testConstructorFull() {
        assertNotNull(dish);
        assertEquals("Pasta", dish.getNombre());
        assertEquals("Spaghetti with tomato sauce", dish.getDescripcion());
        assertEquals(12.99, dish.getPrecio(), 0.01);
    }
    
    @Test
    public void testGetPrecio() {
        assertEquals(12.99, dish.getPrecio(), 0.01);
    }
    
    @Test
    public void testSetPrecio() {
        dish.setPrecio(15.99);
        assertEquals(15.99, dish.getPrecio(), 0.01);
    }
    
    @Test
    public void testGetters() {
        assertEquals("Pasta", dish.getNombre());
        assertEquals("Spaghetti with tomato sauce", dish.getDescripcion());
        assertNotNull(dish.getClave());
    }
    
    @Test
    public void testEquals() {
        Dish other = new Dish(dish.getClave());
        assertTrue(dish.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        Dish other = new Dish(999);
        assertFalse(dish.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        Dish other = new Dish(100);
        int result = dish.compareTo(other);
        assertTrue(result != 0);
    }
    
    @Test
    public void testToString() {
        String result = dish.toString();
        assertNotNull(result);
        assertTrue(result.contains("Dish"));
        assertTrue(result.contains("Pasta"));
    }
}
