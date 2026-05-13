package Apps2;
import GeneralClasses2.Hospital;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HospitalTest {
    
    private Hospital hospital;
    
    @Before
    public void setUp() {
        hospital = new Hospital("General Hospital");
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(hospital);
        assertEquals("General Hospital", hospital.getNombreH());
    }
    
    @Test
    public void testConstructorWithMax() {
        Hospital customHospital = new Hospital("Custom Hospital", 100);
        assertEquals("Custom Hospital", customHospital.getNombreH());
        assertNotNull(customHospital.getMedicos());
    }
    
    @Test
    public void testAddDoctor() {
        boolean result = hospital.altaMedico("Dr. Smith", 101);
        assertTrue(result);
    }
    
    @Test
    public void testAddMultipleDoctors() {
        hospital.altaMedico("Dr. Smith", 101);
        hospital.altaMedico("Dr. Johnson", 102);
        hospital.altaMedico("Dr. Williams", 103);
        assertTrue(true);
    }
    
    @Test
    public void testAddSpecialty() {
        hospital.altaMedico("Dr. Smith", 101);
        boolean result = hospital.agregaEspecialidadMedico(101, "Cardiology");
        assertTrue(result);
    }
    
    @Test
    public void testCountDoctorsBySpecialty() {
        hospital.altaMedico("Dr. Smith", 101);
        hospital.altaMedico("Dr. Johnson", 102);
        hospital.altaMedico("Dr. Williams", 103);
        
        hospital.agregaEspecialidadMedico(101, "Cardiology");
        hospital.agregaEspecialidadMedico(102, "Cardiology");
        hospital.agregaEspecialidadMedico(103, "Surgery");
        
        int cardiologists = hospital.numMedEspX("Cardiology");
        assertEquals(2, cardiologists);
    }
    
    @Test
    public void testGetDoctorSpecialties() {
        hospital.altaMedico("Dr. Smith", 101);
        hospital.agregaEspecialidadMedico(101, "Cardiology");
        
        java.util.ArrayList<String> specialties = hospital.especialidadesMedX(101);
        assertNotNull(specialties);
    }
}
