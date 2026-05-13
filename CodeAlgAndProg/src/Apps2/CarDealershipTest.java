package Apps2;

import GeneralClasses2.CarDealership;

public class CarDealershipTest {

	public static void main(String[] args) {
		CarDealership AgenciaX=new CarDealership("Agencia1", "yy");
		
		AgenciaX.altaMarca("Mercedes");
		AgenciaX.altaMarca("KIA motors");
		AgenciaX.altaMarca("BMW");
		AgenciaX.altaMarca("Audi");
		
		AgenciaX.recibirAuto(1111, "Mercedes", 102, 2023, 890201.0);
		AgenciaX.recibirAuto(2222, "Audi", 5, 2019, 782010.0);
		AgenciaX.recibirAuto(3333, "Mercedes", 0, 2022, 900000.0);
		AgenciaX.recibirAuto(4444, "BMW", 200, 2020, 848001.0);
		
		String datosAuto=AgenciaX.toStringAutoi(2222);
		System.out.println("\nLos datos del auto con esa clave es: " + datosAuto);
		String masCaro=AgenciaX.datosAutoMasCaro();
		System.out.println("\nEl auto más caro es: " + masCaro);
		int cont = AgenciaX.contAutosDeMarca("Mercedes");
		System.out.println("\nEl número de autos con esa marcas son: " + cont);
		
	}

}
