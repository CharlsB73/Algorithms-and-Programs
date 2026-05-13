package ProyectoAgenciaFenix; //Programa de CGCC, clave única:208410

//Clase: se incluye el Comparable, pues se compararán más terrenos

public class Terreno implements Comparable<Terreno>{
	/*
	 * Atributos: el número de casa será el "id" estático que empieza en el 1; se actualiza
	 * con cada Terreno que se da de alta
	 */
	private int numTerreno;
	private static int id = 1;
	private double costo;
	private double m2;
	
	//Constructores
	public Terreno() {
		this.numTerreno=id;
		id++;
	}
	public Terreno(double costo,double m2) {
		this.numTerreno=id;
		id++;
		this.costo=costo;
		this.m2=m2;
	}
	//Funcionalidad mínima: get,set,equals,compareTo,toString
	public int getNumTerreno() {
		return numTerreno;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public String toString() {
		return "Terreno "+numTerreno+" Costo: " + costo + ", m^2:" + m2;
	}
	//Dos métodos equals: uno que compara la clase objeto y otro que compara el objeto creado
	public boolean equals(Object obj) {
		Terreno otra=(Terreno)obj;
		return this.numTerreno==otra.numTerreno;
	}
	public boolean equals2(Terreno otro) {
		boolean res=false;
		if(this.costo==otro.costo && this.m2==otro.m2)
			res=true;
		return res;
	}
	public int compareTo(Terreno otro) {
		return this.numTerreno-otro.numTerreno;
	}
}
