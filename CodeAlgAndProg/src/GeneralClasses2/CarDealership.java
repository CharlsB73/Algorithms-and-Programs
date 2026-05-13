package GeneralClasses2;

import GeneralClasses.Car;

public class CarDealership {
	private String nombre;
	private String direccion;
	private Car[] autos;
	private int totAutos;
	private String [] marcas;
	private int totMarcas;
	private final int maxAutos=200;
	private final int maxMarcas=20;
	
	public CarDealership() {
		
	}
	public CarDealership(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		autos=new Car[maxAutos];
		totAutos=0;
		marcas=new String[maxMarcas];
		totMarcas=0;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public Car[] getAutos() {
		return autos;
	}
	public int getTotAutos() {
		return totAutos;
	}
	public String[] getMarcas() {
		return marcas;
	}
	public String getMarca(int n) {
		return marcas[n];
	}
	public int getTotMarcas() {
		return totMarcas;
	}
	private int buscaMarca(String nombre) {
		int i=0;
		while(i<totMarcas && marcas[i].equalsIgnoreCase(nombre)) {
			i++;
		}
		if(i==totMarcas)
			i=-1;
		return i;
	}
	public boolean altaMarca(String nomMarca) {
		boolean resp=false;
		
		if(totMarcas<marcas.length) {
			resp=true;
			marcas[totMarcas] = nomMarca;
			totMarcas++;
		}
		return resp;
	}
	
	public boolean bajaMarca(String nomMarca) {
		boolean resp=false;
		int pos=buscaMarca(nomMarca);
		if(pos>=0) {
			marcas[pos] = marcas[totMarcas-1];
			marcas[totMarcas-1] = null;
			totMarcas--;
		}
		return resp;
	}
	private int buscaAuto(int ClaveUnica, String marca, double kms, int anio) {
		int i=0;
		while(i<totAutos && autos[i].getclaveUnica()==ClaveUnica) {
			i++;
		}
		if(i==totMarcas)
			i=-1;
		return i;
	}
	public boolean recibirAuto(int ClaveUnica, String marca, double kms, int anio,double precio2) {
		boolean resp=false;
		
		if(totAutos<autos.length) {
			resp=true;
			autos[totAutos] = new Car(ClaveUnica,marca,kms,anio,precio2);
			totAutos++;
		}
		return resp;
	}
	public boolean venderAuto(int ClaveUnica, String marca, double kms, int anio) {
		boolean resp=false;
		int pos=buscaAuto(ClaveUnica,marca,kms,anio);
		if(pos>=0) {
			marcas[pos] = marcas[totMarcas-1];
			marcas[totMarcas-1] = null;
			totMarcas--;
		}
		return resp;
	}
	public String toStringAutoi(int clave) {
		int i=0;
		Car autoX=new Car(clave);
		while(i<totAutos && !autos[i].equalsAuto(clave)) {
			i++;
		}
		return autoX.toStringAuto();
	}
	public String datosAutoMasCaro() {
		int i;
		double max=-1.0;
		Car autoMax= new Car();
		for(i=0;i<totAutos;i++) {
			if(autos[i].getPrecio()>max)
				max=autos[i].getPrecio();
				autoMax = autos[i];
		}
		
		return autoMax.toString();
	}
	public int contAutosDeMarca(String marca) {
		int i,cont=0;
		for(i=0;i<totAutos;i++) {
			if(autos[i].getMarca().equalsIgnoreCase(marca))
				cont++;
		}
		return cont;
	}

}
