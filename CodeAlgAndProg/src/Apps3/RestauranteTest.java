package Apps3;
import GeneralClasses3.Restaurante;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {
    
    private Restaurante restaurante;
    
    @Before
    public void setUp() {
        restaurante = new Restaurante("Italian Palace", "123 Food St", 5551234);
    }
    
    @Test
    public void testDefaultConstructor() {
        Restaurante testRest = new Restaurante();
        assertNotNull(testRest);
    }
    
    @Test
    public void testConstructorFull() {
        assertNotNull(restaurante);
        assertEquals("Italian Palace", restaurante.getNombre());
        assertEquals("123 Food St", restaurante.getDireccion());
        assertEquals(5551234, restaurante.getTelefono());
    }
    
    @Test
    public void testGetters() {
        assertEquals("Italian Palace", restaurante.getNombre());
        assertEquals("123 Food St", restaurante.getDireccion());
        assertEquals(5551234, restaurante.getTelefono());
    }
    
    @Test
    public void testAddToMenu() {
        boolean result = restaurante.altaMenu("Pizza", "Margherita with cheese", 14.99);
        assertTrue(result);
        assertEquals(1, restaurante.getTotMenuPlatillos());
    }
    
    @Test
    public void testAddMultipleToMenu() {
        restaurante.altaMenu("Pizza", "Margherita with cheese", 14.99);
        restaurante.altaMenu("Pasta", "Spaghetti carbonara", 12.99);
        restaurante.altaMenu("Risotto", "Mushroom risotto", 13.99);
        
        assertEquals(3, restaurante.getTotMenuPlatillos());
    }
    
    @Test
    public void testAddDishToTable() {
        boolean result = restaurante.altaPlatillo("Pizza", "Margherita with cheese", 14.99, 0);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleDishesToTable() {
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        restaurante.altaPlatillo("Pasta", "Carbonara", 12.99, 0);
        restaurante.altaPlatillo("Soup", "Minestrone", 8.99, 0);
        assertTrue(true);
    }
    
    @Test
    public void testCalculateBillForTable() {
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        restaurante.altaPlatillo("Pasta", "Carbonara", 12.99, 0);
        
        double total = restaurante.totPagarXMesa(0);
        assertEquals(27.98, total, 0.01);
    }
    
    @Test
    public void testTableWithFewestDishes() {
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        
        restaurante.altaPlatillo("Pasta", "Carbonara", 12.99, 1);
        
        int table = restaurante.mesaMenosAlim();
        assertEquals(1, table);
    }
    
    @Test
    public void testTableWithLowestBill() {
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        
        restaurante.altaPlatillo("Pasta", "Carbonara", 12.99, 1);
        
        int table = restaurante.mesaMinGasto();
        assertEquals(1, table);
    }
    
    @Test
    public void testClearTable() {
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        restaurante.altaPlatillo("Pasta", "Carbonara", 12.99, 0);
        
        boolean result = restaurante.bajaMesa(0);
        assertTrue(result);
    }
    
    @Test
    public void testMostExpensiveDish() {
        restaurante.altaMenu("Pizza", "Margherita", 14.99);
        restaurante.altaMenu("Lobster", "Fresh lobster tail", 45.99);
        restaurante.altaMenu("Pasta", "Carbonara", 12.99);
        
        String expensive = restaurante.alimMasCaro();
        assertNotNull(expensive);
        assertTrue(expensive.contains("45.99"));
    }
    
    @Test
    public void testToStringRestaurante() {
        restaurante.altaPlatillo("Pizza", "Margherita", 14.99, 0);
        
        String result = restaurante.toStringRestaurante();
        assertNotNull(result);
    }
}
