package GeneralClasses2;

public class Animal {
	private String nombre;
	private int edad;
	private String raza;
	private String alimentacion;
	
	public Animal() {
		
	}
	public Animal(String nombre) {
		this.nombre=nombre;
		
	}
	
	public Animal(String nombre,int edad,String raza,String alimentacion) {
		this.nombre=nombre;
		this.edad=edad;
		this.raza=raza;
		this.alimentacion=alimentacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getRaza() {
		return raza;
	}
	
	public String getAlimentacion() {
		return alimentacion;
	}
	

}
