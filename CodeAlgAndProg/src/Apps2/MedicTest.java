package Apps2;
import GeneralClasses2.Medic;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MedicTest {
    
    private Medic medic;
    
    @Before
    public void setUp() {
        medic = new Medic("Dr. Smith", 101);
    }
    
    @Test
    public void testDefaultConstructor() {
        Medic testMedic = new Medic();
        assertNotNull(testMedic);
    }
    
    @Test
    public void testConstructorWithParams() {
        assertNotNull(medic);
        assertEquals("Dr. Smith", medic.getNombre());
        assertEquals(101, medic.getClave());
    }
    
    @Test
    public void testConstructorWithMax() {
        Medic customMedic = new Medic("Dr. Johnson", 102, 10);
        assertEquals("Dr. Johnson", customMedic.getNombre());
        assertEquals(102, customMedic.getClave());
    }
    
    @Test
    public void testConstructorWithKeyOnly() {
        Medic keyMedic = new Medic(103);
        assertEquals(103, keyMedic.getClave());
    }
    
    @Test
    public void testAddSpecialty() {
        boolean result = medic.altaEspecialidad("Cardiology");
        assertTrue(result);
        assertEquals(1, medic.getTotEspecialidades());
    }
    
    @Test
    public void testAddMultipleSpecialties() {
        medic.altaEspecialidad("Cardiology");
        medic.altaEspecialidad("Surgery");
        medic.altaEspecialidad("Neurology");
        assertEquals(3, medic.getTotEspecialidades());
    }
    
    @Test
    public void testGetSpecialty() {
        medic.altaEspecialidad("Cardiology");
        medic.altaEspecialidad("Surgery");
        
        String specialty = medic.getEspecialidad(0);
        assertNotNull(specialty);
    }
    
    @Test
    public void testEquals() {
        Medic other = new Medic("Dr. Smith", 105);
        assertTrue(medic.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        Medic other = new Medic("Dr. Johnson", 102);
        assertFalse(medic.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        Medic other = new Medic("Dr. Johnson", 105);
        int result = medic.compareTo(other);
        assertTrue(result < 0);
    }
    
    @Test
    public void testToString() {
        String result = medic.toString();
        assertNotNull(result);
        assertTrue(result.contains("Dr. Smith"));
        assertTrue(result.contains("101"));
    }
}
