package GeneralClasses;

public class Fruit {
	private int numId;
	private String nombre;
	private String color;
	private String ciudad;
	private double costoK;
	
	public Fruit() {
		
	}
	
	public Fruit(int numId, String nombre, String color, String ciudad, double costoK) {
		this.numId = numId;
		this.nombre = nombre;
		this.color = color;
		this.ciudad = ciudad;
		this.costoK = costoK;
	}
	public String toString() {
		return "Los datos de la fruta son: " + numId + nombre + color + ciudad + costoK;
	}
	
	public int getNumId() {
		return numId;
	}
	public String getNombre() {
		return nombre;
	}
	public String getColor() {
		return color;
	}
	public String getCiudad() {
		return ciudad;
	}
	public double getCostoK() {
		return costoK;
	}
	
	public void setCostoK(double nueva) {
		costoK = nueva;
	}
	
	public int compareTo(GeneralClasses.Fruit otro) {
		return this.numId-otro.numId;
	}
	
	public double calculaProcentajeDescuento(double monto) {
		double descuento = 0;
		
		if ((monto) < 1500) {
			descuento = 0;
		}
		else
			if ((monto) > 1500 || (monto) < 10000) {
				descuento = (((monto)-1500)/8500)*10; //duda con respecto al porcentaje
			}
			else
				descuento = 10;
		return descuento;
	}
	
	public double calculaCosto(int kilo) {
		double resultado;
		resultado = costoK*kilo;
		return resultado;
	}

}
