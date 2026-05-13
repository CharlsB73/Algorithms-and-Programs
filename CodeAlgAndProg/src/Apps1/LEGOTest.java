package Apps1;

import GeneralClasses.LEGOMachine;

public class LEGOTest {

	public static void main(String[] args) {
		
		LEGOMachine x = new LEGOMachine(37, 2018, "AC");
		LEGOMachine x2 = new LEGOMachine(37, 2018, "AB");
		
		double tiempo = x.calcTiempo('B', 75524);
		double precio = x.calcPrecio(1.5, 'B', "amarillo", 75524);
		
		double tiempo2 = x2.calcTiempo('B', 3256)/60;
		double precio2 = x2.calcPrecio(1.5, 'C', "verde", 3256)/60;
		
		double tiempoT = tiempo + tiempo2;
		double precioT = precio + precio2;
		
		System.out.println("\nTardarán en total: " + tiempoT + "horas y el costo total será de $" + precioT);
	}

}
