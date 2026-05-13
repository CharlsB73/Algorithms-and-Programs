package Apps3;
import GeneralClasses3.ParkingLot;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingLotTest {
    
    private ParkingLot parkingLot;
    
    @Before
    public void setUp() {
        parkingLot = new ParkingLot("Downtown Parking");
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(parkingLot);
        assertEquals("Downtown Parking", parkingLot.getNombre());
    }
    
    @Test
    public void testSetNombre() {
        parkingLot.setNombre("Airport Parking");
        assertEquals("Airport Parking", parkingLot.getNombre());
    }
    
    @Test
    public void testGetNombre() {
        assertEquals("Downtown Parking", parkingLot.getNombre());
    }
    
    @Test
    public void testAddVehicle() {
        boolean result = parkingLot.altaVehiculo(0, 0, 900, "Toyota", 2020, "Camry", 12345, "Sedan");
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleVehicles() {
        parkingLot.altaVehiculo(0, 0, 900, "Toyota", 2020, "Camry", 12345, "Sedan");
        parkingLot.altaVehiculo(0, 1, 910, "Honda", 2021, "Civic", 54321, "Sedan");
        parkingLot.altaVehiculo(1, 0, 920, "Ford", 2019, "F-150", 11111, "SUV");
        assertTrue(true);
    }
    
    @Test
    public void testSearchVehicle() {
        parkingLot.altaVehiculo(0, 0, 900, "Toyota", 2020, "Camry", 12345, "Sedan");
        
        int[] pos = parkingLot.buscaVehiculo(12345);
        assertNotNull(pos);
    }
    
    @Test
    public void testSearchNonExistentVehicle() {
        parkingLot.altaVehiculo(0, 0, 900, "Toyota", 2020, "Camry", 12345, "Sedan");
        
        int[] pos = parkingLot.buscaVehiculo(99999);
        assertNotNull(pos);
        // When not found, position should be -1, -1
        assertEquals(-1, pos[0]);
        assertEquals(-1, pos[1]);
    }
    
    @Test
    public void testAddDateToVehicle() {
        parkingLot.altaVehiculo(0, 0, 900, "Toyota", 2020, "Camry", 12345, "Sedan");
        
        boolean result = parkingLot.agregaFecha(12345, 3);
        assertTrue(result);
    }
    
    @Test
    public void testAddServiceToVehicle() {
        parkingLot.altaVehiculo(0, 0, 900, "Toyota", 2020, "Camry", 12345, "Sedan");
        
        boolean result = parkingLot.agregaServicio(12345, "Car Wash");
        assertTrue(result);
    }
}
