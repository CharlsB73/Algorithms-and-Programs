package Apps3;
import GeneralClasses3.MAG;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MAGTest {
    
    private Integer[] intArray;
    private String[] stringArray;
    
    @Before
    public void setUp() {
        intArray = new Integer[10];
        stringArray = new String[10];
    }
    
    @Test
    public void testBuscaSecuencialFound() {
        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;
        
        int result = MAG.buscaSecuencial(intArray, 3, 10);
        assertEquals(1, result);
    }
    
    @Test
    public void testBuscaSecuencialNotFound() {
        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;
        
        int result = MAG.buscaSecuencial(intArray, 3, 20);
        assertEquals(-1, result);
    }
    
    @Test
    public void testBuscaBinariaFound() {
        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;
        intArray[3] = 20;
        
        int result = MAG.buscaBinaria(intArray, 4, 15);
        assertEquals(2, result);
    }
    
    @Test
    public void testBuscaBinariaNotFound() {
        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;
        intArray[3] = 20;
        
        int result = MAG.buscaBinaria(intArray, 4, 12);
        assertTrue(result < 0);
    }
    
    @Test
    public void testInsertaOrdenado() {
        intArray[0] = 5;
        intArray[1] = 15;
        intArray[2] = 20;
        
        int newTotal = MAG.insertaOrdenado(intArray, 3, 10);
        assertEquals(4, newTotal);
        assertEquals(10, (int)intArray[1]);
    }
    
    @Test
    public void testOrdenaSelDir() {
        intArray[0] = 20;
        intArray[1] = 5;
        intArray[2] = 15;
        intArray[3] = 10;
        
        MAG.ordenaSelDir(intArray, 4);
        
        assertEquals(5, (int)intArray[0]);
        assertEquals(10, (int)intArray[1]);
        assertEquals(15, (int)intArray[2]);
        assertEquals(20, (int)intArray[3]);
    }
    
    @Test
    public void testImpArre() {
        stringArray[0] = "Hello";
        stringArray[1] = "World";
        
        String result = MAG.impArre(stringArray, 2);
        assertNotNull(result);
        assertTrue(result.contains("Hello"));
        assertTrue(result.contains("World"));
    }
    
    @Test
    public void testRecorreDer() {
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        
        MAG.recorreDer(intArray, 3, 1);
        
        assertEquals(1, (int)intArray[0]);
        assertEquals(2, (int)intArray[1]);
    }
    
    @Test
    public void testRecorreIzq() {
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        
        MAG.recorreIzq(intArray, 3, 1);
        
        assertEquals(1, (int)intArray[0]);
        assertEquals(3, (int)intArray[1]);
    }
}
