package GeneralClasses;


public class Circle {
	private double radio;
	
	public Circle() {
		
	}
	public Circle(double a) {
		radio = a;
	}
	public String toString() {
		return "Radio: " + radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double nueva) {
		radio = nueva;
	}
	public double calculaArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	public double calculaPerimetro() {
		return Math.PI * 2 * radio;
	}

}