package Apps2;
import GeneralClasses2.ArtGallery;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArtGalleryTest {
    
    private ArtGallery galeria;
    
    @Before
    public void setUp() {
        galeria = new ArtGallery("Modern Art Gallery", 5555123);
    }
    
    @Test
    public void testDefaultConstructor() {
        ArtGallery testGaleria = new ArtGallery();
        assertNotNull(testGaleria);
    }
    
    @Test
    public void testConstructorWithParams() {
        assertNotNull(galeria);
        assertEquals("Modern Art Gallery", galeria.getNombreGaleria());
        assertEquals(5555123, galeria.getTelefono());
    }
    
    @Test
    public void testConstructorWithMax() {
        ArtGallery customGaleria = new ArtGallery("Elite Gallery", 5555999, 50);
        assertEquals("Elite Gallery", customGaleria.getNombreGaleria());
    }
    
    @Test
    public void testAddArtwork() {
        boolean result = galeria.altaObra("Picasso", "Guernica", 'O', 5000000, 1937);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleArtworks() {
        galeria.altaObra("Picasso", "Guernica", 'O', 5000000, 1937);
        galeria.altaObra("Van Gogh", "Starry Night", 'O', 2000000, 1889);
        galeria.altaObra("Da Vinci", "Mona Lisa", 'O', 10000000, 1519);
        assertNotNull(galeria.getObras());
    }
    
    @Test
    public void testSearchArtworkByArtistAndTitle() {
        galeria.altaObra("Picasso", "Guernica", 'O', 5000000, 1937);
        galeria.altaObra("Van Gogh", "Starry Night", 'O', 2000000, 1889);
        
        int pos = galeria.buscaAutorObraString("Picasso", "Guernica");
        assertTrue(pos >= 0);
    }
    
    @Test
    public void testSearchNonExistentArtwork() {
        galeria.altaObra("Picasso", "Guernica", 'O', 5000000, 1937);
        
        int pos = galeria.buscaAutorObraString("Monet", "Water Lilies");
        assertEquals(-1, pos);
    }
    
    @Test
    public void testRemoveArtwork() {
        galeria.altaObra("Picasso", "Guernica", 'O', 5000000, 1937);
        galeria.altaObra("Van Gogh", "Starry Night", 'O', 2000000, 1889);
        
        boolean result = galeria.bajaObra("Picasso", "Guernica");
        assertTrue(result);
    }
}
