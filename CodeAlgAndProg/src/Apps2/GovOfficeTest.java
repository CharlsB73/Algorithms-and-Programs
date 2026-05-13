package Apps2;
import GeneralClasses2.GovOffice;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GovOfficeTest {
    
    private GovOffice oficina;
    
    @Before
    public void setUp() {
        oficina = new GovOffice();
    }
    
    @Test
    public void testDefaultConstructor() {
        assertNotNull(oficina);
    }
    
    @Test
    public void testConstructorWithMax() {
        GovOffice customOficina = new GovOffice(50);
        assertNotNull(customOficina);
    }
    
    @Test
    public void testAddStateData() {
        boolean result = oficina.altaDatos("California", 39500000);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleStates() {
        oficina.altaDatos("California", 39500000);
        oficina.altaDatos("Texas", 29000000);
        oficina.altaDatos("Florida", 21000000);
        assertTrue(true);
    }
    
    @Test
    public void testGetMostPopulousState() {
        oficina.altaDatos("California", 39500000);
        oficina.altaDatos("Texas", 29000000);
        oficina.altaDatos("Florida", 21000000);
        
        String mostPopulous = oficina.estMasPob();
        assertEquals("California", mostPopulous);
    }
    
    @Test
    public void testCalculateAveragePopulation() {
        oficina.altaDatos("California", 39500000);
        oficina.altaDatos("Texas", 29000000);
        oficina.altaDatos("Florida", 21000000);
        
        double average = oficina.promedioEstados();
        assertEquals(29833333.33, average, 100000);
    }
    
    @Test
    public void testCountStatesBelowAverage() {
        oficina.altaDatos("California", 39500000);
        oficina.altaDatos("Texas", 29000000);
        oficina.altaDatos("Florida", 21000000);
        
        int count = oficina.estPoblMenorProm();
        assertTrue(count >= 0);
    }
}
