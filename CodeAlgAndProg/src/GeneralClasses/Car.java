package GeneralClasses;

public class Car {
	private int claveUnica;
	private String marca;
	private double kms;
	private int anio;
	private String nomCli;
	private String numLic;
	private double precio;
	
	public Car(int clave) {
		this.claveUnica=clave;
	}
	public Car() {
		this.precio=precio;	
	}
	public Car(int ClaveUnica, String marca, double kms, int anio, double precio2) {
		this.claveUnica = claveUnica;
		this.anio = anio;
		this.kms = kms;
		this.marca = marca;
		this.precio=precio2;
	}
	public int getclaveUnica() {
		return claveUnica;
	}
	
	public String getMarca() {
		return marca;
	}
	public double getKms() {
		return kms;
	}
	public int getAnio() {
		return anio;
	}
	public String getNomCli() {
		return nomCli;
	}
	public String getNumLic() {
		return numLic;
	}
	public double getPrecio() {
		return precio;
	}
	//Puede tener get en todos sus atributos
	public String toStringAuto() {
		return "claveUnica=" + claveUnica + ", marca=" + marca + ", kms=" + kms + ", anio=" + anio + ",precio=" + precio;
	}
	public boolean equalsAuto(int claveUnica2) {
		return this.claveUnica == claveUnica2;
	}
	
	public int compareTo(GeneralClasses.Car otro ) {
		return this.claveUnica - otro.claveUnica;
	}
	public double registraRenta(String nom, String licencia, int dias) {
		double totalRenta;
		
		if (anio < 2005) 
			totalRenta = 200 * dias;
		else
			totalRenta = 300 * dias;
		if (kms < 20000)
			totalRenta = totalRenta + 20*dias;
		this.nomCli = nom;
		this.numLic = licencia;
		return totalRenta;
	}
	
	public void devolucion(double kmsRecorridos) {
		this.kms = this.kms + kmsRecorridos;
		this.nomCli = " ";
		this.numLic = " ";
	}
}
