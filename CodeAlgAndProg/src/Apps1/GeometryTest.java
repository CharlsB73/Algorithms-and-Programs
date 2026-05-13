package Apps1;

import java.util.Scanner;

import GeneralClasses.Circle;

public class GeometryTest {

	public static void main(String[] args) {
		
		double radio;
		Scanner lee;
		lee = new Scanner(System.in);
		
		
		System.out.print("Ingresa el radio ");
		radio = lee.nextDouble();
		
		Circle x;
		x = new Circle(radio);
		
		System.out.println("\nÁrea del círculo = " + x.calculaArea() + "\nPerimetro = " + x.calculaPerimetro());
		
		double res = x.calculaArea()*3*x.calculaPerimetro();
		System.out.println(res);
		
	}

}		