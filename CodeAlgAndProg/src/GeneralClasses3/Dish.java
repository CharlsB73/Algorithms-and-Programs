package GeneralClasses3;

public class Dish implements Comparable<GeneralClasses3.Dish>{
	private int clave;
	private static int id;
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Dish(int clave) {
		this.clave=clave;
	}
	public Dish(String nombre, String descripcion, double precio) {
		this.clave=id;
		id++;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getClave() {
		return clave;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String toString() {
		return "Dish clave=" + clave + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio;
	}
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    GeneralClasses3.Dish other = (GeneralClasses3.Dish) obj;
	    return this.clave == other.clave;
	}

	public int compareTo(GeneralClasses3.Dish otro) {
		return this.clave-otro.clave;
	}

}
