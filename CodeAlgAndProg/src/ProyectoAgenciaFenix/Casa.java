package ProyectoAgenciaFenix; //Programa de CGCC, clave única:208410

//Clase: se incluye el Comparable, pues se compararán más casas

public class Casa implements Comparable<Casa>{
	/*
	 * Atributos: el número de casa será el "id" estático que empieza en el 100; se actualiza
	 * con cada Casa que se da de alta
	 */
	private int numCasa;
	private static int id = 100;
	private double m2;
	private double precio;
	private int banios;
	private int recamaras;
	private int cajonesEst;
	
	//Constructores
	public Casa(double precio) {
		this.precio=precio;
		this.numCasa=id;
	    id++;
	}
	public Casa(double m2,double precio,int banios,int recamaras,int cajonesEst) {
	    this.numCasa=id;
	    this.m2=m2;
	    this.precio=precio;
	    this.banios=banios;
	    this.recamaras=recamaras;
	    this.cajonesEst=cajonesEst;
	    id++;
	}

	//Funcionalidad mínima: get,set,equals,compareTo,toString
	public static int getId() {
		return id;
	}
	public int getNumCasa() {
		return numCasa;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getBanios() {
		return banios;
	}
	public void setBanios(int banios) {
		this.banios = banios;
	}
	public int getRecamaras() {
		return recamaras;
	}
	public void setRecamaras(int recamaras) {
		this.recamaras = recamaras;
	}
	public int getCajonesEst() {
		return cajonesEst;
	}
	public void setCajonesEst(int cajonesEst) {
		this.cajonesEst = cajonesEst;
	}
	public String toString() {
		return "Casa número "+numCasa+ ": "+"m^2:" + m2 + ", precio:" + precio + ", baños:" + banios + ", recámaras:" + recamaras
				+ ", cajones estacionamiento:" + cajonesEst;
	}
	//Dos métodos equals: uno que compara la clase objeto y otro que compara el objeto creado
	public boolean equals(Object obj) {
		Casa otra=(Casa)obj;
		return this.numCasa==otra.numCasa;
	}
	public boolean equals2(Casa otro) {
		boolean res=false;
		if(this.precio==otro.precio && this.m2==otro.m2 && this.banios==otro.banios && this.cajonesEst==otro.cajonesEst && this.recamaras==otro.recamaras)
			res=true;
		return res;
	}
	public int compareTo(Casa otro) {
		return this.numCasa-otro.numCasa;
	}
	
}
