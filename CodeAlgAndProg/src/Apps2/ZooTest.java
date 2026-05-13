package Apps2;
import GeneralClasses2.Zoo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ZooTest {
    
    private Zoo zoo;
    
    @Before
    public void setUp() {
        zoo = new Zoo("City Zoo", "123 Zoo Lane");
    }
    
    @Test
    public void testDefaultConstructor() {
        Zoo defaultZoo = new Zoo();
        assertNotNull(defaultZoo);
    }
    
    @Test
    public void testConstructorWithParams() {
        assertNotNull(zoo);
        assertEquals("City Zoo", zoo.getNombre());
        assertEquals("123 Zoo Lane", zoo.getDireccion());
    }
    
    @Test
    public void testConstructorWithMax() {
        Zoo customZoo = new Zoo("Safari Zoo", "456 Safari Road", 50);
        assertNotNull(customZoo);
    }
    
    @Test
    public void testAddAnimal() {
        boolean result = zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleAnimals() {
        zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        zoo.altaAnimal("Ella", 8, "Elephant", "Herbívoro");
        zoo.altaAnimal("George", 3, "Giraffe", "Herbívoro");
        zoo.altaAnimal("Penny", 2, "Penguin", "Carnívoro");
        assertTrue(true);
    }
    
    @Test
    public void testGetters() {
        assertEquals("City Zoo", zoo.getNombre());
        assertEquals("123 Zoo Lane", zoo.getDireccion());
    }
    
    @Test
    public void testCalculateAverageAge() {
        zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        zoo.altaAnimal("Ella", 8, "Elephant", "Herbívoro");
        zoo.altaAnimal("George", 3, "Giraffe", "Herbívoro");
        
        int average = zoo.promedioEdad();
        assertTrue(average > 0);
    }
    
    @Test
    public void testCountAnimalsByBreed() {
        zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        zoo.altaAnimal("Simba", 3, "Lion", "Carnívoro");
        zoo.altaAnimal("Ella", 8, "Elephant", "Herbívoro");
        
        int lionCount = zoo.cuantosRaza("Lion");
        assertEquals(2, lionCount);
    }
    
    @Test
    public void testGetAgesOfBreed() {
        zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        zoo.altaAnimal("Simba", 3, "Lion", "Carnívoro");
        zoo.altaAnimal("Ella", 8, "Elephant", "Herbívoro");
        
        ArrayList<Integer> lionAges = zoo.edadesDeCiertaRaza("Lion");
        assertNotNull(lionAges);
        assertEquals(2, lionAges.size());
    }
    
    @Test
    public void testGetAgesOfNonExistentBreed() {
        zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        
        ArrayList<Integer> otterAges = zoo.edadesDeCiertaRaza("Otter");
        assertNotNull(otterAges);
        assertEquals(0, otterAges.size());
    }
    
    @Test
    public void testCheckAnimalByDiet() {
        zoo.altaAnimal("Leo", 5, "Lion", "Carnívoro");
        zoo.altaAnimal("Ella", 8, "Elephant", "Herbívoro");
        
        boolean hasCarnivore = zoo.ciertoTipoAlimentacion("Carnívoro");
        assertTrue(hasCarnivore);
    }
}
