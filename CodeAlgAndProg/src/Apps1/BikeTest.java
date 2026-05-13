package Apps1;

import GeneralClasses.Bike;

public class BikeTest {

	public static void main(String[] args) {
		
		Bike x;
		x = new Bike(205, 2, 'U', "aluminio");
		
		double precio = x.calcPrecio();
		System.out.println(x.getMaterial());
		System.out.println("El precio de la bicicleta es: " + precio);

	}

}
