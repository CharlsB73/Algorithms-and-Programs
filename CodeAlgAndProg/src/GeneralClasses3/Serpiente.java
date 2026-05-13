package GeneralClasses3;

public class Serpiente {
	private String nombre;
	private int clave;
	private String alimentacion;
	private int tipo;
	
	public Serpiente(int clave) {
		this.clave=clave;
	}
	public Serpiente(String nombre,int clave,String alimentacion,int tipo) {
		this.nombre=nombre;
		this.clave=clave;
		this.alimentacion=alimentacion;
		this.tipo=tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public int getClave() {
		return clave;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public int getTipo() {
		return tipo;
	}
	public boolean equals(Object obj) {
		Serpiente otra=(Serpiente)obj;
		return this.clave==otra.clave;
	}
	public int compareTo(Serpiente otro) {
		return this.clave-otro.clave;
	}
	public String toString() {
		return "\nNombre: "+nombre+"Clave: "+clave+"Alimentación: "+alimentacion+"Tipo: "+tipo;
	}

}
