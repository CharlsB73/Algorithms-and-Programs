package GeneralClasses2;

import Arrays.ArrayHandler;

public class Company {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private double [] ventas;
	private String [] mesVenta;
	private int totalVentas;
	private final int MAX = 12;
	
	//Constructores
	/*public Company() {
	 * ventas = new double [MAX];
	 * totalVentas = 0;
	 * 
	 * }
	 */
	
	public Company(String nombre, String direccion, String ciudad, String director) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
		ventas = new double [MAX];
		mesVenta = new String [MAX];
		totalVentas = 0;
	}
	
	public String toString() {
		StringBuilder sB = new StringBuilder();
		
		sB.append("\nNombre de Fábrica: " + nombre);
		sB.append("\nDirección: " + direccion);
		sB.append("\nCiudad: " + ciudad);
		sB.append("\nDirector: " + director);
		
		return sB.toString();
		
	}
	
	public boolean equals(GeneralClasses2.Company otro) {
		return this.nombre.equalsIgnoreCase(otro.nombre);
	}
	
	public int compareTo(GeneralClasses2.Company otro) {
		return this.nombre.compareToIgnoreCase(otro.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDirector() {
		return director;
	}

	public double[] getVentas() {
		return ventas;
	}

	public String[] getMesVenta() {
		return mesVenta;
	}

	public int getTotalVentas() {
		return totalVentas;
	}

	public int getMAX() {
		return MAX;
	}
	
	//Métodos
	public boolean altaVentaMes (String mes, int numVenta) {
		boolean resp = false;
		
		if(totalVentas < mesVenta.length) {
			mesVenta [totalVentas] = mes;
			ventas [totalVentas] = numVenta;
			totalVentas++;
			resp = true;
		}
		return resp;
	}
	
	public double promedioVentas() {
		double res;
		
		res = ArrayHandler.promElem(ventas, totalVentas);
		
		return res;
	}
	
	public int mesMayorVen() {
		int res;
		
		res = (int) (ArrayHandler.mayorElem(ventas, totalVentas) + 1);
		
		return res;
	}
	
	public int mesMenorVen() {
		int res;
		
		res = (int) (ArrayHandler.minElem(ventas, totalVentas) + 1);
		
		return res;
	}
	
	public double arribaPromedio() {
		double res;
		
		res = ArrayHandler.cuentaMayoresQue(ventas, totalVentas, promedioVentas());
		
		return res;
	}
	
	

}
