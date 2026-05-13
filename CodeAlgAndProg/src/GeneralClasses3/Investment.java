package GeneralClasses3;

public class Investment implements Comparable<GeneralClasses3.Investment>{
	private String nombre;
	private double monto;
	private int plazo; //en meses
	private int rendimiento;
	
	public Investment(String nombre) {
		this.nombre=nombre;
	}
	public Investment(String nombre, double monto, int plazo, int rendimiento) {
		this.nombre=nombre;
		this.monto=monto;
		this.plazo=plazo;
		this.rendimiento=rendimiento;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public String getNombre() {
		return nombre;
	}
	public int getRendimiento() {
		return rendimiento;
	}
	public String toString() {
		return "\nInvestment Nombre=" + nombre + ", Monto=" + monto + ", Plazo=" + plazo + ", Rendimiento=" + rendimiento;
	}
	public boolean equals(Object obj) {
		GeneralClasses3.Investment x=(GeneralClasses3.Investment)obj;
		if(nombre.equals(x.nombre))
			return true;
		else
			return false;
	}
	public int compareTo(GeneralClasses3.Investment otro) {
		return this.nombre.compareTo(otro.nombre);
	}


}
