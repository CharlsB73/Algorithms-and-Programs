package Apps2;
import GeneralClasses2.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    
    @Test
    public void testDefaultConstructor() {
        Animal animal = new Animal();
        assertNotNull(animal);
    }
    
    @Test
    public void testConstructorWithName() {
        Animal animal = new Animal("Fluffy");
        assertEquals("Fluffy", animal.getNombre());
    }
    
    @Test
    public void testFullConstructor() {
        Animal animal = new Animal("Rex", 5, "Labrador", "Carnívoro");
        assertEquals("Rex", animal.getNombre());
        assertEquals(5, animal.getEdad());
        assertEquals("Labrador", animal.getRaza());
        assertEquals("Carnívoro", animal.getAlimentacion());
    }
    
    @Test
    public void testGetters() {
        Animal animal = new Animal("Tweety", 2, "Canario", "Semillas");
        assertNotNull(animal.getNombre());
        assertEquals(2, animal.getEdad());
        assertNotNull(animal.getRaza());
        assertNotNull(animal.getAlimentacion());
    }
}
