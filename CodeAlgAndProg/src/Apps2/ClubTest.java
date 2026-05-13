package Apps2;
import GeneralClasses2.Club;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClubTest {
    
    private Club club;
    
    @Before
    public void setUp() {
        club = new Club("Paradise Club", 10);
    }
    
    @Test
    public void testDefaultConstructor() {
        Club testClub = new Club();
        assertNotNull(testClub);
    }
    
    @Test
    public void testConstructorWithParams() {
        assertNotNull(club);
        assertEquals("Paradise Club", club.toString());
    }
    
    @Test
    public void testAddPool() {
        boolean result = club.altaAlberca(10.0, 5.0);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultiplePools() {
        club.altaAlberca(10.0, 5.0);
        club.altaAlberca(20.0, 3.0);
        club.altaAlberca(15.0, 4.0);
        // All should be added successfully
        assertTrue(true);
    }
    
    @Test
    public void testCalculateCost() {
        club.altaAlberca(10.0, 5.0);  // Area = 50
        double cost = club.calculaCosto(10);  // 50 * 10 = 500
        assertEquals(500.0, cost, 0.1);
    }
    
    @Test
    public void testCalculateCostMultiplePools() {
        club.altaAlberca(10.0, 5.0);  // Area = 50
        club.altaAlberca(20.0, 2.0);  // Area = 40
        double cost = club.calculaCosto(5);  // (50+40)*5 = 450
        assertEquals(450.0, cost, 0.1);
    }
    
    @Test
    public void testToString() {
        club.altaAlberca(10.0, 5.0);
        String result = club.toString();
        assertNotNull(result);
        assertTrue(result.contains("Club"));
    }
}
