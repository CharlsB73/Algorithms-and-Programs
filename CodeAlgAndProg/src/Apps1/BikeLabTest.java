package Apps1;

import GeneralClasses.BikeLab;

public class BikeLabTest {

	public static void main(String[] args) {
		
		BikeLab bici = new BikeLab('U', 4, "fibra");
		BikeLab bici2 = new BikeLab('P', 2, "fibra");
		
		System.out.println("El costo de la bicicleta 1 es: " + bici.calcPrecio() + "\nSe tardará: " + bici.calcTiempo() + "días");
		System.out.println("\nEl costo de la bicicleta 2 es: " + bici2.calcPrecio() + "\nSe tardará: " + bici2.calcTiempo() + "días");

	}

}
