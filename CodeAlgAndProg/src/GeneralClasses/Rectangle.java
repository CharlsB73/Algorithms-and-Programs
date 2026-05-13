package GeneralClasses;

public class Rectangle {
	private double base;
	private double altura;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double b, double a) {
		base = b;
		altura = a;
	}
	
	public String toString() {
		return "Base: " + base + " - altura: " + altura;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public void setBase(double nueva) {
		base = nueva;
	}
	public void setAltura(double nueva) {
		altura = nueva;
	}
	public double calculaArea() {
		return base*altura;
	}
	public double calculaPerimetro() {
		double perimetro;
		
		perimetro = 2 * (base + altura);
		return perimetro;
	}

}
