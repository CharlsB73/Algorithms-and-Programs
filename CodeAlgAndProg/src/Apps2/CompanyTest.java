package Apps2;
import GeneralClasses2.Company;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    
    private Company company;
    
    @Before
    public void setUp() {
        company = new Company("TechCorp", "456 Tech Ave", "Silicon Valley", "John Doe");
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(company);
        assertEquals("TechCorp", company.getNombre());
        assertEquals("456 Tech Ave", company.getDireccion());
        assertEquals("Silicon Valley", company.getCiudad());
        assertEquals("John Doe", company.getDirector());
    }
    
    @Test
    public void testGetters() {
        assertEquals("TechCorp", company.getNombre());
        assertEquals("456 Tech Ave", company.getDireccion());
        assertEquals("Silicon Valley", company.getCiudad());
        assertEquals("John Doe", company.getDirector());
        assertEquals(0, company.getTotalVentas());
    }
    
    @Test
    public void testAddSale() {
        boolean result = company.altaVentaMes("January", 1000);
        assertTrue(result);
        assertEquals(1, company.getTotalVentas());
    }
    
    @Test
    public void testAddMultipleSales() {
        company.altaVentaMes("January", 1000);
        company.altaVentaMes("February", 1500);
        company.altaVentaMes("March", 1200);
        assertEquals(3, company.getTotalVentas());
    }
    
    @Test
    public void testAverageSales() {
        company.altaVentaMes("January", 1000);
        company.altaVentaMes("February", 2000);
        company.altaVentaMes("March", 3000);
        double average = company.promedioVentas();
        assertEquals(2000, average, 0.1);
    }
    
    @Test
    public void testEquals() {
        Company other = new Company("TechCorp", "789 Other Ave", "New York", "Jane Doe");
        assertTrue(company.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        Company other = new Company("OtherCorp", "789 Other Ave", "New York", "Jane Doe");
        assertFalse(company.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        Company other = new Company("BetterCorp", "789 Other Ave", "New York", "Jane Doe");
        int result = company.compareTo(other);
        assertTrue(result > 0);
    }
    
    @Test
    public void testToString() {
        String result = company.toString();
        assertNotNull(result);
        assertTrue(result.contains("TechCorp"));
        assertTrue(result.contains("456 Tech Ave"));
    }
}
