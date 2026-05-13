package Apps3;
import GeneralClasses3.Vehicle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {
    
    private Vehicle vehicle;
    
    @Before
    public void setUp() {
        vehicle = new Vehicle("Toyota", 2020, "Camry", 12345, "Sedan");
    }
    
    @Test
    public void testConstructorWithPlacesOnly() {
        Vehicle testVehicle = new Vehicle(54321);
        assertNotNull(testVehicle);
        assertEquals(54321, testVehicle.getPlacas());
    }
    
    @Test
    public void testConstructorFull() {
        assertNotNull(vehicle);
        assertEquals("Toyota", vehicle.getMarca());
        assertEquals(2020, vehicle.getAnio());
        assertEquals("Camry", vehicle.getModelo());
        assertEquals(12345, vehicle.getPlacas());
        assertEquals("Sedan", vehicle.getTipo());
    }
    
    @Test
    public void testGetPlacas() {
        assertEquals(12345, vehicle.getPlacas());
    }
    
    @Test
    public void testSetPlacas() {
        vehicle.setPlacas(99999);
        assertEquals(99999, vehicle.getPlacas());
    }
    
    @Test
    public void testGetters() {
        assertEquals("Toyota", vehicle.getMarca());
        assertEquals(2020, vehicle.getAnio());
        assertEquals("Camry", vehicle.getModelo());
        assertEquals("Sedan", vehicle.getTipo());
    }
    
    @Test
    public void testAddDate() {
        boolean result = vehicle.altaFecha(3);
        assertTrue(result);
        assertEquals(1, vehicle.getTotFechas());
    }
    
    @Test
    public void testAddMultipleDates() {
        vehicle.altaFecha(1);
        vehicle.altaFecha(6);
        vehicle.altaFecha(12);
        assertEquals(3, vehicle.getTotFechas());
    }
    
    @Test
    public void testAddService() {
        boolean result = vehicle.altaServicio("Oil Change");
        assertTrue(result);
        assertEquals(1, vehicle.getTotSer());
    }
    
    @Test
    public void testAddMultipleServices() {
        vehicle.altaServicio("Oil Change");
        vehicle.altaServicio("Tire Rotation");
        vehicle.altaServicio("Inspection");
        assertEquals(3, vehicle.getTotSer());
    }
    
    @Test
    public void testGetService() {
        vehicle.altaServicio("Oil Change");
        String service = vehicle.getServicios(0);
        assertEquals("Oil Change", service);
    }
    
    @Test
    public void testEquals() {
        Vehicle other = new Vehicle("Honda", 2019, "Civic", 12345, "Sedan");
        assertTrue(vehicle.equals(other));
    }
    
    @Test
    public void testNotEquals() {
        Vehicle other = new Vehicle("Honda", 2019, "Civic", 54321, "Sedan");
        assertFalse(vehicle.equals(other));
    }
    
    @Test
    public void testCompareTo() {
        Vehicle other = new Vehicle("Honda", 2019, "Civic", 54321, "Sedan");
        int result = vehicle.compareTo(other);
        assertTrue(result < 0);
    }
    
    @Test
    public void testToString() {
        String result = vehicle.toString();
        assertNotNull(result);
        assertTrue(result.contains("Toyota"));
        assertTrue(result.contains("12345"));
    }
}
