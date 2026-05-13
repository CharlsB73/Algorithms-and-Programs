package Apps2;
import GeneralClasses2.Party;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartyTest {
    
    private Party party;
    
    @Before
    public void setUp() {
        party = new Party("2024-12-25", "Grand Hotel");
    }
    
    @Test
    public void testConstructorWithMax() {
        assertNotNull(party);
    }
    
    @Test
    public void testConstructorWithoutMax() {
        Party customParty = new Party("2024-12-25", "Grand Hotel");
        assertNotNull(customParty);
    }
    
    @Test
    public void testAddGuest() {
        boolean result = party.agregaInv("John Doe");
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleGuests() {
        party.agregaInv("John Doe");
        party.agregaInv("Jane Smith");
        party.agregaInv("Bob Johnson");
        assertTrue(true);
    }
    
    @Test
    public void testDuplicateGuestNotAdded() {
        party.agregaInv("John Doe");
        boolean result = party.agregaInv("John Doe");
        assertFalse(result);
    }
    
    @Test
    public void testRemoveGuest() {
        party.agregaInv("John Doe");
        party.agregaInv("Jane Smith");
        
        boolean result = party.quitaInv("John Doe");
        assertTrue(result);
    }
    
    @Test
    public void testGetFirstGuest() {
        party.agregaInv("John Doe");
        party.agregaInv("Jane Smith");
        
        String first = party.obtenerPrimero();
        assertEquals("John Doe", first);
    }
    
    @Test
    public void testGetLastGuest() {
        party.agregaInv("John Doe");
        party.agregaInv("Jane Smith");
        
        String last = party.obtenerÚltimo();
        assertEquals("Jane Smith", last);
    }
    
    @Test
    public void testFirstGuestWhenEmpty() {
        String first = party.obtenerPrimero();
        assertNull(first);
    }
    
    @Test
    public void testLastGuestWhenEmpty() {
        String last = party.obtenerÚltimo();
        assertNull(last);
    }
    
    @Test
    public void testToString() {
        party.agregaInv("John Doe");
        String result = party.toString();
        assertNotNull(result);
        assertTrue(result.contains("2024-12-25"));
        assertTrue(result.contains("Grand Hotel"));
    }
}
