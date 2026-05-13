package Apps3;
import GeneralClasses3.Investment;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InvestmentTest {
    
    private Investment investment;
    
    @Before
    public void setUp() {
        investment = new Investment("Tech Stocks", 5000, 12, 8);
    }
    
    @Test
    public void testConstructorWithNameOnly() {
        Investment testInv = new Investment("Real Estate");
        assertNotNull(testInv);
        assertEquals("Real Estate", testInv.getNombre());
    }
    
    @Test
    public void testConstructorFull() {
        assertNotNull(investment);
        assertEquals("Tech Stocks", investment.getNombre());
        assertEquals(5000, investment.getMonto(), 0.01);
        assertEquals(12, investment.getPlazo());
        assertEquals(8, investment.getRendimiento());
    }
    
    @Test
    public void testGetMonto() {
        assertEquals(5000, investment.getMonto(), 0.01);
    }
    
    @Test
    public void testSetMonto() {
        investment.setMonto(7500);
        assertEquals(7500, investment.getMonto(), 0.01);
    }
    
    @Test
    public void testGetPlazo() {
        assertEquals(12, investment.getPlazo());
    }
    
    @Test
    public void testSetPlazo() {
        investment.setPlazo(24);
        assertEquals(24, investment.getPlazo());
    }
    
    @Test
    public void testGetNombre() {
        assertEquals("Tech Stocks", investment.getNombre());
    }
    
    @Test
    public void testGetRendimiento() {
        assertEquals(8, investment.getRendimiento());
    }
    
    @Test
    public void testEquals() {
        Investment other = new Investment("Tech Stocks", 3000, 6, 5);
        assertTrue(investment.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        Investment other = new Investment("Bonds", 2000, 24, 3);
        assertFalse(investment.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        Investment other = new Investment("Bonds", 2000, 24, 3);
        int result = investment.compareTo(other);
        assertTrue(result < 0);
    }
    
    @Test
    public void testToString() {
        String result = investment.toString();
        assertNotNull(result);
        assertTrue(result.contains("Investment"));
        assertTrue(result.contains("Tech Stocks"));
    }
}
