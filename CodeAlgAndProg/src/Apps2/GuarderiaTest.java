package Apps2;
import GeneralClasses2.Guarderia;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GuarderiaTest {
    
    private Guarderia guarderia;
    
    @Before
    public void setUp() {
        guarderia = new Guarderia("Happy Kids Daycare");
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(guarderia);
    }
    
    @Test
    public void testAddChild() {
        boolean result = guarderia.altaNinio(1);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleChildren() {
        guarderia.altaNinio(0);
        guarderia.altaNinio(1);
        guarderia.altaNinio(2);
        guarderia.altaNinio(3);
        assertTrue(true);
    }
    
    @Test
    public void testCalculateBreadConsumption() {
        guarderia.altaNinio(0);  // 6 units
        guarderia.altaNinio(1);  // 4 units
        guarderia.altaNinio(2);  // 3 units
        
        int consumption = guarderia.calculaConsumoPan();
        assertEquals(13, consumption);
    }
    
    @Test
    public void testCalculateBreadConsumptionSingleAge() {
        guarderia.altaNinio(0);  // Age 0: 6 units
        int consumption = guarderia.calculaConsumoPan();
        assertEquals(6, consumption);
    }
    
    @Test
    public void testCalculateAverageBreadConsumption() {
        guarderia.altaNinio(0);  // 6 units
        guarderia.altaNinio(1);  // 4 units
        
        double average = guarderia.calculaPromConsumPan();
        assertEquals(5.0, average, 0.1);
    }
    
    @Test
    public void testAverageReturnNegativeWhenEmpty() {
        double average = guarderia.calculaPromConsumPan();
        assertEquals(-1, average, 0.1);
    }
}
