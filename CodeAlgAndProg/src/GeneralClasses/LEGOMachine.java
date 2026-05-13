package GeneralClasses;

public class LEGOMachine {
	private int clave;
	private int anio;
	private String posicion;
	
	public LEGOMachine() {
		
	}
	
	public LEGOMachine(int clave, int anio, String posicion) {
		
	}
	//preguntar cómo meter ciclos if en un switch
	public double calcTiempo(char tipo, int cantidad) {
		double tiempo = 0;
		
		if (tipo == 'B') {
			tiempo = cantidad/720;
		}
		else
			tiempo = cantidad/240;
		return tiempo;
	}
	
	public double calcPrecio(double PrecioP, char tipo, String color, int cantidad) {
		double precioTotal = 0, tipoB = cantidad/12*120, precioColorB = 0, tipoC = cantidad/4*28.5, precioColorC = tipoC 
				/5000*12.5, precioPiezaB = cantidad/100*PrecioP, precioPiezaC = cantidad/140.4*PrecioP;
		
		if (tipo == 'B') {
			if (color == "rojo" || color == "amarillo") {
				precioColorB = (tipoB/5000)*10;
			}
			else
				precioColorB = (tipoB/5000)*12.5;
			precioTotal = precioColorB + precioPiezaB;
		}
		else
			if (color == "rojo" || color == "amarillo" ) {
				precioColorC = (tipoC/5000)*10;
			}
			else
				precioColorC = (tipoC/5000)*12.5;
			precioTotal = precioColorC + precioPiezaC;
		
		return precioTotal;
	}
}
