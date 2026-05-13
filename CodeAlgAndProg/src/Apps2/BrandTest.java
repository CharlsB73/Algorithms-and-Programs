package Apps2;
import GeneralClasses2.Brand;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BrandTest {
    
    private Brand marca;
    
    @Before
    public void setUp() {
        marca = new Brand();
    }
    
    @Test
    public void testDefaultConstructor() {
        assertNotNull(marca);
        assertEquals(0, marca.getTotMarcas());
    }
    
    @Test
    public void testGetMarca() {
        // Manually set values for testing
        // Note: The Marca class doesn't have an addMarca method visible in provided code
        // This test assumes the array can be accessed directly
        assertNotNull(marca.getMarca(0));
    }
    
    @Test
    public void testGetTotalMarcas() {
        assertEquals(0, marca.getTotMarcas());
    }
    
    @Test
    public void testToString() {
        String result = marca.toString();
        assertNotNull(result);
        assertTrue(result.contains("Marcas"));
    }
}
