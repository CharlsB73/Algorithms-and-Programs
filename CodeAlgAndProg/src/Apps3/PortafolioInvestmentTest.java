package Apps3;
import GeneralClasses3.PortafolioInvestment;
import GeneralClasses3.Investment;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PortafolioInvestmentTest {
    
    private PortafolioInvestment portafolio;
    
    @Before
    public void setUp() {
        portafolio = new PortafolioInvestment("Retirement Fund");
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(portafolio);
        assertEquals("Retirement Fund", portafolio.getNombre());
        assertEquals(0, portafolio.getTotInv());
    }
    
    @Test
    public void testSetNombre() {
        portafolio.setNombre("College Fund");
        assertEquals("College Fund", portafolio.getNombre());
    }
    
    @Test
    public void testAddInvestment() {
        int total = portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        assertEquals(1, total);
    }
    
    @Test
    public void testAddMultipleInvestments() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        portafolio.altaInversion("Bonds", 3000, 24, 3);
        portafolio.altaInversion("Real Estate", 10000, 36, 6);
        
        assertEquals(3, portafolio.getTotInv());
    }
    
    @Test
    public void testGetInvestment() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        portafolio.altaInversion("Bonds", 3000, 24, 3);
        
        Investment inv = portafolio.getInversiones(0);
        assertNotNull(inv);
    }
    
    @Test
    public void testSearchInvestment() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        portafolio.altaInversion("Bonds", 3000, 24, 3);
        
        boolean found = portafolio.buscaInversion("Bonds");
        assertTrue(found);
    }
    
    @Test
    public void testSearchNonExistentInvestment() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        
        boolean found = portafolio.buscaInversion("Gold");
        assertFalse(found);
    }
    
    @Test
    public void testCountInvestmentsAboveAmount() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        portafolio.altaInversion("Bonds", 3000, 24, 3);
        portafolio.altaInversion("Real Estate", 10000, 36, 6);
        
        int count = portafolio.cuantasInvMayorA(4000);
        assertEquals(2, count);
    }
    
    @Test
    public void testCountInvestmentsAboveAmountNone() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        portafolio.altaInversion("Bonds", 3000, 24, 3);
        
        int count = portafolio.cuantasInvMayorA(15000);
        assertEquals(0, count);
    }
    
    @Test
    public void testEquals() {
        PortafolioInvestment other = new PortafolioInvestment("Retirement Fund");
        assertTrue(portafolio.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        PortafolioInvestment other = new PortafolioInvestment("Savings Fund");
        assertFalse(portafolio.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        PortafolioInvestment other = new PortafolioInvestment("Savings Fund");
        int result = portafolio.compareTo(other);
        assertTrue(result < 0);
    }
    
    @Test
    public void testToString() {
        portafolio.altaInversion("Tech Stocks", 5000, 12, 8);
        
        String result = portafolio.toString();
        assertNotNull(result);
        assertTrue(result.contains("Portafolio"));
        assertTrue(result.contains("Retirement Fund"));
    }
}
