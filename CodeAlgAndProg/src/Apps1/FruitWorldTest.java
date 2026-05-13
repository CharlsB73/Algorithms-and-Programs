package Apps1;

import GeneralClasses.Fruit;

public class FruitWorldTest {

	public static void main(String[] args) {
		
		Fruit fruta1 = new Fruit(123, "Manzana", "roja", "Campeche", 14.50);
		Fruit fruta2 = new Fruit(321, "Plátano", "amarillo", "Veracruz", 6.85);
		
		double descuento = fruta1.calculaProcentajeDescuento(8500);
		double descuento2 = fruta2.calculaProcentajeDescuento(5090);
		System.out.println("\nLa fruta 1 tiene un descuento de " + descuento);
		System.out.println("\nLa fruta 2 tiene un descuento de " + descuento2);

		
		double costo = fruta1.calculaCosto(122);
		double costo2 = fruta2.calculaCosto(122);
		System.out.println("\nLa fruta 1 tiene un costo de " + costo);
		System.out.println("\nLa fruta 2 tiene un costo de  " + costo2);

		
		String info = fruta1.toString();
		String info2 = fruta2.toString();
		System.out.println("\nLos datos de la fruta 1 son " + info);
		System.out.println("\nLos datos de la fruta 2 son " + info2);


		
		
		int comp = fruta1.compareTo(fruta2);
		
		if(comp>0) {
			System.out.println(fruta1 + "\nes mayor a " + fruta2);
		}
		else
			System.out.println(fruta1 + "\nes mayor a " + fruta1);
		
	}

}
