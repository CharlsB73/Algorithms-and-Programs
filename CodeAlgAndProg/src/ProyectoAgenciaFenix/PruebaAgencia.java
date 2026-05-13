package ProyectoAgenciaFenix; //Programa de CGCC, clave única:208410
//Clase
public class PruebaAgencia {
	//Se crea el objeto tipo Agencia
	public static void main(String[] args) {
		Agencia agencia=new Agencia("Fénix", "Río Hondo");
		
		//Alta de Casas
		agencia.altaCasa(291.2, 2990000.9, 2, 3, 2);
		agencia.altaCasa(255.7, 2780000.9, 2, 3, 2);
		agencia.altaCasa(300.1, 3000129.2, 2, 3, 2);
		agencia.altaCasa(205.2, 2080011.8, 2, 3, 2);
		agencia.altaCasa(267.8, 2921900.1, 2, 3, 2);
		agencia.altaCasa(305.5, 3800111.2, 3, 3, 3);
		agencia.altaCasa(399.7, 4200123.5, 4, 5, 3);
		agencia.altaCasa(225.5, 2435091.7, 2, 3, 2);
		agencia.altaCasa(299.1, 2999000.0, 2, 3, 2);
		agencia.altaCasa(401.0, 4909303.1, 4, 5, 3);
		agencia.altaCasa(322.3, 3708000.2, 3, 3, 3);
		
		//Imprimir casas
		System.out.println(agencia.casasToString()+"\n");
		
		//Baja de una Casa
		boolean res= agencia.bajaCasa(2990000.9);
		if (res) 
			System.out.print("Se dió de baja exitosamente\n");
		else
			System.out.print("No se pudo dar de baja\n");
		System.out.println(agencia.casasToString()+"\n");
		
		//Información de casas en cierta categoría
		System.out.println("Casas en categoría: \n" + agencia.infoCasasEnCategoria(2)+"\n");
		
		//Contador de casas en cada categoría
		System.out.println("Cantidad de casas en cada categoría: "+"\n");
		int [] contC=agencia.contCasas();
		for (int i = 0; i < contC.length; i++) {
		    System.out.println("Categoría " + i + ": " + contC[i]);
		}
		
		//Alta de Terrenos
		agencia.altaTerreno(123020.1, 124.9);
		agencia.altaTerreno(100000.0, 101.0);
		agencia.altaTerreno(270070.0, 201.7);
		agencia.altaTerreno(123000.0, 121.0);
		agencia.altaTerreno(500061.0, 543.3);
		agencia.altaTerreno(341200.0, 292.9);
		agencia.altaTerreno(300000.0, 203.0);
		agencia.altaTerreno(231231.0, 170.2);
		agencia.altaTerreno(354002.0, 259.0);
		
		//Imprimir terrenos en ArrayList
		System.out.println(agencia.terrenosArrayList());
		
		//Baja de un terreno
		int nuevoTotT=agencia.bajaTerreno(231231.0, 170.2);
		if (nuevoTotT>0) 
			System.out.print("Se dió de baja exitosamente\n");
		else
			System.out.print("No se pudo dar de baja\n");
		
		//Imprimir terrenos en ArrayList
		System.out.println(agencia.terrenosArrayList()+"\n");
		
		//Información de terrenos en parámetros
		System.out.println("Terreno en parámetro: \n" + agencia.infoTerrenoEnParametro(231231.0));
	}

}
